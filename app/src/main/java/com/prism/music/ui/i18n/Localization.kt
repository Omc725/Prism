package com.prism.music.ui.i18n

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.prism.music.R

object LocalizedStrings {
    private val stringResMap = mapOf(
        // Tabs
        "Home" to R.string.tab_home,
        "Search" to R.string.tab_search,
        "Library" to R.string.tab_library,
        "Replay" to R.string.tab_replay,
        "Settings" to R.string.tab_settings,
        "Local files" to R.string.tab_local,

        // Actions & Controls
        "Play" to R.string.action_play,
        "Pause" to R.string.action_pause,
        "Next" to R.string.action_next,
        "Previous" to R.string.action_previous,
        "Shuffle" to R.string.action_shuffle,
        "Repeat" to R.string.action_repeat,
        "Like" to R.string.action_like,
        "Liked" to R.string.action_liked,
        "Not for me" to R.string.action_dislike,
        "Share" to R.string.action_share,
        "Play next" to R.string.action_play_next,
        "Add to queue" to R.string.action_add_to_queue,
        "Remove from library" to R.string.action_remove_from_library,
        "Add to library" to R.string.action_add_to_library,
        "In your library" to R.string.action_in_library,
        "Back" to R.string.action_back,
        "Delete" to R.string.action_delete,
        "Remove" to R.string.action_remove,
        "Edit" to R.string.action_edit,
        "Save" to R.string.action_save,
        "Clear" to R.string.action_clear,
        "Close" to R.string.action_close,
        "Reset" to R.string.dialog_reset,
        "Cancel" to R.string.dialog_cancel,
        "Done" to R.string.dialog_done,
        "Join" to R.string.action_join,
        "Leave" to R.string.action_leave,
        "Try again" to R.string.action_retry,
        "Try all again" to R.string.action_retry_all,
        "Remove all" to R.string.action_remove_all,
        "Turn off" to R.string.action_turn_off,
        "More" to R.string.action_more,
        "Mix" to R.string.action_mix,
        "Add to favourites" to R.string.action_add_to_favourites,
        "Remove from favourites" to R.string.action_remove_from_favourites,
        "Add to liked songs" to R.string.action_add_to_liked,
        "Remove from liked songs" to R.string.action_remove_from_liked,
        "Play from the best part" to R.string.action_play_best_part,
        "Go to album" to R.string.action_go_to_album,
        "Go to artist" to R.string.action_go_to_artist,
        "Go to podcast" to R.string.action_go_to_podcast,
        "Mark as played" to R.string.action_mark_played,
        "Mark as unplayed" to R.string.action_mark_unplayed,
        "Song credits" to R.string.action_song_credits,
        "Save lyrics into the file" to R.string.action_save_lyrics_file,
        "Play as a DJ set" to R.string.action_play_dj_set,
        "Share artist" to R.string.action_share_artist,
        "Signature style" to R.string.action_signature_style,
        "Page color" to R.string.action_page_color,
        "Play this artist again" to R.string.action_play_artist_again,
        "Don't play this artist" to R.string.action_dont_play_artist,

        // Player & Queue
        "Up next" to R.string.player_queue,
        "Lyrics" to R.string.player_lyrics,
        "Close lyrics" to R.string.player_close_lyrics,
        "Video" to R.string.player_video,
        "Play on" to R.string.player_output,
        "Sleep timer" to R.string.player_sleep,
        "Add to playlist" to R.string.player_add_to_playlist,
        "Playlist" to R.string.player_add_to_playlist,
        "Sleep" to R.string.player_sleep,
        "Sing" to R.string.player_sing,
        "DJ mode" to R.string.player_dj,
        "Equalizer" to R.string.player_equalizer,
        "Download" to R.string.player_download,
        "Downloads" to R.string.downloads,
        "Downloaded" to R.string.downloads,
        "Start radio" to R.string.player_radio,
        "Radio" to R.string.player_radio,
        "Speed" to R.string.player_speed,
        "Queue" to R.string.queue_title,
        "Played" to R.string.queue_played,
        "Now Playing" to R.string.queue_now_playing,
        "Next in queue" to R.string.queue_next_in_queue,
        "Autoplay" to R.string.queue_autoplay,

        // Lyrics
        "Open lyrics" to R.string.lyrics_open,
        "Looking for lyrics…" to R.string.lyrics_looking,
        "Lyrics not available" to R.string.lyrics_not_available,
        "Tap to load lyrics" to R.string.lyrics_tap_to_load,
        "No lyrics for this track" to R.string.lyrics_none,
        "Lyrics source" to R.string.lyrics_source,
        "Search with another title" to R.string.lyrics_search_other,
        "Use the song's own" to R.string.lyrics_use_own,
        "Title" to R.string.label_title,
        "Artist" to R.string.label_artist,
        "Album" to R.string.label_album,
        "Name" to R.string.label_name,
        "Description" to R.string.label_description,

        // Settings Sections
        "Appearance" to R.string.settings_appearance,
        "Layout & navigation" to R.string.settings_interface,
        "Player" to R.string.settings_player,
        "Playback & sound" to R.string.settings_sound,
        "Lyrics" to R.string.settings_lyrics,
        "Downloads & storage" to R.string.settings_downloads,
        "Prism Connect" to R.string.settings_connect,
        "Home screen" to R.string.settings_home,
        "Library & Replay" to R.string.settings_library,
        "Discord" to R.string.settings_discord,
        "About" to R.string.settings_about,
        "Language" to R.string.settings_group_language,
        "App language" to R.string.settings_app_language,

        // Equalizer
        "10-band equalizer" to R.string.eq_10_band,
        "Tone" to R.string.eq_tone,
        "Preamp" to R.string.eq_preamp,
        "Bass boost" to R.string.eq_bass_boost,
        "Loudness" to R.string.eq_loudness,
        "Prism Spatial" to R.string.eq_spatial,
        "Software spatial audio" to R.string.eq_spatial_software,
        "Intensity" to R.string.eq_intensity,
        "Headphone correction" to R.string.eq_headphone_correction,

        // Features & Screens
        "Moods & genres" to R.string.moods_title,
        "Best fits for you first" to R.string.moods_subtitle,
        "Picked for you" to R.string.moods_picked_for_you,
        "Listen together" to R.string.together_title,
        "Looking on this network…" to R.string.together_looking,
        "End session" to R.string.together_end_session,
        "Find songs" to R.string.together_find_songs,
        "Add songs" to R.string.together_add_songs,
        "Nothing playing yet" to R.string.together_nothing_playing,
        "Recently played" to R.string.local_recently_played,
        "Allow access to music files" to R.string.local_allow_access,
        "Sections" to R.string.local_sections,
        "Recognized songs" to R.string.recognize_recognized_songs,
        "Pause Prism while listening" to R.string.recognize_pause_while_listening,
        "Not found in Prism Music" to R.string.recognize_not_found,
        "Add the widget" to R.string.recognize_add_widget,
        "Again" to R.string.recognize_again,
        "Delete downloads" to R.string.downloads_delete_prompt,
        "Turn off Wi-Fi only" to R.string.downloads_wifi_off,
        "See which" to R.string.downloads_see_which,
        "Group by genre" to R.string.playlist_group_genre,
        "Edit playlist" to R.string.playlist_edit,
        "Delete playlist?" to R.string.playlist_delete_prompt,
        "Who can open it" to R.string.playlist_who_can_open,
        "Playlist picture" to R.string.playlist_picture,
        "Choose a photo" to R.string.playlist_choose_photo,
        "From your phone's photos" to R.string.playlist_from_phone,
        "Use the original picture" to R.string.playlist_use_original,
    )


    // All direct language dictionaries are dynamically loaded from assets/translations/<lang>.json via TranslationManager
        private val takeOutOfFolderRegex = Regex("""^Take out of "(.*)"$""")
    private val inFolderRegex = Regex("""^In "(.*)"$""")
    private val changeColorRegex = Regex("""^Change the (.*) color$""")
    private val mostPlayedInYearRegex = Regex("""^Most played in (\d{4})$""")
    private val folderPlaylistsRegex = Regex("""^Folder · (\d+) playlists$""")
    private val allSettingsPageRegex2 = Regex("""^All (.*) settings$""")
    private val resetSectionRegex = Regex("""^Reset (.*)\?$""")
    private val undoStepRegex = Regex("""^Undo: (.*)$""")
    private val copyingPlaylistRegex = Regex("""^Copying "(.*)"…$""")
    private val couldntLoadPlaylistRegex = Regex("""^Couldn't load "(.*)"$""")
    private val noSongsToCopyRegex = Regex("""^"(.*)" has no songs to copy$""")
    private val savedCopyPrismRegex = Regex("""^Saved "(.*)" as a Prism playlist \((.*)\)$""")
    private val songRegex = Regex("""^(\d+)\s*songs?$""")
    private val albumRegex = Regex("""^(\d+)\s*albums?$""")
    private val artistRegex = Regex("""^(\d+)\s*artists?$""")
    private val offlineRegex = Regex("""^(\d+)\s*songs offline$""")
    private val listeningRegex = Regex("""^Listening\s*\((\d+)\)$""")
    private val smartDlsRegex = Regex("""^Clear Smart Downloads\s*\((\d+)\)$""")
    private val downloadedCountRegex = Regex("""^(\d+)\s+downloaded$""")
    private val percentOfLineRegex = Regex("""^(\d+)%\s+of the line$""")
    private val moreByRegex = Regex("""^More by\s+(.*)$""")
    private val deleteAllDownloadsRegex = Regex("""^Delete all (\d+) downloads \((.*?)\)\? This frees the space straight away\.(.*)$""")
    private val deleteSavedVideosRegex = Regex("""^Delete the (\d+) saved music videos\? The songs stay downloaded\.$""")
    private val deleteSmartDlsPromptRegex = Regex("""^Delete the (.*?) smart downloads added\? They may come back later if smart downloads stays on\.$""")
    private val nothingInMatchesRegex = Regex("""^Nothing in (.*?) matches \"(.*?)\"(.*)$""")
    private val nextFromRegex = Regex("""^Next from:\s*(.*)$""")
    private val continueAlbumRegex = Regex("""^Continue\s+(.+)$""")
    private val fromTheAlbumRegex = Regex("""^From the album\s+(.+)$""")
    private val singPercentRegex = Regex("""^Sing\s*·\s*(\d+)%$""")
    private val usersPhoneRegex = Regex("""^(.+)'s Phone$""")
    private val djReadingRegex = Regex("""^DJ mode: reading keys and tempos…\s*(\d+)\s+of\s+(\d+)$""")
    private val djWaitForWifiRegex = Regex("""^(.*?),\s*(\d+)\s+wait for Wi-Fi$""")
    private val djKeysOnWifiRegex = Regex("""^DJ mode: keys are read on Wi-Fi\s*\((\d+)\s+songs?\s+waiting\)$""")
    private val djKeyOrderWifiRegex = Regex("""^DJ mode:\s*(\d+)\s+of\s+(\d+)\s+songs in key order,\s*the rest wait for Wi-Fi$""")
    private val djKeyOrderStayRegex = Regex("""^DJ mode:\s*(\d+)\s+of\s+(\d+)\s+songs in key order,\s*the rest stay put$""")
    private val minutePluralRegex = Regex("""^([\d,.]+)\s+minutes?$""")
    private val minShortRegex = Regex("""^([\d,.]+)\s+min$""")
    private val hourShortRegex = Regex("""^([\d,.]+)\s*h$""")
    private val hourMinShortRegex = Regex("""^([\d,.]+)\s*h\s+([\d,.]+)\s*m$""")
    private val lessThanMinShortRegex = Regex("""^<1\s+min$""")
    private val searchInRegex = Regex("""^Search in\s*(.*)$""")
    private val titleCountRegex = Regex("""^(.*?)\s*·\s*(\d+)$""")
    private val playbackSpeedRegex = Regex("""^Playback speed\s*(.*)$""")
    private val playTitleRegex = Regex("""^Play\s+(.*)$""")
    private val useLookRegex = Regex("""^Use\s+(.*)$""")
    private val moreForLookRegex = Regex("""^More for\s+(.*)$""")
    private val spaceToUseRegex = Regex("""^Space to use:\s*(.*)$""")
    private val storageInfoRegex = Regex("""^About\s+(.*?)\s+songs\s+·\s+(.*?)\s+used\s+·\s+(.*?)\s+free on the phone.*$""")
    private val aboutSongsRegex = Regex("""^About\s+([\d\.,]+)\s+songs?$""")
    private val usedSizeRegex = Regex("""^([\d\.,]+\s*(?:MB|GB|KB|B))\s+used$""")
    private val freeOnPhoneRegex = Regex("""^([\d\.,]+\s*(?:MB|GB|KB|B))\s+free on the phone$""")
    private val allSettingsRegex = Regex("""^All\s+(.*?)\s+settings$""")
    private val resetQuestionRegex = Regex("""^Reset\s+(.*?)\?$""")
    private val undoRegex = Regex("""^Undo:\s*(.*)$""")
    private val pairQuestionRegex = Regex("""^Pair with\s*(.*?)\?$""")
    private val pairActionRegex = Regex("""^Pair with\s*(.*)$""")
    private val playingOnRegex = Regex("""^Playing on\s+(.*)$""")
    private val addedToRegex = Regex("""^Added to\s*(.*)$""")
    private val alreadyInRegex = Regex("""^Already in\s*(.*)$""")
    private val savedToRegex = Regex("""^Saved\s+(.*?)\s+to\s+(.*)$""")
    private val couldntAddRegex = Regex("""^Couldn't add to\s*(.*)$""")
    private val lyricsSecondsRegex = Regex("""^Lyrics\s+(.*?)\s+seconds$""")
    private val stopsInMinRegex = Regex("""^Stops in\s+(\d+)\s+min$""")
    private val videoWaitRegex = Regex("""^Matched automatically — the song starts\s+(.*?)\s+into the video, so the lyrics wait for it\.$""")
    private val videoSkipRegex = Regex("""^Matched automatically — the video skips the song's first\s+(.*?)\.$""")
    private val topSongsYearRegex = Regex("""^Top songs of (\d+)$""")
    private val rewindYearOpenRegex = Regex("""^Your (\d+) Rewind opens on December 1$""")
    private val rewindYearRegex = Regex("""^REWIND (\d+)$""")
    private val replayPrefixRegex = Regex("""^Replay · (.*)$""")
    private val savedYtmRegex = Regex("""^Saved \"(.*?)\" to YouTube Music$""")
    private val themeRegex = Regex("""^(\w+)\s+theme$""")
    private val fontRegex = Regex("""^(\w+)\s+font$""")
    private val tabsRegex = Regex("""^(\d+)\s+tabs?$""")
    private val smartDlsSizeRegex = Regex("""^Smart Downloads\s+(\d+(?:\.\d+)?\s*(?:GB|MB))$""")
    private val eqRegex = Regex("""^EQ\s*(.*)$""")
    private val moreAboutRegex = Regex("""^More about\s+(.*)$""")
    private val offlineReadyRegex = Regex("""^You're offline · (\d+) of (\d+) songs are on this phone and play$""")
    private val andMoreRegex = Regex("""^and\s+(\d+)\s+more$""")
    private val ofYearRegex = Regex("""^of\s+(\d{4})$""")
    private val downloadingNumRegex = Regex("""^Downloading\s+(\d+)…$""")
    private val downloadingPctRegex = Regex("""^Downloading…\s*(\d+)%$""")
    private val lyricsFontFileRegex = Regex("""^Lyrics font file:\s*(.*)$""")
    private val measuredByRegex = Regex("""^Measured by\s+(.*)$""")
    private val goToRegex = Regex("""^Go to\s+(.*)$""")
    private val couldntDownloadRegex = Regex("""^Couldn't download it:\s*(.*)$""")
    private val usingMbRegex = Regex("""^Using\s+(.*)$""")
    private val deleteVideosRegex = Regex("""^Delete music videos\s*\((.*?)\)$""")
    private val deleteSmartRegex = Regex("""^Delete smart downloads\s*\((.*?)\)$""")
    private val optionsForRegex = Regex("""^Options for\s+(.*)$""")
    private val dragRegex = Regex("""^Drag\s+(.*)$""")
    private val whatsNewRegex = Regex("""^What's new in Prism\s+(.*)$""")

