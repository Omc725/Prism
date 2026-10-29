package com.prism.music

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/**
 * The fixed starting point of an in-app test. The orchestrator clears Prism's data before each test, so every test
 * starts from a fresh install; [ready] then puts Prism where a listener who has set it up would be (welcome screen and
 * tour done, the one-time offers already answered), and [launch] opens it.
 */
object Fixture {
    val context: Context get() = InstrumentationRegistry.getInstrumentation().targetContext
    val container: AppContainer get() = context.container

    /** Prism as set up: past the welcome screen and the tour, with nothing offered on the way in. */
    fun ready() = runBlocking {
        container.settings.editNow {
            it[booleanPreferencesKey("onboarded")] = true
            it[booleanPreferencesKey("performance_offered")] = true
        }
        com.prism.music.ui.tour.Tour.markSeen(context)
        context.getSharedPreferences("prompts", Context.MODE_PRIVATE).edit().putBoolean("notifications_asked", true).commit()
        // The settings Prism reads at start are its live copy of the store: wait until it has them.
        withTimeout(10_000) { while (!container.settings.current.onboarded) kotlinx.coroutines.delay(20) }
    }

    /** Songs that exist only in tests (ids no service knows), with a length and an artist like real ones. */
    fun songs(n: Int, prefix: String = "Test song") = (1..n).map { i ->
        com.prism.music.data.model.Song(
            id = "tst${i.toString().padStart(8, '0')}", title = "$prefix $i",
            artists = listOf(com.prism.music.data.model.ArtistRef("Test Artist", null)), durationSec = 180 + i,
        )
    }

    /** A Prism playlist (no account needed) holding [songs]; its id. */
    fun prismPlaylist(title: String, songs: List<com.prism.music.data.model.Song>): String = container.prismLibrary.create(title, songs)

    /**
     * [songs] as finished downloads, written into Media3's download index before Prism's downloads start (call it
     * before [launch]): pages and Downloads show them as downloaded, with no file behind them.
     */
    @androidx.annotation.OptIn(androidx.media3.common.util.UnstableApi::class)
    fun downloaded(songs: List<com.prism.music.data.model.Song>) {
        val index = androidx.media3.exoplayer.offline.DefaultDownloadIndex(container.databaseProvider)
        val now = System.currentTimeMillis()
        for (s in songs) {
            val request = androidx.media3.exoplayer.offline.DownloadRequest.Builder(s.id, android.net.Uri.parse("prism://audio/${s.id}"))
                .setCustomCacheKey(s.id)
                .setData(com.prism.music.data.innertube.InnerTube.json.encodeToString(com.prism.music.data.model.Song.serializer(), s).toByteArray())
                .build()
            index.putDownload(
                androidx.media3.exoplayer.offline.Download(
                    request, androidx.media3.exoplayer.offline.Download.STATE_COMPLETED, now, now, 3_000_000L,
                    androidx.media3.exoplayer.offline.Download.STOP_REASON_NONE, androidx.media3.exoplayer.offline.Download.FAILURE_REASON_NONE,
                ),
            )
        }
    }

    /**
     * The screen as it is, to /sdcard/prism-tests/<name>.png (outside Prism's data, which the next test clears), for
     * a failure's report and the release check's screenshot tours.
     */
    fun screenshot(name: String) {
        val ui = InstrumentationRegistry.getInstrumentation().uiAutomation
        ui.executeShellCommand("mkdir -p /sdcard/prism-tests").close()
        ui.executeShellCommand("screencap -p /sdcard/prism-tests/$name.png").use { java.io.FileInputStream(it.fileDescriptor).readBytes() }
    }

    /** Opens Prism as its launcher icon does. */
    fun launch(): ActivityScenario<PrismActivity> = ActivityScenario.launch(PrismActivity::class.java)
}
