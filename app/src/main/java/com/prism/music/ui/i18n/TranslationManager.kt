package com.prism.music.ui.i18n

import android.app.LocaleManager
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.LocaleList
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap

/**
 * Metadata for a supported display language in Prism.
 */
data class SupportedLanguage(
    val code: String,
    val nativeName: String,
    val englishName: String,
    val isCustom: Boolean = false
)

/**
 * Central Internationalization (i18n) & Translation Manager for Prism.
 *
 * This infrastructure allows Prism to be translated into any language simply by providing
 * a JSON translation file in `assets/translations/<lang_code>.json` or by importing
 * a custom JSON file at runtime.
 */
object TranslationManager {
    private const val TRANSLATIONS_ASSET_DIR = "translations"
    private const val CUSTOM_TRANSLATIONS_DIR = "custom_translations"

    // Thread-safe in-memory cache for loaded translation maps (langCode -> Map<Key, Translation>)
    private val cache = ConcurrentHashMap<String, Map<String, String>>()

    @Volatile
    private var activeLanguageOverride: String? = null

    /**
     * Well-known languages with clean, curated native names.
     */
    private val wellKnownLanguages = mapOf(
        "" to ("Varsayılan" to "System Default"),
        "en" to ("English" to "English"),
        "tr" to ("Türkçe" to "Turkish"),
        "az" to ("Azərbaycanca" to "Azerbaijani"),
        "es" to ("Español" to "Spanish"),
        "de" to ("Deutsch" to "German"),
        "fr" to ("Français" to "French"),
        "it" to ("Italiano" to "Italian"),
        "pt" to ("Português" to "Portuguese"),
        "ru" to ("Русский" to "Russian"),
        "ja" to ("日本語" to "Japanese"),
        "ko" to ("한국어" to "Korean"),
        "zh" to ("中文" to "Chinese"),
        "ar" to ("العربية" to "Arabic"),
        "hi" to ("हिन्दी" to "Hindi"),
        "pl" to ("Polski" to "Polish"),
        "uk" to ("Українська" to "Ukrainian"),
        "id" to ("Bahasa Indonesia" to "Indonesian")
    )

    /**
     * Sets or clears the active language override for the current session.
     */
    fun setActiveLanguage(code: String?) {
        activeLanguageOverride = code?.ifBlank { null }
    }

    /**
     * Resolves the current active language code for UI rendering.
     */
    fun getActiveLanguageCode(context: Context): String {
        activeLanguageOverride?.let { return it }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            runCatching {
                val lm = context.getSystemService(LocaleManager::class.java)
                val appLocales = lm?.applicationLocales
                if (appLocales != null && !appLocales.isEmpty) {
                    val tag = appLocales[0]?.toLanguageTag() ?: appLocales[0]?.language ?: ""
                    if (tag.isNotBlank()) return normalizeLanguageCode(tag)
                }
            }
        }

