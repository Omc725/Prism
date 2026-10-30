package com.prism.music

import android.content.ContentValues
import android.provider.MediaStore
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.click
import androidx.compose.ui.text.TextLayoutResult
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/** GitHub issues fixed before the 1.7.9 check: #237 tab labels, #225 search in Local files, #227 screen fades. */
@RunWith(AndroidJUnit4::class)
class IssueRound179Test {
    @get:Rule val compose = createEmptyComposeRule()
    @get:Rule val shots = ScreenshotOnFailure()

    private var tone: android.net.Uri? = null

    @After fun cleanUp() {
        tone?.let { runCatching { Fixture.context.contentResolver.delete(it, null, null) } }
    }

    /** #237: "Liked songs" on a floating, compact, six-tab bar with labels fits its tab instead of being cut off. */
    @Test fun longTabNamesFitTheFloatingBar() {
        Fixture.ready()
        runBlocking {
            Fixture.container.settings.editNow {
                it[stringPreferencesKey("nav_style")] = "FLOATING"
                it[stringPreferencesKey("nav_labels")] = "ALWAYS"
                it[stringPreferencesKey("nav_bar_size")] = "COMPACT"
                it[stringPreferencesKey("nav_tabs")] = "HOME,SEARCH,LIBRARY,LIKED,LOCAL,SETTINGS"
            }
        }
        Fixture.launch()
        val label = hasText("Liked songs")
        compose.waitUntil(15_000) { compose.onAllNodes(label, useUnmergedTree = true).fetchSemanticsNodes().isNotEmpty() }
        // The tab bar's one: the lowest on screen (Home may show a Liked songs tile too).
        val node = compose.onAllNodes(label, useUnmergedTree = true).fetchSemanticsNodes().maxBy { it.boundsInRoot.bottom }
        val layouts = mutableListOf<TextLayoutResult>()
        node.config[SemanticsActions.GetTextLayoutResult].action?.invoke(layouts)
        val layout = layouts.single()
        assertFalse("the label is cut off", layout.hasVisualOverflow)
        assertFalse("the label ends in …", layout.isLineEllipsized(0))
    }

    /** #225: Local files has a search box; a word finds the file, and nonsense says nothing matches. */
    @Test fun localFilesCanBeSearched() {
        Fixture.ready()
        val ui = InstrumentationRegistry.getInstrumentation().uiAutomation
        val perm = if (android.os.Build.VERSION.SDK_INT >= 33) android.Manifest.permission.READ_MEDIA_AUDIO else android.Manifest.permission.READ_EXTERNAL_STORAGE
        ui.grantRuntimePermission(Fixture.context.packageName, perm)
        tone = addTone("Prism search tone")
        Fixture.launch()
        compose.waitUntil(15_000) { compose.onAllNodes(hasText("Library") and hasClickAction()).fetchSemanticsNodes().isNotEmpty() }
        compose.onAllNodes(hasText("Library") and hasClickAction()).onFirst().performClick()
        compose.clickWhenFound(hasText("Local files") and hasClickAction(), 15_000)
        compose.waitUntil(30_000) { compose.onAllNodes(hasSetTextAction()).fetchSemanticsNodes().isNotEmpty() }
        compose.onNode(hasSetTextAction()).performTextInput("search tone")
        compose.waitForText("Prism search tone", 30_000)
        compose.onNode(hasSetTextAction()).performTextClearance()
        compose.onNode(hasSetTextAction()).performTextInput("zzqx nothing")
        compose.waitForText("No matches")
    }

    /** #227: "Fades between screens" is in Settings and switches the fades off. */
    @Test fun screenFadesCanBeTurnedOff() {
        Fixture.ready()
        Fixture.launch()
        compose.openSettings()
        compose.onNode(hasSetTextAction()).performTextInput("fades")
        compose.clickWhenFound(hasText("Fades between screens") and hasClickAction())
        compose.waitUntil(5_000) { compose.onAllNodes(hasSetTextAction()).fetchSemanticsNodes().isEmpty() }
        assertTrue(Fixture.container.settings.current.behavior.screenFades)
        // The switch on its row (the name itself opens the ⓘ explanation).
        val title = compose.onNodeWithText("Fades between screens").fetchSemanticsNode().boundsInRoot.center.y
        val switches = compose.onAllNodes(androidx.compose.ui.test.isToggleable())
        val i = switches.fetchSemanticsNodes().withIndex().minBy { kotlin.math.abs(it.value.boundsInRoot.center.y - title) }.index
        // At its right end, where the switch is drawn (the row's middle is its text, which opens the ⓘ).
        switches[i].performTouchInput { click(androidx.compose.ui.geometry.Offset(width - 60f, height / 2f)) }
        compose.waitUntil(5_000) { !Fixture.container.settings.current.behavior.screenFades }
    }

    /** A 25-second silent WAV in Music/, as a music file the phone's media store lists under [title]. */
    private fun addTone(title: String): android.net.Uri {
        val rate = 8_000
        val samples = rate * 25
        val data = java.io.ByteArrayOutputStream()
        fun le32(v: Int) = data.write(byteArrayOf(v.toByte(), (v shr 8).toByte(), (v shr 16).toByte(), (v shr 24).toByte()))
        fun le16(v: Int) = data.write(byteArrayOf(v.toByte(), (v shr 8).toByte()))
        data.write("RIFF".toByteArray()); le32(36 + samples * 2); data.write("WAVEfmt ".toByteArray())
        le32(16); le16(1); le16(1); le32(rate); le32(rate * 2); le16(2); le16(16)
        data.write("data".toByteArray()); le32(samples * 2); data.write(ByteArray(samples * 2))
        val resolver = Fixture.context.contentResolver
        val values = ContentValues().apply {
            put(MediaStore.Audio.Media.DISPLAY_NAME, "$title.wav")
            put(MediaStore.Audio.Media.TITLE, title)
            put(MediaStore.Audio.Media.MIME_TYPE, "audio/wav")
            put(MediaStore.Audio.Media.RELATIVE_PATH, "Music/")
            put(MediaStore.Audio.Media.IS_PENDING, 1)
        }
        val uri = resolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values)!!
        resolver.openOutputStream(uri)!!.use { it.write(data.toByteArray()) }
        resolver.update(uri, ContentValues().apply { put(MediaStore.Audio.Media.IS_PENDING, 0) }, null, null)
        return uri
    }
}
