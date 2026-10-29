package com.prism.music

import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

/**
 * Translations (1.7.9): text a person reads lives in res/values/strings.xml, never written in the code, or it would stay
 * English in every language. Fails on any such text in [CONVERTED] (the parts moved so far; the move adds to it until it
 * covers the app), with where it is. Move new text with I18nConvert (PRISM_I18N=<path>) or by hand with
 * `tr(R.string.…)`. What may stay in the code (logs, keys, addresses, YouTube's own labels) is I18nConvert's rule.
 */
class I18nGuardTest {
    private val src = File("src/main/java/com/prism/music")

    @Test fun noTextIsWrittenInTheCode() {
        val tool = I18nConvert()
        val found = CONVERTED.flatMap { path ->
            File(src, path).let { f -> if (f.isDirectory) f.walkTopDown().filter { it.extension == "kt" }.toList() else listOf(f) }
        }.flatMap { f -> tool.pending(f.readText()).map { "${f.relativeTo(src)}:$it" } }
        assertTrue("Text written in the code instead of strings.xml:\n" + found.joinToString("\n"), found.isEmpty())
    }

    companion object {
        /** Moved into strings.xml so far (1.7.9, section T). */
        val CONVERTED = listOf(
            "ui/screens/LookSettings.kt",
        )
    }
}
