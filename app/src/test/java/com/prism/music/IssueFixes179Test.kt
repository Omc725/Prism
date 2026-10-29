package com.prism.music

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import com.prism.music.data.prefs.AppSettings
import com.prism.music.data.prefs.BehaviorPrefs
import com.prism.music.data.prefs.PanelPlayer
import com.prism.music.ui.player.ControlsOnScroll
import com.prism.music.ui.player.scrollReveals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/** 1.7.9's fixes that are plain logic (the rest have in-app tests in app/src/androidTest). */
class IssueFixes179Test {
    /** #214: scrolling back up the lyrics brings the controls only when the listener wants it, never in Full screen. */
    @Test fun scrollingUpShowsTheControlsOnlyWhenWanted() {
        var shown = 0
        var hidden = 0
        val scroll = ControlsOnScroll(onHide = { hidden++ }, onReveal = { shown++ })
        fun drag(dy: Float) {
            repeat(3) { scroll.onPreScroll(Offset(0f, dy), NestedScrollSource.UserInput) }
            kotlinx.coroutines.runBlocking { scroll.onPreFling(androidx.compose.ui.unit.Velocity.Zero) }
        }
        drag(30f) // the finger down: back up the lyrics
        assertEquals("on (as before): the controls come", 1, shown)
        scroll.reveals = false
        drag(30f)
        assertEquals("off: they stay away", 1, shown)
        drag(-30f)
        assertEquals("scrolling on down still hides them", 1, hidden)

        val base = AppSettings()
        assertTrue("on by default", scrollReveals(base))
        assertFalse(scrollReveals(base.copy(behavior = BehaviorPrefs(scrollShowsControls = false))))
        assertFalse("Full screen keeps the screen", scrollReveals(base.copy(view = base.view.copy(panelPlayer = PanelPlayer.HIDDEN))))
    }
}