    private val moveUpRegex = Regex("""^Move\s+(.*?)\s+up$""")
    private val moveDownRegex = Regex("""^Move\s+(.*?)\s+down$""")
    private val aboutGeneralRegex = Regex("""^About\s+(.*)$""")
    private val shareGeneralRegex = Regex("""^Share\s+(.*)$""")
    private val forgetRegex = Regex("""^Forget\s+(.*)$""")
    private val unpairRegex = Regex("""^Unpair\s+(.*)$""")
    private val startMixRegex = Regex("""^Start\s+(.*?)\s+Mix$""")
    private val updatedRegex = Regex("""^Updated\s+(.*)$""")
    private val moreForRegex = Regex("""^More for\s+(.*)$""")
    private val goBackToRegex = Regex("""^Go back to\s+(.*?)\s+as saved$""")
    private val favFindRegex = Regex("""^Your favorite find:\s*(.*?)(?:,\s*with|\s+with)\s*(.*?)\.$""")
    private val firstSongRegex = Regex("""^Your first song of\s*(.*?):$""")
    private val onRepeatRegex = Regex("""^On repeat:\s*(.*)$""")
    private val sharedGenresRegex = Regex("""^Shared genres:\s*(.*)$""")
    private val youBothPlayRegex = Regex("""^You both play\s*(.*)$""")
    private val wantsToPlayRegex = Regex("""^(.*?)\s+wants to play music here\. To let it, type this code on\s+(.*?):$""")
    private val addingToSessionRegex = Regex("""^Adding to\s+(.*?)'s session$""")
    private val redownloadLyricsRegex = Regex("""^Re-download fetches\s+(.*?)'s lyrics again and replaces the saved copy$""")
    private val dotsAndMoreRegex = Regex("""^…and\s+(\d+)\s+more$""")
    private val noHeadphonesMatchRegex = Regex("""^No headphones match \"(.*?)\"\. AutoEq only has headphones someone has measured; you can also import a ParametricEQ file\.$""")
    private val prismRedrawnRegex = Regex("""^Prism\s+(.*?)\s+is redrawn from the ground up and does more than ever\. Here's a minute's tour: swipe, or tap Start\.$""")
    private val thingsToKnowRegex = Regex("""^(\d+)\s+(?:thing|things)\s+to know since you last looked, in about a minute\.$""")
    private val couldntLoadAutoEqRegex = Regex("""^Couldn't load AutoEq's list:\s*(.*)$""")
    private val showSectionHomeRegex = Regex("""^Show the\s+(.*?)\s+section to see these on Home$""")
    private val lastChangesLookRegex = Regex("""^Your last\s+(\d+)\s+changes to the look show here, to go back through\.$""")
    private val singSeparatesRegex = Regex("""^Sing separates each song's voice from its music on your phone, with no server\. It needs a one-time download:\s*(.*?)\.$""")




    private val immersivePlayerDescRegex = Regex("""^Immersive player,\s*(.*?)\s+by\s*(.*)$""")
    private val sleepTimerDescRegex = Regex("""^Sleep timer:\s*(.*?)\.\s*Tap to change it\.$""")
    private val colorIndexRegex = Regex("""^Color\s+(\d+),\s*(.*)$""")
            private val downloadingCountRegex = Regex("""^Downloading\s+(\d+)…$""")
    private val downloadingPercentRegex = Regex("""^Downloading…\s+(\d+)%$""")
    private val aboutPageRegex = Regex("""^About\s+(.*)$""")
    private val addToSourceRegex = Regex("""^Add to\s+(.*)$""")
        private val goBackAsSavedRegex = Regex("""^Go back to\s+(.*?)\s+as saved$""")
    private val howReplayLooksRegex = Regex("""^How Replay looks on Home, from the quietest to the most colorful\.\s*(.*?):\s*(.*)$""")
        private val lyricsForKaraokeRegex = Regex("""^Lyrics for\s+(.*?)\s*·\s*(.*?)\s*karaoke(?:\s*·\s*getting more…)?$""")
    private val lyricsFromSrcRegex = Regex("""^Lyrics from\s+(.*)$""")
        private val pairWithRegex = Regex("""^Pair with\s+(.*?)\??$""")
        private val replayYearRegex = Regex("""^Replay\s+(\d{4})$""")
    private val replayYearTopRegex = Regex("""^Replay\s+(\d{4})\s*·\s*your #1$""")
        private val shareTargetRegex = Regex("""^Share\s+(.*)$""")
            private val textOnItRegex = Regex("""^Text on it\s*·\s*(.*)$""")
    private val undoActionRegex = Regex("""^Undo:\s*(.*)$""")
    private val whenPrismOpensRegex = Regex("""^When the new Prism opens, tap\s*(.*)$""")
        private val youPlayedTimesRegex = Regex("""^You played it\s+(\d+)\s+times?$""")
    private val offlineSongsCountRegex = Regex("""^You're offline\s*·\s*(\d+)\s+of\s+(\d+)\s+songs are on this phone and play$""")
    private val rewindOpensRegex = Regex("""^Your\s+(\d{4})\s+Rewind opens on December 1$""")
    private val yourBlendNameRegex = Regex("""^Your Blend name:\s*(.*)$""")
    private val yourFavoriteFindRegex = Regex("""^Your favorite find:\s*(.*?)(?:,\s*with\s*|\s*-\s*)(.*?)\.?$""")
    private val yourFirstSongOfRegex = Regex("""^Your first song of\s+(.*?):$""")
    private val andMoreCountRegex = Regex("""^and\s+(\d+)\s+more$""")
    private val noSettingsMatchRegex = Regex("""^No settings match\s*(.*)$""")
    private val pickButtonsRegex = Regex("""^Pick\s+(\d+)\s+to\s+(\d+)\s+for the row under the controls\..*""")
    private val onBothPhonesBlendRegex = Regex("""^On both phones:\s*you and\s+(.*?)\s+have the same Blend\.$""")
    private val sendCodeBackBlendRegex = Regex("""^Send your code back so\s+(.*?)'s Blend is the same as yours\.$""")
    private val prismVersionRegex = Regex("""^Prism\s+v?(\d+\.\d+\.\d+.*)$""")


    private val sessionRegex = Regex("""^(.+?)'s session(?:\s*·\s*(\d+)\s*listening)?$""")
    private val tasteMatchRegex = Regex("""^(\d+)%\s+taste\s+match$""")
    private val waitingWifiRegex = Regex("""^(\d+)\s+waiting for Wi-Fi$""")
    private val dlsFailedRegex = Regex("""^(\d+)\s+downloads?\s+failed$""")
    private val daysMusicRegex = Regex("""^That's\s+([\d\.]+)\s+(days|hours)\s+of music,\s+start to finish\.$""")
    private val shareAllPlayedRegex = Regex("""^(\d+)%\s+of everything you played was them\.$""")
    private val thatMonthRegex = Regex("""^(.*?)\s+that month\.$""")
    private val listenedRegex = Regex("""^(.*?)\s+listened$""")
    private val couldntShareRegex = Regex("""^Couldn't share your\s*(.*)$""")
    private val compareChangeRegex = Regex("""^(\d+)%\s+(more|less)\s+than\s+(.*)$""")
    private val daysInARowRegex = Regex("""^(\d+)\s+days in a row$""")
    private val againRegex = Regex("""^(.*?)(?:,\s*again|\s+again)$""")
    private val removedDlsRegex = Regex("""^Removed\s+(\d+)\s+downloads$""")
    private val downloadingItemRegex = Regex("""^Downloading\s+(.*)$""")
    private val removedFromRegex = Regex("""^Removed from\s+(.*)$""")
    private val couldntRemoveItRegex = Regex("""^Couldn't remove it:\s*(.*)$""")
    private val couldntSaveRegex = Regex("""^Couldn't save:\s*(.*)$""")
    private val couldntDeleteTitleRegex = Regex("""^Couldn't delete "(.*?)":\s*(.*)$""")
    private val markedAtRegex = Regex("""^Marked at\s+(\d+:\d+)$""")
    private val playsCountRegex = Regex("""^(\d+)\s+plays?$""")
    private val daysCountRegex = Regex("""^(\d+)\s+days?$""")
    private val savedQuotedRegex = Regex("""^Saved "(.*?)"$""")

    private val loyalistRegex = Regex("""^You know what you love\. Your top five artists made up (\d+)% of everything you played\.$""")
    private val explorerRegex = Regex("""^Always on the hunt\. (\d+) of the (\d+) artists you played were new to you\.$""")
    private val replayerSongRegex = Regex("""^When a song hits, you run it back\.\s*\"(.*?)\"\s*alone got (\d+) plays\.$""")
    private val nightOwlRegex = Regex("""^Your music comes alive after dark:\s*(\d+)% of it played between 10 PM and 4 AM\.$""")
    private val earlyRiserRegex = Regex("""^You start the day with a soundtrack:\s*(\d+)% of your listening happened before 9 AM\.$""")
    private val marathonerRegex = Regex("""^On the days you listened, you averaged (\d+) minutes\. That's commitment\.$""")
    private val albumRecapRegex = Regex("""^(\d+) of its songs,\s*(\d+) plays,\s*(.*?)\.$""")
    private val atTimeRegex = Regex("""^(.*?) at (\d+:\d+\s*(?:AM|PM|am|pm))$""")
    private val scannedYourCodeRegex = Regex("""^(.*?) scanned your code: your Blend is made$""")
    private val blendUpToDateRegex = Regex("""^(.*?)'s Blend is up to date$""")
    private val blendWithMadeRegex = Regex("""^Blend with (.*?) made$""")
    private val madeOnPhoneTooRegex = Regex("""^Made on (.*?)'s phone too$""")
    private val couldntReachPhoneRegex = Regex("""^Couldn't reach (.*?)'s phone \(on another Wi-Fi\?\)\. Let them scan your code to have it too\.$""")
    private val youreOnLookWithChangesRegex = Regex("""^You're on (.*?), with changes$""")
    private val youreOnLookRegex = Regex("""^You're on (.*?)$""")
    private val editsSinceSavedRegex = Regex("""^(.*?) since you saved it\. Update it to keep them in (.*?)\.$""")
    private val savedQueueCountRegex = Regex("""^Saved (.*?) to (.*?)$""")
    private val nothingToPlayRegex = Regex("""^Nothing to play in "(.*?)"$""")
    private val djSetNeedsRegex = Regex("""^A DJ set needs more than one song$""")
    private val couldntBuildPeriodRegex = Regex("""^Couldn't build your (Rewind|Replay)$""")
    private val playingNextQueueRegex = Regex("""^(.*?) (playing next|added to the queue)$""")
    private val couldntStartRegex = Regex("""^Couldn't start (.*?)$""")
    private val backupFailedRegex = Regex("""^Backup failed:\s*(.*)$""")
    private val accountCopiedRegex = Regex("""^Copied (\d+) playlists, (\d+) albums and (\d+) artists(?:\s*\((\d+)\s+playlists couldn't be read\))?$""")
    private val lyricsAlreadyInRegex = Regex("""^These lyrics are already in (.*?)\. Translations show for songs in other languages\.$""")

