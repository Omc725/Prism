package com.prism.music

import androidx.media3.common.Player
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.prism.music.playback.QueueKind
import com.prism.music.playback.QueueSource
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

/**
 * #241: repeat one was off again after the song was swiped away from the mini player and Prism closed. Repeat and
 * shuffle are kept with nothing lined up too.
 */
@RunWith(AndroidJUnit4::class)
class PlaybackModesTest {
    private val instrumentation get() = InstrumentationRegistry.getInstrumentation()
    private var tone: android.net.Uri? = null

    @After fun cleanUp() {
        runCatching { instrumentation.runOnMainSync { Fixture.container.player.stop() } }
        tone?.let { runCatching { Fixture.context.contentResolver.delete(it, null, null) } }
    }

    @Test fun repeatAndShuffleComeBackWithNothingLinedUp() {
        Fixture.ready()
        // What Prism kept after the song was swiped away with repeat one and shuffle on: an empty queue.
        java.io.File(Fixture.context.filesDir, "queue.json")
            .writeText("""{"songs":[],"index":0,"positionMs":0,"title":"","shuffle":true,"shuffleOrder":[],"repeat":${Player.REPEAT_MODE_ONE}}""")
        Fixture.launch()
        val player = Fixture.container.player
        waitFor(20_000) { player.repeatMode.value == Player.REPEAT_MODE_ONE }
        assertEquals(Player.REPEAT_MODE_ONE, player.repeatMode.value)
    }

    @Test fun swipingTheSongAwayKeepsRepeatInWhatsSaved() {
        Fixture.ready()
        val perm = if (android.os.Build.VERSION.SDK_INT >= 33) android.Manifest.permission.READ_MEDIA_AUDIO else android.Manifest.permission.READ_EXTERNAL_STORAGE
        instrumentation.uiAutomation.grantRuntimePermission(Fixture.context.packageName, perm)
        tone = Fixture.tone("Prism repeat tone", 60)
        Fixture.launch()
        val local = Fixture.container.localMusic
        runBlocking { local.scan() }
        val song = local.tracks.value.first { it.song.title == "Prism repeat tone" }.song
        val player = Fixture.container.player
        instrumentation.runOnMainSync { player.playQueue(listOf(song), 0, QueueSource(QueueKind.OTHER, "Repeat test")) }
        waitFor(20_000) { player.currentSong.value?.id == song.id }
        // Off → all → one.
        instrumentation.runOnMainSync { player.cycleRepeat(); player.cycleRepeat() }
        waitFor(5_000) { player.repeatMode.value == Player.REPEAT_MODE_ONE }
        // The mini player's swipe down: the queue goes.
        instrumentation.runOnMainSync { player.stop() }
        val saved = java.io.File(Fixture.context.filesDir, "queue.json")
        waitFor(10_000) { saved.exists() && saved.readText().contains("\"songs\":[]") }
        assertTrue("repeat one kept: ${saved.readText()}", saved.readText().contains("\"repeat\":${Player.REPEAT_MODE_ONE}"))
    }

    private fun waitFor(timeoutMs: Long, condition: () -> Boolean) {
        val end = System.currentTimeMillis() + timeoutMs
        while (!condition()) {
            if (System.currentTimeMillis() > end) throw AssertionError("not after $timeoutMs ms")
            Thread.sleep(200)
        }
    }
}
