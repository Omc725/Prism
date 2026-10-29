package com.prism.music

import android.content.res.Resources
import androidx.annotation.StringRes

/**
 * Prism's text in the listener's language (1.7.9). Every word on screen is in res/values/strings.xml (translated in
 * values-xx/ through Weblate) and read with [tr]: in a screen, a menu, a notification or a setting's label alike. Prism
 * restarts when its language changes, so text read once (a menu's labels) is never left in the old one.
 */
object Strings {
    /** Set first thing in PrismApp.onCreate (the language's resources); tests without Prism's app find their own. */
    @Volatile var resources: Resources? = null

    internal val res: Resources
        get() = resources ?: fallback().also { resources = it }

    /** Only for tests that run with a plain Application: the process's app, as Android itself keeps it. */
    private fun fallback(): Resources = runCatching {
        (Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null) as android.app.Application).resources
    }.getOrElse { Resources.getSystem() }
}

/** [id]'s text in the listener's language. */
fun tr(@StringRes id: Int): String = Strings.res.getString(id)

/** [id]'s text with [args] in its places (%1$s, %2$s…). */
fun tr(@StringRes id: Int, vararg args: Any?): String = Strings.res.getString(id, *args)