    private val likedDeleteRegex = Regex("""^"(.+)" will be deleted from your YouTube Music account\. Your liked songs stay liked\.$""")
    private val couldntDeleteItRegex = Regex("""^Couldn't delete it: (.+)$""")
    private val madeWithNameCountRegex = Regex("""^Made "(.+)" with (.+)$""")
    private val couldntMakePlaylistMsgRegex = Regex("""^Couldn't make the playlist: (.+)$""")
    private val lastUpdateFailedRegex = Regex("""^Last update failed: (.+)$""")
    private val titleUpdatedRegex = Regex("""^"(.+)" · updated (.+)$""")
    private val lyricsSavedFilesRegex = Regex("""^Lyrics saved into (\d+) files$""")
    private val lyricsSavedOfFilesRegex = Regex("""^Lyrics saved into (\d+) of (\d+) files$""")
    private val gettingLyricsFilesRegex = Regex("""^Getting lyrics for (\d+) files…$""")
    private val sentToHostRegex = Regex("""^Sent to (.+)$""")
    private val playlistsProgressRegex = Regex("""^Playlists: (\d+) of (\d+)$""")
    private val thatMusicTimeRegex = Regex("""^That's ([\d\.,]+) (days|hours) of music, start to finish\.$""")
    private val togetherHostSessionRegex = Regex("""^(.+)'s session(?:\s*·\s*(\d+)\s+listening)?$""")
    private val togetherCatchUpRegex = Regex("""^You paused or played something else here\. Tap to catch up with (.+)\.$""")
    private val ellipsisAndMoreRegex = Regex("""^…and (\d+) more$""")
    private val togetherAddToHostQueueRegex = Regex("""^Add songs from any song's ⋯ menu: they go to (.+)'s queue\.$""")
    private val turnOnSettingFirstRegex = Regex("""^Turn on (.+) first$""")
    private val summaryTabsRegex = Regex("""^(\d+) tabs$""")
    private val summaryMiniPlayerRegex = Regex("""^(.+) mini player$""")
    private val summaryBarRegex = Regex("""^(.+) bar$""")
    private val summaryQualityRegex = Regex("""^(.+) quality$""")
    private val summarySmartDownloadsRegex = Regex("""^Smart Downloads (.+)$""")
    private val summaryStyleRegex = Regex("""^(.+) style$""")
    private val summaryFirstRegex = Regex("""^(.+) first$""")
    private val summaryTextScaleRegex = Regex("""^(\d+)% size$""")
    private val summaryHexAccentRegex = Regex("""^(#?[0-9a-fA-F]{6,8}) accent$""")
    private val summaryFontRegex = Regex("""^(.+) font$""")
    private val livesInPrismRegex = Regex("""^(.+) lives in Prism, so there's no link to it\. The picture and the track list share what's in it\.$""")
    private val rewindReadyRegex = Regex("""^Your (\d{4}) Rewind is ready$""")
    private val newFromOneArtistRegex = Regex("""^New from (.+)$""")
    private val newFromTwoArtistsRegex = Regex("""^New from (.+) and (.+)$""")
    private val newFromMultipleArtistsRegex = Regex("""^New from (.+), (.+) and (\d+) more$""")
    private val foundItRegex = Regex("""^Found it: (.+)$""")
    private val pairingCodeNotificationRegex = Regex("""^Pairing code:\s*(.*)$""")
    private val wantsToPlayNotificationRegex = Regex("""^(.+) wants to play music on this device\. Type this code on (.+) to pair them\.$""")
    private val intoLangRegex = Regex("""^Into\s+(.*)$""")
    private val howArtistNameSetRegex = Regex("""^How (.*?)'s name is set on their page\. Tip: long-press the name to come back here\.$""")
    private val togetherJoinedRegex = Regex("""^(.+)\s+joined$""")
    private val togetherAddedRegex = Regex("""^(.+)\s+added\s+(.+)$""")
    private val togetherEndedRegex = Regex("""^(.+)\s+ended the session$""")
    private val lostConnectionRegex = Regex("""^Lost the connection to\s+(.*)$""")
    private val playingHereFromRegex = Regex("""^Playing here from\s+(.*)$""")
    private val playingOnDeviceRegex = Regex("""^Playing on\s+(.*)$""")
    private val movingToDeviceRegex = Regex("""^Moving to\s+(.*?)…$""")
    private val bringingOverRegex = Regex("""^Bringing it over from\s+(.*?)…$""")
    private val didntAcceptPairingRegex = Regex("""^(.*?) didn't accept the pairing\. Try again\.$""")
    private val couldntStartPlayingOpenRegex = Regex("""^(.*?) couldn't start playing\. Open Prism there and try again$""")
    private val openPrismFirstRegex = Regex("""^Open Prism on (.*?) first: Android only lets it start playing there while it's open \(or already playing\)$""")
    private val showingSixDigitCodeRegex = Regex("""^(.*?) is showing a six-digit code\. Type it here \(only needed the first time\)\.$""")
    private val songsOnPhoneWithVideosRegex = Regex("""^(\d+)\s+songs?\s+·\s+([\d\.,\s]+(?:MB|GB|KB|B))\s+on this phone(?:\s+\(([\d\.,\s]+(?:MB|GB|KB|B))\s+with videos\))?$""")
    private val musicVideosDownloadingRegex = Regex("""^(\d+)\s+music videos?\s+·\s+([\d\.,\s]+(?:MB|GB|KB|B))(?:\s+·\s+(\d+)\s+downloading)?$""")
    private val losslessFromPhoneRegex = Regex("""^(\d+)\s+lossless from your phone's music files$""")
    private val lyricsForKaraokeMoreRegex = Regex("""^Lyrics for\s+(\d+)\s+·\s+(\d+)\s+karaoke(?:\s+·\s+getting more…)?$""")
    private val downloadingSongsCountRegex = Regex("""^Downloading\s+(.+?)…$""")
    private val cancelDownloadsPromptRegex = Regex("""^Cancel\s+(\d+)\s+downloads that haven't finished\?$""")
    private val pairedLastUsedRegex = Regex("""^Paired\s+(.*?)\s+·\s+last used\s+(.*?)$""")
    private val usingMbGbRegex = Regex("""^Using\s+([\d\.,]+\s*(?:MB|GB|KB|B))$""")
    private val switchedToAccountRegex = Regex("""^Switched to\s+(.*)$""")
    private val goToLookAsSavedRegex = Regex("""^Go back to\s+(.*?)\s+as saved$""")
    private val replayStoryPlayedTimesRegex = Regex("""^You played it\s+(\d+)\s+(?:time|times),\s+for\s+(.*?)\.$""")
    private val allSettingsPageRegex = Regex("""^All\s+(.*?)\s+settings$""")
    private val togetherListenStepRegex = Regex("""^The same music plays on this phone, in step with (.*?)'s\. Off: just add songs to their queue\.$""")
    private val pickControlsRowRegex = Regex("""^Pick (\d+) to (\d+) for the row under the controls\. Hold one \(or drag its grip\) to put them in your order\. The rest stay in the player's ⋯ menu\.$""")
    private val savedToYouTubeMusicRegex = Regex("""^Saved "(.*?)" to YouTube Music$""")
    private val lookingUpSongRegex = Regex("""^Looking up "(.*?)"(?:\s+by\s+(.*?))?$""")
    private val downloadingJapaneseKanjiRegex = Regex("""^Downloading Japanese kanji readings…\s*(\d+)%$""")
    private val ourBlendOnPrismRegex = Regex("""^Our Blend on Prism:\s*(\d+)%\s*taste match$""")
    private val sendLookRegex = Regex("""^Send\s+(.*?)$""")
    private val timeRemainingRegex = Regex("""^([\d:]+)\s+left$""")
    private val playlistsCountRegex = Regex("""^(\d+)\s+playlists$""")
    private val nextLookAtRegex = Regex("""^Next:\s*(.*?)\s*at\s*(\d{1,2}:\d{2})$""")
    private val lastStepsChangesRegex = Regex("""^Your last\s+(\d+)\s+changes to the look show here, to go back through\.$""")
    private val andMoreUpcomingRegex = Regex("""^…and\s+(\d+)\s+more$""")
    private val togetherHostQueueRegex = Regex("""^Add songs from any song's ⋯ menu: they go to (.*?)'s queue\.$""")
    private val aboutSmartSongsFreeRegex = Regex("""^About\s+(.*?)\s+songs\s+·\s+(.*?)\s+used\s+·\s+([\d\.,]+\s*GB)\s+free on the phone$""")
    private val replayYearNumberOneRegex = Regex("""^Replay\s+(\d{4})\s+·\s+your #1$""")
    private val homeBackdropOverColorRegex = Regex("""^Home has the (.*?) background \(Glass & backgrounds\), drawn over this color, so it only shows a little there\. Pick Ambient there to see it fully$""")
    private val tourPlanThingsRegex = Regex("""^(\d+)\s+(?:thing|things)\s+to know since you last looked, in about a minute\.$""")

