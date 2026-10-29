package com.prism.music

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/** Settings search (#73): a word finds the setting, the result opens its page, and the setting there works. */
@RunWith(AndroidJUnit4::class)
class SettingsSearchTest {
    @get:Rule val compose = createEmptyComposeRule()
    @get:Rule val shots = ScreenshotOnFailure()

    @Before fun start() {
        Fixture.ready()
        Fixture.launch()
    }

    @Test fun aSearchOpensTheSettingAndItWorks() {
        compose.openSettings()
        compose.onNode(hasSetTextAction()).performTextInput("crossfade")
        compose.waitForText("Crossfade songs")
        compose.onNodeWithText("Crossfade songs").performClick()
        // Its page: the search box is gone and the switch is there.
        compose.waitUntil(5_000) { compose.onAllNodes(hasSetTextAction()).fetchSemanticsNodes().isEmpty() }
        compose.onNodeWithText("Crossfade songs").assertIsDisplayed()
        val before = Fixture.container.settings.current.mix
        compose.onNodeWithText("Crossfade songs").performClick()
        compose.waitUntil(5_000) { Fixture.container.settings.current.mix != before }
        assertTrue("Crossfade songs turned ${if (before) "off" else "on"}", Fixture.container.settings.current.mix != before)
    }

    /** #209 (1.7.9): a slider described in words also shows its number. */
    @Test fun slidersShowTheirNumber() {
        compose.openSettings()
        compose.onNode(hasSetTextAction()).performTextInput("line spacing")
        compose.clickWhenFound(androidx.compose.ui.test.hasText("Line spacing") and androidx.compose.ui.test.hasClickAction())
        compose.waitForText("As usual · 100%")
    }

    @Test fun aWordWithNoSettingSaysSo() {
        compose.openSettings()
        compose.onNode(hasSetTextAction()).performTextInput("zzqx")
        compose.waitUntil(5_000) { compose.onAllNodes(androidx.compose.ui.test.hasText("Crossfade songs")).fetchSemanticsNodes().isEmpty() }
    }
}

/** Home's picture opens Settings (there's no Settings tab by default). */
fun androidx.compose.ui.test.junit4.ComposeTestRule.openSettings() {
    waitUntil(15_000) { onAllNodesWithContentDescription("Settings").fetchSemanticsNodes().isNotEmpty() }
    onAllNodesWithContentDescription("Settings").onFirst().performClick()
    waitUntil(10_000) { onAllNodes(hasSetTextAction()).fetchSemanticsNodes().isNotEmpty() }
}

fun androidx.compose.ui.test.junit4.ComposeTestRule.waitForText(text: String, timeoutMs: Long = 10_000) =
    waitUntil(timeoutMs) { onAllNodes(androidx.compose.ui.test.hasText(text, substring = true)).fetchSemanticsNodes().isNotEmpty() }
