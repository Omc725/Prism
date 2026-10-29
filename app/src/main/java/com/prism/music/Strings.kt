package com.prism.music

import android.content.res.Resources
import androidx.annotation.StringRes

/**
 * Prism's text in the listener's language (1.7.9). Every word on screen is in res/values/strings.xml (translated in
 * values-xx/, see [AppLanguage]) and read with [tr]: in a screen, a menu, a notification or a setting's label alike. Prism
 * restarts when its language changes, so text read once (a menu's labels) is never left in the old one.
 */
object Strings {
    /** Set first thing in PrismApp.onCreate (the language's resources). */
    @Volatile var resources: Resources? = null

    internal fun get(id: Int): String = android()?.let { r -> runCatching { r.getString(id) }.getOrNull() } ?: english(id)

    internal fun get(id: Int, args: Array<out Any?>): String =
        android()?.let { r -> runCatching { r.getString(id, *args) }.getOrNull() } ?: english(id).format(*args)

    internal fun plural(id: Int, n: Int, args: Array<out Any?>): String {
        val with = if (args.isEmpty()) arrayOf<Any?>(n) else args
        return android()?.let { r -> runCatching { r.getQuantityString(id, n, *with) }.getOrNull() }
            ?: englishPlural(id, n).format(*with)
    }

    /** The plain JVM's English plurals ([english]): "one" for 1, "other" for the rest, as English has it. */
    private fun englishPlural(id: Int, n: Int): String {
        val name = runCatching { Class.forName("com.prism.music.R\$plurals").fields.first { it.getInt(null) == id }.name }.getOrNull()
        val forms = name?.let { englishPlurals[it] } ?: return "#$id"
        return (if (n == 1) forms["one"] else null) ?: forms["other"] ?: forms.values.first()
    }

    private val englishPlurals: Map<String, Map<String, String>> by lazy {
        val xml = stringsFile()?.readText() ?: return@lazy emptyMap<String, Map<String, String>>()
        Regex("<plurals name=\"([^\"]+)\">(.*?)</plurals>", RegexOption.DOT_MATCHES_ALL).findAll(xml).associate { p ->
            p.groupValues[1] to Regex("<item quantity=\"(\\w+)\">(.*?)</item>", RegexOption.DOT_MATCHES_ALL).findAll(p.groupValues[2])
                .associate { it.groupValues[1] to unescape(it.groupValues[2]) }
        }
    }

    /** Prism's resources, or (tests on a plain Application) the process's app's, as Android itself keeps it. */
    private fun android(): Resources? = resources ?: runCatching {
        (Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null) as android.app.Application).resources
    }.getOrNull()?.also { resources = it }

    /**
     * Only where there's no Android at all (unit tests on the plain JVM, which build settings and parse YouTube without
     * an app): the English text straight from strings.xml, by the resource's name. Never on a phone.
     */
    private fun english(id: Int): String = plainJvm.getOrPut(id) {
        val name = runCatching { Class.forName("com.prism.music.R\$string").fields.first { it.getInt(null) == id }.name }.getOrNull()
        name?.let { englishXml[it] } ?: "#$id"
    }

    private val plainJvm = java.util.concurrent.ConcurrentHashMap<Int, String>()

    private fun stringsFile() = listOf("src/main/res/values/strings.xml", "app/src/main/res/values/strings.xml").map { java.io.File(it) }.firstOrNull { it.isFile }

    private fun unescape(s: String) = s.replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&")
        .replace("\\'", "'").replace("\\\"", "\"").replace("\\n", "\n").replace("\\t", "\t").replace("\\@", "@").replace("\\?", "?")
        .replace("\\\\", "\\")

    private val englishXml: Map<String, String> by lazy {
        val xml = stringsFile()?.readText() ?: return@lazy emptyMap<String, String>()
        Regex("<string name=\"([^\"]+)\"[^>]*>(.*?)</string>", RegexOption.DOT_MATCHES_ALL).findAll(xml).associate { m -> m.groupValues[1] to unescape(m.groupValues[2]) }
    }
}

/** [id]'s text in the listener's language. */
fun tr(@StringRes id: Int): String = Strings.get(id)

/** [id]'s text with [args] in its places (%1$s, %2$s…). */
fun tr(@StringRes id: Int, vararg args: Any?): String = Strings.get(id, args)

/**
 * [id]'s form for [n] in the listener's language ("1 song", "5 songs"; Polish and Arabic have more forms than
 * English), with [args] in its places, or [n] alone when there are none.
 */
fun trp(@androidx.annotation.PluralsRes id: Int, n: Int, vararg args: Any?): String = Strings.plural(id, n, args)

/**
 * A date or time format in the listener's language from a [skeleton] of what to show ("MMMd": month and day), in that
 * language's own order and words ("Nov 3", "3 nov.", "11月3日"); "j" is the hour as the language writes it (12 or 24).
 */
fun localDates(skeleton: String): java.time.format.DateTimeFormatter {
    val locale = java.util.Locale.getDefault()
    val pattern = runCatching { android.text.format.DateFormat.getBestDateTimePattern(locale, skeleton) }.getOrNull()
        ?: skeleton.replace("j", "h")
    return java.time.format.DateTimeFormatter.ofPattern(pattern, locale)
}