    fun get(text: String, context: Context): String {
        val clean = text.trim()
        if (clean.isEmpty()) return text

        // 1. Direct dictionary lookup via TranslationManager (assets/translations/<lang>.json or custom JSON)
        val translated = TranslationManager.get(clean, context)
        if (translated != null) return translated

        // 2. Android R.string resource fallback
        val res = stringResMap[clean]
        if (res != null) return context.getString(res)

        val lang = TranslationManager.getActiveLanguageCode(context)

        storageInfoRegex.matchEntire(clean)?.let { m ->
            val songs = m.groupValues[1]
            val used = m.groupValues[2]
            val free = m.groupValues[3]
            val extra = if (clean.contains("stops when storage runs low")) {
                if (lang == "tr") " (depolama azaldığında durur)" else " (yaddaş azaldıqda dayanır)"
            } else ""
            return when (lang) {
                "tr" -> "Yaklaşık $songs şarkı · $used kullanıldı · telefonda $free boş$extra"
                "az" -> "Təxminən $songs mahnı · $used istifadə edildi · telefonda $free boşdur$extra"
                else -> clean
            }
        }

        if (clean.contains(" · ")) {
            val parts = clean.split(" · ")
            val translatedParts = parts.map { get(it, context) }
            if (translatedParts != parts) {
                return translatedParts.joinToString(" · ")
            }
        }

        if (clean.contains(" › ")) {
            val parts = clean.split(" › ")
            val translatedParts = parts.map { get(it, context) }
            if (translatedParts != parts) {
                return translatedParts.joinToString(" › ")
            }
        }

        if (clean.contains(" • ")) {
            val parts = clean.split(" • ")
            val translatedParts = parts.map { get(it, context) }
            if (translatedParts != parts) {
                return translatedParts.joinToString(" • ")
            }
        }

        songRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count şarkı"
                "az" -> "$count mahnı"
                else -> clean
            }
        }

        albumRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count albüm"
                "az" -> "$count albom"
                else -> clean
            }
        }

        artistRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count sanatçı"
                "az" -> "$count sənətçi"
                else -> clean
            }
        }

        offlineRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count şarkı çevrimdışı"
                "az" -> "$count mahnı oflayn"
                else -> clean
            }
        }

        listeningRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Dinleyenler ($count)"
                "az" -> "Dinləyənlər ($count)"
                else -> clean
            }
        }

        smartDlsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Akıllı indirmeleri temizle ($count)"
                "az" -> "Ağıllı endirmələri sil ($count)"
                else -> clean
            }
        }

        downloadedCountRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count indirildi"
                "az" -> "$count endirildi"
                else -> clean
            }
        }

        percentOfLineRegex.matchEntire(clean)?.let { m ->
            val pct = m.groupValues[1]
            return when (lang) {
                "tr" -> "Satırın %$pct'si"
                "az" -> "Sətrin %$pct-i"
                else -> clean
            }
        }

        moreByRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name sanatçısından daha fazlası"
                "az" -> "$name sənətçisindən daha çox"
                else -> clean
            }
        }

        deleteAllDownloadsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            val size = m.groupValues[2]
            val rest = m.groupValues[3]
            return when (lang) {
                "tr" -> "Tüm $count indirmeyi ($size) silmek istiyor musunuz? Bu hemen yer açar.$rest"
                "az" -> "Bütün $count endirməni ($size) silmək istəyirsiniz? Bu dərhal yer açır.$rest"
                else -> clean
            }
        }

        deleteSavedVideosRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count kayıtlı müzik videosu silinsin mi? Şarkılar indirilmiş olarak kalır."
                "az" -> "$count saxlanılan musiqi videosu silinsin? Mahnılar endirilmiş olaraq qalır."
                else -> clean
            }
        }

        deleteSmartDlsPromptRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1].localized(context)
            return when (lang) {
                "tr" -> "Eklenen $count akıllı indirme silinsin mi? Akıllı indirmeler açık kalırsa daha sonra tekrar gelebilirler."
                "az" -> "Əlavə edilmiş $count ağıllı endirmə silinsin? Ağıllı endirmələr açıq qalsa, daha sonra yenidən gələ bilər."
                else -> clean
            }
        }

        nothingInMatchesRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val query = m.groupValues[2]
            val rest = m.groupValues[3]
            val restTr = if (rest.contains("yet — more songs are still loading")) " henüz eşleşen bir şey yok — daha fazla şarkı hâlâ yükleniyor." else " bir şey bulunamadı."
            val restAz = if (rest.contains("yet — more songs are still loading")) " hələlik uyğun gələn heç nə yoxdur — daha çox mahnı hələ də yüklənir." else " heç nə tapılmadı."
            return when (lang) {
                "tr" -> "$title içinde \"$query\" ile$restTr"
                "az" -> "$title daxilində \"$query\" ilə$restAz"
                else -> clean
            }
        }

        nextFromRegex.matchEntire(clean)?.let { m ->
            val from = m.groupValues[1]
            val translatedFrom = if (from == "Queue") {
                when (lang) {
                    "tr" -> "Kuyruk"
                    "az" -> "Növbə"
                    else -> from
                }
            } else from
            return when (lang) {
                "tr" -> "Sıradaki kaynak: $translatedFrom"
                "az" -> "Növbəti mənbə: $translatedFrom"
                else -> clean
            }
        }

        continueAlbumRegex.matchEntire(clean)?.let { m ->
            val album = m.groupValues[1]
            return when (lang) {
                "tr" -> "$album albümüne devam et"
                "az" -> "$album albomuna davam et"
                else -> clean
            }
        }

        fromTheAlbumRegex.matchEntire(clean)?.let { m ->
            val album = m.groupValues[1]
            return when (lang) {
                "tr" -> "$album albümünden"
                "az" -> "$album albomundan"
                else -> clean
            }
        }

        singPercentRegex.matchEntire(clean)?.let { m ->
            val pct = m.groupValues[1]
            return when (lang) {
                "tr" -> "Vokal · %$pct"
                "az" -> "Vokal · %$pct"
                else -> clean
            }
        }

        usersPhoneRegex.matchEntire(clean)?.let { m ->
            val user = m.groupValues[1]
            return when (lang) {
                "tr" -> "$user telefonu"
                "az" -> "$user telefonu"
                else -> clean
            }
        }

        djReadingRegex.matchEntire(clean)?.let { m ->
            val a = m.groupValues[1]
            val b = m.groupValues[2]
            return when (lang) {
                "tr" -> "DJ modu: tonlar ve tempolar okunuyor… $a / $b"
                "az" -> "DJ rejimi: tonlar və templər oxunur… $a / $b"
                else -> clean
            }
        }

        djWaitForWifiRegex.matchEntire(clean)?.let { m ->
            val prefix = get(m.groupValues[1], context)
            val count = m.groupValues[2]
            return when (lang) {
                "tr" -> "$prefix, $count Wi-Fi bekliyor"
                "az" -> "$prefix, $count Wi-Fi gözləyir"
                else -> clean
            }
        }

        djKeysOnWifiRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "DJ modu: tonlar Wi-Fi üzerinde okunur ($count şarkı bekliyor)"
                "az" -> "DJ rejimi: tonlar Wi-Fi üzərində oxunur ($count mahnı gözləyir)"
                else -> clean
            }
        }

        djKeyOrderWifiRegex.matchEntire(clean)?.let { m ->
            val a = m.groupValues[1]
            val b = m.groupValues[2]
            return when (lang) {
                "tr" -> "DJ modu: ton sırasına göre $a / $b şarkı, geri kalanı Wi-Fi bekliyor"
                "az" -> "DJ rejimi: ton sırasına görə $a / $b mahnı, qalanı Wi-Fi gözləyir"
                else -> clean
            }
        }

        djKeyOrderStayRegex.matchEntire(clean)?.let { m ->
            val a = m.groupValues[1]
            val b = m.groupValues[2]
            return when (lang) {
                "tr" -> "DJ modu: ton sırasına göre $a / $b şarkı, geri kalanı yerinde kalır"
                "az" -> "DJ rejimi: ton sırasına görə $a / $b mahnı, qalanı yerində qalır"
                else -> clean
            }
        }

        minutePluralRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count dakika"
                "az" -> "$count dəqiqə"
                else -> clean
            }
        }

        minShortRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count dk"
                "az" -> "$count dəq"
                else -> clean
            }
        }

        hourShortRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count sa"
                "az" -> "$count saat"
                else -> clean
            }
        }

        hourMinShortRegex.matchEntire(clean)?.let { m ->
            val h = m.groupValues[1]
            val min = m.groupValues[2]
            return when (lang) {
                "tr" -> "$h sa $min dk"
                "az" -> "$h saat $min dəq"
                else -> clean
            }
        }

        lessThanMinShortRegex.matchEntire(clean)?.let {
            return when (lang) {
                "tr" -> "<1 dk"
                "az" -> "<1 dəq"
                else -> clean
            }
        }

        searchInRegex.matchEntire(clean)?.let { m ->
            val target = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$target içinde ara"
                "az" -> "$target daxilində axtar"
                else -> clean
            }
        }

        titleCountRegex.matchEntire(clean)?.let { m ->
            val title = get(m.groupValues[1], context)
            val count = m.groupValues[2]
            return "$title · $count"
        }

        playbackSpeedRegex.matchEntire(clean)?.let { m ->
            val speed = m.groupValues[1]
            return when (lang) {
                "tr" -> "Oynatma hızı: $speed"
                "az" -> "Oxutma sürəti: $speed"
                else -> clean
            }
        }

        playTitleRegex.matchEntire(clean)?.let { m ->
            val title = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$title çal"
                "az" -> "$title oxut"
                else -> clean
            }
        }

        useLookRegex.matchEntire(clean)?.let { m ->
            val name = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$name kullan"
                "az" -> "$name istifadə et"
                else -> clean
            }
        }

        moreForLookRegex.matchEntire(clean)?.let { m ->
            val name = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$name için daha fazla"
                "az" -> "$name üçün daha çox"
                else -> clean
            }
        }

        spaceToUseRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Kullanılacak alan: $size"
                "az" -> "İstifadə ediləcək yer: $size"
                else -> clean
            }
        }

        aboutSongsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Yaklaşık $count şarkı"
                "az" -> "Təxminən $count mahnı"
                else -> clean
            }
        }

        usedSizeRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "$size kullanıldı"
                "az" -> "$size istifadə edildi"
                else -> clean
            }
        }

        freeOnPhoneRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "telefonda $size boş"
                "az" -> "telefonda $size boşdur"
                else -> clean
            }
        }

        allSettingsRegex.matchEntire(clean)?.let { m ->
            val section = m.groupValues[1]
            val transSection = get(section, context)
            return when (lang) {
                "tr" -> "Tüm $transSection ayarları"
                "az" -> "Bütün $transSection parametrləri"
                else -> clean
            }
        }

        resetQuestionRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            val transTarget = get(target, context)
            return when (lang) {
                "tr" -> "$transTarget sıfırlansın mı?"
                "az" -> "$transTarget sıfırlansın?"
                else -> clean
            }
        }

        undoRegex.matchEntire(clean)?.let { m ->
            val action = m.groupValues[1]
            val transAction = get(action, context)
            return when (lang) {
                "tr" -> "Geri al: $transAction"
                "az" -> "Geri qaytar: $transAction"
                else -> clean
            }
        }

        pairQuestionRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name ile eşlensin mi?"
                "az" -> "$name ilə cütləşdirilsin?"
                else -> clean
            }
        }

        pairActionRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name ile eşle"
                "az" -> "$name ilə cütləşdir"
                else -> clean
            }
        }

        playingOnRegex.matchEntire(clean)?.let { m ->
            val device = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$device üzerinde çalınıyor"
                "az" -> "$device üzərində oxudulur"
                else -> clean
            }
        }

        addedToRegex.matchEntire(clean)?.let { m ->
            val pl = m.groupValues[1]
            return when (lang) {
                "tr" -> "$pl listesine eklendi"
                "az" -> "$pl siyahısına əlavə edildi"
                else -> clean
            }
        }

        alreadyInRegex.matchEntire(clean)?.let { m ->
            val pl = m.groupValues[1]
            return when (lang) {
                "tr" -> "Zaten $pl içinde"
                "az" -> "Artıq $pl daxilindədir"
                else -> clean
            }
        }

        savedToRegex.matchEntire(clean)?.let { m ->
            val item = m.groupValues[1]
            val pl = m.groupValues[2]
            return when (lang) {
                "tr" -> "$item, $pl içine kaydedildi"
                "az" -> "$item, $pl daxilinə saxlanıldı"
                else -> clean
            }
        }

        couldntAddRegex.matchEntire(clean)?.let { m ->
            val pl = m.groupValues[1]
            return when (lang) {
                "tr" -> "$pl listesine eklenemedi"
                "az" -> "$pl siyahısına əlavə edilə bilmədi"
                else -> clean
            }
        }

        lyricsSecondsRegex.matchEntire(clean)?.let { m ->
            val sec = m.groupValues[1]
            return when (lang) {
                "tr" -> "Şarkı sözleri $sec saniye"
                "az" -> "Mahnı sözləri $sec saniyə"
                else -> clean
            }
        }

        stopsInMinRegex.matchEntire(clean)?.let { m ->
            val min = m.groupValues[1]
            return when (lang) {
                "tr" -> "$min dk içinde durur"
                "az" -> "$min dəq ərzində dayanır"
                else -> clean
            }
        }

        videoWaitRegex.matchEntire(clean)?.let { m ->
            val time = m.groupValues[1]
            return when (lang) {
                "tr" -> "Otomatik eşlendi — şarkı videonun $time kısmında başladığı için sözler bekletiliyor."
                "az" -> "Avtomatik uyğunlaşdırıldı — mahnı videonun $time hissəsində başladığı üçün sözlər gözləyir."
                else -> clean
            }
        }

        videoSkipRegex.matchEntire(clean)?.let { m ->
            val time = m.groupValues[1]
            return when (lang) {
                "tr" -> "Otomatik eşlendi — video şarkının ilk $time kısmını atlıyor."
                "az" -> "Avtomatik uyğunlaşdırıldı — video mahnının ilk $time hissəsini ötürür."
                else -> clean
            }
        }

        topSongsYearRegex.matchEntire(clean)?.let { m ->
            val y = m.groupValues[1]
            return when (lang) {
                "tr" -> "$y yılının en iyi şarkıları"
                "az" -> "$y ilinin ən yaxşı mahnıları"
                else -> clean
            }
        }

        rewindYearOpenRegex.matchEntire(clean)?.let { m ->
            val y = m.groupValues[1]
            return when (lang) {
                "tr" -> "$y Geri Sarmanız 1 Aralık'ta açılıyor"
                "az" -> "$y Geri Sarmanız 1 Dekabrda açılır"
                else -> clean
            }
        }

        rewindYearRegex.matchEntire(clean)?.let { m ->
            val y = m.groupValues[1]
            return when (lang) {
                "tr" -> "GERİ SARMA $y"
                "az" -> "GERİ SARMA $y"
                else -> clean
            }
        }

        replayPrefixRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            val tp = get(p, context)
            return "Replay · $tp"
        }

        savedYtmRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$name\" YouTube Music'e kaydedildi"
                "az" -> "\"$name\" YouTube Music-də saxlanıldı"
                else -> clean
            }
        }

        themeRegex.matchEntire(clean)?.let { m ->
            val t = m.groupValues[1]
            return when (lang) {
                "tr" -> when (t.lowercase()) {
                    "system" -> "Sistem teması"
                    "light" -> "Açık tema"
                    "dark" -> "Koyu tema"
                    else -> "$t teması"
                }
                "az" -> when (t.lowercase()) {
                    "system" -> "Sistem teması"
                    "light" -> "Açıq tema"
                    "dark" -> "Tünd tema"
                    else -> "$t teması"
                }
                else -> clean
            }
        }

        fontRegex.matchEntire(clean)?.let { m ->
            val f = m.groupValues[1]
            return when (lang) {
                "tr" -> "$f yazı tipi"
                "az" -> "$f şrifti"
                else -> clean
            }
        }

        tabsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count sekme"
                "az" -> "$count vərəqə"
                else -> clean
            }
        }

        smartDlsSizeRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Akıllı İndirmeler $size"
                "az" -> "Ağıllı Endirmələr $size"
                else -> clean
            }
        }

        eqRegex.matchEntire(clean)?.let { m ->
            val preset = m.groupValues[1]
            return when (lang) {
                "tr" -> "Ekolayzer $preset"
                "az" -> "Ekvayzer $preset"
                else -> clean
            }
        }



        
        moreAboutRegex.matchEntire(clean)?.let { m ->
            val topic = m.groupValues[1]
            val transTopic = get(topic, context)
            return when (lang) {
                "tr" -> "$transTopic hakkında daha fazla bilgi"
                "az" -> "$transTopic haqqında ətraflı məlumat"
                else -> clean
            }
        }

        offlineReadyRegex.matchEntire(clean)?.let { m ->
            val (r, s) = m.groupValues[1] to m.groupValues[2]
            return when (lang) {
                "tr" -> "Çevrimdışısınız · $s şarkıdan $r tanesi bu telefonda ve çalınabilir"
                "az" -> "Oflaynsınız · $s mahnıdan $r dənəsi bu telefondadır və oxudula bilər"
                else -> clean
            }
        }

        andMoreRegex.matchEntire(clean)?.let { m ->
            val c = m.groupValues[1]
            return when (lang) {
                "tr" -> "ve $c tane daha"
                "az" -> "və daha $c dənə"
                else -> clean
            }
        }

        ofYearRegex.matchEntire(clean)?.let { m ->
            val y = m.groupValues[1]
            return when (lang) {
                "tr" -> "$y yılı"
                "az" -> "$y ili"
                else -> clean
            }
        }

        downloadingNumRegex.matchEntire(clean)?.let { m ->
            val c = m.groupValues[1]
            return when (lang) {
                "tr" -> "$c indiriliyor…"
                "az" -> "$c endirilir…"
                else -> clean
            }
        }

        downloadingPctRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "İndiriliyor… %$p"
                "az" -> "Endirilir… %$p"
                else -> clean
            }
        }

        lyricsFontFileRegex.matchEntire(clean)?.let { m ->
            val f = m.groupValues[1]
            return when (lang) {
                "tr" -> "Şarkı sözü yazı tipi dosyası: $f"
                "az" -> "Mahnı sözü şrift faylı: $f"
                else -> clean
            }
        }

        measuredByRegex.matchEntire(clean)?.let { m ->
            val b = m.groupValues[1]
            return when (lang) {
                "tr" -> "Ölçüm: $b"
                "az" -> "Ölçən: $b"
                else -> clean
            }
        }

        goToRegex.matchEntire(clean)?.let { m ->
            val dest = m.groupValues[1]
            val transDest = get(dest, context)
            return when (lang) {
                "tr" -> "$transDest sayfasına git"
                "az" -> "$transDest səhifəsinə get"
                else -> clean
            }
        }

        couldntDownloadRegex.matchEntire(clean)?.let { m ->
            val msg = m.groupValues[1]
            return when (lang) {
                "tr" -> "İndirilemedi: $msg"
                "az" -> "Endirilə bilmədi: $msg"
                else -> clean
            }
        }

        usingMbRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Kullanılan: $size"
                "az" -> "İstifadə edilən: $size"
                else -> clean
            }
        }

        deleteVideosRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Müzik videolarını sil ($size)"
                "az" -> "Musiqi videolarını sil ($size)"
                else -> clean
            }
        }

        deleteSmartRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Akıllı indirmeleri sil ($count)"
                "az" -> "Ağıllı endirmələri sil ($count)"
                else -> clean
            }
        }

        optionsForRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            val transTarget = get(target, context)
            return when (lang) {
                "tr" -> "$transTarget seçenekleri"
                "az" -> "$transTarget seçimləri"
                else -> clean
            }
        }

        dragRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            val transTarget = get(target, context)
            return when (lang) {
                "tr" -> "$transTarget ögesini sürükle"
                "az" -> "$transTarget elementini sürüşdür"
                else -> clean
            }
        }

        whatsNewRegex.matchEntire(clean)?.let { m ->
            val v = m.groupValues[1]
            return when (lang) {
                "tr" -> "Prism $v yenilikleri"
                "az" -> "Prism $v yenilikləri"
                else -> clean
            }
        }

        moveUpRegex.matchEntire(clean)?.let { m ->
            val item = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$item öğesini yukarı taşı"
                "az" -> "$item elementini yuxarı köçür"
                else -> clean
            }
        }

        moveDownRegex.matchEntire(clean)?.let { m ->
            val item = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$item öğesini aşağı taşı"
                "az" -> "$item elementini aşağı köçür"
                else -> clean
            }
        }

        aboutGeneralRegex.matchEntire(clean)?.let { m ->
            val name = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$name hakkında"
                "az" -> "$name haqqında"
                else -> clean
            }
        }

        shareGeneralRegex.matchEntire(clean)?.let { m ->
            val name = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$name paylaş"
                "az" -> "$name paylaş"
                else -> clean
            }
        }

        forgetRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name cihazını unut"
                "az" -> "$name cihazını unut"
                else -> clean
            }
        }

        unpairRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name eşleşmesini kaldır"
                "az" -> "$name cütləşməsini ləğv et"
                else -> clean
            }
        }

        startMixRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name Miksini Başlat"
                "az" -> "$name Miksini Başlat"
                else -> clean
            }
        }

        updatedRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name güncellendi"
                "az" -> "$name yeniləndi"
                else -> clean
            }
        }

        moreForRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name için daha fazlası"
                "az" -> "$name üçün daha çoxu"
                else -> clean
            }
        }

        goBackToRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "Kayıtlı $name görünümüne dön"
                "az" -> "Yadda saxlanılmış $name görünüşünə qayıt"
                else -> clean
            }
        }

        favFindRegex.matchEntire(clean)?.let { m ->
            val artist = m.groupValues[1]
            val time = m.groupValues[2]
            return when (lang) {
                "tr" -> "En sevdiğiniz keşif: $artist ($time dinlendi)."
                "az" -> "Ən sevimli kəşfiniz: $artist ($time dinlənildi)."
                else -> clean
            }
        }

        firstSongRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            return when (lang) {
                "tr" -> "$target içindeki ilk şarkınız:"
                "az" -> "$target daxilindəki ilk mahnınız:"
                else -> clean
            }
        }

        onRepeatRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            return when (lang) {
                "tr" -> "Sürekli tekrarda: $target"
                "az" -> "Davamlı təkrar: $target"
                else -> clean
            }
        }

        sharedGenresRegex.matchEntire(clean)?.let { m ->
            val genres = m.groupValues[1]
            return when (lang) {
                "tr" -> "Ortak türler: $genres"
                "az" -> "Ortaq janrlar: $genres"
                else -> clean
            }
        }

        youBothPlayRegex.matchEntire(clean)?.let { m ->
            val artists = m.groupValues[1]
            return when (lang) {
                "tr" -> "İkiniz de $artists dinliyorsunuz"
                "az" -> "Hər ikiniz $artists dinləyirsiniz"
                else -> clean
            }
        }

        wantsToPlayRegex.matchEntire(clean)?.let { m ->
            val from = m.groupValues[1]
            val to = m.groupValues[2]
            return when (lang) {
                "tr" -> "$from burada müzik çalmak istiyor. İzin vermek için bu kodu $to üzerinde girin:"
                "az" -> "$from burada musiqi oxutmaq istəyir. İcazə vermək üçün bu kodu $to üzərində daxil edin:"
                else -> clean
            }
        }

        addingToSessionRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "$host oturumuna ekleniyor"
                "az" -> "$host sessiyasına əlavə edilir"
                else -> clean
            }
        }

        redownloadLyricsRegex.matchEntire(clean)?.let { m ->
            val src = m.groupValues[1]
            return when (lang) {
                "tr" -> "Yeniden indirme, $src şarkı sözlerini tekrar alır ve kayıtlı kopyayı değiştirir"
                "az" -> "Yenidən yükləmə, $src mahnı sözlərini təkrar əldə edir və saxlanılan surəti əvəz edir"
                else -> clean
            }
        }

        dotsAndMoreRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "…ve $count tane daha"
                "az" -> "…və $count dənə daha"
                else -> clean
            }
        }

        noHeadphonesMatchRegex.matchEntire(clean)?.let { m ->
            val q = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$q\" ile eşleşen kulaklık yok. AutoEq yalnızca ölçümü yapılmış kulaklıklara sahiptir; ayrıca bir ParametricEQ dosyası da içe aktarabilirsiniz."
                "az" -> "\"$q\" ilə uyğun gələn qulaqlıq yoxdur. AutoEq yalnız ölçülmüş qulaqlıqlara malikdir; həmçinin ParametricEQ faylını da idxal edə bilərsiniz."
                else -> clean
            }
        }

        prismRedrawnRegex.matchEntire(clean)?.let { m ->
            val ver = m.groupValues[1]
            return when (lang) {
                "tr" -> "Prism $ver baştan sona yeniden tasarlandı ve her zamankinden daha fazlasını yapıyor. İşte bir dakikalık tur: kaydırın veya Başla'ya dokunun."
                "az" -> "Prism $ver başdan-başa yenidən dizayn edildi və həmişəkindən daha çox şey edir. Budur bir dəqiqəlik tur: sürüşdürün və ya Başla vurun."
                else -> clean
            }
        }

        thingsToKnowRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Son baktığınızdan bu yana bilmeniz gereken $count şey, yaklaşık bir dakika içinde."
                "az" -> "Son baxdığınızdan bəri bilməli olduğunuz $count şey, təxminən bir dəqiqə ərzində."
                else -> clean
            }
        }

        couldntLoadAutoEqRegex.matchEntire(clean)?.let { m ->
            val err = m.groupValues[1]
            return when (lang) {
                "tr" -> "AutoEq listesi yüklenemedi: $err"
                "az" -> "AutoEq siyahısı yüklənmədi: $err"
                else -> clean
            }
        }

        showSectionHomeRegex.matchEntire(clean)?.let { m ->
            val sec = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Bunları Ana Sayfada görmek için $sec bölümünü gösterin"
                "az" -> "Bunları Əsas Səhifədə görmək üçün $sec bölməsini göstərin"
                else -> clean
            }
        }

        lastChangesLookRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Görünümde yapılan son $count değişiklik geri dönülebilmesi için burada gösterilir."
                "az" -> "Görünüşdə edilən son $count dəyişiklik geri qayıtmaq üçün burada göstərilir."
                else -> clean
            }
        }

        singSeparatesRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Sing, sunucu olmadan telefonunuzda her şarkının sesini müziğinden ayırır. Bir kerelik indirme gerekir: $size."
                "az" -> "Sing, server olmadan telefonunuzda hər mahnının səsini musiqisindən ayırır. Bir dəfəlik yükləmə tələb olunur: $size."
                else -> clean
            }
        }

        immersivePlayerDescRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val artist = m.groupValues[2]
            return when (lang) {
                "tr" -> "Sürükleyici oynatıcı, $artist tarafından $title"
                "az" -> "İmmersiv oynatıcı, $artist tərəfindən $title"
                else -> clean
            }
        }

        sleepTimerDescRegex.matchEntire(clean)?.let { m ->
            val left = m.groupValues[1]
            return when (lang) {
                "tr" -> "Uyku zamanlayıcısı: $left. Değiştirmek için dokunun."
                "az" -> "Yuxu taymeri: $left. Dəyişmək üçün toxunun."
                else -> clean
            }
        }

        colorIndexRegex.matchEntire(clean)?.let { m ->
            val num = m.groupValues[1]
            val hex = m.groupValues[2]
            return when (lang) {
                "tr" -> "Renk $num, $hex"
                "az" -> "Rəng $num, $hex"
                else -> clean
            }
        }

        aboutPageRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name hakkında"
                "az" -> "$name haqqında"
                else -> clean
            }
        }

        addToSourceRegex.matchEntire(clean)?.let { m ->
            val src = m.groupValues[1]
            return when (lang) {
                "tr" -> "$src içine ekle"
                "az" -> "$src daxilinə əlavə et"
                else -> clean
            }
        }

        howReplayLooksRegex.matchEntire(clean)?.let { m ->
            val lbl = get(m.groupValues[1], context)
            val note = get(m.groupValues[2], context)
            return when (lang) {
                "tr" -> "Replay'in Ana Sayfada en sadeden en renkliye nasıl göründüğü. $lbl: $note"
                "az" -> "Replay-in Əsas Səhifədə ən sadədən ən rəngliyə necə göründüyü. $lbl: $note"
                else -> clean
            }
        }

        lyricsForKaraokeRegex.matchEntire(clean)?.let { m ->
            val lyrics = m.groupValues[1]
            val karaoke = m.groupValues[2]
            val gettingMore = clean.contains("getting more…")
            return when (lang) {
                "tr" -> "$lyrics için sözler · $karaoke karaoke" + (if (gettingMore) " · daha fazlası alınıyor…" else "")
                "az" -> "$lyrics üçün sözlər · $karaoke karaoke" + (if (gettingMore) " · daha çoxu əldə edilir…" else "")
                else -> clean
            }
        }

        lyricsFromSrcRegex.matchEntire(clean)?.let { m ->
            val src = m.groupValues[1]
            return when (lang) {
                "tr" -> "$src kaynağından sözler"
                "az" -> "$src mənbəyindən sözlər"
                else -> clean
            }
        }

        pairWithRegex.matchEntire(clean)?.let { m ->
            val who = m.groupValues[1]
            return when (lang) {
                "tr" -> "$who ile eşleştirilsin mi?"
                "az" -> "$who ilə cütləşdirilsin?"
                else -> clean
            }
        }

        replayYearRegex.matchEntire(clean)?.let { m ->
            val yr = m.groupValues[1]
            return "Replay $yr"
        }

        replayYearTopRegex.matchEntire(clean)?.let { m ->
            val yr = m.groupValues[1]
            return when (lang) {
                "tr" -> "Replay $yr · 1 numaranız"
                "az" -> "Replay $yr · 1 nömrəniz"
                else -> clean
            }
        }

        shareTargetRegex.matchEntire(clean)?.let { m ->
            val target = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$target Paylaş"
                "az" -> "$target Paylaş"
                else -> clean
            }
        }

        textOnItRegex.matchEntire(clean)?.let { m ->
            val lbl = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Üzerindeki metin · $lbl"
                "az" -> "Üzərindəki mətn · $lbl"
                else -> clean
            }
        }

        undoActionRegex.matchEntire(clean)?.let { m ->
            val action = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Geri al: $action"
                "az" -> "Geri al: $action"
                else -> clean
            }
        }

        whenPrismOpensRegex.matchEntire(clean)?.let { m ->
            val tap = m.groupValues[1]
            return when (lang) {
                "tr" -> "Yeni Prism açıldığında şuna dokunun: $tap"
                "az" -> "Yeni Prism açılanda buna toxunun: $tap"
                else -> clean
            }
        }

        youPlayedTimesRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Bunu $count kez dinlediniz"
                "az" -> "Bunu $count dəfə dinlədiniz"
                else -> clean
            }
        }

        yourBlendNameRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "Blend adınız: $name"
                "az" -> "Blend adınız: $name"
                else -> clean
            }
        }

        noSettingsMatchRegex.matchEntire(clean)?.let { m ->
            val q = m.groupValues[1]
            return when (lang) {
                "tr" -> "$q ile eşleşen ayar bulunamadı"
                "az" -> "$q ilə uyğunlaşan tənzimləmə tapılmadı"
                else -> clean
            }
        }

        pickButtonsRegex.matchEntire(clean)?.let { m ->
            val min = m.groupValues[1]
            val max = m.groupValues[2]
            return when (lang) {
                "tr" -> "Kontrollerin altındaki satır için $min ila $max adet seçin. Sıralamak için birini basılı tutun (veya tutamağını sürükleyin). Geri kalanı oynatıcının ⋯ menüsünde kalır."
                "az" -> "İdarəedicilərin altındakı sətir üçün $min ilə $max arası seçin. Sıralamaq üçün birini basıb saxlayın (və ya tutacağını sürüşdürün). Qalanları oynatıcının ⋯ menyusunda qalır."
                else -> clean
            }
        }

        onBothPhonesBlendRegex.matchEntire(clean)?.let { m ->
            val friend = m.groupValues[1]
            return when (lang) {
                "tr" -> "Her iki telefonda da: siz ve $friend aynı Blend'e sahipsiniz."
                "az" -> "Hər iki telefonda da: siz və $friend eyni Blend-ə sahibsiniz."
                else -> clean
            }
        }

        sendCodeBackBlendRegex.matchEntire(clean)?.let { m ->
            val friend = m.groupValues[1]
            return when (lang) {
                "tr" -> "$friend adlı arkadaşınızın Blend'i sizinkiyle aynı olsun diye kodunuzu geri gönderin."
                "az" -> "$friend adlı dostunuzun Blend-i sizinki ilə eyni olsun deyə kodunuzu geri göndərin."
                else -> clean
            }
        }

        prismVersionRegex.matchEntire(clean)?.let { m ->
            val v = m.groupValues[1]
            return "Prism $v"
        }


        sessionRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            val count = m.groupValues[2]
            return when (lang) {
                "tr" -> "${host} oturumu" + if (count.isNotBlank()) " · $count kişi dinliyor" else ""
                "az" -> "${host} sessiyası" + if (count.isNotBlank()) " · $count nəfər dinləyir" else ""
                else -> clean
            }
        }

        tasteMatchRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "%$p zevk eşleşmesi"
                "az" -> "%$p zövq uyğunluğu"
                else -> clean
            }
        }

        waitingWifiRegex.matchEntire(clean)?.let { m ->
            val c = m.groupValues[1]
            return when (lang) {
                "tr" -> "Wi-Fi bekleniyor ($c)"
                "az" -> "Wi-Fi gözlənilir ($c)"
                else -> clean
            }
        }

        dlsFailedRegex.matchEntire(clean)?.let { m ->
            val c = m.groupValues[1]
            return when (lang) {
                "tr" -> "$c indirme başarısız oldu"
                "az" -> "$c endirmə uğursuz oldu"
                else -> clean
            }
        }

        daysMusicRegex.matchEntire(clean)?.let { m ->
            val num = m.groupValues[1]
            val unit = m.groupValues[2]
            return when (lang) {
                "tr" -> "Baştan sona $num ${if (unit == "days") "gün" else "saat"} müzik."
                "az" -> "Əvvəldən axıra $num ${if (unit == "days") "gün" else "saat"} musiqi."
                else -> clean
            }
        }

        shareAllPlayedRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "Çaldığınız her şeyin %$p kadarı onlardı."
                "az" -> "Oxutduğunuz hər şeyin %$p qədəri onlar idi."
                else -> clean
            }
        }

        thatMonthRegex.matchEntire(clean)?.let { m ->
            val time = m.groupValues[1]
            return when (lang) {
                "tr" -> "O ay $time."
                "az" -> "Həmin ay $time."
                else -> clean
            }
        }

        listenedRegex.matchEntire(clean)?.let { m ->
            val t = m.groupValues[1]
            return when (lang) {
                "tr" -> "$t dinlendi"
                "az" -> "$t dinlənildi"
                else -> clean
            }
        }

        couldntShareRegex.matchEntire(clean)?.let { m ->
            val item = m.groupValues[1]
            return when (lang) {
                "tr" -> "$item paylaşılamadı"
                "az" -> "$item paylaşıla bilmədi"
                else -> clean
            }
        }

        compareChangeRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            val comp = m.groupValues[2]
            val label = get(m.groupValues[3], context)
            return when (lang) {
                "tr" -> "$label kıyasla %$p ${if (comp == "more") "daha fazla" else "daha az"}"
                "az" -> "$label ilə müqayisədə %$p ${if (comp == "more") "daha çox" else "daha az"}"
                else -> clean
            }
        }

        daysInARowRegex.matchEntire(clean)?.let { m ->
            val d = m.groupValues[1]
            return when (lang) {
                "tr" -> "Üst üste $d gün"
                "az" -> "Ard-arda $d gün"
                else -> clean
            }
        }

        againRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "Yeniden $name"
                "az" -> "Yenidən $name"
                else -> clean
            }
        }

        removedDlsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count indirme kaldırıldı"
                "az" -> "$count endirmə silindi"
                else -> clean
            }
        }

        downloadingItemRegex.matchEntire(clean)?.let { m ->
            val item = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$item indiriliyor"
                "az" -> "$item endirilir"
                else -> clean
            }
        }

        removedFromRegex.matchEntire(clean)?.let { m ->
            val item = m.groupValues[1]
            return when (lang) {
                "tr" -> "$item içinden kaldırıldı"
                "az" -> "$item daxilindən silindi"
                else -> clean
            }
        }

        couldntRemoveItRegex.matchEntire(clean)?.let { m ->
            val err = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Kaldırılamadı: $err"
                "az" -> "Silinə bilmədi: $err"
                else -> clean
            }
        }

        couldntSaveRegex.matchEntire(clean)?.let { m ->
            val err = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Kaydedilemedi: $err"
                "az" -> "Yadda saxlanıla bilmədi: $err"
                else -> clean
            }
        }

        couldntDeleteTitleRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val err = get(m.groupValues[2], context)
            return when (lang) {
                "tr" -> "\"$title\" silinemedi: $err"
                "az" -> "\"$title\" silinə bilmədi: $err"
                else -> clean
            }
        }

        markedAtRegex.matchEntire(clean)?.let { m ->
            val at = m.groupValues[1]
            return when (lang) {
                "tr" -> "$at konumunda işaretlendi"
                "az" -> "$at mövqeyində işarələndi"
                else -> clean
            }
        }

        playsCountRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "$p çalma"
                "az" -> "$p oxutma"
                else -> clean
            }
        }

        daysCountRegex.matchEntire(clean)?.let { m ->
            val d = m.groupValues[1]
            return when (lang) {
                "tr" -> "$d gün"
                "az" -> "$d gün"
                else -> clean
            }
        }

        savedQuotedRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$name\" kaydedildi"
                "az" -> "\"$name\" yadda saxlanıldı"
                else -> clean
            }
        }


        loyalistRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "Neyi sevdiğinizi biliyorsunuz. Çaldığınız her şeyin %$p'ini en sevdiğiniz beş sanatçı oluşturdu."
                "az" -> "Nəyi sevdiyinizi bilirsiniz. Səsləndirdiyiniz hər şeyin %$p-ni ən sevdiyiniz beş sənətçi təşkil etdi."
                else -> clean
            }
        }

        explorerRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            val total = m.groupValues[2]
            return when (lang) {
                "tr" -> "Her zaman keşifte. Çaldığınız $total sanatçıdan $n tanesi sizin için yeniydi."
                "az" -> "Həmişə axtarışda. Səsləndirdiyiniz $total sənətçidən $n-i sizin üçün yeni idi."
                else -> clean
            }
        }

        replayerSongRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val plays = m.groupValues[2]
            return when (lang) {
                "tr" -> "Bir şarkı vurduğunda, tekrar çalarsınız. Yalnızca \"$title\" $plays kez çalındı."
                "az" -> "Bir mahnı təsir edəndə, onu yenidən oxudursunuz. Təkcə \"$title\" $plays dəfə səsləndirildi."
                else -> clean
            }
        }

        nightOwlRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "Müziğiniz hava karardıktan sonra canlanıyor: Dinlemelerinizin %$p'i 22:00 ile 04:00 arasında gerçekleşti."
                "az" -> "Musiqiniz hava qaralandan sonra canlanır: Dinləmələrinizin %$p-i 22:00 ilə 04:00 arasında baş verdi."
                else -> clean
            }
        }

        earlyRiserRegex.matchEntire(clean)?.let { m ->
            val p = m.groupValues[1]
            return when (lang) {
                "tr" -> "Güne müzikle başlıyorsunuz: Dinlemelerinizin %$p'i sabah 09:00'dan önce gerçekleşti."
                "az" -> "Günə musiqi ilə başlayırsınız: Dinləmələrinizin %$p-i səhər 09:00-dan əvvəl baş verdi."
                else -> clean
            }
        }

        marathonerRegex.matchEntire(clean)?.let { m ->
            val mins = m.groupValues[1]
            return when (lang) {
                "tr" -> "Dinlediğiniz günlerde ortalama $mins dakika dinlediniz. İşte bu bağlılık."
                "az" -> "Dinlədiyiniz günlərdə orta hesabla $mins dəqiqə dinlədiniz. Bax bu sədaqətdir."
                else -> clean
            }
        }

        albumRecapRegex.matchEntire(clean)?.let { m ->
            val songs = m.groupValues[1]
            val plays = m.groupValues[2]
            val time = get(m.groupValues[3], context)
            return when (lang) {
                "tr" -> "$songs şarkısı, $plays çalma, $time."
                "az" -> "$songs mahnısı, $plays səsləndirmə, $time."
                else -> clean
            }
        }

        atTimeRegex.matchEntire(clean)?.let { m ->
            val date = get(m.groupValues[1], context)
            val time = m.groupValues[2]
            return when (lang) {
                "tr" -> "$date, $time"
                "az" -> "$date, $time"
                else -> clean
            }
        }

        scannedYourCodeRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name kodunuzu taradı: Blend'iniz oluşturuldu"
                "az" -> "$name kodunuzu skan etdi: Blend-iniz yaradıldı"
                else -> clean
            }
        }

        blendUpToDateRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name kişisinin Blend'i güncel"
                "az" -> "$name adlı istifadəçinin Blend-i aktualdır"
                else -> clean
            }
        }

        blendWithMadeRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name ile Blend oluşturuldu"
                "az" -> "$name ilə Blend yaradıldı"
                else -> clean
            }
        }

        madeOnPhoneTooRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name adlı kişinin telefonunda da oluşturuldu"
                "az" -> "$name adlı şəxsin telefonunda da yaradıldı"
                else -> clean
            }
        }

        couldntReachPhoneRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name adlı kişinin telefonuna ulaşılamadı (farklı bir Wi-Fi'da mı?). Blend'e sahip olması için kodunuzu taratın."
                "az" -> "$name adlı şəxsin telefonuna qoşulmaq mümkün olmadı (başqa Wi-Fi-dadır?). Onun da əldə etməsi üçün kodunuzu skan etdirin."
                else -> clean
            }
        }

        youreOnLookWithChangesRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name görünümündesiniz, değişiklikler var"
                "az" -> "$name görünüşündəsiniz, dəyişikliklər var"
                else -> clean
            }
        }

        youreOnLookRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name görünümündesiniz"
                "az" -> "$name görünüşündəsiniz"
                else -> clean
            }
        }

        editsSinceSavedRegex.matchEntire(clean)?.let { m ->
            val diff = get(m.groupValues[1], context)
            val name = m.groupValues[2]
            return when (lang) {
                "tr" -> "Kaydettiğinizden beri $diff. Bunları $name içinde tutmak için güncelleyin."
                "az" -> "Yadda saxladığınızdan bəri $diff. Bunları $name daxilində saxlamaq üçün yeniləyin."
                else -> clean
            }
        }

        savedQueueCountRegex.matchEntire(clean)?.let { m ->
            val count = get(m.groupValues[1], context)
            val name = m.groupValues[2]
            return when (lang) {
                "tr" -> "$count $name konumuna kaydedildi"
                "az" -> "$count $name məkanına yadda saxlanıldı"
                else -> clean
            }
        }

        nothingToPlayRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$title\" içinde çalınacak hiçbir şey yok"
                "az" -> "\"$title\" daxilində oxudulacaq heç nə yoxdur"
                else -> clean
            }
        }

        djSetNeedsRegex.matchEntire(clean)?.let {
            return when (lang) {
                "tr" -> "Bir DJ seti birden fazla şarkı gerektirir"
                "az" -> "Bir DJ seti birdən çox mahnı tələb edir"
                else -> clean
            }
        }

        couldntBuildPeriodRegex.matchEntire(clean)?.let { m ->
            val period = m.groupValues[1]
            return when (lang) {
                "tr" -> "$period oluşturulamadı"
                "az" -> "$period hazırlana bilmədi"
                else -> clean
            }
        }

        playingNextQueueRegex.matchEntire(clean)?.let { m ->
            val count = get(m.groupValues[1], context)
            val action = m.groupValues[2]
            val transAction = if (action == "playing next") (if (lang == "tr") "sıradaki olarak çalınıyor" else "növbəti olaraq oxudulur") else (if (lang == "tr") "kuyruğa eklendi" else "növbəyə əlavə edildi")
            return "$count $transAction"
        }

        couldntStartRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            return when (lang) {
                "tr" -> "$target başlatılamadı"
                "az" -> "$target başladıla bilmədi"
                else -> clean
            }
        }

        backupFailedRegex.matchEntire(clean)?.let { m ->
            val msg = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Yedekleme başarısız oldu: $msg"
                "az" -> "Yedəkləmə uğursuz oldu: $msg"
                else -> clean
            }
        }

        accountCopiedRegex.matchEntire(clean)?.let { m ->
            val pl = m.groupValues[1]
            val al = m.groupValues[2]
            val ar = m.groupValues[3]
            val failed = m.groupValues[4]
            return when (lang) {
                "tr" -> {
                    val failSuffix = if (failed.isNotBlank()) " ($failed çalma listesi okunamadı)" else ""
                    "$pl çalma listesi, $al albüm ve $ar sanatçı kopyalandı$failSuffix"
                }
                "az" -> {
                    val failSuffix = if (failed.isNotBlank()) " ($failed pleylist oxuna bilmədi)" else ""
                    "$pl pleylist, $al albom və $ar sənətçi kopyalandı$failSuffix"
                }
                else -> clean
            }
        }

        lyricsAlreadyInRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "Bu şarkı sözleri zaten $name dilinde. Çeviriler diğer dillerdeki şarkılar için gösterilir."
                "az" -> "Bu mahnı sözləri artıq $name dilindədir. Tərcümələr digər dillərdəki mahnılar üçün göstərilir."
                else -> clean
            }
        }

        likedDeleteRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$title\" YouTube Music hesabınızdan silinecek. Beğendiğiniz şarkılar beğenilmiş olarak kalır."
                "az" -> "\"$title\" YouTube Music hesabınızdan silinəcək. Bəyəndiyiniz mahnılar bəyənilmiş olaraq qalır."
                else -> clean
            }
        }

        couldntDeleteItRegex.matchEntire(clean)?.let { m ->
            val err = m.groupValues[1]
            return when (lang) {
                "tr" -> "Silinemedi: $err"
                "az" -> "Silinmədi: $err"
                else -> clean
            }
        }

        madeWithNameCountRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            val cnt = get(m.groupValues[2], context)
            return when (lang) {
                "tr" -> "\"$name\" oluşturuldu ($cnt ile)"
                "az" -> "\"$name\" yaradıldı ($cnt ilə)"
                else -> clean
            }
        }

        couldntMakePlaylistMsgRegex.matchEntire(clean)?.let { m ->
            val err = m.groupValues[1]
            return when (lang) {
                "tr" -> "Çalma listesi oluşturulamadı: $err"
                "az" -> "Pleylist yaradıla bilmədi: $err"
                else -> clean
            }
        }

        lastUpdateFailedRegex.matchEntire(clean)?.let { m ->
            val err = m.groupValues[1]
            return when (lang) {
                "tr" -> "Son güncelleme başarısız oldu: $err"
                "az" -> "Son yenilənmə uğursuz oldu: $err"
                else -> clean
            }
        }

        titleUpdatedRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val time = m.groupValues[2]
            return when (lang) {
                "tr" -> "\"$title\" · güncellendi: $time"
                "az" -> "\"$title\" · yeniləndi: $time"
                else -> clean
            }
        }

        lyricsSavedFilesRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            return when (lang) {
                "tr" -> "Şarkı sözleri $n dosyaya kaydedildi"
                "az" -> "Mahnı sözləri $n fayla yadda saxlanıldı"
                else -> clean
            }
        }

        lyricsSavedOfFilesRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            val total = m.groupValues[2]
            return when (lang) {
                "tr" -> "Şarkı sözleri $total dosyanın $n tanesine kaydedildi"
                "az" -> "Mahnı sözləri $total fayldan $n dənəsinə yadda saxlanıldı"
                else -> clean
            }
        }

        gettingLyricsFilesRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            return when (lang) {
                "tr" -> "$n dosya için şarkı sözleri alınıyor…"
                "az" -> "$n fayl üçün mahnı sözləri alınır…"
                else -> clean
            }
        }

        sentToHostRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "$host adlı kişiye gönderildi"
                "az" -> "$host adlı şəxsə göndərildi"
                else -> clean
            }
        }

        playlistsProgressRegex.matchEntire(clean)?.let { m ->
            val cur = m.groupValues[1]
            val total = m.groupValues[2]
            return when (lang) {
                "tr" -> "Çalma listeleri: $cur / $total"
                "az" -> "Pleylistlər: $cur / $total"
                else -> clean
            }
        }

        thatMusicTimeRegex.matchEntire(clean)?.let { m ->
            val time = m.groupValues[1]
            val unit = m.groupValues[2]
            return when (lang) {
                "tr" -> {
                    val u = if (unit == "days") "gün" else "saat"
                    "Baştan sona $time $u müzik."
                }
                "az" -> {
                    val u = if (unit == "days") "gün" else "saat"
                    "Baştan sona $time $u musiqi."
                }
                else -> clean
            }
        }

        togetherHostSessionRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            val cnt = m.groupValues[2]
            return when (lang) {
                "tr" -> if (cnt.isNotBlank()) "$host adlı kişinin oturumu · $cnt kişi dinliyor" else "$host adlı kişinin oturumu"
                "az" -> if (cnt.isNotBlank()) "$host adlı şəxsin sessiyası · $cnt nəfər dinləyir" else "$host adlı şəxsin sessiyası"
                else -> clean
            }
        }

        togetherCatchUpRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "Burada müziği duraklattınız veya başka bir şey çaldınız. $host ile senkronize olmak için dokunun."
                "az" -> "Burada musiqini dayandırdınız və ya başqa bir şey oxutdunuz. $host ilə sinxronlaşmaq üçün toxunun."
                else -> clean
            }
        }

        ellipsisAndMoreRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            return when (lang) {
                "tr" -> "…ve $n tane daha"
                "az" -> "…və daha $n ədəd"
                else -> clean
            }
        }

        togetherAddToHostQueueRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "Herhangi bir şarkının ⋯ menüsünden şarkı ekleyin: $host adlı kişinin sırasına eklenir."
                "az" -> "Hər hansı bir mahnının ⋯ menyusundan mahnı əlavə edin: $host adlı şəxsin növbəsinə əlavə olunar."
                else -> clean
            }
        }


        turnOnSettingFirstRegex.matchEntire(clean)?.let { m ->
            val setting = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Önce $setting ayarını açın"
                "az" -> "Əvvəlcə $setting parametrini aktivləşdirin"
                else -> clean
            }
        }

        summaryTabsRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            return when (lang) {
                "tr" -> "$n sekme"
                "az" -> "$n vərəq"
                else -> clean
            }
        }

        summaryMiniPlayerRegex.matchEntire(clean)?.let { m ->
            val style = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$style mini oynatıcı"
                "az" -> "$style mini oxuducu"
                else -> clean
            }
        }

        summaryBarRegex.matchEntire(clean)?.let { m ->
            val nav = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$nav çubuk"
                "az" -> "$nav panel"
                else -> clean
            }
        }

        summaryQualityRegex.matchEntire(clean)?.let { m ->
            val q = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$q kalite"
                "az" -> "$q keyfiyyət"
                else -> clean
            }
        }

        summarySmartDownloadsRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "Akıllı İndirmeler $size"
                "az" -> "Ağıllı Yükləmələr $size"
                else -> clean
            }
        }

        summaryStyleRegex.matchEntire(clean)?.let { m ->
            val s = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$s stili"
                "az" -> "$s üslubu"
                else -> clean
            }
        }

        summaryFirstRegex.matchEntire(clean)?.let { m ->
            val item = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Önce $item"
                "az" -> "Əvvəlcə $item"
                else -> clean
            }
        }

        summaryTextScaleRegex.matchEntire(clean)?.let { m ->
            val pct = m.groupValues[1]
            return when (lang) {
                "tr" -> "% $pct boyut"
                "az" -> "% $pct ölçü"
                else -> clean
            }
        }

        summaryHexAccentRegex.matchEntire(clean)?.let { m ->
            val hex = m.groupValues[1]
            return when (lang) {
                "tr" -> "$hex vurgusu"
                "az" -> "$hex vurğusu"
                else -> clean
            }
        }

        summaryFontRegex.matchEntire(clean)?.let { m ->
            val font = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$font yazı tipi"
                "az" -> "$font şrifti"
                else -> clean
            }
        }

        livesInPrismRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            return when (lang) {
                "tr" -> "$title Prism içinde yer alır, bu yüzden bağlantısı yoktur. Resim ve parça listesi içeriği paylaşır."
                "az" -> "$title Prism daxilindədir, buna görə keçidi yoxdur. Şəkil və trek siyahısı tərkibini bölüşür."
                else -> clean
            }
        }

        rewindReadyRegex.matchEntire(clean)?.let { m ->
            val yr = m.groupValues[1]
            return when (lang) {
                "tr" -> "$yr Rewind'ınız hazır"
                "az" -> "$yr Rewind-ınız hazırdır"
                else -> clean
            }
        }

        newFromOneArtistRegex.matchEntire(clean)?.let { m ->
            val a = m.groupValues[1]
            return when (lang) {
                "tr" -> "$a adlı sanatçıdan yeni müzik"
                "az" -> "$a adlı ifaçıdan yeni musiqi"
                else -> clean
            }
        }

        newFromTwoArtistsRegex.matchEntire(clean)?.let { m ->
            val a1 = m.groupValues[1]
            val a2 = m.groupValues[2]
            return when (lang) {
                "tr" -> "$a1 ve $a2 adlı sanatçılardan yeni müzik"
                "az" -> "$a1 və $a2 adlı ifaçılardan yeni musiqi"
                else -> clean
            }
        }

        newFromMultipleArtistsRegex.matchEntire(clean)?.let { m ->
            val a1 = m.groupValues[1]
            val a2 = m.groupValues[2]
            val count = m.groupValues[3]
            return when (lang) {
                "tr" -> "$a1, $a2 ve $count sanatçıdan daha yeni müzik"
                "az" -> "$a1, $a2 və daha $count ifaçıdan yeni musiqi"
                else -> clean
            }
        }

        foundItRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            return when (lang) {
                "tr" -> "Bulundu: $title"
                "az" -> "Tapıldı: $title"
                else -> clean
            }
        }

        pairingCodeNotificationRegex.matchEntire(clean)?.let { m ->
            val codeStr = m.groupValues[1]
            return when (lang) {
                "tr" -> "Eşleme kodu: $codeStr"
                "az" -> "Cütləşdirmə kodu: $codeStr"
                else -> clean
            }
        }

        wantsToPlayNotificationRegex.matchEntire(clean)?.let { m ->
            val from1 = m.groupValues[1]
            val from2 = m.groupValues[2]
            return when (lang) {
                "tr" -> "$from1 bu cihazda müzik çalmak istiyor. Cihazları eşleştirmek için bu kodu $from2 cihazına yazın."
                "az" -> "$from1 bu cihazda musiqi oxutmaq istəyir. Cihazları cütləşdirmək üçün bu kodu $from2 cihazına daxil edin."
                else -> clean
            }
        }

        intoLangRegex.matchEntire(clean)?.let { m ->
            val langName = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$langName diline"
                "az" -> "$langName dilinə"
                else -> clean
            }
        }

        howArtistNameSetRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name adlı sanatçının adının sayfasında nasıl görüneceği. İpucu: buraya geri dönmek için ada uzun basın."
                "az" -> "$name ifaçısının adının səhifəsində necə görünəcəyi. İpucu: bura qayıtmaq üçün ada uzun basın."
                else -> clean
            }
        }

        togetherJoinedRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name katıldı"
                "az" -> "$name qoşuldu"
                else -> clean
            }
        }

        togetherAddedRegex.matchEntire(clean)?.let { m ->
            val user = m.groupValues[1]
            val song = m.groupValues[2]
            return when (lang) {
                "tr" -> "$user, $song şarkısını ekledi"
                "az" -> "$user, $song mahnısını əlavə etdi"
                else -> clean
            }
        }

        togetherEndedRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "$name oturumu sonlandırdı"
                "az" -> "$name sessiyanı sonlandırdı"
                else -> clean
            }
        }

        lostConnectionRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device ile bağlantı koptu"
                "az" -> "$device ilə əlaqə kəsildi"
                else -> clean
            }
        }

        playingHereFromRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device cihazından burada çalınıyor"
                "az" -> "$device cihazından burada oxunur"
                else -> clean
            }
        }

        playingOnDeviceRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device üzerinde çalınıyor"
                "az" -> "$device üzərində oxunur"
                else -> clean
            }
        }

        movingToDeviceRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device cihazına aktarılıyor…"
                "az" -> "$device cihazına köçürülür…"
                else -> clean
            }
        }

        bringingOverRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device cihazından buraya aktarılıyor…"
                "az" -> "$device cihazından bura gətirilir…"
                else -> clean
            }
        }

        didntAcceptPairingRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device eşlemeyi kabul etmedi. Tekrar deneyin."
                "az" -> "$device cütləşdirməni qəbul etmədi. Yenidən cəhd edin."
                else -> clean
            }
        }

        couldntStartPlayingOpenRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device çalmayı başlatamadı. Orada Prism'i açın ve tekrar deneyin"
                "az" -> "$device oxutmanı başlada bilmədi. Orada Prism-i açın və yenidən cəhd edin"
                else -> clean
            }
        }

        openPrismFirstRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "Önce $device üzerinde Prism'i açın: Android, yalnızca açıkken (veya zaten çalıyorken) orada çalmaya başlamasına izin verir"
                "az" -> "Əvvəlcə $device üzərində Prism-i açın: Android yalnız açıq olduqda (və ya artıq oxunarkən) orada oxutmağa icazə verir"
                else -> clean
            }
        }

        showingSixDigitCodeRegex.matchEntire(clean)?.let { m ->
            val device = m.groupValues[1]
            return when (lang) {
                "tr" -> "$device altı haneli bir kod gösteriyor. Buraya yazın (yalnızca ilk seferde gereklidir)."
                "az" -> "$device altı rəqəmli kod göstərir. Bura daxil edin (yalnız ilk dəfə tələb olunur)."
                else -> clean
            }
        }

        songsOnPhoneWithVideosRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            val size = m.groupValues[2]
            val withVid = m.groupValues[3]
            return when (lang) {
                "tr" -> "$count şarkı · bu telefonda $size" + if (!withVid.isNullOrBlank()) " (videolarla $withVid)" else ""
                "az" -> "$count mahnı · bu telefonda $size" + if (!withVid.isNullOrBlank()) " (videolarla $withVid)" else ""
                else -> clean
            }
        }

        musicVideosDownloadingRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            val size = m.groupValues[2]
            val dl = m.groupValues[3]
            return when (lang) {
                "tr" -> "$count müzik videosu · $size" + if (!dl.isNullOrBlank()) " · $dl indiriliyor" else ""
                "az" -> "$count musiqi videosu · $size" + if (!dl.isNullOrBlank()) " · $dl endirilir" else ""
                else -> clean
            }
        }

        losslessFromPhoneRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count kayıpsız, telefonunuzdaki müzik dosyalarından"
                "az" -> "$count itkisiz, telefonunuzdakı musiqi fayllarından"
                else -> clean
            }
        }

        lyricsForKaraokeMoreRegex.matchEntire(clean)?.let { m ->
            val withLyrics = m.groupValues[1]
            val karaoke = m.groupValues[2]
            val hasMore = clean.contains("getting more…")
            return when (lang) {
                "tr" -> "$withLyrics şarkının sözü var · $karaoke karaoke" + if (hasMore) " · daha fazlası alınıyor…" else ""
                "az" -> "$withLyrics mahnının sözü var · $karaoke karaoke" + if (hasMore) " · daha çoxu əldə edilir…" else ""
                else -> clean
            }
        }

        downloadingSongsCountRegex.matchEntire(clean)?.let { m ->
            val target = m.groupValues[1]
            val translatedTarget = get(target, context)
            return when (lang) {
                "tr" -> "$translatedTarget indiriliyor…"
                "az" -> "$translatedTarget endirilir…"
                else -> clean
            }
        }

        cancelDownloadsPromptRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Tamamlanmamış $count indirme iptal edilsin mi?"
                "az" -> "Tamamlanmamış $count endirmə ləğv edilsin?"
                else -> clean
            }
        }

        pairedLastUsedRegex.matchEntire(clean)?.let { m ->
            val paired = get(m.groupValues[1], context)
            val used = get(m.groupValues[2], context)
            return when (lang) {
                "tr" -> "Eşlendi: $paired · son kullanım: $used"
                "az" -> "Cütləşdi: $paired · son istifadə: $used"
                else -> clean
            }
        }

        usingMbGbRegex.matchEntire(clean)?.let { m ->
            val size = m.groupValues[1]
            return when (lang) {
                "tr" -> "$size kullanılıyor"
                "az" -> "$size istifadə edilir"
                else -> clean
            }
        }

        switchedToAccountRegex.matchEntire(clean)?.let { m ->
            val account = m.groupValues[1]
            return when (lang) {
                "tr" -> "$account hesabına geçildi"
                "az" -> "$account hesabına keçildi"
                else -> clean
            }
        }

        goToLookAsSavedRegex.matchEntire(clean)?.let { m ->
            val look = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$look görünümünün kaydedilen haline geri dön"
                "az" -> "$look görünüşünün yadda saxlanılan halına qayıt"
                else -> clean
            }
        }

        replayStoryPlayedTimesRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            val duration = get(m.groupValues[2], context)
            return when (lang) {
                "tr" -> "Bunu $count kez, toplam $duration boyunca dinlediniz."
                "az" -> "Bunu $count dəfə, ümumilikdə $duration boyunca dinlədiniz."
                else -> clean
            }
        }

        allSettingsPageRegex.matchEntire(clean)?.let { m ->
            val page = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Tüm $page ayarları"
                "az" -> "Bütün $page parametrləri"
                else -> clean
            }
        }

        togetherListenStepRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "Aynı müzik $host cihazı ile eşzamanlı olarak bu telefonda da çalar. Kapalı: yalnızca onların sırasına şarkı ekler."
                "az" -> "Eyni musiqi $host cihazı ilə sinxron olaraq bu telefonda da oxunur. Sönülü: yalnız onların növbəsinə mahnı əlavə edir."
                else -> clean
            }
        }

        pickControlsRowRegex.matchEntire(clean)?.let { m ->
            val min = m.groupValues[1]
            val max = m.groupValues[2]
            return when (lang) {
                "tr" -> "Kontrollerin altındaki satır için $min ile $max arasında seçim yapın. Sıralamak için basılı tutun (veya tutamağından sürükleyin). Geri kalanı oynatıcının ⋯ menüsünde kalır."
                "az" -> "İdarəetmələrin altındakı cərgə üçün $min ilə $max arasında seçim edin. Sıralamaq üçün basıb saxlayın (və ya tutacağından dartın). Qalanları oxuducunun ⋯ menyusunda qalır."
                else -> clean
            }
        }

        savedToYouTubeMusicRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            return when (lang) {
                "tr" -> "\"$name\" YouTube Music'e kaydedildi"
                "az" -> "\"$name\" YouTube Music-ə saxlanıldı"
                else -> clean
            }
        }

        lookingUpSongRegex.matchEntire(clean)?.let { m ->
            val title = m.groupValues[1]
            val artist = m.groupValues[2]
            return when (lang) {
                "tr" -> if (artist.isNotBlank()) "\"$title\" ($artist) aranıyor" else "\"$title\" aranıyor"
                "az" -> if (artist.isNotBlank()) "\"$title\" ($artist) axtarılır" else "\"$title\" axtarılır"
                else -> clean
            }
        }

        downloadingJapaneseKanjiRegex.matchEntire(clean)?.let { m ->
            val pct = m.groupValues[1]
            return when (lang) {
                "tr" -> "Japonca kanji okuma verileri indiriliyor… %$pct"
                "az" -> "Yapon kanci oxu məlumatları endirilir… %$pct"
                else -> clean
            }
        }

        ourBlendOnPrismRegex.matchEntire(clean)?.let { m ->
            val match = m.groupValues[1]
            return when (lang) {
                "tr" -> "Prism'de Blend'imiz: %$match zevk uyumu"
                "az" -> "Prism-də Blend-imiz: %$match zövq uyğunluğu"
                else -> clean
            }
        }

        sendLookRegex.matchEntire(clean)?.let { m ->
            val look = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "$look gönder"
                "az" -> "$look göndər"
                else -> clean
            }
        }

        timeRemainingRegex.matchEntire(clean)?.let { m ->
            val time = m.groupValues[1]
            return when (lang) {
                "tr" -> "$time kaldı"
                "az" -> "$time qaldı"
                else -> clean
            }
        }

        playlistsCountRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "$count çalma listesi"
                "az" -> "$count pleylist"
                else -> clean
            }
        }

        nextLookAtRegex.matchEntire(clean)?.let { m ->
            val look = get(m.groupValues[1], context)
            val at = m.groupValues[2]
            return when (lang) {
                "tr" -> "Sıradaki: $look ($at)"
                "az" -> "Növbəti: $look ($at)"
                else -> clean
            }
        }

        lastStepsChangesRegex.matchEntire(clean)?.let { m ->
            val steps = m.groupValues[1]
            return when (lang) {
                "tr" -> "Görünümde yaptığınız son $steps değişiklik geriye dönmeniz için burada gösterilir."
                "az" -> "Görünüşdə etdiyiniz son $steps dəyişiklik geriyə qayıtmağınız üçün burada göstərilir."
                else -> clean
            }
        }

        andMoreUpcomingRegex.matchEntire(clean)?.let { m ->
            val n = m.groupValues[1]
            return when (lang) {
                "tr" -> "…ve $n tane daha"
                "az" -> "…və $n dənə daha"
                else -> clean
            }
        }

        togetherHostQueueRegex.matchEntire(clean)?.let { m ->
            val host = m.groupValues[1]
            return when (lang) {
                "tr" -> "Herhangi bir şarkının ⋯ menüsünden şarkı ekleyin: $host cihazının sırasına gider."
                "az" -> "İstənilən mahnının ⋯ menyusundan mahnı əlavə edin: $host cihazının növbəsinə gedər."
                else -> clean
            }
        }

        aboutSmartSongsFreeRegex.matchEntire(clean)?.let { m ->
            val songs = m.groupValues[1]
            val used = get(m.groupValues[2], context)
            val free = m.groupValues[3]
            return when (lang) {
                "tr" -> "Yaklaşık $songs şarkı · $used kullanıldı · Telefonda $free boş alan"
                "az" -> "Təxminən $songs mahnı · $used istifadə edildi · Telefonda $free boş yer"
                else -> clean
            }
        }

        replayYearNumberOneRegex.matchEntire(clean)?.let { m ->
            val year = m.groupValues[1]
            return when (lang) {
                "tr" -> "$year Replay · 1 numaranız"
                "az" -> "$year Replay · 1 nömrəniz"
                else -> clean
            }
        }

        homeBackdropOverColorRegex.matchEntire(clean)?.let { m ->
            val backdrop = get(m.groupValues[1], context)
            return when (lang) {
                "tr" -> "Ana Sayfa, bu rengin üzerine çizilen $backdrop arka planına (Cam ve arka planlar) sahiptir, bu nedenle orada yalnızca biraz görünür. Tamamen görmek için orada Ambiyans'ı seçin"
                "az" -> "Əsas Səhifə, bu rəngin üzərinə çəkilən $backdrop fonuna (Şüşə və fonlar) malikdir, buna görə orada yalnız bir az görünür. Tam görmək üçün orada Ambiyansı seçin"
                else -> clean
            }
        }

        takeOutOfFolderRegex.matchEntire(clean)?.let { m ->
            val folder = m.groupValues[1]
            TranslationManager.formatPattern("Take out of \"%s\"", context, folder)?.let { return it }
            return when (lang) {
                "tr" -> "\"$folder\" klasöründen çıkar"
                "az" -> "\"$folder\" qovluğundan çıxar"
                else -> clean
            }
        }

        inFolderRegex.matchEntire(clean)?.let { m ->
            val folder = m.groupValues[1]
            TranslationManager.formatPattern("In \"%s\"", context, folder)?.let { return it }
            return when (lang) {
                "tr" -> "\"$folder\" içinde"
                "az" -> "\"$folder\" daxilində"
                else -> clean
            }
        }

        changeColorRegex.matchEntire(clean)?.let { m ->
            val color = get(m.groupValues[1], context)
            TranslationManager.formatPattern("Change the %s color", context, color)?.let { return it }
            return when (lang) {
                "tr" -> "$color rengini değiştir"
                "az" -> "$color rəngini dəyiş"
                else -> clean
            }
        }

        mostPlayedInYearRegex.matchEntire(clean)?.let { m ->
            val year = m.groupValues[1]
            TranslationManager.formatPattern("Most played in %s", context, year)?.let { return it }
            return when (lang) {
                "tr" -> "$year yılında en çok dinlenenler"
                "az" -> "$year ilində ən çox dinlənilənlər"
                else -> clean
            }
        }

        folderPlaylistsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            TranslationManager.formatPattern("Folder · %s playlists", context, count)?.let { return it }
            return when (lang) {
                "tr" -> "Klasör · $count çalma listesi"
                "az" -> "Qovluq · $count pleylist"
                else -> clean
            }
        }

        allSettingsPageRegex2.matchEntire(clean)?.let { m ->
            val page = get(m.groupValues[1], context)
            TranslationManager.formatPattern("All %s settings", context, page)?.let { return it }
            return when (lang) {
                "tr" -> "Tüm $page ayarları"
                "az" -> "Bütün $page parametrləri"
                else -> clean
            }
        }

        resetSectionRegex.matchEntire(clean)?.let { m ->
            val sec = get(m.groupValues[1], context)
            TranslationManager.formatPattern("Reset %s?", context, sec)?.let { return it }
            return when (lang) {
                "tr" -> "$sec sıfırlansın mı?"
                "az" -> "$sec sıfırlansın?"
                else -> clean
            }
        }

        undoStepRegex.matchEntire(clean)?.let { m ->
            val step = get(m.groupValues[1], context)
            TranslationManager.formatPattern("Undo: %s", context, step)?.let { return it }
            return when (lang) {
                "tr" -> "Geri al: $step"
                "az" -> "Geri qaytar: $step"
                else -> clean
            }
        }

        copyingPlaylistRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            TranslationManager.formatPattern("Copying \"%s\"…", context, name)?.let { return it }
            return when (lang) {
                "tr" -> "\"$name\" kopyalanıyor…"
                "az" -> "\"$name\" kopyalanır…"
                else -> clean
            }
        }

        couldntLoadPlaylistRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            TranslationManager.formatPattern("Couldn't load \"%s\"", context, name)?.let { return it }
            return when (lang) {
                "tr" -> "\"$name\" yüklenemedi"
                "az" -> "\"$name\" yüklənmədi"
                else -> clean
            }
        }

        noSongsToCopyRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            TranslationManager.formatPattern("\"%s\" has no songs to copy", context, name)?.let { return it }
            return when (lang) {
                "tr" -> "\"$name\" kopyalanacak şarkı içermiyor"
                "az" -> "\"$name\" kopyalanacaq mahnıya malik deyil"
                else -> clean
            }
        }

        savedCopyPrismRegex.matchEntire(clean)?.let { m ->
            val name = m.groupValues[1]
            val count = get(m.groupValues[2], context)
            TranslationManager.formatPattern("Saved \"%s\" as a Prism playlist (%s)", context, name, count)?.let { return it }
            return when (lang) {
                "tr" -> "\"$name\", Prism çalma listesi olarak kaydedildi ($count)"
                "az" -> "\"$name\", Prism pleylisti kimi saxlanıldı ($count)"
                else -> clean
            }
        }

        tourPlanThingsRegex.matchEntire(clean)?.let { m ->
            val count = m.groupValues[1]
            return when (lang) {
                "tr" -> "Son baktığınızdan bu yana bilmeniz gereken $count şey, yaklaşık bir dakika içinde."
                "az" -> "Son baxdığınızdan bəri bilməli olduğunuz $count şey, təxminən bir dəqiqə ərzində."
                else -> clean
            }
        }

        return clean
    }
}

@Composable
fun String.localized(): String = LocalizedStrings.get(this, LocalContext.current)

@Composable
fun String.localized(vararg args: Any): String {
    val pattern = LocalizedStrings.get(this, LocalContext.current)
    return try {
        pattern.format(*args)
    } catch (_: Exception) {
        pattern
    }
}

fun String.localized(context: Context): String = LocalizedStrings.get(this, context)

fun String.localized(context: Context, vararg args: Any): String {
    val pattern = LocalizedStrings.get(this, context)
    return try {
        pattern.format(*args)
    } catch (_: Exception) {
        pattern
    }
}
