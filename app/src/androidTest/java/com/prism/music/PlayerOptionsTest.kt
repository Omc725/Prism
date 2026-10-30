package com.prism.music

import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.prism.music.playback.QueueKind
import com.prism.music.playback.QueueSource
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * 1.7.9.1, three player requests from Reddit, each an option off by default: the volume bar like the progress bar, the
 * grey handle at the player's top hidden, and the status bar hidden only while the player is open.
 */
@RunWith(AndroidJUnit4::class)
class PlayerOptionsTest {
    @get:Rule val compose = createEmptyComposeRule()
    @get:Rule val shots = ScreenshotOnFailure()

    private var tone: android.net.Uri? = null
    private val instrumentation get() = InstrumentationRegistry.getInstrumentation()

    @After fun cleanUp() {
        runCatching { instrumentation.runOnMainSync { Fixture.container.player.stop() } }
        tone?.let { runCatching { Fixture.context.contentResolver.delete(it, null, null) } }
    }

    /** A test tone playing, the full player open (by the link a widget's cover uses), then paused so Compose goes idle. */
    private fun openPlayer() {
        Fixture.ready()
        val perm = if (android.os.Build.VERSION.SDK_INT >= 33) android.Manifest.permission.READ_MEDIA_AUDIO else android.Manifest.permission.READ_EXTERNAL_STORAGE
        instrumentation.uiAutomation.grantRuntimePermission(Fixture.context.packageName, perm)
        tone = Fixture.tone("Prism options tone", 120)
        Fixture.launch()
        val local = Fixture.container.localMusic
        runBlocking { local.scan() }
        val song = local.tracks.value.first { it.song.title == "Prism options tone" }.song
        instrumentation.runOnMainSync { Fixture.container.player.playQueue(listOf(song), 0, QueueSource(QueueKind.OTHER, "Options test")) }
        compose.waitForText("Prism options tone", 20_000)
        Fixture.context.startActivity(
            android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("prism://player"))
                .setClass(Fixture.context, PrismActivity::class.java)
                .addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK or android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP),
        )
        Thread.sleep(2_000)
        instrumentation.runOnMainSync { Fixture.container.player.setPlaying(false) }
        compose.waitUntil(15_000) { compose.onAllNodes(hasTestTag("progressBar")).fetchSemanticsNodes().isNotEmpty() }
    }

    private fun height(tag: String): Float = compose.onAllNodes(hasTestTag(tag)).fetchSemanticsNodes().first().boundsInRoot.height

    @Test fun theVolumeBarCanMatchTheProgressBar() {
        runBlocking {
            Fixture.container.settings.setHideVolumeBar(false)
            Fixture.container.settings.setScrubberThickness(1.6f)
        }
        openPlayer()
        compose.waitUntil(10_000) { compose.onAllNodes(hasTestTag("volumeBar")).fetchSemanticsNodes().isNotEmpty() }
        // Off (as before): its own height, not the thicker progress bar's.
        assertNotEquals("off: its own height", height("progressBar"), height("volumeBar"), 0.5f)

        runBlocking { Fixture.container.settings.setVolumeMatchesProgress(true) }
        compose.waitUntil(10_000) { kotlin.math.abs(height("progressBar") - height("volumeBar")) < 0.5f }
        assertEquals("on: the progress bar's height", height("progressBar"), height("volumeBar"), 0.5f)
    }

    @Test fun theHandleCanGo() {
        openPlayer()
        assertTrue("on by default", compose.onAllNodes(hasTestTag("playerHandle")).fetchSemanticsNodes().isNotEmpty())
        runBlocking { Fixture.container.settings.setPlayerHandle(false) }
        compose.waitUntil(10_000) { compose.onAllNodes(hasTestTag("playerHandle")).fetchSemanticsNodes().isEmpty() }
    }

    /** #250: the dark band behind three-button navigation on the player can go (the player shows through). */
    @Test fun theBandBehindTheNavigationButtonsCanGo() {
        openPlayer()
        compose.waitUntil(5_000) { navBarColor() != android.graphics.Color.TRANSPARENT }
        runBlocking { Fixture.container.settings.setPlayerNavBand(false) }
        compose.waitUntil(10_000) { navBarColor() == android.graphics.Color.TRANSPARENT }
    }

    private fun navBarColor(): Int {
        var color = 0
        instrumentation.runOnMainSync {
            val activity = androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry.getInstance()
                .getActivitiesInStage(androidx.test.runner.lifecycle.Stage.RESUMED).firstOrNull()
            @Suppress("DEPRECATION")
            color = activity?.window?.navigationBarColor ?: 0
        }
        return color
    }

    @Test fun theStatusBarCanGoOnlyOnThePlayer() {
        runBlocking { Fixture.container.settings.setHideStatusBarPlayer(true) }
        openPlayer()
        compose.waitUntil(10_000) { !statusBarShown() }

        // Closing the player brings it back.
        instrumentation.runOnMainSync { Fixture.container.player.setPlaying(false) }
        androidx.test.uiautomator.UiDevice.getInstance(instrumentation).pressBack()
        compose.waitUntil(10_000) { statusBarShown() }
    }

    private fun statusBarShown(): Boolean {
        var shown = true
        instrumentation.runOnMainSync {
            val activity = androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry.getInstance()
                .getActivitiesInStage(androidx.test.runner.lifecycle.Stage.RESUMED).firstOrNull()
            val insets = activity?.window?.decorView?.let { androidx.core.view.ViewCompat.getRootWindowInsets(it) }
            shown = insets?.isVisible(androidx.core.view.WindowInsetsCompat.Type.statusBars()) ?: true
        }
        return shown
    }
}