        val configLocale = context.resources.configuration.locales[0]
        val lang = configLocale?.language ?: Locale.getDefault().language
        return normalizeLanguageCode(lang)
    }

    private fun normalizeLanguageCode(raw: String): String {
        val code = raw.lowercase().trim()
        val base = code.split("-", "_").firstOrNull() ?: code
        return base
    }

    /**
     * Discovers all available languages:
     * 1. System Default ("")
     * 2. All *.json translation files present in `assets/translations/`
     * 3. Any user-imported custom translation files in app internal storage
     */
    fun getAvailableLanguages(context: Context): List<SupportedLanguage> {
        val result = mutableListOf<SupportedLanguage>()

        // 1. System default
        result.add(
            SupportedLanguage(
                code = "",
                nativeName = wellKnownLanguages[""]?.first ?: "System Default",
                englishName = wellKnownLanguages[""]?.second ?: "System Default"
            )
        )

        // 2. Discover from assets/translations/
        val discoveredCodes = mutableSetOf<String>()
        runCatching {
            context.assets.list(TRANSLATIONS_ASSET_DIR)?.forEach { fileName ->
                if (fileName.endsWith(".json", ignoreCase = true) && !fileName.equals("template.json", ignoreCase = true)) {
                    val code = fileName.removeSuffix(".json").lowercase()
                    discoveredCodes.add(code)
                }
            }
        }

        // Always ensure en, tr, az are included if assets exist
        discoveredCodes.addAll(listOf("en", "tr", "az"))

        // Sort: en first, then tr, az, then alphabetical
        val sortedCodes = discoveredCodes.sortedWith { a, b ->
            when {
                a == "en" -> -1
                b == "en" -> 1
                a == "tr" && b != "en" -> -1
                b == "tr" && a != "en" -> 1
                a == "az" && b !in listOf("en", "tr") -> -1
                b == "az" && a !in listOf("en", "tr") -> 1
                else -> a.compareTo(b)
            }
        }

        for (code in sortedCodes) {
            val names = resolveLanguageNames(code)
            result.add(SupportedLanguage(code, names.first, names.second, isCustom = false))
        }

        // 3. User-imported custom translations
        runCatching {
            val customDir = File(context.filesDir, CUSTOM_TRANSLATIONS_DIR)
            if (customDir.exists() && customDir.isDirectory) {
                customDir.listFiles()?.forEach { file ->
                    if (file.name.endsWith(".json", ignoreCase = true)) {
                        val code = file.name.removeSuffix(".json").lowercase()
                        if (result.none { it.code == code }) {
                            val names = resolveLanguageNames(code)
                            result.add(
                                SupportedLanguage(
                                    code = code,
                                    nativeName = "${names.first} (Özel)",
                                    englishName = "${names.second} (Custom)",
                                    isCustom = true
                                )
                            )
                        }
                    }
                }
            }
        }

        return result
    }

    /**
     * Resolves display names (native and english) for any given ISO language code.
     */
    fun resolveLanguageNames(code: String): Pair<String, String> {
        wellKnownLanguages[code]?.let { return it }

        return try {
            val locale = Locale.forLanguageTag(code)
            val nativeName = locale.getDisplayName(locale).replaceFirstChar { it.uppercase() }
            val englishName = locale.getDisplayName(Locale.ENGLISH).replaceFirstChar { it.uppercase() }
            val finalNative = if (nativeName.isNotBlank()) nativeName else code
            val finalEnglish = if (englishName.isNotBlank()) englishName else code
            finalNative to finalEnglish
        } catch (_: Exception) {
            code to code
        }
    }

    /**
     * Returns the human-readable display label for a language code (for chips/settings).
     */
    fun getDisplayName(code: String, context: Context): String {
        if (code.isBlank()) {
            return runCatching {
                context.getString(com.prism.music.R.string.language_system_default)
            }.getOrDefault("Varsayılan (Telefon dili)")
        }
        return resolveLanguageNames(code).first
    }

    /**
     * Returns the loaded dictionary for the specified language code.
     */
    fun getDictionary(langCode: String, context: Context): Map<String, String> {
        val code = normalizeLanguageCode(langCode)
        if (code.isBlank() || code == "en") return emptyMap()

        cache[code]?.let { return it }

        val loaded = loadDictionaryFromFileOrAsset(code, context)
        cache[code] = loaded
        return loaded
    }

    private fun loadDictionaryFromFileOrAsset(code: String, context: Context): Map<String, String> {
        // 1. Check custom user translations first
        runCatching {
            val customFile = File(File(context.filesDir, CUSTOM_TRANSLATIONS_DIR), "$code.json")
            if (customFile.exists() && customFile.canRead()) {
                customFile.inputStream().use { stream ->
                    val map = parseJsonToMap(stream)
                    if (map.isNotEmpty()) return map
                }
            }
        }

        // 2. Check assets/translations/<code_iso>.json
        runCatching {
            context.assets.open("$TRANSLATIONS_ASSET_DIR/$code.json").use { stream ->
                val map = parseJsonToMap(stream)
                if (map.isNotEmpty()) return map
            }
        }

        return emptyMap()
    }

    private fun parseJsonToMap(inputStream: InputStream): Map<String, String> {
        val jsonStr = inputStream.bufferedReader(Charsets.UTF_8).use { it.readText() }
        val json = JSONObject(jsonStr)
        val map = HashMap<String, String>(json.length())
        val keys = json.keys()
        while (keys.hasNext()) {
            val key = keys.next()
            map[key] = json.getString(key)
        }
        return map
    }

    /**
     * Translates a direct string key into the active language.
     * Returns null if no translation is available (caller can fall back to English).
     */
    fun get(key: String, context: Context): String? {
        val lang = getActiveLanguageCode(context)
        if (lang == "en" || lang.isBlank() && isSystemEnglish(context)) {
            return null
        }

        val dict = getDictionary(lang, context)
        return dict[key]
    }

    private fun isSystemEnglish(context: Context): Boolean {
        val sysLang = context.resources.configuration.locales[0]?.language ?: Locale.getDefault().language
        return sysLang.startsWith("en", ignoreCase = true)
    }

    /**
     * Formats a parameterized pattern in the active language.
     * For example: `formatPattern("Take out of \"%s\"", context, folderName)`
     * If the pattern is translated in `<lang>.json`, it formats with the args.
     */
    fun formatPattern(patternKey: String, context: Context, vararg args: Any): String? {
        val lang = getActiveLanguageCode(context)
        if (lang == "en" || lang.isBlank() && isSystemEnglish(context)) {
            return runCatching { patternKey.format(*args) }.getOrNull()
        }

        val dict = getDictionary(lang, context)
        val template = dict[patternKey] ?: return null
        return try {
            template.format(*args)
        } catch (_: Exception) {
            template
        }
    }

    /**
     * Imports an external translation JSON file into the app (e.g. from file picker).
     * Validates JSON and saves it to app internal storage.
     */
    fun importTranslation(context: Context, uri: Uri, customCode: String): Result<SupportedLanguage> {
        return runCatching {
            val code = normalizeLanguageCode(customCode).ifBlank { "custom" }
            val content = context.contentResolver.openInputStream(uri)?.use { it.bufferedReader(Charsets.UTF_8).readText() }
                ?: throw IllegalArgumentException("Could not read from Uri")

            // Validate JSON
            val json = JSONObject(content)
            if (json.length() == 0) {
                throw IllegalArgumentException("Translation file is empty")
            }

            // Save to filesDir
            val customDir = File(context.filesDir, CUSTOM_TRANSLATIONS_DIR)
            if (!customDir.exists()) customDir.mkdirs()
            val targetFile = File(customDir, "$code.json")
            targetFile.writeText(content, Charsets.UTF_8)

            // Invalidate cache
            cache.remove(code)

            val names = resolveLanguageNames(code)
            SupportedLanguage(
                code = code,
                nativeName = "${names.first} (Özel)",
                englishName = "${names.second} (Custom)",
                isCustom = true
            )
        }
    }
}
