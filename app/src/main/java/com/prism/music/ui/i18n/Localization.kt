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


                        private val trMap1 = mapOf(
        "\"Continue …\" picks up the album you were in" to "\"Devam et …\" dinlemekte olduğunuz albüme kaldığı yerden devam eder",
        "\"Not for me\" and \"Leave out of my taste\" keep things out" to "\"Bana göre değil\" ve \"Zevkimden hariç tut\" istenmeyenleri uzak tutar",
        "\"On this phone\" searches your own music files" to "\"Bu telefonda\" kendi müzik dosyalarınızı arar",
        "10 bands, bass boost, headphone correction" to "10 bant, bas güçlendirme, kulaklık düzeltme",
        "10-band equalizer" to "10 bantlı ekolayzer",
        "256 kbps with YouTube Music Premium" to "YouTube Music Premium ile 256 kbps",
        "3 h 52 m" to "3 sa 52 dk",
        "3 min · Explicit" to "3 dk · Uygunsuz içerik",
        "3 tabs" to "3 sekme",
        "4 tabs" to "4 sekme",
        "42h 10m" to "42 sa 10 dk",
        "5 tabs" to "5 sekme",
        "A .prismlook file, with its photos and font" to "Fotoğrafları ve yazı tipiyle bir .prismlook dosyası",
        "A Look keeps colors, type, icons, backgrounds, the player and lyrics' look together. Pick one and everything changes at once; Undo puts it back." to "Bir Görünüm; renkleri, yazı tiplerini, simgeleri, arka planları, oynatıcı ve şarkı sözlerinin görünümünü bir arada tutar. Birini seçtiğinizde her şey bir anda değişir; Geri Al eski haline getirir.",
        "A Prism Account (Settings, at the top) is your name and picture (a photo or one of Prism's), all on this phone; it can keep a copy of your YouTube Music library" to "Prism Hesabı (Ayarlar, üstte) adınız ve resminizdir (bir fotoğraf veya Prism görsellerinden biri), hepsi bu telefondadır; YouTube Music kitaplığınızın bir kopyasını tutabilir",
        "A background of their own: plain dark, the cover blurred or moving, its color, or yours; immersive mode too" to "Kendilerine ait bir arka plan: sade koyu, kapak bulanık veya hareketli, rengi veya sizinki; sürükleyici mod da dahil",
        "A band of refracted light down one side" to "Bir kenardan süzülen kırılmış ışık şeridi",
        "A bit of everything" to "Her şeyden biraz",
        "A code is 6 hex digits, like #3A86FF" to "Kod, #3A86FF gibi 6 onaltılık basamaktır",
        "A code someone sent you" to "Birinin size gönderdiği kod",
        "A color, or two as a gradient" to "Bir renk veya gradyan olarak iki renk",
        "A dot with the Thumb style" to "Tutamaç stiliyle bir nokta",
        "A downloaded song's animated cover is kept on the phone too, so it plays offline. An album's songs share one copy." to "İndirilen bir şarkının hareketli kapağı da telefonda tutulur, böylece çevrimdışı oynatılır. Bir albümdeki şarkılar tek bir kopyayı paylaşır.",
        "A faint wash of color and month bars" to "Hafif bir renk geçişi ve ay çubukları",
        "A few MB a song" to "Şarkı başına birkaç MB",
        "A few sung lines stay in view" to "Söylenen birkaç satır görünür kalır",
        "A few things you asked for." to "İstediğiniz birkaç şey.",
        "A light tap on buttons and swipes" to "Düğmelere dokunurken ve kaydırırken hafif titreşim",
        "A log for tracking down stutters" to "Takılmaları tespit etmek için bir günlük",
        "A long title scrolls across (off: it ends with …)" to "Uzun başlık kayar (kapalı: … ile biter)",
        "A minute's tour of Prism" to "Prism'e bir dakikalık tur",
        "A minute's walk through Prism" to "Prism'e bir dakikalık bakış",
        "A music video in autoplay or a radio plays as its song, and videos with no song version are left out." to "Otomatik oynatmada veya radyoda bir müzik videosu şarkı olarak çalınır, şarkı sürümü olmayan videolar hariç tutulur.",
        "A new Prism is out" to "Yeni bir Prism sürümü çıktı",
        "A playlist of two tastes" to "İki zevkten oluşan bir çalma listesi",
        "A playlist of two tastes, made on both phones. Swap codes and it's ready." to "Her iki telefonda oluşturulan iki zevkin çalma listesi. Kodları paylaşın ve hazır.",
        "A small copy of each song, 1–4 MB" to "Her şarkının küçük bir kopyası, 1–4 MB",
        "A small risk to your Discord account" to "Discord hesabınız için küçük bir risk",
        "A song and its video as one" to "Bir şarkı ve videosu tek bir bütün olarak",
        "A star instead of a heart for likes" to "Beğeniler için kalp yerine yıldız",
        "A tap still changes songs" to "Dokunmak şarkıyı değiştirmeye devam eder",
        "A third down" to "Üçte bir aşağıda",
        "A to Z" to "A'dan Z'ye",
        "A visualizer if you'd like one: bars, a wave, a ring, a pulse or a glow (off unless you pick it)" to "İsterseniz bir görselleştirici: çubuklar, dalga, halka, nabız veya parıltı (siz seçene kadar kapalıdır)",
        "A waveform progress bar, its color, the title centred or bigger, and which times show" to "Dalga formu ilerleme çubuğu, rengi, başlığın ortalanması veya büyütülmesi ve hangi sürelerin gösterileceği",
        "ALBUM" to "ALBÜM",
        "AMOLED-friendly dark theme" to "AMOLED uyumlu koyu tema",
        "About 3–8 MB a song" to "Şarkı başına yaklaşık 3–8 MB",
        "About this" to "Bunun hakkında",
        "Accent color" to "Vurgu rengi",
        "Accounts" to "Hesaplar",
        "Accounts and channels" to "Hesaplar ve kanallar",
        "Add" to "Ekle",
        "Add a Google account" to "Google hesabı ekle",
        "Add a color" to "Bir renk ekle",
        "Add a section" to "Bir bölüm ekle",
        "Add new sections automatically" to "Yeni bölümleri otomatik olarak ekle",
        "Add the Recognize widget or Quick Settings tile to do it from anywhere" to "Her yerden yapabilmek için Şarkı Tanıma widget'ını veya Hızlı Ayarlar kutucuğunu ekleyin",
        "Add your Look" to "Görünümünüzü ekleyin",
        "Added albums" to "Eklenen albümler",
        "Address" to "Adres",
        "Address on the host's screen" to "Kurucunun ekranındaki adres",
        "After Hours" to "After Hours",
        "After a video, the next song plays as video too" to "Bir videodan sonra sıradaki şarkı da video olarak oynatılır",
        "Ahead 10 s" to "10 sn ileri",
        "Ahead 30 s" to "30 sn ileri",
        "Album & playlist cards" to "Albüm ve çalma listesi kartları",
        "Album, playlist and artist pages use their picture's color instead (Artist & album pages, below)" to "Albüm, çalma listesi ve sanatçı sayfaları bunun yerine kendi resimlerinin rengini kullanır (Sanatçı ve albüm sayfaları, aşağıda)",
        "Albums" to "Albümler",
        "Albums, artists & playlists as" to "Albümler, sanatçılar ve çalma listeleri görünümü:",
        "Alignment" to "Hizalama",
        "All" to "Tümü",
        "All time" to "Tüm zamanlar",
        "Allow Prism to install updates" to "Prism'in güncellemeleri yüklemesine izin verin",
        "Allow access to lossless files" to "Kayıpsız dosyalara erişime izin ver",
        "Allow notifications" to "Bildirimlere izin ver",
        "Allow the camera" to "Kameraya izin ver",
        "Also checked every few hours" to "Ayrıca birkaç saatte bir kontrol edilir",
        "Also new" to "Ayrıca yeni",
        "Always colorful" to "Her zaman renkli",
        "Always play at 256 kbps when on Wi-Fi" to "Wi-Fi bağlıyken her zaman 256 kbps hızında oynat",
        "Always plays the best audio there is, keeps hi-res at full resolution, and plays matching FLAC, WAV and AIFF files on your phone instead of the stream. Put them in your Music folder." to "Her zaman mevcut en iyi sesi çalar, yüksek çözünürlüklü sesi tam kalitede tutar ve akış yerine telefonunuzdaki eşleşen FLAC, WAV ve AIFF dosyalarını çalar. Bunları Müzik klasörünüze koyun.",
        "An AutoEq or EqualizerAPO .txt (Preamp and Filter lines)" to "Bir AutoEq veya EqualizerAPO .txt dosyası (Preamp ve Filter satırları)",
        "Android Auto" to "Android Auto",
        "Android can't update across that change, so this once Prism is reinstalled. Your things come with you:" to "Android bu değişiklik üzerinden güncelleme yapamaz, bu yüzden Prism bu defalık yeniden yüklenir. Verileriniz korunur:",
        "Animated cover" to "Hareketli kapak",
        "Animated cover saved" to "Hareketli kapak kaydedildi",
        "Animated covers" to "Hareketli kapaklar",
        "Any network" to "Herhangi bir ağ",
        "Anyone can find it and open it." to "Herkes bulabilir ve açabilir.",
        "Anyone can find it." to "Herkes bulabilir.",
        "Anyone with the link can open it, so it's easy to share." to "Bağlantıya sahip herkes açabilir, paylaşması kolaydır.",
        "Anyone with the link can open it; it doesn't show up in search." to "Bağlantıya sahip herkes açabilir; aramalarda görünmez.",
        "App icon" to "Uygulama simgesi",
        "App info" to "Uygulama bilgisi",
        "Appearance: the Spectrum's colors (or plain white), your accent, fonts, icons and backgrounds" to "Görünüm: Spektrum renkleri (veya sade beyaz), vurgunuz, yazı tipleri, simgeler ve arka planlar",
        "Artist & album pages" to "Sanatçı ve albüm sayfaları",
        "Artist, album and playlist pages sit on frosted glass made from their picture; Home, Library, Search and Settings sit on frost from what's playing. Whether pages take their picture's color is under Color." to "Sanatçı, albüm ve çalma listesi sayfaları resimlerinden oluşturulan buzlu cam üzerinde durur; Ana Sayfa, Kitaplık, Ara ve Ayarlar çalan parçanın buzlanması üzerinde durur. Sayfaların resim rengini alıp almayacağı Renk altındadır.",
        "Artists" to "Sanatçılar",
        "Artists not to play, and playlists or songs left out of your taste." to "Çalınmayacak sanatçılar ve zevkinizden hariç tutulan çalma listeleri veya şarkılar.",
        "Artwork" to "Albüm kapağı",
        "As a song ends it fades out while the next fades in, as on Spotify. Never between an album's own tracks." to "Spotify'da olduğu gibi bir şarkı biterken sesi kısılır, diğeri yavaşça başlar. Bir albümün kendi parçaları arasında asla uygulanmaz.",
        "As now" to "Şimdiki gibi",
        "Asking GitHub…" to "GitHub'a soruluyor…",
        "At the end of Home" to "Ana sayfanın sonunda",
        "At the top of Home" to "Ana sayfanın başında",
        "Audio offload" to "Donanımsal ses hızlandırma",
        "Audio quality" to "Ses kalitesi",
        "Aurora" to "Aurora",
        "Auto download" to "Otomatik indirme",
        "Automatic (follow the phone)" to "Otomatik (telefonu takip et)",
        "Automatic length" to "Otomatik uzunluk",
        "Autoplay and radios play songs" to "Otomatik oynatma ve radyolar şarkı çalar",
        "Autoplay from" to "Otomatik oynatma kaynağı",
        "Available for handoff" to "Aktarım için uygun",
        "BLEND" to "KARIŞIM",
        "Back 10 s" to "10 sn geri",
        "Back 30 s" to "30 sn geri",
        "Back to Lyrics, Video and Up next" to "Şarkı Sözleri, Video ve Sıradaki'ne geri dön",
        "Back to Prism's buttons" to "Prism'in düğmelerine geri dön",
        "Back to Prism's order" to "Prism'in sıralamasına geri dön",
        "Back to a built-in font" to "Yerleşik bir yazı tipine dön",
        "Back to the part people replay most" to "En çok tekrar oynatılan kısma geri dön",
        "Back up" to "Yedekle",
        "Back up Prism" to "Prism'i yedekle",
        "Backed up" to "Yedeklendi",
        "Background" to "Arka plan",
        "Background color" to "Arka plan rengi",
        "Backgrounds" to "Arka planlar",
        "Backing up…" to "Yedekleniyor…",
        "Backup" to "Yedekleme",
        "Backup & restore" to "Yedekleme ve geri yükleme",
        "Bass Boost" to "Bas Güçlendirme",
        "Bass Reducer" to "Bas Azaltma",
        "Beats line up while songs overlap" to "Şarkılar üst üste binerken vuruşlar hizalanır",
        "Behind the lyrics" to "Şarkı sözlerinin arkasında",
        "Best part jumps to where listeners replay most; hold it to pick your own" to "En iyi kısım, dinleyicilerin en çok tekrar dinlediği yere atlar; kendinizinkini seçmek için basılı tutun",
        "Between songs" to "Şarkılar arasında",
        "Blend" to "Karışım",
        "Blend makes a playlist of two tastes with a friend: scan each other's code and both phones get it" to "Blend, bir arkadaşınızla iki zevkten oluşan bir çalma listesi oluşturur: birbirinizin kodunu tarayın ve her iki telefona da gelsin",
        "Blinding Lights" to "Blinding Lights",
        "Bluetooth" to "Bluetooth",
        "Blurred cover" to "Bulanık kapak",
        "Bold" to "Kalın",
        "Bottom bar" to "Alt çubuk",
        "Bring back" to "Geri getir",
        "Bring here" to "Buraya aktar",
        "Bring it back from Customize Home" to "Ana Sayfayı Özelleştir'den geri getirin",
        "Browse Looks people shared, under From the community" to "Topluluktan altında insanların paylaştığı Görünümlere göz atın",
        "Browse community Looks" to "Topluluk Görünümlerine göz at",
        "Browser remote on" to "Tarayıcıdan uzaktan kumanda açık",
        "Built with" to "Şununla geliştirildi:",
        "Buttons" to "Düğmeler",
        "Buttons and touch" to "Düğmeler ve dokunma",
        "By day" to "Gündüz",
        "By night" to "Gece",
        "By pull request on GitHub" to "GitHub'da pull request ile",
        "Cache" to "Önbellek",
        "Calmer, quicker animations" to "Daha sakin, daha hızlı animasyonlar",
        "Capitals" to "Büyük harfler",
        "Card mini player" to "Kart mini oynatıcı",
        "Card style" to "Kart stili",
        "Centered, as on a lyric sheet" to "Şarkı sözü kağıdındaki gibi ortalanmış",
        "Centred" to "Ortalanmış",
        "Change" to "Değiştir",
        "Change lyrics source" to "Şarkı sözü kaynağını değiştir",
        "Change picture" to "Resmi değiştir",
        "Changes the moment you pick" to "Seçtiğiniz anda değişir",
        "Check for updates" to "Güncellemeleri denetle",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another" to "Bağlantınızı kontrol edin. İş ve okul ağları gibi bazı ağlar Discord'u engelleyebilir: başka bir ağ deneyin",
        "Checking…" to "Kontrol ediliyor…",
        "Choose the display language for Prism" to "Prism için görüntüleme dilini seçin",
        "Choose what swipes, a double tap and a long press do on the cover and the mini player" to "Kapakta ve mini oynatıcıda kaydırmaların, çift dokunmanın ve uzun basmanın ne yapacağını seçin",
        "Choose where" to "Konum seç",
        "Chosen" to "Seçildi",
        "Classical" to "Klasik",
        "Clear diagnostics" to "Tanılamaları temizle",
        "Clear search" to "Aramayı temizle",
        "Clear sung songs" to "Söylenen şarkıları temizle",
        "Codes leave out photos and your own font; a file can carry them." to "Kodlar fotoğrafları ve kendi yazı tipinizi hariç tutar; bir dosya bunları taşıyabilir.",
        "Color" to "Renk",
        "Color code" to "Renk kodu",
        "Color fields drift, waves roll and ripples spread, slowly" to "Renk alanları süzülür, dalgalar yuvarlanır ve dalgacıklar yavaşça yayılır",
        "Color mesh" to "Renk ağı",
        "Color wheel" to "Renk tekerleği",
        "Color, your way" to "Renk, sizin zevkinize göre",
        "Colors" to "Renkler",
        "Confirm in Android's installer" to "Android yükleyicisinde onaylayın",
        "Connecting…" to "Bağlanıyor…",
        "Content country" to "İçerik ülkesi",
        "Continue line" to "Satıra devam et",
        "Continue listening" to "Dinlemeye devam et",
        "Control Prism from a browser on your computer" to "Prism'i bilgisayarınızdaki bir tarayıcıdan kontrol edin",
        "Control from a browser" to "Tarayıcıdan kontrol et",
        "Controls" to "Denetimler",
        "Copy" to "Kopyala",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out." to "Çalma listelerini, kayıtlı albümleri ve sanatçıları Prism'e kopyalayın, böylece oturum kapatılsa bile bu telefonda kalırlar.",
        "Corners" to "Köşeler",
        "Couldn't build your Replay" to "Tekrar özetiniz oluşturulamadı",
        "Couldn't build your Rewind" to "Geri Sarma özetiniz oluşturulamadı",
        "Couldn't create playlist" to "Çalma listesi oluşturulamadı",
        "Couldn't load the credits. Check your connection and try again." to "Katkıda bulunanlar yüklenemedi. Bağlantınızı kontrol edip tekrar deneyin.",
        "Couldn't load the gallery" to "Galeri yüklenemedi",
        "Couldn't load your history" to "Geçmişiniz yüklenemedi",
        "Couldn't match this video to the song automatically. Use the controls above to line the lyrics up." to "Bu video otomatik olarak şarkıyla eşleştirilemedi. Sözleri hizalamak için yukarıdaki kontrolleri kullanın.",
        "Couldn't reach Discord" to "Discord'a ulaşılamadı",
        "Couldn't reach GitHub · try again in a moment" to "GitHub'a ulaşılamadı · birazdan tekrar deneyin",
        "Couldn't recognize that one" to "Bu şarkı tanınamadı",
        "Cover" to "Kapak",
        "Cover art" to "Kapak resmi",
        "Cover size" to "Kapak boyutu",
        "Covers in a grid" to "Kapaklar ızgara düzeninde",
        "Create" to "Oluştur",
        "Crossfade" to "Çapraz geçiş",
        "Crossfade (Settings → Playback & sound) blends any two songs" to "Çapraz Geçiş (Ayarlar → Oynatma ve ses) herhangi iki şarkıyı birbirine harmanlar",
        "Crossfade songs" to "Şarkılar arası çapraz geçiş",
        "Custom" to "Özel",
        "Customize Home" to "Ana sayfayı özelleştir",
        "Customize button at the bottom" to "En alttaki Özelleştir düğmesi",
        "Customize button at the top" to "En üstteki Özelleştir düğmesi",
        "Customize button on Home" to "Ana sayfadaki Özelleştir düğmesi",
        "Customize by tapping" to "Dokunarak özelleştirin",
        "Customize by tapping: hold the Settings tab, or turn it on in Appearance, then tap the mini player, tab bar, player or a Home section" to "Dokunarak özelleştirin: Ayarlar sekmesini basılı tutun veya Görünüm'de açın, ardından mini oynatıcıya, sekme çubuğuna, oynatıcıya veya bir Ana Sayfa bölümüne dokunun",
        "Customize home" to "Ana sayfayı özelleştir",
        "Customize this" to "Bunu özelleştir",
        "DJ mode and Crossfade" to "DJ modu ve Çapraz Geçiş",
        "Daily Mixes group the artists you play by what goes together" to "Günlük Miksler, dinlediğiniz sanatçıları birbirine uyumlarına göre gruplar",
        "Dark" to "Koyu",
        "Dark mode" to "Karanlık mod",
        "Dark theme" to "Koyu tema",
        "Data saver" to "Veri tasarrufu",
        "Date added" to "Eklenme tarihi",
        "Day and night" to "Gündüz ve gece",
        "Day and night Looks" to "Gündüz ve gece Görünümleri",
        "Day starts at" to "Gündüz başlangıcı",
        "Delete all downloads" to "Tüm indirmeleri sil",
        "Delete playlist" to "Çalma listesini sil",
        "Delete the playlist" to "Çalma listesini sil",
        "Delete the playlist?" to "Çalma listesi silinsin mi?",
        "Design gallery" to "Tasarım galerisi",
        "Diagnostics" to "Tanılama",
        "Diagnostics cleared" to "Tanılamalar temizlendi",
        "Different color for light mode" to "Açık mod için farklı renk",
        "Discord has no way for Android apps to do this officially, so Prism uses your Discord sign-in the way other Android music players do. Discord doesn't allow that for third-party apps, so there's a small risk to your account. Prism only ever changes your status." to "Discord'un Android uygulamalarının bunu resmi olarak yapmasının bir yolu yoktur, bu nedenle Prism, Discord oturumunuzu diğer Android müzik çalarlar gibi kullanır. Discord üçüncü taraf uygulamalar için buna izin vermez, bu nedenle hesabınız için küçük bir risk vardır. Prism yalnızca durumunuzu değiştirir.",
        "Discover together" to "Birlikte keşfedin",
        "Dismiss" to "Kapat",
        "Docked mini player" to "Sabit mini oynatıcı",
        "Double-tap the cover's sides to skip back or ahead" to "Geriye veya ileriye atlamak için kapağın kenarlarına çift dokunun",
        "Download liked songs automatically" to "Beğenilen şarkıları otomatik olarak indir",
        "Download lyrics again" to "Şarkı sözlerini tekrar indir",
        "Download on Wi-Fi only" to "Yalnızca Wi-Fi üzerinden indir",
        "Download progress" to "İndirme ilerlemesi",
        "Downloaded songs keep theirs" to "İndirilen şarkılar kendilerininkini korur",
        "Downloading" to "İndiriliyor",
        "Downloading its photos…" to "Fotoğrafları indiriliyor…",
        "Downloads on Wi-Fi only" to "Yalnızca Wi-Fi ile indir",
        "Drag to reorder" to "Sıralamak için sürükleyin",
        "EVERY LINE IN CAPITALS" to "HER SATIR BÜYÜK HARFLERLE",
        "Each group says everything it changes in the app" to "Her grup uygulamada değiştirdiği her şeyi açıklar",
        "Each pair of headphones keeps its own correction, and the phone's speaker and the car never get one. Corrections come from the AutoEq project (Jaakko Pasanen, MIT licence), from measurements by oratory1990, crinacle and others. Only the headphone's name is looked up, on GitHub." to "Her kulaklık kendi düzeltmesini saklar; telefonun hoparlörü ve araba asla düzeltme almaz. Düzeltmeler AutoEq projesinden (Jaakko Pasanen, MIT lisansı), oratory1990, crinacle ve diğerlerinin ölçümlerinden gelir. GitHub'da yalnızca kulaklığın adı aranır.",
        "Each song fades into the next" to "Her şarkı yavaşça bir sonrakine geçer",
        "Each song is measured on your phone and brought to the same level (-14 LUFS, like Spotify): loud ones down, quiet ones up, with a limiter so nothing clips. Works offline too." to "Her şarkı telefonunuzda ölçülür ve aynı seviyeye getirilir (Spotify gibi -14 LUFS): yüksek sesliler kısılır, kısık sesliler yükseltilir; sınırlayıcı sayesinde ses patlamaz. Çevrimdışı da çalışır.",
        "Earlier" to "Daha önce",
        "Edge to edge at the top" to "En üstte uçtan uca",
        "Edge to edge, like an artist page" to "Sanatçı sayfası gibi uçtan uca",
        "Edit details" to "Ayrıntıları düzenle",
        "Elapsed" to "Geçen süre",
        "Electronic" to "Elektronik",
        "End of song" to "Şarkı sonu",
        "Episode" to "Bölüm",
        "Episodes" to "Bölümler",
        "Episodes for later" to "Daha sonrası için bölümler",
        "Equalizer & sound" to "Ekolayzer ve ses",
        "Every color finds its way" to "Her renk kendi yolunu bulur",
        "Every component of the redesign, in each state" to "Yeniden tasarımın her bileşeni, her durumda",
        "Every look page shows Home, the player and lyrics as you change them; Undo takes a change back" to "Her görünüm sayfası siz değiştirdikçe Ana Sayfa'yı, oynatıcıyı ve sözleri gösterir; Geri Al değişikliği geri alır",
        "Every major feature of the redesign, in eight cards. Swipe, or tap Start." to "Yeniden tasarımın her önemli özelliği sekiz kartta. Kaydırın veya Başlat'a dokunun.",
        "Every song at the same loudness" to "Her şarkı aynı ses seviyesinde",
        "Everyone in the session hears this" to "Oturumdaki herkes bunu dinliyor",
        "Everything you keep, with or without a YouTube Music account." to "YouTube Music hesabı olsun veya olmasın kaydettiğiniz her şey.",
        "Everywhere" to "Her yerde",
        "Exclusions" to "Dışlananlar",
        "Exit full screen" to "Tam ekrandan çık",
        "Explicit" to "Uygunsuz içerik",
        "Failed before Prism kept the reason" to "Prism nedeni kaydetmeden önce başarısız oldu",
        "Faster" to "Daha Hızlı",
        "Favourites" to "Favoriler",
        "Fewer" to "Daha az",
        "Fewest first" to "En az olan başta",
        "File size" to "Dosya boyutu",
        "Fill" to "Doldur",
        "Fill the player" to "Oynatıcıyı doldur",
        "Fills in starred-out words" to "Yıldızlanan sansürlü kelimeleri doldurur",
        "Filters for songs, videos, albums, artists, podcasts and live" to "Şarkılar, videolar, albümler, sanatçılar, podcast'ler ve canlı performanslar için filtreler",
        "Find anything in Prism Music, or name the song playing around you." to "Prism Music'teki her şeyi bulun veya etrafınızda çalan şarkıyı tanımlayın.",
        "Fitted to how songs end and begin" to "Şarkıların bitiş ve başlangıç şekline göre ayarlandı",
        "Flat" to "Düz",
        "Floating bar" to "Kayan çubuk",
        "Floating mini player" to "Kayan mini oynatıcı",
        "Font" to "Yazı tipi",
        "Font, text size, corners, spacing, navigation bar, tabs, mini player and player style go back to how Prism ships. Your colors, backgrounds and everything else stay as they are." to "Yazı tipi, metin boyutu, köşeler, aralıklar, gezinme çubuğu, sekmeler, mini oynatıcı ve oynatıcı stili Prism'in ilk haline döner. Renkleriniz, arka planlarınız ve diğer her şey olduğu gibi kalır.",
        "Fonts" to "Yazı tipleri",
        "For songs in another language. Machine translation: the lyrics' text (nothing else) is sent to Google Translate." to "Başka bir dildeki şarkılar için. Makine çevirisi: şarkı sözü metni (başka hiçbir şey) Google Çeviri'ye gönderilir.",
        "For you" to "Sizin için",
        "Forget crashes" to "Çökmeleri unut",
        "Forget my best part" to "En iyi kısmımı unut",
        "Forgets the sign-in on this phone" to "Bu telefondaki oturumu unutur",
        "Found it" to "Bulundu",
        "Framed artwork" to "Çerçeveli kapak",
        "Fresh Daily Mixes now" to "Günlük Miksleri hemen yenile",
        "Friends on this Wi-Fi join with a code. They can listen along on their phones or add songs to your queue." to "Bu Wi-Fi'daki arkadaşlarınız bir kodla katılır. Kendi telefonlarından dinleyebilir veya kuyruğunuza şarkı ekleyebilirler.",
        "Friends open Listen together in Prism on the same Wi-Fi, tap your session and enter this code." to "Arkadaşlarınız aynı Wi-Fi ağında Prism'de Birlikte Dinle'yi açıp oturumunuza dokunur ve bu kodu girer.",
        "From Apple Music" to "Apple Music'ten",
        "From GitHub" to "GitHub'dan",
        "From Prism" to "Prism'den",
        "From Prism's next start." to "Prism'in bir sonraki başlangıcından itibaren.",
        "From Spotify" to "Spotify'dan",
        "From Spotify, Apple Music and more" to "Spotify, Apple Music ve daha fazlasından",
        "From Spotify, Apple Music…" to "Spotify, Apple Music… üzerinden",
        "From YouTube Music" to "YouTube Music'ten",
        "From a computer or tablet on this Wi-Fi" to "Bu Wi-Fi üzerindeki bir bilgisayar veya tabletten",
        "From a friend's Prism" to "Bir arkadaşın Prism'inden",
        "From another service or a file" to "Başka bir servisten veya dosyadan",
        "From the community" to "Topluluktan",
        "From your liked songs" to "Beğendiğiniz şarkılardan",
        "Frosted Glass" to "Buzlu Cam",
        "Frosted pages" to "Buzlu sayfalar",
        "Full color, like a Rewind slide" to "Geri Sarma slaytı gibi tam renkli",
        "Full-bleed artwork" to "Çerçevesiz kapak",
        "Full-width playlist pictures" to "Tam genişlikte çalma listesi resimleri",
        "GPL-3.0-or-later, and what it's built with" to "GPL-3.0-veya-sonrası ve geliştirildiği araçlar",
        "Gentle motion" to "Yumuşak hareket",
        "Gestures" to "Hareketler",
        "Get a Look" to "Bir Görünüm Al",
        "Get missing lyrics" to "Eksik sözleri al",
        "Get songs ready on mobile data" to "Şarkıları mobil veride hazırla",
        "Get songs ready while Sing is off" to "Sing kapalıyken şarkıları hazırla",
        "Glass" to "Cam",
        "Glass ringed in split light, the time in color" to "Ayrık ışıkla çevrili cam, renkli süre",
        "Glass style" to "Cam stili",
        "Glow" to "Parlama",
        "Go to" to "Git",
        "Good evening" to "İyi akşamlar",
        "Good morning / afternoon / evening" to "Günaydın / Tünaydın / İyi akşamlar",
        "Greeting" to "Karşılama",
        "Grey or black-and-white covers still give a color" to "Gri veya siyah-beyaz kapaklar yine de bir renk verir",
        "Guests can control playback" to "Konuklar oynatmayı kontrol edebilir",
        "Hand what's playing to another phone or tablet with Prism" to "Çalan müziği Prism yüklü başka bir telefona veya tablete aktarın",
        "Handoff" to "Cihazlar arası aktarım",
        "Haptics" to "Titreşim bildirimleri",
        "Headline" to "Manşet",
        "Indie & alternative" to "İndie ve alternatif",
        "Dance & electronic" to "Dans ve elektronik",
        "Soundtracks & musicals" to "Film müzikleri ve müzikaller",
        "Country & Americana" to "Country ve Americana",
        "Folk & acoustic" to "Halk müziği ve akustik",
        "R&B & soul" to "R&B ve soul",
        "Sorting…" to "Sıralanıyor…",
        "Search in album" to "Albümde ara",
        "Hear a song you like? Let Prism listen for a few seconds: what it finds is kept here." to "Beğendiğiniz bir şarkı mı duydunuz? Prism'in birkaç saniye dinlemesine izin verin: bulduğu şarkılar burada saklanır.",
        "Helps the words read over photos and moving covers" to "Sözlerin fotoğraf ve hareketli kapaklar üzerinde daha rahat okunmasını sağlar",
        "Hidden" to "Gizlenen",
        "Hide Sing's controls" to "Eşlik Et kontrollerini gizle",
        "Hide details" to "Ayrıntıları gizle",
        "Hide the status bar" to "Durum çubuğunu gizle",
        "Hide the status bar (Layout & navigation)" to "Durum çubuğunu gizle (Düzen ve gezinme)",
        "Hide this section" to "Bu bölümü gizle",
        "High quality on Wi-Fi" to "Wi-Fi üzerinde yüksek kalite",
        "High quality on mobile data" to "Hücresel veride yüksek kalite",
        "High · Opus 160 kbps" to "Yüksek · Opus 160 kbps",
        "History" to "Geçmiş",
        "Hold Prism's icon for Search, Recognize, Liked songs and Downloads" to "Arama, Şarkı Tanıma, Beğenilen şarkılar ve İndirilenler için Prism simgesine basılı tutun",
        "Hold a section (or drag its grip) to move it; tap it to show or hide it." to "Taşımak için bir bölüme basılı tutun (veya tutamacı sürükleyin); göstermek veya gizlemek için dokunun.",
        "Hold and drag, or use the arrows" to "Basılı tutup sürükleyin veya okları kullanın",
        "Hold previous / next to seek" to "İleri/geri sarmak için önceki / sonraki düğmesini basılı tutun",
        "Hold previous or next to seek" to "Hızlı sarmak için önceki veya sonrakine basılı tutun",
        "Hold your phone near the music" to "Telefonunuzu müziğe yakın tutun",
        "Home and Library as cover tiles" to "Ana sayfa ve Kitaplık kapak kutucukları olarak",
        "Home greets you by it; Blend, Listen Together and other phones see it." to "Ana sayfa sizi bu adla karşılar; Blend, Birlikte Dinle ve diğer telefonlar bunu görür.",
        "Home, Search, Library, Replay and Settings" to "Ana Sayfa, Ara, Kitaplık, Tekrar ve Ayarlar",
        "Home, the player and lyrics, as you change them" to "Değiştirdikçe Ana sayfa, oynatıcı ve şarkı sözleri",
        "Hours by month" to "Aylara göre saatler",
        "How a translation, or a line spelled out in Latin letters, sits with each line." to "Çevirinin veya latin harfleriyle yazılmış dizenin her satırla nasıl hizalanacağı.",
        "How it will look" to "Nasıl görünecek",
        "How it works" to "Nasıl çalışır",
        "How it's used" to "Nasıl kullanılır",
        "How many of the next lines show; the rest appear as the song gets to them." to "Sonraki satırlardan kaçının gösterileceği; geri kalanı şarkı o kısma geldikçe görünür.",
        "How much the theme color washes over the background, for easier reading" to "Daha kolay okuma için tema renginin arka plana ne kadar yayılacağı",
        "How strong grey text and lines are against the page." to "Gri metinlerin ve çizgilerin sayfaya karşı ne kadar belirgin olacağı.",
        "Icon pack and weight, app icon, corners" to "Simge paketi ve kalınlığı, uygulama simgesi, köşeler",
        "Icons" to "Simgeler",
        "If Google blocks the embedded sign-in, copy the Cookie header from a signed-in music.youtube.com browser session and paste it here. It's stored only on this device." to "Google gömülü girişi engellerse, oturum açılmış bir music.youtube.com tarayıcı oturumundan Cookie başlığını kopyalayıp buraya yapıştırın. Yalnızca bu cihazda saklanır.",
        "If a session doesn't show up here" to "Bir oturum burada görünmüyorsa",
        "If something still stutters, Settings → About → Diagnostics notes where it happened, to share" to "Bir şey hala takılıyorsa, Ayarlar → Hakkında → Tanılamalar paylaşmanız için nerede olduğunu kaydeder",
        "Immersive mode" to "Tam ekran modu",
        "Immersive mode settings" to "Sürükleyici mod ayarları",
        "Import a ParametricEQ file" to "Parametrik Ekolayzer dosyası içe aktar",
        "Import playlists" to "Çalma listelerini içe aktar",
        "Imported playlists go to your YouTube Music account, then show up in Prism." to "İçe aktarılan çalma listeleri YouTube Music hesabınıza eklenir, ardından Prism'de görünür.",
        "In Your Eyes" to "In Your Eyes",
        "In dark mode, pages sit on true black, whichever background you picked: its colors and patterns stay, quieter, over black." to "Koyu modda sayfalar tam siyah üzerine oturur: seçtiğiniz arka planın renk ve desenleri siyah üzerinde daha sakin kalır.",
        "In place of the song title and cover. The car's Lyrics button turns them on and off too." to "Şarkı adı ve kapağı yerine. Aracın Sözler düğmesi de bunları açıp kapatır.",
        "In the middle" to "Ortada",
        "In the queue, tap DJ, then pick Steady, Build up or Wind down" to "Kuyrukta DJ'e dokunun, ardından Sabit, Yükselen veya Sakinleşen seçeneklerinden birini seçin",
        "In use" to "Kullanımda",
        "In use, changed since saved" to "Kullanımda, kaydedildikten sonra değiştirildi",
        "Include downloaded songs" to "İndirilen şarkıları dahil et",
        "Include its font" to "Yazı tipini dahil et",
        "Include its photos" to "Fotoğraflarını dahil et",
        "Including likes from other devices" to "Diğer cihazlardan beğeniler dahil",
        "Inline style" to "Satır içi stil",
        "Instead" to "Yerine",
        "Instead of the time left" to "Kalan süre yerine",
        "Instrumental" to "Enstrümantal",
        "Intro" to "Giriş",
        "It goes away once they're paired, or after three minutes." to "Eşlendiklerinde veya üç dakika sonra kaybolur.",
        "It listens to Prism's own sound (no microphone) and only runs while the player is open and playing. On an older phone, Off keeps the player lightest." to "Prism'in kendi sesini dinler (mikrofon yok) ve yalnızca oynatıcı açık ve çalarken çalışır. Eski telefonlarda Kapalı seçeneği oynatıcıyı en hafif tutar.",
        "It'll be looked up when you're back online, with a notification when it's found." to "Tekrar çevrimiçi olduğunuzda aranacak ve bulunduğunda bildirim gönderilecek.",
        "It's the same service YouTube Music's own app uses for transfers." to "YouTube Music'in kendi uygulamasının aktarımlar için kullandığı hizmettir.",
        "Italics" to "İtalik",
        "Japanese kanji readings" to "Japonca kanji okunuşları",
        "Join a session" to "Bir oturuma katıl",
        "Join with an address" to "Adres ile katıl",
        "Joining" to "Katılınıyor",
        "Just sign out" to "Yalnızca oturumu kapat",
        "Karaoke lyrics (lit up word by word) from any source that has them come first, then time-synced lines, then plain text." to "Kelime kelime yanan karaoke sözleri hangi kaynakta varsa önce gelir, ardından zaman senkronlu satırlar, sonra düz metin gelir.",
        "Karaoke with the song's own music: Prism takes the voice out, on your phone." to "Şarkının kendi müziğiyle karaoke: Prism, telefonunuzda vokali çıkarır.",
        "Karaoke · lights up word by word" to "Karaoke · kelime kelime yanar",
        "Keep a copy" to "Bir kopyasını sakla",
        "Keep a copy of its playlists, saved albums and artists in your Prism Account first? Liked songs, downloads and Replay stay either way." to "Önce çalma listelerinin, kayıtlı albümlerin ve sanatçıların bir kopyası Prism Hesabınızda saklansın mı? Beğenilen şarkılar, indirmeler ve Replay her durumda kalır.",
        "Keep a little of it in to sing along with, or none for karaoke. Backing vocals go with it." to "Eşlik etmek için sesin birazını bırakın veya karaoke için tamamen kapatın. Geri vokaller de onunla gider.",
        "Keep controls on screen" to "Kontrolleri ekranda tut",
        "Keep downloads updated" to "İndirmeleri güncel tut",
        "Keep holding to leave immersive mode (or press Back)" to "Sürükleyici moddan çıkmak için basılı tutmaya devam edin (veya Geri tuşuna basın)",
        "Keep it" to "Sakla",
        "Keep playing videos" to "Videoları oynatmaya devam et",
        "Keep seconds of music ready ahead of playback" to "Oynatmadan önce birkaç saniyelik müziği hazır tut",
        "Keep the song title" to "Şarkı adını koru",
        "Keeps a log on this phone of what the audio does. Nothing is sent anywhere unless you share it. When you hear a stutter, tap \"Mark a stutter\" in the player's ⋯ menu, then share the log here." to "Bu telefonda sesin yaptıklarına dair bir günlük tutar. Siz paylaşmadığınız sürece hiçbir yere hiçbir şey gönderilmez. Bir takılma duyduğunuzda oynatıcının ⋯ menüsünden \"Takılmayı işaretle\"ye dokunun, ardından günlüğü buradan paylaşın.",
        "Kept (up to 400 MB) so they start at once next time." to "Bir dahaki sefere hemen başlamaları için tutulur (400 MB'a kadar).",
        "Kept dark enough for white words." to "Beyaz sözcükler için yeterince koyu tutulur.",
        "Kept on this phone" to "Bu telefonda tutuluyor",
        "Kept on this phone (and in your backups), no account needed. Sign in to YouTube Music for playlists on your account." to "Bu telefonda (ve yedeklerinizde) tutulur, hesaba gerek yoktur. Hesabınızdaki çalma listeleri için YouTube Music'e giriş yapın.",
        "Kept on this phone, for this song only" to "Yalnızca bu şarkı için bu telefonda tutulur",
        "Kept on this phone. No email, no password, no server." to "Bu telefonda tutulur. E-posta yok, şifre yok, sunucu yok.",
        "Kept up to date" to "Güncel tutuluyor",
        "Key" to "Tonalite",
        "Knob at the playhead" to "Oynatma noktasındaki tutamaç",
        "Korean, Japanese, Russian and Greek are spelled out on the phone (word by word with karaoke); other scripts by Google Translate, which is sent only the lyrics' text. Turn it on or off for one song from the player's ⋯ menu." to "Korece, Japonca, Rusça ve Yunanca telefonda hecelenir (karaoke ile kelime kelime); diğer alfabeler yalnızca söz metninin gönderildiği Google Çeviri ile çevrilir. Oynatıcının ⋯ menüsünden tek bir şarkı için açıp kapatabilirsiniz.",
        "KuGou first" to "Önce KuGou",
        "LIVE" to "CANLI",
        "Labels" to "Etiketler",
        "Largest first" to "En büyük başta",
        "Last 30 days" to "Son 30 gün",
        "Last copied" to "Son kopyalanan",
        "Last crash" to "Son çökme",
        "Later" to "Daha sonra",
        "Latest episode" to "Son bölüm",
        "Layout" to "Düzen",
        "Layout: the tab bar, your tabs and the mini player" to "Düzen: sekme çubuğu, sekmeleriniz ve mini oynatıcı",
        "Layouts: Standard, a big Cover, Lyrics first, Minimal, Vinyl or Cassette (they turn as it plays)" to "Düzenler: Standart, büyük Kapak, önce Şarkı Sözleri, Minimal, Plak veya Kaset (çalarken dönerler)",
        "Lead voice" to "Ana vokal",
        "Leave a little of the voice in to sing along, or none" to "Birlikte söylemek için vokali biraz bırakın veya tamamen kapatın",
        "Ledger" to "Defter",
        "Left" to "Sol",
        "Less work while lists scroll, while you type in Search, and while a song plays" to "Listeler kaydırılırken, Arama'ya yazarken ve şarkı çalarken daha az işlem gücü",
        "Let Prism mix your music: songs blend into each other, in key and on the beat." to "Prism müziğinizi mikslesin: şarkılar tonunda ve ritminde birbirine karışır.",
        "Let Prism tell you when something needs you." to "Bir şey ilginizi gerektirdiğinde Prism'in size haber vermesine izin verin.",
        "Let the audio chip decode songs directly" to "Şarkıların doğrudan ses yongası tarafından çözülmesine izin ver",
        "Library tiles" to "Kitaplık kutucukları",
        "Library → History: what you played, by day, on this phone or on your account" to "Kitaplık → Geçmiş: bu telefonda veya hesabınızda gün bazında ne çaldığınız",
        "Library's tiles: the edit button at the top of Library" to "Kitaplığın kutucukları: Kitaplığın üstündeki düzenleme düğmesi",
        "Library, Replay, settings and sign-in, to a file" to "Kitaplık, Tekrar, ayarlar ve oturum bir dosyaya",
        "Library: pick its tiles, or put your playlists first (the edit button at the top of Library)" to "Kitaplık: kutucuklarını seçin veya çalma listelerinizi öne koyun (Kitaplığın üstündeki düzenleme düğmesi)",
        "Licenses" to "Lisanslar",
        "Light" to "Hafif",
        "Light mode" to "Aydınlık mod",
        "Light mode accent" to "Açık mod vurgusu",
        "Light pages get an accent of their own" to "Açık sayfalar kendilerine özel bir vurgu alır",
        "Light theme" to "Açık tema",
        "Like Theme: System, for whole Looks. Sunrise and sunset are worked out from your time zone, without your location. A Look you pick in between stays until the next switch." to "Tüm Görünümler için Tema: Sistem gibidir. Gün doğumu ve gün batımı konumunuz olmadan saat diliminizden hesaplanır. Arada seçtiğiniz bir Görünüm bir sonraki geçişe kadar kalır.",
        "Like a lyric video. Tap the screen for its settings; press Back, or hold the settings button, to leave. It's also in the player's ⋯ menu." to "Şarkı sözü videosu gibi. Ayarları için ekrana dokunun; çıkmak için Geri'ye basın veya ayarlar düğmesini basılı tutun. Ayrıca oynatıcının ⋯ menüsündedir.",
        "Like or download songs, or star artists, and they'll show up here." to "Şarkıları beğenin veya indirin ya da sanatçıları yıldızlayın; burada görünecekler.",
        "Like songs from your phone (♥ on the player or in a song's menu) and they gather here." to "Telefonunuzdaki şarkıları beğenin (oynatıcıda ♥ veya şarkı menüsünde), burada toplanırlar.",
        "Liked a song and its video? They show once, as the song" to "Bir şarkıyı ve videosunu beğendiniz mi? Şarkı olarak bir kez görünürler",
        "Liked both? They show once, as the song" to "İkisini de beğendiniz mi? Şarkı olarak bir kez gösterilir",
        "Liked songs" to "Beğenilen şarkılar",
        "Liked songs playlist" to "Beğenilen şarkılar listesi",
        "Liked songs, Downloads and the music files on your phone" to "Beğenilen şarkılar, İndirilenler ve telefonunuzdaki müzik dosyaları",
        "Likes as stars" to "Beğeniler yıldız olarak",
        "Lines to come" to "Gelecek satırlar",
        "Link" to "Bağlantı",
        "Liquid Glass" to "Akışkan Cam",
        "Listen again" to "Tekrar dinle",
        "Listen for a while — songs you play for 10 seconds or more count toward your Replay." to "Bir süre dinleyin — 10 saniye veya daha uzun süre çaldığınız şarkılar Tekrar özetinize sayılır.",
        "Listen from here" to "Buradan dinle",
        "Listen together plays in step with friends on the same Wi-Fi" to "Birlikte Dinle, aynı Wi-Fi'daki arkadaşlarla eşzamanlı çalar",
        "Listened" to "Dinlendi",
        "Listening" to "Dinleyenler",
        "Load ahead" to "Önceden yükle",
        "Load ahead on mobile data" to "Hücresel veride önceden yükle",
        "Loading" to "Yükleniyor",
        "Lock screen and notification" to "Kilit ekranı ve bildirim",
        "Long-press an album or playlist → Play as a DJ set" to "Bir albüme veya çalma listesine uzun basın → DJ seti olarak çal",
        "Longest first" to "En uzun başta",
        "Look" to "Görünüm",
        "Look & feel" to "Görünüm ve his",
        "Look now" to "Şimdi incele",
        "Looking on this Wi-Fi…" to "Bu Wi-Fi ağında aranıyor…",
        "Looking round your artists…" to "Sanatçılarınıza göz atılıyor…",
        "Looks" to "Görünümler",
        "Looks people shared on GitHub" to "Kullanıcıların GitHub'da paylaştığı Görünümler",
        "Looks you save show here. Save one above, or get one from a friend below." to "Kaydettiğiniz Görünümler burada listelenir. Yukarıdan kaydedin veya aşağıdan bir arkadaşınızdan alın.",
        "Lossless" to "Kayıpsız",
        "Lossless playback" to "Kayıpsız oynatma",
        "Lossless · Crossfade · Normalized" to "Kayıpsız · Çapraz Geçiş · Normalleştirilmiş",
        "Lyrics" to "Şarkı sözleri",
        "Lyrics font" to "Şarkı sözü yazı tipi",
        "Lyrics in the car" to "Arabada şarkı sözleri",
        "Lyrics on mobile data" to "Hücresel veride şarkı sözleri",
        "Lyrics on the cover only" to "Şarkı sözleri yalnızca kapakta",
        "Lyrics position" to "Şarkı sözü konumu",
        "Lyrics timing" to "Şarkı sözü zamanlaması",
        "Lyrics, your way" to "Şarkı sözleri, sizin tarzınızda",
        "MMMM d" to "d MMMM",
        "MORE" to "DAHA FAZLA",
        "Made for you" to "Sizin için hazırlandı",
        "Made for you also has mixes from your own music, and On repeat: they come from your plays alone and work offline" to "Sizin İçin Hazırlandı ayrıca kendi müziğinizden miksler ve Tekrarda listesini içerir: yalnızca dinlemelerinizden gelir ve çevrimdışı çalışır",
        "Made for you: Daily Mixes, your time-of-day mix and Release Radar" to "Sizin için hazırlandı: Günlük Miksler, günün saatine özel miksiniz ve Yeni Çıkanlar Radarı",
        "Made on your phone from what you play" to "Dinlediklerinizden telefonunuzda oluşturuldu",
        "Made with Prism" to "Prism ile yapıldı",
        "Made with Prism Replay" to "Prism Replay ile oluşturuldu",
        "Make a Prism Account" to "Prism Hesabı Oluştur",
        "Make it yours" to "Kendinize göre uyarlayın",
        "Make my mixes again" to "Mikslerimi yeniden yap",
        "Make one on YouTube Music" to "YouTube Music üzerinde bir tane oluşturun",
        "Make one with New playlist, or from any song's menu (Add to playlist). They're kept on this phone, no account needed." to "Yeni çalma listesi ile veya herhangi bir şarkının menüsünden (Çalma listesine ekle) bir tane oluşturun. Bir hesaba gerek olmadan bu telefonda tutulurlar.",
        "Make playlist" to "Çalma listesi oluştur",
        "Make playlists and save albums: without an account they're kept on this phone" to "Çalma listeleri yapın ve albümleri kaydedin: hesap olmadan bu telefonda tutulurlar",
        "Make the Blend" to "Blend Oluştur",
        "Make unlisted" to "Liste dışı yap",
        "Makes a YouTube Music playlist of every song you've liked, one you can share, pin or open in other apps. Prism keeps it up to date: songs you like are added, songs you unlike are taken out." to "Beğendiğiniz her şarkıdan paylaşabileceğiniz veya başka uygulamalarda açabileceğiniz bir YouTube Music çalma listesi oluşturur. Prism bunu güncel tutar.",
        "Making it…" to "Oluşturuluyor…",
        "Manage downloads" to "İndirmeleri yönet",
        "Mark a stutter" to "Takılmayı işaretle",
        "Match again" to "Yeniden eşleştir",
        "Match tempo and beats (DJ-style)" to "Tempo ve ritimleri eşleştir (DJ stili)",
        "Matched automatically — the video lines up with the song." to "Otomatik eşlendi — video şarkıyla tam uyumlu.",
        "Matching the lyrics to the video's audio…" to "Şarkı sözleri videonun sesiyle eşleştiriliyor…",
        "Measure songs on mobile data" to "Şarkıları hücresel veride analiz et",
        "Medium" to "Orta",
        "Mini player" to "Mini oynatıcı",
        "Minutes by month" to "Aylara göre dakikalar",
        "Mixes made on your phone from what you play. Nothing about your listening leaves it." to "Dinlediklerinizden telefonunuzda oluşturulan miksler. Dinleme verileriniz asla dışarı çıkmaz.",
        "Mobile data" to "Hücresel veri",
        "Monday 19 October" to "19 Ekim Pazartesi",
        "More about" to "Hakkında daha fazla bilgi",
        "More about %s" to "%s hakkında daha fazla bilgi",
        "More episodes" to "Daha fazla bölüm",
        "More room; swipe down from the top to see it" to "Daha fazla alan; görmek için yukarıdan aşağı kaydırın",
        "Most first" to "En çok olan başta",
        "Motion" to "Hareket",
        "Motion artwork and video covers. Turn them off for one song from the player's ⋯ menu." to "Hareketli kapaklar ve video kapakları. Oynatıcının ⋯ menüsünden bunları tek bir şarkı için kapatabilirsiniz.",
        "Move down" to "Aşağı taşı",
        "Move music between your Prism devices" to "Prism cihazlarınız arasında müziği aktarın",
        "Move the key up or down to suit your voice" to "Ses tonunuza uyacak şekilde tonu yukarı veya aşağı ayarlayın",
        "Move the music there" to "Müziği oraya taşı",
        "Move up" to "Yukarı taşı",
        "Moves the song up or down to suit your voice (the tempo stays)." to "Şarkıyı sesinize uyacak şekilde yukarı veya aşağı taşır (tempo aynı kalır).",
        "Moving artwork, when a song has it" to "Şarkıda varsa hareketli kapak resmi",
        "Music beyond your phone." to "Telefonunuzun ötesinde müzik.",
        "Music buffer" to "Müzik önbellekleme",
        "Music files on this phone" to "Bu telefondaki müzik dosyaları",
        "Music video" to "Müzik videosu",
        "Music video quality" to "Müzik videosu kalitesi",
        "Music videos in search, albums, playlists, Liked songs and downloads play as their song, with its album and cover. The Video button still shows the video; a video with no song plays as it is." to "Aramadaki, albümlerdeki, çalma listelerindeki, Beğenilen şarkılardaki ve indirmelerdeki müzik videoları kendi albümü ve kapağıyla şarkı olarak çalar. Video düğmesi videoyu göstermeye devam eder; şarkısı olmayan video olduğu gibi çalar.",
        "NEW TO YOU" to "SİZİN İÇİN YENİ",
        "Navigation" to "Gezinme",
        "Navigation bar" to "Gezinme çubuğu",
        "Near the top" to "Üste yakın",
        "Never download songs over mobile data" to "Hücresel veri üzerinden asla şarkı indirme",
        "New YouTube Music shelves appear on Home" to "Yeni YouTube Music rafları Ana sayfada görünür",
        "New albums, singles and EPs from artists you listen to" to "Dinlediğiniz sanatçılardan yeni albümler, tekliler ve EP'ler",
        "New code" to "Yeni kod",
        "New playlist" to "Yeni çalma listesi",
        "New release notifications" to "Yeni çıkan bildirimleri",
        "New releases from artists you star" to "Yıldızladığınız sanatçılardan yeni çıkanlar",
        "New shelves from YouTube Music appear at the bottom" to "YouTube Music'in yeni rafları en altta görünür",
        "New to you both, like what you share" to "Paylaştıklarınız gibi ikiniz için de yeni",
        "Newest first" to "En yeni başta",
        "Next button" to "Sonraki düğmesi",
        "Next song" to "Sonraki şarkı",
        "Night starts at" to "Gece başlangıcı",
        "No Podcasts page here" to "Burada Podcast'ler sayfası yok",
        "No albums yet" to "Henüz albüm yok",
        "No artists yet" to "Henüz sanatçı yok",
        "No black bars when a video plays as a song" to "Bir video şarkı olarak oynatılırken siyah şeritler olmaz",
        "No community Looks yet. Yours could be the first." to "Henüz topluluk Görünümü yok. İlk sizinki olabilir.",
        "No downloads yet" to "Henüz indirme yok",
        "No drifting backgrounds, no artwork bounce, quicker transitions." to "Süzülen arka planlar ve kapak zıplaması yok, daha hızlı geçişler.",
        "No favourites yet" to "Henüz favori yok",
        "No history on your account" to "Hesabınızda geçmiş bulunamadı",
        "No liked songs yet" to "Henüz beğenilen şarkı yok",
        "No lyrics found" to "Şarkı sözü bulunamadı",
        "No matches" to "Eşleşme yok",
        "No music files found" to "Müzik dosyası bulunamadı",
        "No one yet." to "Henüz kimse yok.",
        "No results" to "Sonuç yok",
        "No synced lyrics for this song, so the car shows it as usual." to "Bu şarkı için senkronize söz yok, bu yüzden araç her zamanki gibi gösteriyor.",
        "None" to "Hiçbiri",
        "None found. They show here when they're on this Wi-Fi with Google Cast (Chromecast, Google TV) or DLNA / UPnP (often called media sharing)." to "Hiçbir cihaz bulunamadı. Bu Wi-Fi ağında Google Cast veya DLNA / UPnP ile açık olduklarında burada görünürler.",
        "Normalization" to "Ses dengeleme",
        "Normalize volume" to "Ses düzeyini dengele",
        "Normalize volume and Crossfade measure each song once: its loudness, how its music starts and ends, its beat. Songs on your phone are measured from there. Off, the rest wait for Wi-Fi." to "Sesi normalleştir ve Çapraz Geçiş her şarkıyı bir kez ölçer: ses yüksekliği, müziğin nasıl başlayıp bittiği, vuruşu. Telefonunuzdaki şarkılar oradan ölçülür. Kapalıyken geri kalanı Wi-Fi bekler.",
        "Normalized" to "Normalleştirilmiş",
        "Northern Lights" to "Kuzey Işıkları",
        "Not available for this song" to "Bu şarkı için mevcut değil",
        "Not now" to "Şimdi değil",
        "Not showing up for them? They can join with" to "Onlarda görünmüyor mu? Bununla katılabilirler:",
        "Not showing up for them? They can join with " to "Onlarda görünmüyor mu? Şununla katılabilirler: ",
        "Nothing" to "Hiçbir şey",
        "Nothing downloaded yet" to "Henüz indirilen bir şey yok",
        "Nothing here yet" to "Henüz burada bir şey yok",
        "Nothing matches these filters. Try a longer time or another type." to "Bu filtrelerle eşleşen bir şey bulunamadı. Daha uzun bir zaman dilimi veya başka bir tür deneyin.",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred," to "Son üç ayda sanatçılarınızdan yeni bir şey yok. Prism yıldızladığınız sanatçıları birkaç günde bir kontrol eder,",
        "Nothing on this phone matches" to "Bu telefonda eşleşen hiçbir şey yok",
        "Nothing played yet" to "Henüz bir şey çalınmadı",
        "Nothing recognized yet" to "Henüz tanınan şarkı yok",
        "Nothing to replay yet" to "Henüz tekrar edilecek bir şey yok",
        "Notification and car" to "Bildirim ve araba",
        "Notifications are on." to "Bildirimler açık.",
        "Now" to "Şimdi",
        "Now playing" to "Şu an çalıyor",
        "Number of albums" to "Albüm sayısı",
        "Number of songs" to "Şarkı sayısı",
        "Off" to "Kapalı",
        "Off, Podcasts opens from Library → Playlists." to "Kapalıyken Podcast'ler Kitaplık → Çalma Listeleri'nden açılır.",
        "Off, Prism doesn't look up lyrics on mobile data until you open them (the player's lyrics, Immersive mode or the source list). Lyrics already saved on the phone still show, and on Wi-Fi nothing changes." to "Kapalıyken Prism, siz açana kadar (oynatıcı sözleri, Sürükleyici mod veya kaynak listesi) mobil veride şarkı sözü aramaz. Telefonda zaten kayıtlı olan sözler gösterilmeye devam eder, Wi-Fi'da hiçbir şey değişmez.",
        "Off, it can recognize what Prism itself is playing" to "Kapalıyken, Prism'in kendisinin çaldığı parçaları da tanıyabilir",
        "Off, songs are only loaded ahead on Wi-Fi. Whole songs loaded ahead count toward Smart Downloads' space." to "Kapalıyken şarkılar yalnızca Wi-Fi'da önceden yüklenir. Önceden yüklenen tam şarkılar Akıllı İndirmeler alanına dahil edilir.",
        "Oldest first" to "En eski başta",
        "On" to "Açık",
        "On December 1, when your year is ready" to "Yıl özetiniz hazır olduğunda 1 Aralık'ta",
        "On mobile data: pictures at the size they're shown, no artist photos for lists, no animated covers (saved ones still play), songs at your mobile data quality and at most Normal (even with lossless on), and videos at 480p at most. Wi-Fi is unaffected." to "Mobil veride: resimler gösterildikleri boyutta, listeler için sanatçı fotoğrafı yok, hareketli kapak yok (kaydedilenler oynatılır), şarkılar mobil veri kalitenizde ve en fazla Normal (kayıpsız açık olsa bile) ve videolar en fazla 480p. Wi-Fi etkilenmez.",
        "On the car's player" to "Aracın oynatıcısında",
        "On the player's cover. Swiping down always closes the player." to "Oynatıcı kapağında. Aşağı kaydırmak her zaman oynatıcıyı kapatır.",
        "On this phone" to "Bu telefonda",
        "On this phone too" to "Bu telefonda da",
        "On top of your phone's own text size." to "Telefonunuzun kendi metin boyutuna ek olarak.",
        "On, the line above the progress bar and immersive mode draw the lyrics in the style, colors, weight and capitals picked here. Off, they keep Prism's own look." to "Açıkken, ilerleme çubuğunun üzerindeki satır ve sürükleyici mod şarkı sözlerini burada seçilen stil, renkler, kalınlık ve büyük harflerle çizer. Kapalıyken Prism'in kendi görünümünü korurlar.",
        "One Look by day and another by night, at sunrise and sunset" to "Gün doğumu ve gün batımında; gündüz bir Görünüm, gece başka bir Görünüm",
        "One Look by day, another by night" to "Gündüz bir Görünüm, gece başka bir Görünüm",
        "One color" to "Tek renk",
        "One color taken from the cover" to "Kapak görselinden alınan tek bir renk",
        "One moment…" to "Bir dakika…",
        "One space for music on your phone: songs you stream stay, so replays start at once and use no data, and the songs you're most likely to play next are downloaded ahead, a little at a time. When it's full, the songs you're least likely to come back to make room. Learned on your phone from what you play, finish, skip and like. Off, it only keeps songs you've played." to "Telefonunuzdaki müzik için tek bir alan: dinlediğiniz şarkılar saklanır, böylece tekrarlar hemen başlar ve veri kullanmaz; sırada çalmanız en olası şarkılar azar azar önceden indirilir. Dolduğunda, tekrar dinleme olasılığınızın en düşük olduğu şarkılar yer açar. Ne çaldığınız, bitirdiğiniz, atladığınız ve beğendiğinize göre telefonunuzda öğrenilir. Kapalıyken yalnızca çaldığınız şarkıları tutar.",
        "Ones that aren't connected yet" to "Henüz bağlı olmayanlar",
        "Only if the font's license lets you share it" to "Yalnızca yazı tipinin lisansı paylaşmanıza izin veriyorsa",
        "Only you can see it." to "Yalnızca siz görebilirsiniz.",
        "Only your name and picture go. Your likes, playlists, downloads, Replay and everything else on this phone stay as they are." to "Yalnızca adınız ve resminiz kaldırılır. Beğenileriniz, çalma listeleriniz, indirmeleriniz, Tekrar özetiniz ve bu telefondaki diğer her şey aynen kalır.",
        "Open Library on" to "Kitaplığı şurada aç:",
        "Open Prism on" to "Prism'i şurada aç:",
        "Open a Look file" to "Bir Görünüm dosyası aç",
        "Open album" to "Albümü aç",
        "Open downloads →" to "İndirilenleri aç →",
        "Open on GitHub" to "GitHub'da aç",
        "Open the keyboard" to "Klavyeyi aç",
        "Open the playlist" to "Çalma listesini aç",
        "Open them from the button under the controls. Many songs light up word by word." to "Kontrollerin altındaki düğmeden açın. Birçok şarkı kelime kelime aydınlanır.",
        "Open-source licenses" to "Açık kaynak lisansları",
        "Optional: your library, history and recommendations" to "İsteğe bağlı: kitaplığınız, geçmişiniz ve önerileriniz",
        "Options" to "Seçenekler",
        "Or a cover from this playlist" to "Veya bu çalma listesinden bir kapak",
        "Or sign in to bring your YouTube Music playlists" to "Veya YouTube Music çalma listelerinizi getirmek için oturum açın",
        "Or sign in to sync your YouTube Music library" to "Veya YouTube Music kitaplığınızı eşitlemek için oturum açın",
        "Order" to "Sıralama",
        "Original order" to "Özgün sıralama",
        "Other Bluetooth devices" to "Diğer Bluetooth cihazları",
        "Other devices with Prism on this Wi-Fi can move what they're playing here, or bring it over. On the device that's playing, open the player's device list and pick this one under Prism devices (Prism has to be open or playing here). The first time, a code shows to type in." to "Bu Wi-Fi'daki Prism yüklü diğer cihazlar çaldıkları müziği buraya taşıyabilir veya buraya getirebilir. Çalan cihazda oynatıcının cihaz listesini açın ve Prism cihazları altından bunu seçin (Prism'in burada açık veya çalıyor olması gerekir). İlk seferde girilecek bir kod gösterilir.",
        "Other scripts in Latin letters, to sing along." to "Eşlik etmek için diğer alfabelerin latin harfleriyle yazılışı.",
        "Other versions" to "Diğer sürümler",
        "Otherwise they wait for Wi-Fi" to "Aksi takdirde Wi-Fi bekler",
        "Out of step" to "Senkronizasyon dışı",
        "Over the line" to "Satırın üstünde",
        "PREVIEW" to "ÖN İZLEME",
        "PRIME TIME" to "EN ÇOK DİNLENEN SAAT",
        "PRISM" to "PRISM",
        "PUBLIC" to "HERKESE AÇIK",
        "Pack" to "Paket",
        "Page background" to "Sayfa arka planı",
        "Page titles" to "Sayfa başlıkları",
        "Pages" to "Sayfalar",
        "Pages frosted with their picture" to "Resimleriyle buzlanmış sayfalar",
        "Pair" to "Eşle",
        "Paired" to "Eşlendi",
        "Pairing code" to "Eşleme kodu",
        "Paste a Look code" to "Bir Görünüm kodu yapıştır",
        "Paste a code" to "Kod yapıştır",
        "Paste a color code" to "Renk kodu yapıştır",
        "Phone speaker" to "Telefon hoparlörü",
        "Photos" to "Fotoğraflar",
        "Pick a cover" to "Bir kapak seç",
        "Pick a few artists you like" to "Beğendiğiniz birkaç sanatçıyı seçin",
        "Pick a moment on the bar" to "Çubuk üzerinden bir an seçin",
        "Pick a photo" to "Bir fotoğraf seç",
        "Pick a picture" to "Bir resim seçin",
        "Pick artists you like" to "Beğendiğiniz sanatçıları seçin",
        "Pick it from the device line on the player" to "Oynatıcıdaki cihaz satırından seçin",
        "Pick the buttons under the controls (speed is one), and the two beside play in your notification and car" to "Kontrollerin altındaki düğmeleri (hız bunlardan biridir) ve bildiriminiz ile arabanızda çalmanın yanındaki iki düğmeyi seçin",
        "Pick these headphones from thousands measured by AutoEq, to make them sound neutral (the Harman target)" to "Seslerini nötr hale getirmek (Harman hedefi) için AutoEq tarafından ölçülen kulaklıklar arasından seçim yapın",
        "Pick where the music plays" to "Müziğin nerede çalacağını seçin",
        "Picked" to "Seçildi",
        "Picked for this queue by Smart Shuffle" to "Akıllı Karışık tarafından bu kuyruk için seçildi",
        "Pill bar" to "Hap çubuk",
        "Pin Prism playlists to Home (Customize Home → Pinned playlists)" to "Prism çalma listelerini Ana Sayfa'ya sabitleyin (Ana Sayfayı Özelleştir → Sabitlenmiş çalma listeleri)",
        "Pinned" to "Sabitlendi",
        "Pinned playlists" to "Sabitlenmiş çalma listeleri",
        "Plain text" to "Düz metin",
        "Play / pause" to "Oynat / duraklat",
        "Play a song to see how its lyrics look in the car." to "Şarkı sözlerinin araçta nasıl göründüğünü görmek için bir şarkı çalın.",
        "Play here too" to "Burada da çal",
        "Play on a speaker or TV" to "Hoparlörde veya TV'de çal",
        "Play on mobile data" to "Hücresel veride çal",
        "Play on speakers, TVs and Chromecasts: tap the device line under the controls" to "Hoparlörlerde, TV'lerde ve Chromecast'lerde çalın: kontrollerin altındaki cihaz satırına dokunun",
        "Play something and everyone hears it" to "Bir şey çalın ve herkes duysun",
        "Play the song to see its audio details" to "Ses ayrıntılarını görmek için şarkıyı çalın",
        "Play the songs on your phone (MP3, M4A, FLAC, OGG, WAV…) in Prism. They stay where they are; Prism only reads them." to "Telefonunuzdaki şarkıları (MP3, M4A, FLAC, OGG, WAV…) Prism'de çalın. Dosyalarınız yerinde kalır; Prism yalnızca onları okur.",
        "Play, pause and skip from their phones too. They can always add songs." to "Kendi telefonlarından da oynatabilir, duraklatabilir ve atlayabilirler. Her zaman şarkı ekleyebilirler.",
        "Play, search, and see the queue and lyrics. Only browsers on this Wi-Fi that type a code shown here get in, and only while Prism is open or playing. Nothing goes through the internet." to "Çalın, arayın, kuyruğu ve şarkı sözlerini görün. Yalnızca bu Wi-Fi'da burada gösterilen kodu yazan tarayıcılar erişebilir ve yalnızca Prism açıkken veya çalarken çalışır. İnternet üzerinden hiçbir şey geçmez.",
        "Playback" to "Oynatma",
        "Playback diagnostics" to "Oynatma tanılamaları",
        "Playback speed" to "Oynatma hızı",
        "Playback stops for a moment" to "Oynatma bir anlığına durur",
        "Player settings" to "Oynatıcı ayarları",
        "Player: its background, the cover and what shows on it" to "Oynatıcı: arka planı, kapak ve üzerinde gösterilenler",
        "Playing" to "Çalıyor",
        "Playlist •" to "Çalma listesi •",
        "Playlists" to "Çalma listeleri",
        "Plug in or connect your headphones to pick their correction." to "Düzeltmelerini seçmek için kulaklığınızı takın veya bağlayın.",
        "Podcast" to "Podcast",
        "Podcasts" to "Podcast'ler",
        "Podcasts (the button at the top of Home) has its own search for shows and episodes" to "Podcast'ler (Ana Sayfa'nın üstündeki düğme) programlar ve bölümler için kendi aramasına sahiptir",
        "Podcasts button" to "Podcast'ler düğmesi",
        "Pop" to "Pop",
        "Popular" to "Popüler",
        "Prefer karaoke & synced lyrics" to "Karaoke ve senkronize sözleri tercih et",
        "Premium quality" to "Premium kalite",
        "Previous button" to "Önceki düğmesi",
        "Previous song" to "Önceki şarkı",
        "Previous, play and next stay up" to "Önceki, oynat ve sonraki düğmeleri ekranda kalır",
        "Prism" to "Prism",
        "Prism Connect" to "Prism Connect",
        "Prism Music's Podcasts page isn't offered in your country. Search can still find shows and episodes: search, then pick Podcasts or Episodes." to "Prism Music'in Podcast sayfası ülkenizde sunulmuyor. Arama ile programları ve bölümleri bulabilirsiniz: arama yapın, ardından Podcast'leri veya Bölümleri seçin.",
        "Prism Sample" to "Prism Örneği",
        "Prism Spatial" to "Prism Uzamsal",
        "Prism also checks on its own" to "Prism kendi kendine de kontrol eder",
        "Prism also tries them again by itself when the phone is back online." to "Telefon tekrar çevrimiçi olduğunda Prism bunları kendiliğinden tekrar dener.",
        "Prism can soften it to suit dark and light pages, or use it exactly." to "Prism bunu koyu ve açık sayfalara uyacak şekilde yumuşatabilir veya olduğu gibi kullanabilir.",
        "Prism devices" to "Prism cihazları",
        "Prism font" to "Prism yazı tipi",
        "Prism has no server" to "Prism sunucu kullanmaz",
        "Prism listens for up to 12 seconds. The sound stays on your phone: only a fingerprint of it goes to Shazam to find the song." to "Prism 12 saniyeye kadar dinler. Ses telefonunuzda kalır: şarkıyı bulmak için Shazam'a yalnızca sesin parmak izi gider.",
        "Prism listens to how each song ends and the next begins: a long blend over a fade-out or quiet intro, a short one between two hard edges." to "Prism her şarkının nasıl bittiğini ve diğerinin nasıl başladığını analiz eder: sessiz girişlerde uzun bir geçiş, sert geçişlerde kısa bir geçiş.",
        "Prism needs the camera to scan a code" to "Prism bir kod taramak için kameraya ihtiyaç duyar",
        "Prism normally fetches songs without your account, which starts them fastest but gets YouTube's standard 128–160 kbps stream. On, each song is asked for as you, and with Music Premium that brings its 256 kbps version. Songs can take a moment longer to start. Without Premium, Prism notices and plays as usual. YouTube Music has no lossless streams, even with Premium." to "Prism normalde şarkıları hesabınız olmadan getirir; bu en hızlı başlatır ancak YouTube'un standart 128–160 kbps akışını alır. Açıkken, her şarkı sizin adınıza istenir ve Music Premium ile 256 kbps sürümü getirilir. Şarkıların başlaması biraz daha uzun sürebilir. Premium olmadan Prism durumu fark eder ve her zamanki gibi çalar. YouTube Music'te Premium ile bile kayıpsız akış yoktur.",
        "Prism playlists" to "Prism çalma listeleri",
        "Prism scrolls, searches and opens the player more smoothly, most of all on older phones." to "Prism, özellikle eski telefonlarda daha akıcı kaydırır, arar ve oynatıcıyı açar.",
        "Prism style" to "Prism stili",
        "Prism takes its color from what's playing. Change as much of it as you like." to "Prism rengini çalan parçadan alır. İstediğiniz kadarını değiştirebilirsiniz.",
        "Prism tells Android which of its parts to get ready ahead, and updates from the banner come ready, so they no longer run slow" to "Prism, Android'e hangi bölümlerini önceden hazırlayacağını söyler ve başlıktan gelen güncellemeler hazır gelir, bu yüzden artık yavaş çalışmazlar",
        "Prism's Looks" to "Prism Görünümleri",
        "Prism's library, history and settings on this phone are replaced with the backup's, then Prism restarts." to "Bu telefondaki Prism kitaplığı, geçmişi ve ayarları yedekteki verilerle değiştirilir, ardından Prism yeniden başlar.",
        "Prism's own volume" to "Prism'in kendi ses seviyesi",
        "Prism's own volume, apart from the phone's (Settings → Player)" to "Telefonunkinden bağımsız Prism'in kendi ses seviyesi (Ayarlar → Oynatıcı)",
        "Private" to "Gizli",
        "Progress" to "İlerleme",
        "Progress bar" to "İlerleme çubuğu",
        "Progress bar color" to "İlerleme çubuğu rengi",
        "Progress line" to "İlerleme çizgisi",
        "Project page" to "Proje sayfası",
        "Public" to "Herkese açık",
        "Pure black" to "Saf siyah",
        "Put the lyric line, progress bar, controls and volume in your order" to "Söz satırını, ilerleme çubuğunu, kontrolleri ve ses seviyesini kendi sıranıza koyun",
        "Quality" to "Kalite",
        "Quick picks" to "Hızlı seçimler",
        "Quick picks start a radio" to "Hızlı seçimler bir radyo başlatır",
        "Quick picks: songs around the artists you play, swipe across for more" to "Hızlı seçimler: dinlediğiniz sanatçılar etrafında şarkılar, daha fazlası için kaydırın",
        "Ready for when you're offline" to "Çevrimdışı kaldığınız anlar için hazır",
        "Ready to type when Search opens" to "Arama açıldığında yazmaya hazır",
        "Rearrange playlists" to "Çalma listelerini yeniden düzenle",
        "Recent searches" to "Son aramalar",
        "Recently added" to "Son eklenenler",
        "Recently played albums" to "Son çalınan albümler",
        "Recently played covers" to "Son çalınan kapaklar",
        "Recognize" to "Tanı",
        "Recognize a song" to "Bir şarkı tanı",
        "Recognize songs from your home screen" to "Ana ekranınızdan şarkıları tanıyın",
        "Recognized" to "Tanınanlar",
        "Recommendations" to "Öneriler",
        "Reduce motion" to "Hareketi azalt",
        "Reduce motion is on, so it stays still." to "Hareketi azalt açık, bu yüzden sabit kalır.",
        "Reduced motion" to "Azaltılmış hareket",
        "Refractive bars and controls" to "Kırılmalı çubuklar ve kontroller",
        "Refresh the list" to "Listeyi yenile",
        "Region" to "Bölge",
        "Regular" to "Normal",
        "Release Radar finds new music from the artists you follow" to "Yeni Çıkanlar Radarı, takip ettiğiniz sanatçıların yeni müziklerini bulur",
        "Remove Prism Account" to "Prism Hesabını Kaldır",
        "Remove from playlist" to "Çalma listesinden kaldır",
        "Remove from this playlist" to "Bu çalma listesinden kaldır",
        "Remove the lyrics font file" to "Şarkı sözü yazı tipi dosyasını kaldır",
        "Remove this Blend" to "Bu Blend'i kaldır",
        "Remove this account?" to "Bu hesap kaldırılsın mı?",
        "Remove your Prism Account?" to "Prism Hesabınız kaldırılsın mı?",
        "Remove your font" to "Yazı tipinizi kaldırın",
        "Removes the songs it downloaded ahead and the ones kept from streaming." to "Önceden indirdiği şarkıları ve akıştan saklananları kaldırır.",
        "Rename" to "Yeniden adlandır",
        "Replaces what's here, then restarts" to "Buradakileri yenisiyle değiştirir, ardından yeniden başlar",
        "Replay and Rewind" to "Replay ve Rewind",
        "Replay card" to "Replay kartı",
        "Replay: your top songs, artists and genres for any stretch of time" to "Replay: herhangi bir zaman aralığı için en iyi şarkılarınız, sanatçılarınız ve türleriniz",
        "Reset all to Ambient" to "Tümünü Ambiyans'a sıfırla",
        "Reset colors to defaults" to "Renkleri varsayılanlara sıfırla",
        "Reset colors?" to "Renkler sıfırlansın mı?",
        "Reset look & layout to defaults" to "Görünüm ve düzeni varsayılanlara sıfırla",
        "Reset look & layout?" to "Görünüm ve düzen sıfırlansın mı?",
        "Reset this page" to "Bu sayfayı sıfırla",
        "Restart Prism to see its icons" to "Simgelerini görmek için Prism'i yeniden başlatın",
        "Restart Prism to see them" to "Görmek için Prism'i yeniden başlatın",
        "Restore" to "Geri yükle",
        "Restore from a backup" to "Bir yedekten geri yükle",
        "Restore this backup?" to "Bu yedek geri yüklensin mi?",
        "Restoring…" to "Geri yükleniyor…",
        "Reverse" to "Tersine çevir",
        "Rewind notification" to "Geri Sarma bildirimi",
        "Rewind: your year in music, as a story, each December" to "Rewind: her Aralık ayında bir hikaye olarak müzikle geçen yılınız",
        "Rock" to "Rock",
        "Romanize lyrics" to "Şarkı sözlerini Latin alfabesine çevir",
        "Romanize my own language too" to "Benim dilimi de latin alfabesine çevir",
        "Round ends and softer corners" to "Yuvarlak uçlar ve yumuşak köşeler",
        "Rounded" to "Yuvarlatılmış",
        "SAPISID" to "SAPISID",
        "Same as Home" to "Ana sayfa ile aynı",
        "Same look everywhere" to "Her yerde aynı görünüm",
        "Same on every screen" to "Her ekranda aynı",
        "Save animated cover" to "Hareketli kapağı kaydet",
        "Save as a Look" to "Görünüm olarak kaydet",
        "Save as a playlist" to "Çalma listesi olarak kaydet",
        "Save as new" to "Yeni olarak kaydet",
        "Save lyrics into your music files" to "Şarkı sözlerini müzik dosyalarınıza kaydedin",
        "Save on mobile data too" to "Hücresel veride de kaydet",
        "Save one from the player's ⋯ menu and it never has to load again." to "Oynatıcının ⋯ menüsünden kaydedin ve bir daha asla yüklenmek zorunda kalmasın.",
        "Save the new Prism" to "Yeni Prism'i kaydet",
        "Save to YouTube Music" to "YouTube Music'e kaydet",
        "Save with downloads" to "İndirmelerle birlikte kaydet",
        "Save your Look, share it as text, and add its code to themes/index.json in Prism's repository. The page says how." to "Görünümünüzü kaydedin, metin olarak paylaşın ve kodunu Prism'in deposundaki themes/index.json dosyasına ekleyin. Sayfa nasıl yapılacağını açıklar.",
        "Save yours, update it when you change it, and share it as a QR code, a code or a file" to "Kendinizinkini kaydedin, değiştirdiğinizde güncelleyin ve QR kod, kod veya dosya olarak paylaşın",
        "Save, switch and share whole looks; day and night" to "Görünümleri kaydedin, değiştirin ve paylaşın; gündüz ve gece",
        "Saved animated covers" to "Kaydedilen hareketli kapaklar",
        "Saved covers play either way" to "Kaydedilen kapaklar her iki şekilde de oynatılır",
        "Scan a Look's QR code" to "Bir Görünümün QR kodunu tara",
        "Scan a code" to "Kod tara",
        "Scan for lossless files again" to "Kayıpsız dosyaları tekrar tara",
        "Scan it in Prism: Appearance → Looks → Scan" to "Prism'de tarayın: Görünüm → Görünümler → Tara",
        "Screen" to "Ekran",
        "Screen backgrounds" to "Ekran arka planları",
        "Scrolling titles" to "Kayan başlıklar",
        "Search" to "Ara",
        "Search Settings from the box at the top of Settings" to "Ayarlar'ın üstündeki kutudan Ayarlar içinde arama yapın",
        "Search and Recognize" to "Arama ve Şarkı Tanıma",
        "Search for an artist" to "Bir sanatçı arayın",
        "Search for it" to "Bunu arayın",
        "Search with another title" to "Başka bir başlıkla ara",
        "Sections" to "Bölümler",
        "Sections, order and styles" to "Bölümler, sıra ve stiller",
        "Sections, shortcuts and greeting" to "Bölümler, kısayollar ve karşılama",
        "See all" to "Tümünü gör",
        "See and delete what's on your phone" to "Telefonunuzdakileri görün ve silin",
        "See which" to "Hangileri olduğuna bak",
        "See which downloads failed, and why" to "Hangi indirmelerin neden başarısız olduğunu görün",
        "Seek by side" to "Kenara göre sar",
        "Selected" to "Seçildi",
        "Send as a file" to "Dosya olarak gönder",
        "Send as text" to "Metin olarak gönder",
        "Send my code" to "Kodumu gönder",
        "Send my code back" to "Kodumu geri gönder",
        "Session code" to "Oturum kodu",
        "Sessions nearby" to "Yakındaki oturumlar",
        "Sets them apart from the lyrics" to "Onları şarkı sözlerinden ayırır",
        "Settings pages are tidier: tap ⓘ beside a setting for the details" to "Ayarlar sayfaları daha düzenli: ayrıntılar için bir ayarın yanındaki ⓘ simgesine dokunun",
        "Settings → Appearance → Color: every choice shows what it looks like before you pick it." to "Ayarlar → Görünüm → Renk: her seçenek seçmeden önce nasıl göründüğünü gösterir.",
        "Settings → Appearance → Looks: your whole look, saved, switched and shared in one tap." to "Ayarlar → Görünüm → Görünümler: tüm görünümünüz tek bir dokunuşla kaydedilir, değiştirilir ve paylaşılır.",
        "Settings → Appearance → Player, or ⋯ → Player settings on the player itself." to "Ayarlar → Görünüm → Oynatıcı veya oynatıcının üzerindeki ⋯ → Oynatıcı ayarları.",
        "Settings → Lyrics: how your lyrics look, with an example of every choice." to "Ayarlar → Şarkı sözleri: her seçeneğin bir örneğiyle sözlerinizin nasıl görüneceği.",
        "Shadow" to "Gölge",
        "Shape" to "Şekil",
        "Share any slide as a picture" to "Herhangi bir slaytı resim olarak paylaşın",
        "Share as a picture" to "Resim olarak paylaş",
        "Share diagnostics" to "Tanılamaları paylaş",
        "Share this slide" to "Bu slaytı paylaş",
        "Shazam asks to wait a little" to "Shazam biraz beklemenizi istiyor",
        "Shortcuts appear in the order you pick them." to "Kısayollar seçtiğiniz sırada görünür.",
        "Shortest first" to "En kısa başta",
        "Show all, in Prism's order" to "Tümünü Prism'in sıralamasında göster",
        "Show hours" to "Saatleri göster",
        "Show me" to "Bana göster",
        "Show minutes" to "Dakikaları göster",
        "Show more" to "Daha fazla göster",
        "Show on the player" to "Oynatıcıda göster",
        "Show the player" to "Oynatıcıyı göster",
        "Show time in hours" to "Süreyi saat cinsinden göster",
        "Show what you're playing" to "Çaldığınız parçayı gösterin",
        "Show what you're playing on your profile" to "Profilinizde ne çaldığınızı gösterin",
        "Show your name" to "Adınızı gösterin",
        "Showing what you play on your profile" to "Profilinizde çaldığınız müzik gösteriliyor",
        "Shown" to "Gösterilen",
        "Shown as tiles after the shortcuts" to "Kısayollardan sonra kutucuk olarak gösterilir",
        "Shows" to "Programlar",
        "Shows and episodes" to "Programlar ve bölümler",
        "Shrink when paused" to "Duraklatıldığında küçült",
        "Shrink while scrolling" to "Kaydırırken küçült",
        "Sign in" to "Giriş yap",
        "Sign in to Discord" to "Discord'a giriş yap",
        "Sign in to YouTube Music" to "YouTube Music'e giriş yap",
        "Sign in to YouTube Music to turn Liked songs into a playlist of your own." to "Beğenilen şarkıları kendi çalma listenize dönüştürmek için YouTube Music'e giriş yapın.",
        "Sign in to import playlists" to "Çalma listelerini içe aktarmak için oturum açın",
        "Sign in to see the shows you follow on YouTube Music. Shows you open here can be shared or played without an account." to "YouTube Music'te takip ettiğiniz programları görmek için oturum açın. Burada açtığınız programlar bir hesap olmadan da paylaşılabilir veya çalınabilir.",
        "Sign in with Google" to "Google ile giriş yap",
        "Sign in with a cookie" to "Çerez ile giriş yap",
        "Sign out" to "Çıkış yap",
        "Sign out of Discord" to "Discord'dan çıkış yap",
        "Sign out of YouTube Music?" to "YouTube Music oturumu kapatılsın mı?",
        "Signature" to "İmza",
        "Signed out" to "Oturum kapatıldı",
        "Signing you in to Prism…" to "Prism oturumunuz açılıyor…",
        "Similar music plays next" to "Sırada benzer müzikler çalacak",
        "Similar music when the queue ends" to "Kuyruk bittiğinde benzer müzikler",
        "Similar music will play after your queue" to "Kuyruğunuz bittikten sonra benzer müzikler çalacak",
        "Sing" to "Vokal",
        "Sing doesn't run on this phone's kind of processor." to "Eşlik Et bu telefonun işlemci türünde çalışmıyor.",
        "Sing needs each song whole on the phone. Off, it waits for Wi-Fi unless the song is downloaded or already played through." to "Eşlik Et her şarkının tamamının telefonda olmasına ihtiyaç duyar. Kapalıyken, şarkı indirilmediyse veya sonuna kadar çalınmadıysa Wi-Fi bekler.",
        "Sing works with songs, not live streams or podcasts." to "Eşlik Et canlı yayınlar veya podcast'lerle değil, şarkılarla çalışır.",
        "Sing's voice separation" to "Sing vokal ayrıştırma",
        "Six styles: Prism, Classic karaoke, Bold card, Glow, Typewriter and Calm" to "Altı stil: Prism, Klasik karaoke, Kalın kart, Parıltı, Daktilo ve Sakin",
        "Skip" to "Atla",
        "Skip for now" to "Şimdilik atla",
        "Skip silence" to "Sessizliği atla",
        "Skip silent stretches between songs" to "Şarkılar arasındaki sessiz bölümleri atla",
        "Skip to the best part" to "En iyi kısma atla",
        "Skip tour" to "Turu atla",
        "Slims down as you scroll" to "Kaydırdıkça incelir",
        "Smaller things that make Prism yours." to "Prism'i size özel kılan daha küçük detaylar.",
        "Smallest first" to "En küçük başta",
        "Smart Downloads" to "Akıllı İndirmeler",
        "Smart Downloads 5 GB" to "Akıllı İndirmeler 5 GB",
        "Smart Downloads on mobile data" to "Hücresel veride Akıllı İndirmeler",
        "Smart downloads" to "Akıllı indirmeler",
        "So Sing starts at once when you turn it on" to "Böylece açtığınızda Sing hemen başlar",
        "So other players show them too" to "Böylece diğer oynatıcılar da bunları gösterir",
        "Soft blur, no refraction" to "Yumuşak bulanıklık, kırılma yok",
        "Softness" to "Yumuşaklık",
        "Software spatial audio: a wider stage, sound placed outside your head and a sense of room. Built into Prism, so it needs no Dolby Atmos or spatial audio hardware." to "Yazılımsal uzamsal ses: daha geniş bir sahne, kafanızın dışına yerleştirilmiş ses ve oda hissi. Prism'e yerleşiktir, bu nedenle Dolby Atmos veya uzamsal ses donanımına gerek duymaz.",
        "Solid bars" to "Düz çubuklar",
        "Song credits in any song's menu" to "Herhangi bir şarkının menüsünde şarkı künyesi",
        "Song length" to "Şarkı uzunluğu",
        "Song menu" to "Şarkı menüsü",
        "Song options" to "Şarkı seçenekleri",
        "Songs" to "Şarkılar",
        "Songs Prism found by listening" to "Prism'in dinleyerek bulduğu şarkılar",
        "Songs are worked out again the next time you sing them." to "Şarkılar bir sonraki söyleyişinizde tekrar işlenir.",
        "Songs blend into each other" to "Şarkılar birbirine karışarak geçer",
        "Songs found by listening" to "Dinleyerek bulunan şarkılar",
        "Songs from your phone that you play show up here." to "Telefonunuzdan çaldığınız şarkılar burada görünür.",
        "Songs you copy onto your phone, or download with another app, show up here." to "Telefonunuza kopyaladığınız veya başka bir uygulamayla indirdiğiniz şarkılar burada görünür.",
        "Songs you download in Prism show up here too." to "Prism'de indirdiğiniz şarkılar burada da görünür.",
        "Songs you download play without a connection." to "İndirdiğiniz şarkılar bağlantı olmadan da çalınır.",
        "Songs you play in Prism show up here, newest first. They're kept on this phone." to "Prism'de çaldığınız şarkılar en yeniden başlayarak burada görünür. Bu telefonda tutulurlar.",
        "Songs you play on YouTube Music, in Prism or anywhere else signed in, show up here." to "Prism'de veya oturum açtığınız başka bir yerde YouTube Music'te çaldığınız şarkılar burada görünür.",
        "Songs you'll likely play, ready offline" to "Muhtemelen dinleyeceğiniz şarkılar, çevrimdışı hazır",
        "Songs, not videos" to "Videolar değil, şarkılar",
        "Sort" to "Sırala",
        "Sort albums" to "Albümleri sırala",
    )
    private val trMap2 = mapOf(
        "Sort artists" to "Sanatçıları sırala",
        "Sort by" to "Sıralama ölçütü",
        "Sort songs" to "Şarkıları sırala",
        "Sound" to "Ses",
        "Sound & playback" to "Ses ve oynatma",
        "Source code" to "Kaynak kodu",
        "Sources" to "Kaynaklar",
        "Spacing" to "Aralık",
        "Speakers & TVs" to "Hoparlörler ve TV'ler",
        "Speakers, TVs and receivers" to "Hoparlörler, TV'ler ve alıcılar",
        "Spectrum" to "Spektrum",
        "Spectrum · every component, every state" to "Spektrum · her bileşen, her durum",
        "Split light under the line being sung" to "Söylenen satırın altında ayrık ışık",
        "Square video covers" to "Kare video kapakları",
        "Star an artist on their page, or like their songs, and they show up here." to "Sayfasında bir sanatçıyı yıldızlayın veya şarkılarını beğenin; burada görünecekler.",
        "Start" to "Başlat",
        "Start a session" to "Oturum başlat",
        "Starts the log again" to "Günlüğü yeniden başlatır",
        "Stats for nerds" to "Ayrıntılı istatistikler",
        "Stay in the loop" to "Haberdar kalın",
        "Stop" to "Durdur",
        "Stop casting" to "Yayını durdur",
        "Stop updating it" to "Güncellemeyi durdur",
        "Stop when swiped away" to "Kaydırılarak kapatıldığında durdur",
        "Stops when this song ends" to "Bu şarkı bittiğinde durur",
        "Storage" to "Depolama",
        "Storage & network" to "Depolama ve ağ",
        "Streaming" to "Akış",
        "Streaming quality on Wi-Fi" to "Wi-Fi üzerinde akış kalitesi",
        "Streaming quality on mobile data" to "Hücresel veride akış kalitesi",
        "Streaming quality on mobile data (data saver)" to "Mobil veride akış kalitesi (veri tasarrufu)",
        "Strength" to "Yoğunluk",
        "Style" to "Stil",
        "Style, light, accent, background, contrast and page colors go back to how Prism ships. Your saved colors stay." to "Stil, ışık, vurgu, arka plan, kontrast ve sayfa renkleri Prism'in varsayılanlarına döner. Kaydedilen renkleriniz kalır.",
        "Swear words starred out (f**k) are filled back in from Genius, keeping the word timings, and a source that still stars them out is passed over." to "Yıldızlanan küfürlü kelimeler (s**tir) kelime zamanlamaları korunarak Genius'tan tamamlanır ve bunları yıldızlamaya devam eden kaynaklar atlanır.",
        "Swings onto the record while it plays" to "Çalarken plağın üzerine doğru hareket eder",
        "Swiping Prism out of recent apps stops it" to "Prism'i son uygulamalardan kaydırarak kapatmak oynatmayı durdurur",
        "Swiping left skips too" to "Sola kaydırmak da şarkıyı atlar",
        "Swiping right goes back too" to "Sağa kaydırmak da geri gider",
        "Switch" to "Değiştir",
        "Switch account" to "Hesap değiştir",
        "Synced lyrics go into your FLAC and MP3 files' tags (as LRC): Local files, and the lossless files played for songs. Lyrics already saved are used, others are looked up. Android asks once before any file is changed. For one song, use its ⋯ menu." to "Senkronize sözler FLAC ve MP3 dosyalarınızın etiketlerine (LRC olarak) eklenir: Yerel dosyalar ve şarkılar için çalınan kayıpsız dosyalar. Zaten kayıtlı olan sözler kullanılır, diğerleri aranır. Herhangi bir dosya değiştirilmeden önce Android bir kez izin ister. Tek bir şarkı için ⋯ menüsünü kullanın.",
        "System" to "Sistem",
        "System font" to "Sistem yazı tipi",
        "System theme" to "Sistem teması",
        "TOP GENRE" to "EN ÇOK DİNLENEN TÜR",
        "TOP RESULT" to "EN İYİ SONUÇ",
        "Tabs" to "Sekmeler",
        "Take a color from" to "Şuradan bir renk al:",
        "Take the tour" to "Turu başlat",
        "Takes the singer's voice out of songs, on your phone, for karaoke. Downloaded once." to "Karaoke için şarkıcının sesini telefonunuzda şarkılardan çıkarır. Bir kez indirilir.",
        "Tap a color to change or remove it, + to add one (2 to 7)." to "Değiştirmek veya kaldırmak için bir renge dokunun, eklemek için + işaretine dokunun (2 ila 7).",
        "Tap a line to jump there" to "Oraya atlamak için bir satıra dokunun",
        "Tap anything outlined to change it" to "Değiştirmek için çerçeveli herhangi bir şeye dokunun",
        "Tap one to read its license." to "Lisansını okumak için birine dokunun.",
        "Tap or drag to pick a color" to "Renk seçmek için dokunun veya sürükleyin",
        "Tap shuffle twice on a playlist for Smart Shuffle: new songs slip in" to "Akıllı Karıştırma için bir çalma listesinde karıştıra iki kez dokunun: araya yeni şarkılar eklenir",
        "Tap the bookmark on an album's page to keep it here. Albums you like or download songs from show up too." to "Burada saklamak için bir albümün sayfasındaki yer işaretine dokunun. Beğendiğiniz veya şarkı indirdiğiniz albümler de görünür.",
        "Tap the heart on the player and the song shows up here, on this phone." to "Oynatıcıdaki kalp simgesine dokunun; şarkı burada, bu telefonda görünür.",
        "Tap the line under the player's controls (it says which device is playing) and pick a speaker, TV or receiver." to "Oynatıcı kontrollerinin altındaki satıra dokunun (hangi cihazın çaldığını gösterir) ve bir hoparlör, TV veya alıcı seçin.",
        "Tap the mini player (or swipe it up) to open it; swipe down to close." to "Açmak için mini oynatıcıya dokunun (veya yukarı kaydırın); kapatmak için aşağı kaydırın.",
        "Tap the mini player, tab bar, player or a Home section" to "Mini oynatıcıya, sekme çubuğuna, oynatıcıya veya bir Ana sayfa bölümüne dokunun",
        "Tap to find out what's playing" to "Ne çaldığını öğrenmek için dokunun",
        "Tap to go on · hold to pause" to "Devam etmek için dokunun · duraklatmak için basılı tutun",
        "Tap to join with their code" to "Kodlarıyla katılmak için dokunun",
        "Tap to pick a different file" to "Farklı bir dosya seçmek için dokunun",
        "Text" to "Metin",
        "Text contrast" to "Metin kontrastı",
        "The Ambient frost behind Home, Search, Library, Replay and Settings (Automatic keeps the cover's colors in it," to "Ana Sayfa, Ara, Kitaplık, Tekrar ve Ayarlar arkasındaki Ambiyans buzlu cam efekti (Otomatik, kapağın renklerini içinde tutar,",
        "The Replay card at the top: your year so far (pick its look in Settings → Home screen)" to "Üstteki Replay kartı: şimdiye kadarki yılınız (görünümünü Ayarlar → Ana ekran bölümünden seçin)",
        "The Weeknd" to "The Weeknd",
        "The Weeknd · 2020" to "The Weeknd · 2020",
        "The Weeknd · After Hours" to "The Weeknd · After Hours",
        "The album you were last playing (or your Rewind, in December), under Home's greeting. Tap it to open." to "Ana Sayfa karşılamasının altında, en son çaldığınız albüm (veya Aralık ayında Rewind). Açmak için dokunun.",
        "The animated cover plays behind everything" to "Hareketli kapak her şeyin arkasında oynatılır",
        "The car shows Home's sections as rows of covers under their headings, and Library and Made for you as covers, like Spotify's car screen. Off, they're plain lists. Takes effect the next time the car connects." to "Araba; Ana Sayfa bölümlerini başlıkların altında kapak sıraları olarak, Kitaplık ve Sizin İçin Hazırlandı bölümlerini de Spotify'ın araba ekranı gibi kapaklar olarak gösterir. Kapalıyken düz listedir. Araba bir sonraki bağlanışında geçerli olur.",
        "The car's small media card then reads as usual (its cover is tiny), and the full player shows the lyric card big. Android Auto doesn't tell apps which of the two is showing." to "Arabanın küçük medya kartı her zamanki gibi görünür (kapağı çok küçüktür) ve tam oynatıcı söz kartını büyük gösterir. Android Auto uygulamalara ikisinden hangisinin gösterildiğini bildirmez.",
        "The clock, battery and notification icons at the top stay hidden while Prism is open. Swipe down from the top edge and they show for a moment. Immersive mode and full-screen video hide the other bars too, as before." to "Prism açıkken üstteki saat, pil ve bildirim simgeleri gizli kalır. Üst kenardan aşağı kaydırdığınızda bir anlığına görünürler. Sürükleyici mod ve tam ekran video diğer çubukları da daha önce olduğu gibi gizler.",
        "The cover eases back while paused" to "Duraklatıldığında kapak hafifçe geri çekilir",
        "The cover fills the screen, lyrics over it" to "Kapak ekranı doldurur, sözler üzerindedir",
        "The cover runs to the screen's edges at the top of the player and fades into the background. Cover size then sets how far down it reaches." to "Kapak oynatıcının üst kısmında ekranın kenarlarına kadar uzanır ve arka planda kaybolur. Kapak boyutu ne kadar aşağı uzanacağını belirler.",
        "The cover's color" to "Kapağın rengi",
        "The cover, soft and dimmed" to "Yumuşatılmış ve soluk kapak",
        "The current-lyric line and immersive mode follow these settings" to "Mevcut şarkı sözü satırı ve sürükleyici mod bu ayarları takip eder",
        "The equalizer and Crossfade are the phone's own, so they're off while casting." to "Ekolayzer ve Çapraz Geçiş telefonun kendi özellikleridir, bu nedenle yayın yaparken devre dışıdır.",
        "The grid button at the top arranges Home's sections" to "Üstteki ızgara düğmesi Ana Sayfa'nın bölümlerini düzenler",
        "The light: 12 presets, White (Black in light mode), or your own colors" to "Işık: 12 hazır ayar, Beyaz (açık modda Siyah) veya kendi renkleriniz",
        "The line being sung" to "Söylenen satır",
        "The list is downloaded from Prism's GitHub repository when you open it (GitHub sees the download, nothing else is sent). Each Look shows as a preview first, and can only change how Prism looks." to "Liste açtığınızda Prism'in GitHub deposundan indirilir (GitHub indirmeyi görür, başka hiçbir şey gönderilmez). Her Görünüm önce bir önizleme olarak gösterilir ve yalnızca Prism'in görünüşünü değiştirebilir.",
        "The log and audio settings, as text" to "Metin olarak günlük ve ses ayarları",
        "The most lines ahead show" to "En çok sonraki satırlar görünür",
        "The moving artwork fills the whole player, darkened under the controls, and the cover itself shows the still picture. Not with full-bleed artwork, which already shows it edge to edge." to "Hareketli görsel tüm oynatıcıyı doldurur, kontrollerin altında koyulaşır ve kapağın kendisi sabit resmi gösterir. Zaten kenardan kenara gösteren çerçevesiz görsellerde geçerli değildir.",
        "The music pauses; pick this phone to carry on here" to "Müzik duraklatılır; buradan devam etmek için bu telefonu seçin",
        "The next song plays at the ending one's tempo with its beats lined up while they overlap, then eases back. Off, they crossfade at their own speed." to "Sonraki şarkı, biten şarkının temposunda, üst üste binerken vuruşları hizalanmış olarak çalar, ardından normal temposuna döner. Kapalıyken kendi hızlarında çapraz geçiş yaparlar.",
        "The other lines" to "Diğer satırlar",
        "The page background: plain, tinted with your accent, or a color of your own" to "Sayfa arka planı: sade, vurgunuzla renklendirilmiş veya kendi renginiz",
        "The part people replay most" to "En çok tekrar oynatılan kısım",
        "The phone's volume" to "Telefonun ses seviyesi",
        "The picture shows everywhere in Prism, including Android Auto. YouTube Music keeps its own." to "Resim Android Auto dahil Prism'in her yerinde gösterilir. YouTube Music kendi resmini korur.",
        "The player" to "Oynatıcı",
        "The player follows Home's background" to "Oynatıcı Ana sayfanın arka planını takip eder",
        "The player's background, or the cover in immersive mode" to "Oynatıcının arka planı veya sürükleyici modda kapak",
        "The player, your way" to "Oynatıcı, sizin tarzınızda",
        "The playing song and the next are separated in the background even with Sing off. It uses more battery while music plays; on mobile data it follows the setting above." to "Çalan şarkı ve sıradaki şarkı, Sing kapalı olsa bile arka planda ayrıştırılır. Müzik çalarken daha fazla pil tüketir; mobil veride yukarıdaki ayarı takip eder.",
        "The progress bar and Play ring in the player and mini player, the song that's playing in every list (and its" to "Oynatıcı ve mini oynatıcıdaki ilerleme çubuğu ile Oynat halkası, her listede çalan şarkı (ve bunun",
        "The song's moving cover when it has one" to "Varsa şarkının hareketli kapağı",
        "The song's own music, with the voice taken out" to "Şarkının vokalden arındırılmış kendi müziği",
        "The sung line and the others in white, your light, the accent, the cover's color or your own" to "Söylenen satır ve diğerleri beyazda, ışığınızda, vurguda, kapak renginde veya kendi renginizde",
        "The sung line near the top, a third down or in the middle, and how many lines to come show" to "Söylenen satır üste yakın, üçte bir aşağıda veya ortada ve gelecek satırlardan kaçının gösterileceği",
        "The time on the right shows how long the song is rather than how much is left. Tapping the time on the player switches too." to "Sağdaki süre, kalan süre yerine şarkının toplam uzunluğunu gösterir. Oynatıcıdaki süreye dokunmak da bunu değiştirir.",
        "The video uses the song's own timing." to "Video şarkının kendi zamanlamasını kullanır.",
        "The volume slider changes" to "Ses seviyesi kaydırıcısı değişir",
        "The waveform button in the search box listens for a song" to "Arama kutusundaki dalga formu düğmesi çalan şarkıyı dinler",
        "Their source is at the bottom: tap it to pick another, or fix the timing from ⋯" to "Kaynakları alttadır: başka birini seçmek için dokunun veya ⋯ menüsünden zamanlamayı düzeltin",
        "Theme" to "Tema",
        "They shape your Daily Mixes and Release Radar. They're starred on this phone; nothing is followed on YouTube." to "Günlük Mikslerinizi ve Yeni Çıkanlar Radarı'nı şekillendirirler. Bu telefonda yıldızlanırlar; YouTube'da hiçbir şey takip edilmez.",
        "They shape your mixes and Release Radar" to "Mikslerinizi ve Yeni Çıkanlar Radarı'nı şekillendirirler",
        "They'll need a new code" to "Yeni bir koda ihtiyaçları olacak",
        "Thin" to "İnce",
        "This month" to "Bu ay",
        "This page's look goes back to how Prism comes. Everything else stays, and Undo brings it back." to "Bu sayfanın görünümü Prism'in varsayılan haline döner. Diğer her şey kalır ve Geri Al işlemi bunu geri getirir.",
        "This phone" to "Bu telefon",
        "This playlist is private, so its link only works for you." to "Bu çalma listesi gizlidir, bu nedenle bağlantısı yalnızca sizin için çalışır.",
        "This section" to "Bu bölüm",
        "Three parts, numbered in the preview: ① the light, ② the accent and ③ the background." to "Ön izlemede numaralandırılmış üç bölüm: ① ışık, ② vurgu ve ③ arka plan.",
        "Tick the sections you want; hold one (or its grip) to move it." to "İstediğiniz bölümleri işaretleyin; taşımak için basılı tutun.",
        "Tick the tiles to show at the top of Library; hold one to move it." to "Kitaplığın üstünde göstermek için kutucukları işaretleyin; taşımak için birine basılı tutun.",
        "Tick your tabs and hold one to move it. Keep Home, Library or Settings, so Settings can always be reached." to "Sekmelerinizi işaretleyin ve taşımak için birini basılı tutun. Ayarlara her zaman ulaşılabilmesi için Ana Sayfa, Kitaplık veya Ayarları koruyun.",
        "Time left" to "Kalan süre",
        "Time-synced lines" to "Zaman senkronize satırlar",
        "Times under the progress bar" to "İlerleme çubuğunun altındaki süreler",
        "Tint strength" to "Renk tonu yoğunluğu",
        "Title and times" to "Başlık ve süreler",
        "Title size" to "Başlık boyutu",
        "Tonearm" to "Pikap kolu",
        "Too much for a QR code: send it as text or a file" to "Bir QR kod için çok büyük: metin veya dosya olarak gönderin",
        "Top artists" to "En çok dinlenen sanatçılar",
        "Top genres" to "En çok dinlenen türler",
        "Top of the Blend" to "Blend'in zirvesi",
        "Top right of Home" to "Ana sayfanın sağ üst köşesi",
        "Top songs" to "En çok dinlenen şarkılar",
        "Top to bottom, as they sit on the player; hold one to move it. The progress bar, controls and buttons are always there." to "Oynatıcıda durdukları gibi yukarıdan aşağıya; taşımak için birine basılı tutun. İlerleme çubuğu, kontroller ve düğmeler her zaman oradadır.",
        "Translate into" to "Şu dile çevir:",
        "Translate lyrics" to "Şarkı sözlerini çevir",
        "Translate them, or read other scripts in Latin letters (Settings → Lyrics)" to "Sözleri çevirin veya diğer alfabeleri Latin harfleriyle okuyun (Ayarlar → Şarkı sözleri)",
        "Translations & romanized lines" to "Çeviriler ve latinleştirilmiş dizeler",
        "Translations over or under each line, their size, color and italics" to "Her satırın üstünde veya altında çeviriler, boyutları, renkleri ve italik yazı",
        "Treble Boost" to "Tiz Güçlendirme",
        "Tried top to bottom; hold one to move it. Switch source per song from the player's ⋯." to "Yukarıdan aşağıya doğru denenir; taşımak için birine basılı tutun. Oynatıcının ⋯ menüsünden şarkı başına kaynak değiştirin.",
        "Trims silence at the start and end" to "Başlangıç ve bitişteki sessizliği kırpar",
        "Try Prism's own: Paper, Midnight, Neon, Soft, Studio and Vinyl" to "Prism'in kendi görünümlerini deneyin: Paper, Midnight, Neon, Soft, Studio ve Vinyl",
        "Try again closer to the music, or where it's louder." to "Müziğe daha yakın veya sesin daha yüksek olduğu bir yerde tekrar deneyin.",
        "Try again in a minute." to "Bir dakika içinde tekrar deneyin.",
        "TuneMyMusic copies your playlists, Liked Songs included, into your YouTube Music account." to "TuneMyMusic, Beğenilen Şarkılar dahil olmak üzere çalma listelerinizi YouTube Music hesabınıza kopyalar.",
        "TuneMyMusic is a separate service, not part of Prism. It asks for access to the accounts you connect and sees the" to "TuneMyMusic ayrı bir hizmettir, Prism'in bir parçası değildir. Bağladığınız hesaplara erişim ister ve",
        "Turn off Wi-Fi only" to "Yalnızca Wi-Fi seçeneğini kapat",
        "Turn them on in Android's settings for Prism." to "Prism için Android ayarlarından bildirimleri açın.",
        "Typeface" to "Yazı tipi",
        "USB" to "USB",
        "Uncensor lyrics" to "Şarkı sözü sansürünü kaldır",
        "Under each line" to "Her satırın altında",
        "Under the cover's left edge" to "Kapağın sol kenarının altında",
        "Under the line" to "Satırın altında",
        "Under the title" to "Başlığın altında",
        "Undo" to "Geri al",
        "Uninstall" to "Kaldır",
        "Uninstall this Prism" to "Bu Prism'i kaldır",
        "United States" to "Amerika Birleşik Devletleri",
        "Unknown song" to "Bilinmeyen şarkı",
        "Unlisted" to "Liste dışı",
        "Unofficial" to "Resmi değildir",
        "Unofficial · not affiliated with Google or YouTube" to "Resmi değildir · Google veya YouTube ile bağlantısı yoktur",
        "Unpair all browsers" to "Tüm tarayıcıların eşleşmesini kaldır",
        "Update" to "Güncelle",
        "Update now" to "Şimdi güncelle",
        "Use 256 kbps over mobile networks" to "Mobil ağlarda 256 kbps kullan",
        "Use Prism's cover" to "Prism'in kapağını kullan",
        "Use cookie" to "Çerezi kullan",
        "Use it" to "Bunu kullan",
        "Use mine" to "Benimkini kullan",
        "Use mobile data" to "Hücresel veriyi kullan",
        "Use my initial" to "Baş harfimi kullan",
        "Use the song's own" to "Şarkının kendi adını kullan",
        "Use theme colors" to "Tema renklerini kullan",
        "Use this color" to "Bu rengi kullan",
        "Uses much less data off Wi-Fi" to "Wi-Fi dışındayken çok daha az veri kullanır",
        "Version" to "Sürüm",
        "Video saved" to "Video kaydedildi",
        "Videos everywhere play as their song" to "Her yerdeki videolar şarkı olarak çalar",
        "Visualizer" to "Görselleştirici",
        "Visualizer color" to "Görselleştirici rengi",
        "Vocal Boost" to "Vokal Güçlendirme",
        "Voice" to "Vokal",
        "Volume" to "Ses düzeyi",
        "WHEN YOU LISTEN" to "NE ZAMAN DİNLİYORSUNUZ",
        "WHERE IT STARTED" to "NEREDE BAŞLADI",
        "Waiting for a network" to "Ağ bekleniyor",
        "Watch your Replay" to "Tekrar özetinizi izleyin",
        "Watch your Rewind" to "Geri Sarma özetinizi izleyin",
        "Waterfalls Coming Out Your Mouth" to "Waterfalls Coming Out Your Mouth",
        "Weight" to "Kalınlık",
        "Weight, line spacing, how dim the other lines are, blur strength, capitals and a shadow" to "Kalınlık, satır aralığı, diğer satırların solukluğu, bulanıklık gücü, büyük harfler ve gölge",
        "Welcome to Prism" to "Prism'e Hoş Geldiniz",
        "What Prism leaves out of your recommendations" to "Prism'in önerilerinizden hariç tuttukları",
        "What's kept out of your music" to "Müziğinizden uzak tutulanlar",
        "When a starred artist puts out music" to "Yıldızlı bir sanatçı müzik çıkardığında",
        "When the lyrics are listed under a different name" to "Şarkı sözleri farklı bir ad altında listelendiğinde",
        "When the queue ends, Prism's radio picks from your music (Settings → Playback & sound → Autoplay from)" to "Kuyruk bittiğinde, Prism'in radyosu müziğinizden parçalar seçer (Ayarlar → Oynatma ve ses → Otomatik oynatma kaynağı)",
        "When you've liked a song and its music video, Liked songs, Library and the car show just the song. The video stays liked: unlike the song and it shows again. Nothing changes on YouTube Music." to "Bir şarkıyı ve müzik videosunu beğendiğinizde Beğenilen şarkılar, Kitaplık ve araba yalnızca şarkıyı gösterir. Video beğenilmiş olarak kalır: şarkının beğenisini kaldırırsanız video tekrar görünür. YouTube Music'te hiçbir şey değişmez.",
        "Where Best part takes you in this song, and where it starts in Rewind and Blend" to "Bu şarkıda En İyi Kısım'ın sizi nereye götürdüğü ve Geri Sarma ile Karışım'da nereden başladığı",
        "Where the lines go" to "Satırların konumu",
        "Where your playlists go" to "Çalma listelerinizin gideceği yer",
        "Which background" to "Hangi arka plan",
        "Which of its colors" to "Hangi renkleri",
        "While it's on, those parts of Prism are outlined, and tapping one opens just its settings. Done, at the top of the screen, turns it off. Holding the Settings tab (when it's in the tab bar) turns it on and off too." to "Açıkken Prism'in bu bölümleri çerçevelenir ve birine dokunulduğunda yalnızca ilgili ayarlar açılır. Ekranın üstündeki Bitti bunu kapatır. Ayarlar sekmesini basılı tutmak da (sekme çubuğundayken) bunu açıp kapatır.",
        "Who you are in Prism, kept on this phone and in your backups. No email, no password, no server." to "Prism'deki kimliğiniz; bu telefonda ve yedeklerinizde tutulur. E-posta yok, şifre yok, sunucu yok.",
        "Wi-Fi only" to "Yalnızca Wi-Fi",
        "Wi-Fi or mobile data." to "Wi-Fi veya hücresel veri.",
        "Wider sound for any headphones" to "Her kulaklık için daha geniş ses sahnesi",
        "Wired" to "Kablolu",
        "With friends on the same Wi-Fi" to "Aynı Wi-Fi'daki arkadaşlarla",
        "With phones on the same Wi-Fi" to "Aynı Wi-Fi ağındaki telefonlarla",
        "With the lyrics open, tap Sing at the bottom" to "Şarkı sözleri açıkken alttaki Sing'e dokunun",
        "Word by word first, then by line" to "Önce kelime kelime, ardından satır satır",
        "YOU LISTENED FOR" to "DİNLEME SÜRENİZ",
        "YOUR #1 SONG" to "1 NUMARALI ŞARKINIZ",
        "YOUR BIGGEST MONTH" to "EN ÇOK DİNLEDİĞİNİZ AY",
        "YOUR LISTENING PERSONALITY" to "DİNLEME KİŞİLİĞİNİZ",
        "YOUR TOP ALBUM" to "ZİRVEDEKİ ALBÜMÜNÜZ",
        "YOUR TOP ARTIST" to "ZİRVEDEKİ SANATÇINIZ",
        "YOUR TOP ARTISTS" to "ZİRVEDEKİ SANATÇILARINIZ",
        "YOUR TOP GENRE" to "ZİRVEDEKİ TÜRÜNÜZ",
        "YOUR TOP SONGS" to "ZİRVEDEKİ ŞARKILARINIZ",
        "YOUR YEAR IN PRISM" to "PRISM İLE GEÇEN YILINIZ",
        "YOUR YEAR, SEASON BY SEASON" to "MEVSİM MEVSİM YILINIZ",
        "You both play" to "İkiniz de dinliyorsunuz",
        "You can take it again from Settings → About." to "Ayarlar → Hakkında bölümünden tekrar başlatabilirsiniz.",
        "You see a Look first, and choose to try it or keep it." to "Önce bir Görünüm görürsünüz, ardından denemeyi veya saklamayı seçersiniz.",
        "You're offline, so Prism kept what it heard" to "Çevrimdışısınız, bu yüzden Prism duyduklarını sakladı",
        "You're on it now" to "Şu anda buradasınız",
        "You're up to date" to "Uygulamanız güncel",
        "YouTube Music playlists" to "YouTube Music çalma listeleri",
        "YouTube didn't list any other channels. Sign out and in again if you've just made one." to "YouTube başka kanal listelemedi. Yeni bir kanal oluşturduysanız oturumu kapatıp tekrar açın.",
        "YouTube's video pictures are wide, with black bars above and below. On, Prism trims the bars and uses the middle of the picture as a square cover: on the player, in lists, the notification and Android Auto." to "YouTube'un video resimleri geniştir, üstte ve altta siyah çubuklar vardır. Açıkken Prism bu çubukları kırpar ve resmin ortasını kare bir kapak olarak kullanır: oynatıcıda, listelerde, bildirimde ve Android Auto'da.",
        "Your #1 song" to "1 numaralı şarkınız",
        "Your Blends" to "Blend'leriniz",
        "Your Looks" to "Görünümleriniz",
        "Your Prism" to "Sizin Prism'iniz",
        "Your Rewind, ready on December 1" to "Rewind özetiniz, 1 Aralık'ta hazır",
        "Your YouTube Music library" to "YouTube Music kitaplığınız",
        "Your accent instead of Prism's gradient" to "Prism'in gradyanı yerine sizin vurgunuz",
        "Your accent: any color, from a wheel, a code or the eyedropper" to "Vurgunuz: tekerlekten, bir koddan veya damlalıktan seçilen herhangi bir renk",
        "Your artists" to "Sanatçılarınız",
        "Your background photos go in the file" to "Arka plan fotoğraflarınız dosyaya dahil edilir",
        "Your best part" to "En iyi kısmınız",
        "Your color" to "Kendi renginiz",
        "Your colors" to "Kendi renkleriniz",
        "Your data stays here" to "Verileriniz burada kalır",
        "Your go-to music" to "Favori müziğiniz",
        "Your headphones" to "Kulaklığınız",
        "Your history, Replay and settings live only on this phone." to "Geçmişiniz, Replay ve ayarlarınız yalnızca bu telefonda tutulur.",
        "Your language under each line" to "Her satırın altında sizin diliniz",
        "Your launcher may take a moment to update." to "Başlatıcınızın güncellenmesi biraz zaman alabilir.",
        "Your library" to "Kitaplığınız",
        "Your library, Replay history, settings, sign-in, covers and backgrounds go into one file. Keep it private: it can sign in as you." to "Kitaplığınız, Replay geçmişiniz, ayarlarınız, oturumunuz, kapaklar ve arka planlar tek bir dosyaya kaydedilir. Gizli tutun: sizin adınıza oturum açabilir.",
        "Your listening recap" to "Dinleme özetiniz",
        "Your listening, recapped on your phone." to "Dinleme geçmişiniz, telefonunuzda özetlendi.",
        "Your listening, recapped on-device" to "Cihazınızda özetlenen dinleme geçmişiniz",
        "Your mixes and new releases start from them" to "Miksiniz ve yeni çıkanlar bunlardan başlar",
        "Your music files" to "Müzik dosyalarınız",
        "Your music, refracted." to "Müziğiniz, ışık gibi kırıldı.",
        "Your music, refracted. Here's a minute's tour of what it can do: swipe, or tap Start." to "Müziğiniz, kırılan ışık gibi. Neler yapabildiğine bir dakikalık bir bakış: kaydırın veya Başlat'a dokunun.",
        "Your name" to "Adınız",
        "Your name and picture will be removed from this phone." to "Adınız ve resminiz bu telefondan kaldırılacaktır.",
        "Your name and picture, kept on this phone. Nothing you have changes" to "Adınız ve resminiz bu telefonda tutulur. Mevcut hiçbir şeyiniz değişmez",
        "Your name in Blends" to "Blend'lerdeki adınız",
        "Your own downloads stay" to "Kendi indirmeleriniz kalır",
        "Your own light's colors, left to right" to "Işığınızın soldan sağa kendi renkleri",
        "Your phone's notification and lock screen show the first two beside play; Android Auto shows them all, in this order. Hold one to move it." to "Telefonunuzun bildirimi ve kilit ekranı oynatmanın yanında ilk ikisini gösterir; Android Auto hepsini bu sırada gösterir. Taşımak için basılı tutun.",
        "Your pick" to "Sizin seçiminiz",
        "Your playlists" to "Çalma listeleriniz",
        "Your playlists show up here once your library has loaded" to "Kitaplığınız yüklendiğinde çalma listeleriniz burada görünür",
        "Your profile shows the song and how far in. You sign in on Discord's own page, and the sign-in stays on this phone. While it's on, song names and artists go to Discord as you listen." to "Profiliniz şarkıyı ve ne kadar ilerlediğini gösterir. Discord'un kendi sayfasında oturum açarsınız ve oturum bu telefonda kalır. Açıkken, dinledikçe şarkı adları ve sanatçılar Discord'a gönderilir.",
        "Your shows" to "Programlarınız",
        "Your starting point, made from what you play." to "Çaldıklarınızdan oluşturulan başlangıç noktanız.",
        "Your top genres" to "Zirvedeki müzik türleriniz",
        "Your top songs, artists and genres" to "Zirvedeki şarkılarınız, sanatçılarınız ve türleriniz",
        "Your year in music" to "Müzikle geçen yılınız",
        "Your year so far" to "Bu yıla kadarki özetiniz",
        "Z to A" to "Z'den A'ya",
        "and pick the backup." to "ve yedeklemeyi seçin.",
        "days" to "gün",
        "found their way into your rotation." to "çalma listenize girmeyi başardı.",
        "in the player's ⋯ menu, then share the log here." to "oynatıcının ⋯ menüsünde, ardından günlüğü burada paylaşın.",
        "not affiliated with Google or YouTube" to "Google veya YouTube ile bağlantısı yoktur",
        "pairs the first time" to "ilk seferde eşleşir",
        "pending" to "beklemede",
        "taste match" to "zevk eşleşmesi",
        "tnum" to "tnum",
        "under the greeting" to "karşılamanın altında",
        "• Each phone streams the music itself, so guests use their own data or Wi-Fi." to "• Her telefon müziği kendisi aktarır, bu nedenle konuklar kendi verilerini veya Wi-Fi'larını kullanır.",
        "• Everyone needs Prism on the same Wi-Fi, or on one phone's hotspot." to "• Herkesin aynı Wi-Fi ağında veya bir telefonun erişim noktasında Prism'e ihtiyacı vardır.",
        "• Phones talk to each other directly. There's no Prism server, and nothing is shared once the session ends." to "• Telefonlar birbirleriyle doğrudan iletişim kurar. Prism sunucusu yoktur ve oturum bittiğinde hiçbir şey paylaşılmaz.",
        "• Some public and work Wi-Fi keeps phones apart; a hotspot works there." to "• Bazı halka açık ve iş yeri Wi-Fi ağları cihazları ayırır; orada kişisel erişim noktası çalışır.",
        "⋯ has the sleep timer, stats, downloads and Player settings" to "⋯ menüsünde uyku zamanlayıcısı, istatistikler, indirmeler ve Oynatıcı ayarları bulunur",
        "① The light: the colors Prism lights its highlights with." to "① Işık: Prism'in vurgularını aydınlattığı renkler.",
        "③ The background: what Prism's own screens sit on." to "③ Arka plan: Prism'in ekranlarının üzerinde durduğu zemin.",
        "Welcome to the new Prism" to "Yeni Prism'e Hoş Geldiniz",
        "Vocal" to "Vokal",
        "Hip-Hop" to "Hip-Hop",
        "Jazz" to "Caz",
        "Acoustic" to "Akustik",
        "Late Night" to "Gece Vakti",
        "not corrected" to "düzeltilmedi",
        "That file has no ParametricEQ filters in it" to "Bu dosyada hiçbir ParametricEQ filtresi yok",
        "Search headphones (e.g. Sony WH-1000XM5)" to "Kulaklık ara (örn. Sony WH-1000XM5)",
        "Strength" to "Güç",
        "Your headphones" to "Kulaklıklarınız",
        "TuneMyMusic copies your playlists, Liked Songs included, into your YouTube Music account. It's the same service YouTube Music's own app uses for transfers." to "TuneMyMusic, Beğenilen Şarkılar dahil olmak üzere çalma listelerinizi YouTube Music hesabınıza kopyalar. YouTube Music'in kendi uygulamasının aktarımlar için kullandığı hizmetin aynısıdır.",
        "From Spotify" to "Spotify'dan",
        "From Apple Music" to "Apple Music'ten",
        "From another service or a file" to "Başka bir servisten veya dosyadan",
        "How it works" to "Nasıl çalışır",
        "1. Sign in to Spotify or Apple Music on TuneMyMusic and pick the playlists." to "1. TuneMyMusic üzerinden Spotify veya Apple Music'e giriş yapın ve çalma listelerini seçin.",
        "2. Choose YouTube Music as the destination and sign in with the Google account you use in Prism%s." to "2. Hedef olarak YouTube Music'i seçin ve Prism'de kullandığınız Google hesabıyla%s giriş yapın.",
        "3. When the transfer finishes, come back here. Prism syncs your library and the playlists appear under Library → Playlists." to "3. Aktarım bittiğinde buraya geri dönün. Prism kitaplığınızı eşitler ve çalma listeleri Kitaplık → Çalma Listeleri altında görünür.",
        "TuneMyMusic is a separate service, not part of Prism. It asks for access to the accounts you connect and sees the playlists you move; its free plan has limits. Prism doesn't share anything with it." to "TuneMyMusic ayrı bir hizmettir, Prism'in bir parçası değildir. Bağladığınız hesaplara erişim ister ve taşıdığınız çalma listelerini görür; ücretsiz planının sınırları vardır. Prism onunla hiçbir şey paylaşmaz.",
        "Preamp" to "Ön Amfi",
        "Software spatial audio" to "Yazılımsal uzamsal ses",
        "Intensity" to "Yoğunluk",
        "Focus blur needs Android 12 or later; on this phone the other lines are only dimmed." to "Odak bulanıklığı Android 12 veya üstünü gerektirir; bu telefonda diğer satırlar yalnızca soluklaştırılır.",
        "Bold card's color shows with the background As now or The cover's color (Background, below); here it keeps its bold type." to "Kalın kartın rengi Şimdiki gibi veya Kapak rengi arka planıyla görünür (Arka Plan, aşağıda); burada kalın yazı tipini korur.",
        "Pure black (under Theme) keeps dark pages black; the tint then shows on cards and in light mode" to "Saf siyah (Tema altında) koyu sayfaları siyah tutar; tonlama daha sonra kartlarda ve açık modda görünür",
        "Immersive mode settings (hold to leave)" to "Sürükleyici mod ayarları (çıkmak için basılı tutun)",
        "Signature style" to "İmza stili",
        "MORE THAN\\nLISTENING" to "DİNLEMEKTEN\\nDAHA FAZLASI",
        "Looking on this network…" to "Bu ağda aranıyor…",
        "Not found in Prism Music" to "Prism Music içinde bulunamadı",
        "album" to "albüm",
        "artist" to "sanatçı",
        "playlist" to "çalma listesi",
        "podcast" to "podcast",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred, saved and play most; the first look only learns what's already out, so new music shows up from the next one." to "Son üç ayda sanatçılarınızdan yeni bir şey yok. Prism birkaç günde bir favorilediğiniz, kaydettiğiniz ve en çok dinlediğiniz sanatçıları kontrol eder; ilk kontrol yalnızca mevcut olanları öğrenir, sonraki kontrolden itibaren yeni müzikler burada görünür.",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another Wi-Fi or mobile data." to "Bağlantınızı kontrol edin. İş veya okul ağları gibi bazı ağlar Discord'u engeller: başka bir Wi-Fi veya mobil veri deneyin.",
        "YouTube is limiting playback on this network right now. Try again in a while, switch networks (or turn off a VPN), or sign in." to "YouTube şu anda bu ağda çalmayı sınırlandırıyor. Bir süre sonra tekrar deneyin, ağ değiştirin (veya VPN'i kapatın) ya da oturum açın.",
        "Sync library now" to "Kitaplığı şimdi eşitle",
        "Syncing…" to "Eşitleniyor…",
        "Sign in to import playlists" to "Çalma listelerini içe aktarmak için oturum açın",
        "Imported playlists go to your YouTube Music account, then show up in Prism." to "İçe aktarılan çalma listeleri YouTube Music hesabınıza gider, ardından Prism'de görünür.",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out. Your account isn't changed; copy again any time to bring Prism's copies up to date." to "Çalma listelerini, kaydedilen albümleri ve sanatçıları Prism'e kopyalayın, böylece oturumu kapatsanız bile bu telefonda kalırlar. Hesabınız değişmez; Prism'in kopyalarını güncellemek için istediğiniz zaman tekrar kopyalayın.",
        "backup, updates" to "yedekleme, güncellemeler",
        "List view" to "Liste görünümü",
        "Grid view" to "Izgara görünümü",
        "hours" to "saat",
        "minutes" to "dakika",
        "Docked bar" to "Sabitlenmiş çubuk",
        "Hidden bar" to "Gizli çubuk",
        "Full mini player" to "Tam mini oynatıcı",
        "High quality" to "Yüksek kalite",
        "Medium quality" to "Orta kalite",
        "Low quality" to "Düşük kalite",
        "Accent from the cover" to "Kapak renginden vurgu",
        "Accent from the wallpaper" to "Duvar kâğıdından vurgu",
        "About %s; downloads are fetched again after restoring" to "Yaklaşık %s; indirilenler geri yüklendikten sonra tekrar alınır",
        "About %s" to "Yaklaşık %s",
        "From %s, Prism is signed with its own key instead of a shared test key, so Android stops flagging it. Android can't update across that change, so this once Prism is reinstalled. Your things come with you:" to "%s sürümünden itibaren Prism, paylaşılan bir test anahtarı yerine kendi anahtarıyla imzalanmıştır, böylece Android uyarı vermeyi durdurur. Android bu değişiklik üzerinden güncelleme yapamaz, bu yüzden bu işlem bir defaya mahsus yapılır. Verileriniz korunur:",
        "Couldn't restore: %s" to "Geri yüklenemedi: %s",
        "Couldn't save it: %s" to "Kaydedilemedi: %s",
            "Floating" to "Kayan",
        "Docked" to "Sabit",
        "Minimal" to "Minimal",
        "Always" to "Her zaman",
        "Selected" to "Seçilen",
        "Never" to "Hiçbir zaman",
        "Card" to "Kart",
        "Slim" to "İnce",
        "Pill" to "Hap",
        "Line" to "Çizgi",
        "Fill" to "Dolgu",
        "None" to "Yok",
        "Color mesh" to "Renk ağı",
        "Blurred cover" to "Bulanık kapak",
        "Your background" to "Arka planınız",
        "Theme" to "Tema",
        "Black" to "Siyah",
        "Classic" to "Klasik",
        "Play button" to "Oynat düğmesi",
        "Rings" to "Halkalar",
        "Standard" to "Standart",
        "Large" to "Büyük",
        "Full width" to "Tam genişlik",
        "Next song's start" to "Sonraki şarkının başlangıcı",
        "Next song" to "Sonraki şarkı",
        "Next 3 songs" to "Sonraki 3 şarkı",
        "High" to "Yüksek",
        "Middle" to "Orta",
        "Low" to "Alçak",
        "Full screen" to "Tam ekran",
        "Fill the screen" to "Ekranı doldur",
        "Zoomed out" to "Uzaklaştırılmış",
        "Whole cover" to "Tüm kapak",
        "Hairline" to "İnce çizgi",
        "Bold" to "Kalın",
        "Thumb" to "Düğmeli",
        "Waveform" to "Dalga formu",
        "Compact" to "Sıkışık",
        "Comfortable" to "Rahat",
        "Roomy" to "Geniş",
        "Medium" to "Orta",
        "Small" to "Küçük",
        "Songs" to "Şarkılar",
        "Favourites" to "Favoriler",
        "Artists" to "Sanatçılar",
        "Albums" to "Albümler",
        "Recently added" to "Son eklenenler",
        "Added albums" to "Eklenen albümler",
        "Downloads" to "İndirilenler",
        "Back to Lyrics, Video and Up next" to "Şarkı Sözleri, Video ve Sıradakiler'e dön",
        "Back to Prism's buttons" to "Prism düğmelerine dön",
        "Back to Prism's order" to "Prism sırasına dön",
        "Wallpaper" to "Duvar kağıdı",
        "White light" to "Beyaz ışık",
        "Automatic" to "Otomatik",
        "Neutral" to "Nötr",
        "Accent" to "Vurgu",
        "Vibrant" to "Canlı",
        "Muted" to "Sakin",
        "Main color" to "Ana renk",
        "At once" to "Hemen",
        "Fade" to "Karartma",
        "Slow fade" to "Yavaş karartma",
        "New albums only" to "Yalnızca yeni albümler",
        "Clean" to "Temiz",
        "Geometric" to "Geometrik",
        "Airy" to "Ferah",
        "Editorial" to "Dergi stili",
        "Mono" to "Mono",
        "Your font" to "Yazı tipiniz",
        "Sharp" to "Keskin",
        "Subtle" to "Hafif",
        "Round" to "Yuvarlak",
        "Extra" to "Ekstra",
        "Vinyl" to "Plak",
        "Cassette" to "Kaset",
        "With the style" to "Stile uygun",
        "Dot" to "Nokta",
        "Ring" to "Halka",
        "Bars" to "Çubuklar",
        "Wave" to "Dalga",
        "Pulse" to "Nabız",
        "Current lyric" to "Mevcut söz",
        "Your light" to "Işığınız",
        "White" to "Beyaz",
        "From the cover" to "Kapaktan",
        "Classic karaoke" to "Klasik karaoke",
        "Bold card" to "Kalın kart",
        "Typewriter" to "Daktilo",
        "Calm" to "Sakin",
        "Three" to "Üç",
        "One" to "Bir",
        "Plain dark" to "Düz koyu",
        "Center" to "Ortala",
        "Both" to "Her ikisi",
        "Your music" to "Müziğiniz",
        "Carousel" to "Karusel",
        "Grid" to "Izgara",
        "List" to "Liste",
        "Spotlight" to "Öne çıkan",
        "Title only" to "Yalnızca başlık",
        "Line by line" to "Satır satır",
        "Karaoke" to "Karaoke",
        "Section style" to "Bölüm stili",
        "This section" to "Bu bölüm",
        "Hide this section" to "Bu bölümü gizle",
        "Bring it back from Customize Home" to "Ana Sayfayı Özelleştir'den geri getirin",
        "Immersive mode" to "Sürükleyici mod",
        "Show the player" to "Oynatıcıyı göster",
        "Artwork" to "Kapak resmi",
        "Keep controls on screen" to "Kontrolleri ekranda tut",
        "Song options" to "Şarkı seçenekleri",
        "Lyrics position" to "Söz konumu",
        "Lyrics timing" to "Söz zamanlaması",
        "Lyrics source" to "Söz kaynağı",
        "Keep holding to leave immersive mode (or press Back)" to "Sürükleyici moddan çıkmak için basılı tutmaya devam edin (veya Geri'ye basın)",
        "Immersive mode settings" to "Sürükleyici mod ayarları",
        "Immersive mode settings (hold to leave)" to "Sürükleyici mod ayarları (çıkmak için basılı tutun)",
        "Open immersive mode settings" to "Sürükleyici mod ayarlarını aç",
        "Leave immersive mode" to "Sürükleyici moddan çık",
        "Close the player" to "Oynatıcıyı kapat",
        "Color wheel" to "Renk tekeri",
        "Loading" to "Yükleniyor",
        "LIVE" to "CANLI",
        "Clear Smart Downloads" to "Akıllı İndirmeleri Temizle",
        "MORE THAN\\nLISTENING" to "DİNLEMEKTEN\\nDAHA FAZLASI",
        "MORE THAN\nLISTENING" to "DİNLEMEKTEN\nDAHA FAZLASI",
        "YOU LISTENED FOR" to "ŞU KADAR SÜRE DİNLEDİNİZ",
        "YOUR TOP GENRE" to "EN ÇOK DİNLEDİĞİNİZ TÜR",
        "YOUR TOP ARTIST" to "EN ÇOK DİNLEDİĞİNİZ SANATÇI",
        "YOUR TOP ARTISTS" to "EN ÇOK DİNLEDİĞİNİZ SANATÇILAR",
        "YOUR #1 SONG" to "1 NUMARALI ŞARKINIZ",
        "YOUR TOP SONGS" to "EN ÇOK DİNLEDİĞİNİZ ŞARKILAR",
        "WHEN YOU LISTEN" to "NE ZAMAN DİNLİYORSUNUZ",
        "PRIME TIME" to "ZİRVE VAKTİ",
        "NEW TO YOU" to "SİZİN İÇİN YENİ",
        "YOUR LISTENING PERSONALITY" to "DİNLEME KİŞİLİĞİNİZ",
        "YOUR YEAR, SEASON BY SEASON" to "MEVSİM MEVSİM YILINIZ",
        "YOUR BIGGEST MONTH" to "EN ÇOK DİNLEDİĞİNİZ AY",
        "TOP GENRE" to "EN ÇOK DİNLENEN TÜR",
        "Your top songs, artists and genres" to "En çok dinlediğiniz şarkılar, sanatçılar ve türler",
        "Good evening" to "İyi akşamlar",
        "Your year so far" to "Şu ana kadarki yılınız",
        "Quick picks" to "Hızlı seçimler",
        "Made for you" to "Sizin için hazırlandı",
        "Smart Downloads" to "Akıllı İndirmeler",
        "Ready for when you're offline" to "Çevrimdışı olduğunuz zamanlar için hazır",
        "ALBUM" to "ALBÜM",
        "MORE" to "DAHA FAZLA",
        "Explicit" to "Uygunsuz içerik",
        "3 min · Explicit" to "3 dk · Uygunsuz",
        "Use mine" to "Benimkini kullan",
        "Tint strength" to "Renk tonu yoğunluğu",
        "Prism Sample" to "Prism Örneği",
        "Both of you" to "İkiniz de",
        "You" to "Siz",
        "Point at your friend's Blend code" to "Arkadaşınızın Blend koduna yöneltin",
        "On" to "Açık",
        "Off" to "Kapalı",
        "Picked" to "Seçildi",
        "Song's cover" to "Şarkı kapağı",
        "Your pick" to "Sizin seçiminiz",
        "Follows the song that's playing" to "Çalan şarkıyı takip eder",
        "Unpair %s" to "%s eşleşmesini kaldır",
        "Forget %s" to "%s cihazını unut",
        "Move %s up" to "%s öğesini yukarı taşı",
        "Move %s down" to "%s öğesini aşağı taşı",
        "More about %s" to "%s hakkında daha fazla bilgi",
        "Hide details" to "Ayrıntıları gizle",
        "Prism" to "Prism",
        "Every color finds its way" to "Her renk kendi yolunu bulur",
        "Somewhere a light is turning on" to "Bir yerlerde bir ışık yanıyor",
        "We follow the line of the sound" to "Sesin çizgisini takip ediyoruz",
        "Into the bright of the day" to "Günün aydınlığına doğru",
        "Northern Lights" to "Kutup Işıkları",
        "Paper Planes" to "Kağıt Uçaklar",
        "Slow Tide" to "Sakin Gelgit",
        "Home, charts and search follow this country. If Prism Music isn't available where you live, pick a country where it is. Restart Prism for playback to follow too. Songs a label blocks in your country still won't play: that's decided by your connection, not this setting." to "Ana sayfa, listeler ve arama bu ülkeyi takip eder. Prism Music yaşadığınız yerde kullanılamıyorsa, kullanılabildiği bir ülkeyi seçin. Oynatmanın da bunu takip etmesi için Prism'i yeniden başlatın. Bir müzik şirketinin ülkenizde engellediği şarkılar yine de çalınmaz: buna bu ayar değil, bağlantınız karar verir.",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out. " to "Çalma listelerini, kayıtlı albümleri ve sanatçıları Prism'e kopyalayın; böylece oturumu kapatsanız bile bu telefonda kalırlar. ",
        "Prism closed unexpectedly. What went wrong is kept on this phone (only the last few crashes). Sharing it, through GitHub for example, helps fix it. Nothing is sent anywhere unless you share it." to "Prism beklenmedik bir şekilde kapandı. Neyin yanlış gittiği bu telefonda saklanır (yalnızca son birkaç çökme). Örneğin GitHub üzerinden paylaşmak düzeltilmesine yardımcı olur. Siz paylaşmadığınız sürece hiçbir yere hiçbir şey gönderilmez.",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another " to "Bağlantınızı kontrol edin. İş ve okul ağları gibi bazı ağlar Discord'u engeller: başka bir bağlantı deneyin ",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred, " to "Son üç ayda sanatçılarınızdan yeni bir şey yok. Prism, yıldız eklediğiniz sanatçıları birkaç günde bir kontrol eder, ",
        "Tap the line under the player's controls (it says which device is playing) and pick a speaker, TV or receiver. " to "Oynatıcı kontrollerinin altındaki satıra dokunun (hangi cihazın çaldığını gösterir) ve bir hoparlör, TV veya alıcı seçin. ",
        "Last copied " to "Son kopyalanan ",
        "Measured by %s" to "%s ile ölçüldü",
        "Moving to Prism %s" to "Prism %s sürümüne geçiliyor",
        "%d min" to "%d dk",
        "Stops in %d min" to "%d dk içinde duracak",

        "Stats" to "İstatistikler",
        "Remove from liked" to "Beğenilenlerden kaldır",
        "Add to liked" to "Beğenilenlere ekle",
        "Playing next" to "Sıradaki çalınıyor",
        "Added to queue" to "Kuyruğa eklendi",
        "Repeat all" to "Tümünü tekrarla",
        "Repeat one" to "Birini tekrarla",
        "Repeat off" to "Tekrarlama kapalı",
        "Smart Shuffle" to "Akıllı Karıştırma",
        "Shuffle" to "Karıştır",
        "Back to the song" to "Şarkıya geri dön",
        "Music video" to "Müzik videosu",
        "No music video" to "Müzik videosu yok",
        "No music video for this song" to "Bu şarkı için müzik videosu yok",
        "Song end" to "Şarkı sonu",
        "Your best part" to "En sevdiğiniz bölüm",
        "✦ Pick" to "✦ Seç",
        "Drag to move" to "Taşımak için sürükleyin",
        " · Karaoke" to " · Karaoke",
        "Turn Sing off" to "Vokali kapat",
        "Sing" to "Vokal",
        "Show or hide Sing's controls" to "Vokal kontrollerini göster veya gizle",
        "Ready" to "Hazır",
        "Getting ready…" to "Hazırlanıyor…",
        "Original" to "Orijinal",
        "Off: the song plays as it is." to "Kapalı: şarkı olduğu gibi çalar.",
        "Ready: the voice is out." to "Hazır: vokal çıkarıldı.",
        "Getting this song ready…" to "Bu şarkı hazırlanıyor…",
        "Couldn't make the picture to share" to "Paylaşılacak resim oluşturulamadı",
        "Anyone with the link can now open it" to "Artık bağlantıya sahip olan herkes açabilir",
        "Couldn't change who can see it" to "Kimlerin görebileceği değiştirilemedi",
        "Copy link" to "Bağlantıyı kopyala",
        "Send link" to "Bağlantıyı gönder",
        "Track list" to "Parça listesi",
        "Preparing…" to "Hazırlanıyor…",
        "Share image" to "Resmi paylaş",
        "Listen on YouTube Music" to "YouTube Music'te dinleyin",
        "Link copied" to "Bağlantı kopyalandı",
        "Episode" to "Bölüm",
        "Single" to "Tekli",
        "EP" to "EP",
        "Sunset" to "Gün Batımı",
        "Ocean" to "Okyanus",
        "Forest" to "Orman",
        "Ember" to "Kor Ateş",
        "Candy" to "Şeker",
        "Neon" to "Neon",
        "Ice" to "Buz",
        "Gold" to "Altın",
        "Silver" to "Gümüş",
        "Color-blind safe" to "Renk körlüğü dostu",
        "Couldn't open that file" to "Bu dosya açılamadı",
        "That isn't a font file Android can use (pick a .ttf or .otf)" to "Bu, Android'in kullanabileceği bir yazı tipi dosyası değil (.ttf veya .otf seçin)",
        "Couldn't save the font" to "Yazı tipi kaydedilemedi",
        "That font couldn't be used" to "Bu yazı tipi kullanılamadı",
        "Icons & shapes" to "Simgeler ve şekiller",
        "Glass & backgrounds" to "Cam ve arka planlar",
        "Immersive" to "Sürükleyici",
        "Lossless" to "Kayıpsız",
        "Your own" to "Kendinize özel",
        "Search settings" to "Ayarlarda ara",
        "Prism playback diagnostics" to "Prism oynatma tanılamaları",
        "Share diagnostics" to "Tanılamaları paylaş",
        "\"Listening to Prism\" on your profile" to "Profilinizde \"Prism Dinliyor\"",
        "Photo's color" to "Fotoğrafın rengi",
        "Focus blur" to "Odak bulanıklığı",
        "Double tap" to "Çift dokunma",
        "Lyrics style" to "Şarkı sözü stili",
        "Left" to "Sol",
        "Centred" to "Ortalanmış",
        "Small" to "Küçük",
        "Medium" to "Orta",
        "Large" to "Büyük",
        "Both" to "Her ikisi",
        "Elapsed" to "Geçen süre",
        "Time left" to "Kalan süre",
        "None" to "Hiçbiri",
        "Next song" to "Sıradaki şarkı",
        "Previous song" to "Önceki şarkı",
        "Back 10 s" to "10 sn geri",
        "Ahead 10 s" to "10 sn ileri",
        "Seek by side" to "Kenarlardan sarma",
        "Play / pause" to "Oynat / duraklat",
        "Song menu" to "Şarkı menüsü",
        "Stop" to "Durdur",
        "Nothing" to "Hiçbir şey",
        "Under each line" to "Her satırın altında",
        "Instead" to "Yerine",
        "Liked songs" to "Beğenilen şarkılar",
        "Downloads" to "İndirilenler",
        "Local files" to "Yerel dosyalar",
        "Replay" to "Replay",
        "Podcasts" to "Podcast'ler",
        "Listen together" to "Birlikte dinleyin",
        "Blend" to "Blend",
        "Recognized" to "Tanınanlar",
        "New playlist" to "Yeni çalma listesi",
        "Import playlists" to "Çalma listelerini içe aktar",
        "Video ID" to "Video Kimliği",
        "Source" to "Kaynak",
        "Stream" to "Akış",
        "Codec" to "Kodek",
        "Bitrate" to "Bit hızı",
        "Format" to "Biçim",
        "Output" to "Çıkış",
        "Device" to "Cihaz",
        "Spatializer" to "Uzamsallaştırıcı",
        "Loudness" to "Ses yüksekliği",
        "Effects" to "Efektler",
        "Buffer" to "Arabellek",
        "Session" to "Oturum",
        "The split light" to "Kırılan ışık",
        "Thinner" to "Daha ince",
        "As the style" to "Stile göre",
        "Thicker" to "Daha kalın",
        "Still" to "Hareketsiz",
        "Slow drift" to "Yavaş süzülme",
        "Drifting" to "Süzülüyor",
        "Soft" to "Yumuşak",
        "As the cover" to "Kapak gibi",
        "Rich" to "Zengin",
        "Swipe left" to "Sola kaydır",
        "Swipe right" to "Sağa kaydır",
        "Swipe up" to "Yukarı kaydır",
        "Pull down" to "Aşağı çek",
        "Long press" to "Uzun basma",
        "The mark" to "İşaret",
        "Split light" to "Kırılan ışık",
        "Orbits" to "Yörüngeler",
        "Color wheel" to "Renk çarkı",
        "Waves" to "Dalgalar",
        "Night sky" to "Gece gökyüzü",
        "Thin" to "İnce",
        "Regular" to "Normal",
        "Bold" to "Kalın",
        "Quiet" to "Sakin",
        "Plain glass, one hairline of split light" to "Sade cam, tek bir ince kırılan ışık çizgisi",
        "Wash" to "Yıkama",
        "A faint wash of color and month bars" to "Hafif bir renk geçişi ve ay çubukları",
        "Spectrum frame" to "Spektrum çerçevesi",
        "Glass ringed in split light, the time in color" to "Kırılan ışıkla çevrelenmiş cam, renkli süre",
        "Prism stripe" to "Prism şeridi",
        "A band of refracted light down one side" to "Bir kenar boyunca kırılan ışık bandı",
        "Spectrum bars" to "Spektrum çubukları",
        "Your months as big bars, red to violet" to "Kırmızıdan menekşeye büyük çubuklar olarak aylarınız",
        "Listened" to "Dinlendi",
        "Top artist" to "En çok dinlenen sanatçı",
        "Top song" to "En çok dinlenen şarkı",
        "Top artists" to "En çok dinlenen sanatçılar",
        "Top songs" to "En çok dinlenen şarkılar",
        "play" to "çalma",
        "plays" to "çalma",
        "day" to "gün",
        "days" to "gün",
        "PRISM REWIND" to "PRISM REWIND",
        "PRISM REPLAY" to "PRISM REPLAY",
        "the 30 days before" to "önceki 30 gün",
        "of music" to "müzik",
        "artist" to "sanatçı",
        "artists" to "sanatçı",
        "Favorite day" to "En sevilen gün",
        "Biggest day" to "En yoğun gün",
        "Longest streak" to "En uzun seri",
        "NEW ARTIST" to "YENİ SANATÇI",
        "NEW ARTISTS" to "YENİ SANATÇILAR",
        "Save Top 100" to "İlk 100'ü kaydet",
        "Save playlist" to "Çalma listesini kaydet",
        "Search failed" to "Arama başarısız oldu",
        "Every color finds its way" to "Her renk kendi yolunu bulur",
        "Northern Lights" to "Kutup Işıkları",
        "Prism Sample" to "Prism Örneği",
        "Tap anything outlined to change it" to "Değiştirmek için çerçevelenen herhangi bir yere dokunun",
        "That's your own code" to "Bu kendi kodunuz",
        "That isn't a Prism Blend code" to "Bu bir Prism Blend kodu değil",
        "That isn't a Prism Look" to "Bu bir Prism Look değil",
        "That file isn't a Prism Look" to "Bu dosya bir Prism Look değil",
        "Couldn't make the playlist" to "Çalma listesi oluşturulamadı",
        "Couldn't use that picture" to "Bu resim kullanılamadı",
        "You're offline. Check your connection and try again." to "Çevrimdışısınız. Bağlantınızı kontrol edip tekrar deneyin.",
        "Prism Music took too long to answer. Try again." to "Prism Music'in yanıt vermesi çok uzun sürdü. Tekrar deneyin.",
        "Couldn't connect securely. On public Wi-Fi or a VPN? Try another network." to "Güvenli bağlantı kurulamadı. Ortak Wi-Fi veya VPN mi kullanıyorsunuz? Başka bir ağ deneyin.",
        "YouTube is limiting requests right now. Try again in a few minutes." to "YouTube şu anda istekleri sınırlandırıyor. Birkaç dakika sonra tekrar deneyin.",
        "Prism Music is having trouble right now. Try again in a bit." to "Prism Music şu anda sorun yaşıyor. Birazdan tekrar deneyin.",
        "Something went wrong" to "Bir şeyler ters gitti",
        "tap to share its details" to "ayrıntılarını paylaşmak için dokunun",
        "Your own light" to "Kendinize özel ışık",
        "White light" to "Beyaz ışık",
        "Black light" to "Siyah ışık",
        "Floating bar" to "Kayan çubuk",
        "Docked bar" to "Sabit çubuk",
        "Minimal bar" to "Minimal çubuk",
        "High quality" to "Yüksek kalite",
        "Normal quality" to "Normal kalite",
        "Low quality" to "Düşük kalite",
        "Grid view" to "Izgara görünümü",
        "List view" to "Liste görünümü",
        "hours" to "saat",
        "minutes" to "dakika",
        "That Look code couldn't be read" to "Bu Görünüm kodu okunamadı",
        "That file isn't a Prism Look" to "Bu dosya bir Prism Görünümü değil",
        "That isn't a YouTube or YouTube Music link" to "Bu bir YouTube veya YouTube Music bağlantısı değil",
        "Picture-in-picture is off for Prism in Android's settings" to "Android ayarlarında Prism için Pencere İçinde Pencere kapalı",
        "Couldn't save the queue" to "Kuyruk kaydedilemedi",
        "Saved to your library" to "Kitaplığınıza kaydedildi",
        "Removed from your library" to "Kitaplığınızdan kaldırıldı",
        "Added to your library" to "Kitaplığınıza eklendi",
        "Couldn't update your library" to "Kitaplığınız güncellenemedi",
        "Couldn't start the radio" to "Radyo başlatılamadı",
        "Its plays count towards your recommendations again" to "Çalmaları yeniden önerilerinizi şekillendirecek",
        "Its plays won't shape your recommendations" to "Çalmaları önerilerinizi etkilemeyecek",
        "Saved" to "Kaydedildi",
        "Couldn't use that picture" to "Bu resim kullanılamadı",
        "Backed up" to "Yedeklendi",
        "Account added. Pick its channel under Switch account" to "Hesap eklendi. Hesap değiştir altından kanalını seçin",
        "That isn't a Prism Look" to "Bu bir Prism Görünümü değil",
        "Couldn't download that Look" to "Bu Görünüm indirilemedi",
        "Couldn't make the file" to "Dosya oluşturulamadı",
        "Couldn't share your Rewind" to "Rewind'ınız paylaşılamadı",
        "Couldn't share your Replay" to "Replay'iniz paylaşılamadı",
        "Saved as a private playlist" to "Gizli bir çalma listesi olarak kaydedildi",
        "Couldn't save the Blend" to "Blend kaydedilemedi",
        "Couldn't reach YouTube Music. Try again." to "YouTube Music'e ulaşılamadı. Tekrar deneyin.",
        "Couldn't create playlist" to "Çalma listesi oluşturulamadı",
        "Couldn't make the playlist" to "Çalma listesi yapılamadı",
        "That's your own code" to "Bu sizin kendi kodunuz",
        "That isn't a Prism Blend code" to "Bu bir Prism Blend kodu değil",
        "The Loyalist" to "Sadık Dinleyici",
        "The Explorer" to "Kâşif",
        "The Replayer" to "Tekrarcı",
        "The Night Owl" to "Gece Kuşu",
        "The Early Riser" to "Erkenci",
        "The Marathoner" to "Maratoncu",
        "The Shapeshifter" to "Şekil Değiştiren",
        "The Listener" to "Dinleyici",
        "Every play counted." to "Her çalma değerliydi.",
        "No single sound could hold you. You moved between genres all the time." to "Tek bir tını sizi tutamadı. Sürekli türler arasında gezindiniz.",
        "When a song hits, you run it back." to "Bir şarkı sizi yakaladığında, tekrar çalarsınız.",
        "Songs you sang" to "Söylediğiniz şarkılar",
        "Songs in DJ sets" to "DJ setlerindeki şarkılar",
        "Smart Shuffle finds played" to "Çalınan Akıllı Karışık keşifleri",
        "Songs recognized" to "Tanınan şarkılar",
        "Blend made" to "Blend oluşturuldu",
        "Blends made" to "Blend oluşturuldu",
        "Release Radar finds" to "Yeni Çıkanlar Radarı keşifleri",
        "Listening" to "Dinleme süresi",
        "Different songs" to "Farklı şarkı",
        "Watch again" to "Tekrar izle",
        "Longest streak" to "En uzun seri",
        "Biggest day" to "En yoğun gün",
        "NEW ARTIST" to "YENİ SANATÇI",
        "NEW ARTISTS" to "YENİ SANATÇILAR",
        "A bit of everything" to "Her şeyden biraz",
        "PRISM REWIND" to "PRISM REWIND",
        "PRISM REPLAY" to "PRISM REPLAY",
        "REWIND" to "REWIND",
        "REPLAY" to "REPLAY",
        "Watch your Rewind" to "Rewind'ınızı izleyin",
        "Watch your Replay" to "Replay'inizi izleyin",
        "You're on your own mix of settings" to "Kendi özel ayar karışımınızdasınız",
        "A Look keeps colors, type, icons, backgrounds, the player and lyrics' look together. Pick one and everything changes at once; Undo puts it back." to "Görünüm; renkleri, yazı tipini, simgeleri, arka planları, oynatıcıyı ve şarkı sözü tarzını bir arada tutar. Birini seçtiğinizde her şey aynı anda değişir; Geri Al eski haline getirir.",
        "Looks you save show here. Save one above, or get one from a friend below." to "Kaydettiğiniz Görünümler burada görünür. Yukarıdan bir tane kaydedin veya aşağıdan bir arkadaşınızdan alın.",
        "You see a Look first, and choose to try it or keep it." to "Bir Görünümü önce görür, ardından denemeyi veya saklamayı seçersiniz.",
        "Scan a Look's QR code" to "Bir Görünümün QR kodunu tara",
        "From a friend's Prism" to "Bir arkadaşınızın Prism'inden",
        "Paste a Look code" to "Bir Görünüm kodu yapıştır",
        "A code someone sent you" to "Birinin size gönderdiği bir kod",
        "Open a Look file" to "Bir Görünüm dosyası aç",
        "A .prismlook file, with its photos and font" to "Fotoğrafları ve yazı tipiyle birlikte bir .prismlook dosyası",
        "Couldn't add it to the playlist" to "Çalma listesine eklenemedi",
        "Link" to "Bağlantı",
        "MORE" to "DAHA FAZLA",
        "Artist" to "Sanatçı",

        // Liked playlist and files
        "The playlist stays, but won't change any more" to "Çalma listesi kalır, ancak artık değişmeyecektir",
        "Lyrics saved into the file" to "Şarkı sözleri dosyaya kaydedildi",
        "Couldn't save the lyrics into the files" to "Şarkı sözleri dosyalara kaydedilemedi",
        "Nothing was changed" to "Hiçbir şey değiştirilmedi",
        "Prism needs permission to change your music files" to "Prism müzik dosyalarınızı değiştirmek için izne ihtiyaç duyuyor",
        "No FLAC or MP3 files to save lyrics into" to "Şarkı sözlerini kaydedecek FLAC veya MP3 dosyası yok",
        "No lyrics found for this song" to "Bu şarkı için şarkı sözü bulunamadı",
        "No lyrics found for these songs" to "Bu şarkılar için şarkı sözü bulunamadı",
        "Find a playlist" to "Bir çalma listesi bulun",

        // Account progress
        "Starting…" to "Başlatılıyor…",
        "Albums and artists" to "Albümler ve sanatçılar",

        // Replay Cards styles & notes
        "Three numbers side by side" to "Yan yana üç sayı",
        "The year so far as a ring of split light" to "Yılın şu ana kadarki kısmı ayrık ışık halkası olarak",
        "Your top song's cover sets the color" to "Rengi en çok dinlediğiniz şarkının kapağı belirler",
        "A faint wash of color and month bars" to "Hafif bir renk geçişi ve ay çubukları",
        "Glass ringed in split light, the time in color" to "Ayrık ışıkla çevrelenmiş cam, renkli süre",
        "A band of refracted light down one side" to "Bir kenarı boyunca kırılmış ışık bandı",
        "Your months as big bars, red to violet" to "Kırmızıdan mora büyük çubuklar halinde aylarınız",
        "Full color, like a Rewind slide" to "Rewind slaytı gibi tam renkli",
        "Plain glass, one hairline of split light" to "Düz cam, altta tek bir ayrık ışık çizgisi",
        "<1 min" to "<1 dk",

        // Replay Story
        "Your year in music." to "Müzikteki yılınız.",
        "Your month in music." to "Müzikteki ayınız.",
        "Your last 30 days in music." to "Müzikteki son 30 gününüz.",
        "Everything you've played, in one story." to "Çaldığınız her şey tek bir hikayede.",
        "Couldn't share this slide" to "Bu slayt paylaşılamadı",
        "Unmute" to "Sesi aç",

        // Search & local music
        "Allow access to your music files in Library → Local files to search them here too." to "Bunları burada da aramak için Kitaplık → Yerel dosyalar bölümünden müzik dosyalarınıza erişim izni verin.",
        "Your music files and downloads are searched by title, artist and album." to "Müzik dosyalarınız ve indirmeleriniz başlık, sanatçı ve albüme göre aranır.",
        "● Live" to "● Canlı",
        "● LIVE" to "● CANLI",
        "VIDEO" to "VİDEO",

        // Settings Screen
        "\"Continue …\" under the greeting" to "Karşılamanın altında \"Devam et …\"",
        "Making your mixes…" to "Karışımlarınız hazırlanıyor…",
        "Prism Account · on this phone" to "Prism Hesabı · bu telefonda",
        "signed in" to "giriş yapıldı",
        "Signed in" to "Giriş yapıldı",
        "Turn on Crossfade songs and turn off Automatic length first" to "Önce Şarkılar arası çapraz geçişi açın ve Otomatik süreyi kapatın",
        "Lossless playback always plays the best audio; turn it off to pick a quality" to "Kayıpsız oynatma her zaman en iyi sesi çalar; bir kalite seçmek için kapatın",
        "Pick a Romanize lyrics option first" to "Önce bir Şarkı sözlerini latinleştir seçeneği seçin",

        // Settings summaries
        "Browser remote on" to "Tarayıcı kumandası açık",
        "Available for handoff" to "Aktarma için uygun",
        "Accent from the cover" to "Kapak resminden vurgu",
        "Accent from the wallpaper" to "Duvar kağıdından vurgu",
        "Showing what you play on your profile" to "Profilinizde ne çaldığınız gösteriliyor",
        "Show what you're playing on your profile" to "Profilinizde ne çaldığınızı gösterin",
        "Icon pack and weight, app icon, corners" to "Simge paketi ve kalınlığı, uygulama simgesi, köşeler",
        "Save, switch and share whole looks; day and night" to "Görünümleri kaydedin, değiştirin ve paylaşın; gündüz ve gece",
        "Sections, order and styles" to "Bölümler, sıralama ve stiller",

        // Settings choices
        "Bands" to "Bantlar",
        "Smooth" to "Pürüzsüz",
        "Stripes of each color, like the logo" to "Logo gibi her renkten çizgiler",
        "Each color blends into the next" to "Her renk bir sonrakine yumuşakça karışır",
        "Exactly as picked" to "Aynen seçildiği gibi",
        "Softened" to "Yumuşatılmış",
        "Your color as it is, only changed where text wouldn't read" to "Renginiz olduğu gibi, yalnızca metnin okunamadığı yerlerde değiştirilir",
        "Lighter on dark pages, deeper on light ones" to "Koyu sayfalarda daha açık, açık sayfalarda daha derin",
        "Picture's color" to "Resmin rengi",
        "Each page and menu takes a color from its picture instead of yours (black-and-white ones keep yours)" to "Her sayfa ve menü sizinki yerine kendi resminden bir renk alır (siyah-beyaz olanlar sizinkini korur)",
        "Your accent on every page and menu" to "Her sayfada ve menüde sizin vurgu renginiz",
        "Playlists first" to "Önce çalma listeleri",
        "Tiles first" to "Önce kutucuklar",
        "Your playlists at the top, the tiles after them" to "Çalma listeleriniz üstte, kutucuklar altlarında",
        "The tiles at the top, your playlists below" to "Kutucuklar üstte, çalma listeleriniz altta",
        "The player's own background" to "Oynatıcının kendi arka planı",
        "Filling the screen, as now" to "Şu anki gibi ekranı kaplayarak",
        "Top color" to "Üst renk",
        "Bottom color" to "Alt renk",
        "Animated cover: songs without a moving cover show the cover blurred." to "Hareketli kapak: hareketli kapağı olmayan şarkılar kapağı bulanık gösterir.",

        // Settings notes
        "The line on the cover art, lighting up word by word, and as the title (unless the title's kept)" to "Kapak resmi üzerindeki satır, kelime kelime ışıldayarak ve başlık olarak (başlık korunmadığı sürece)",
        "The current and next line on the cover art, and as the title (unless the title's kept)" to "Kapak resmi üzerindeki mevcut ve sonraki satır ve başlık olarak (başlık korunmadığı sürece)",
        "The current line in place of the song title; the cover stays as it is" to "Şarkı başlığı yerine mevcut satır; kapak olduğu gibi kalır",
        "Apple Music's lyrics · word by word" to "Apple Music sözleri · kelime kelime",
        "Apple Music, Musixmatch and Spotify's · word by word" to "Apple Music, Musixmatch ve Spotify sözleri · kelime kelime",
        "QQ Music · word by word, the most Chinese songs" to "QQ Music · kelime kelime, en çok Çince şarkı",
        "Open lyrics database · line by line" to "Açık şarkı sözü veritabanı · satır satır",
        "NetEase Cloud Music · word by word" to "NetEase Cloud Music · kelime kelime",
        "KuGou · word by word, many Asian songs" to "KuGou · kelime kelime, birçok Asya şarkısı",
        "Lyrics listeners submit · few songs so far" to "Dinleyicilerin gönderdiği şarkı sözleri · şimdilik az şarkı",
        "LyricFind · lines or plain" to "LyricFind · satırlar veya düz metin",
        "Plain text · also fills in starred-out words" to "Düz metin · sansürlenmiş kelimeleri de doldurur",
        "The cover, then everything under it" to "Kapak, ardından altındaki her şey",
        "A big cover; tap it for the controls" to "Büyük bir kapak; kontroller için üzerine dokunun",
        "Opens on the lyrics, a small cover beside the title" to "Şarkı sözleriyle açılır, başlığın yanında küçük bir kapak",
        "The title and play; gestures do the rest" to "Başlık ve oynat; gerisini hareketler halleder",
        "The cover as a record's label, turning as it plays" to "Çalarken dönen bir plak etiketi olarak kapak",
        "The cover on a tape whose reels turn as it plays" to "Çalarken makaraları dönen bir kaset üzerindeki kapak",
        "Nothing moves with the music" to "Müzikle birlikte hiçbir şey hareket etmez",
        "Along the bottom of the player" to "Oynatıcının altı boyunca",
        "A soft wave behind the title" to "Başlığın arkasında yumuşak bir dalga",
        "Around the cover" to "Kapağın etrafında",
        "The progress bar pulses with the beat" to "İlerleme çubuğu ritimle atar",
        "The background breathes with the music" to "Arka plan müzikle nefes alır",
        "Each word grows bolder as it's sung" to "Her kelime söylendikçe daha kalınlaşır",
        "Color fills the words as they're sung" to "Kelimeler söylendikçe içleri renkle dolar",
        "Big bold lines on the cover's color" to "Kapağın renginde büyük kalın satırlar",
        "The sung words glow" to "Söylenen kelimeler parlar",
        "Words appear as they're sung" to "Kelimeler söylendikçe görünür",
        "No animation: the line simply brightens" to "Animasyon yok: satır sadece aydınlanır",
        "Nothing but the words" to "Yalnızca sözler",
        "let me reorder or hide them" to "yeniden sıralamama veya gizlememe izin ver",
        "Mixes from your music" to "Müziğinizden karışımlar",
        "Shortcut tiles" to "Kısayol kutucukları",
        "New from your artists" to "Sanatçılarınızdan yeni çıkanlar",
        "Replay teaser" to "Replay tanıtımı",
        "Speed dial" to "Hızlı arama",
        "Repeat rewind" to "Sürekli dinlenenler",
        "Forgotten favourites" to "Unutulan favoriler",
        "Mixed for you" to "Sizin için karışık",

        // Playback buttons
        "Shuffle off" to "Karışık çalma kapalı",
        "Hide lyrics" to "Sözleri gizle",
        "Show lyrics" to "Sözleri göster",
        "Back 10 seconds" to "10 saniye geri",
        "Ahead 30 seconds" to "30 saniye ileri",

        // Notifications
        "Your year in music: your top songs, artists and more, made on your phone." to "Müzikteki yılınız: en çok dinlediğiniz şarkılar, sanatçılar ve daha fazlası telefonunuzda hazırlandı.",
        "Pairing codes when another device wants to play here" to "Başka bir cihaz burada çalmak istediğinde eşleme kodları",
        "New music from artists you follow" to "Takip ettiğiniz sanatçılardan yeni müzikler",
        "When your year in music is ready" to "Müzikteki yılınız hazır olduğunda",
        "Songs recognized after you were offline" to "Çevrimdışıyken tanınan şarkılar",

        "Appears On" to "Şurada yer aldı",
        "Artist Playlists" to "Sanatçı Çalma Listeleri",
        "Best part" to "En iyi kısım",
        "Your best part" to "Sizin en iyi kısmınız",
        "Copied" to "Kopyalandı",
        "Copy a friend's code first" to "Önce bir arkadaşınızın kodunu kopyalayın",
        "Downloading lyrics again" to "Şarkı sözleri yeniden indiriliyor",
        "Each group's ⓘ says everything it changes in the app, and each choice shows what it looks like. Tap one and the preview above changes at once. Reset colors, at the bottom, puts everything back." to "Her grubun ⓘ simgesi uygulamada değiştirdiği her şeyi açıklar ve her seçenek nasıl göründüğünü gösterir. Birine dokunduğunuzda yukarıdaki önizleme anında değişir. En alttaki Renkleri sıfırla seçeneği her şeyi eski haline getirir.",
        "Got it — Prism will steer clear of this song" to "Anlaşıldı — Prism bu şarkıyı çalmaktan kaçınacak",
        "Livestreams" to "Canlı Yayınlar",
        "Music Videos" to "Müzik Videoları",
        "Output device" to "Çıkış cihazı",
        "Prism is free software under the GNU General Public License, version 3 or later. You can use, study, share and change it; copies and changed versions have to stay under the same license, with their source." to "Prism, GNU Genel Kamu Lisansı sürüm 3 veya üstü kapsamındaki özgür bir yazılımdır. Kullanabilir, inceleyebilir, paylaşabilir ve değiştirebilirsiniz; kopyalar ve değiştirilmiş sürümler kaynak kodlarıyla birlikte aynı lisans altında kalmalıdır.",
        "Saving animated covers for this album" to "Bu albüm için animasyonlu kapaklar kaydediliyor",
        "Shuffle & repeat" to "Karışık ve tekrar",
        "Similar Artists" to "Benzer Sanatçılar",
        "Singles & EPs" to "Tekliler ve EP'ler",
        "Song / Video" to "Şarkı / Video",
        "Stream quality" to "Yayın kalitesi",
        "Top Songs" to "En İyi Şarkılar",
        "Type a name first" to "Önce bir ad yazın",
        "When the new Prism opens, tap \"Restore from a backup\" and pick the backup." to "Yeni Prism açıldığında \"Yedekten geri yükle\"ye dokunun ve yedeği seçin.",
        "You're offline, and this song isn't downloaded" to "Çevrimdışısınız ve bu şarkı indirilmemiş",
        "Your Prism Account is ready" to "Prism Hesabınız hazır",
        "Your Prism Account" to "Prism Hesabınız",
        "Your account" to "Hesabınız",
        "Your picture" to "Resminiz",
        "Your account isn't changed; copy again any time to bring Prism's copies up to date." to "Hesabınız değişmez; Prism kopyalarını güncel tutmak için istediğiniz zaman yeniden kopyalayın.",
        "Your color here is the one picked for the other lines (Colors, above)." to "Buradaki renginiz diğer satırlar için seçilen renktir (yukarıdaki Renkler).",
        "A photo" to "Bir fotoğraf",
        "A .prismlook file, with its photos and font" to "Fotoğrafları ve yazı tipiyle birlikte bir .prismlook dosyası",
        "Open a Look file" to "Bir Görünüm dosyası aç",
        "Its brightest color" to "En parlak rengi",
        "A softer, dusty one" to "Daha yumuşak, pastel bir renk",
        "The color it has most of" to "En çok bulunan renk",
        "Which of this cover's colors becomes the accent." to "Bu kapağın hangi renginin vurgu rengi olacağı.",
        "Which of the cover's colors becomes the accent. Play a song to see its own colors here." to "Kapağın hangi renginin vurgu rengi olacağı. Kendi renklerini burada görmek için bir şarkı çalın.",
        "Waiting for Wi-Fi" to "Kablosuz ağ bekleniyor",
        "Queued" to "Sırada",
        "Paused" to "Duraklatıldı",
        "Restarting" to "Yeniden başlatılıyor",
        "Starting" to "Başlatılıyor",
        "Prism also tries them again by itself when the phone is back online." to "Telefon tekrar çevrimiçi olduğunda Prism bunları kendiliğinden yeniden dener.",
        "Playing here" to "Burada çalınıyor",
        "★ Favorite" to "★ Favori",
        "● Live now" to "● Şu anda canlı",
        "What's playing" to "Şu an çalan",
        "Your wallpaper" to "Duvar kağıdınız",
        "today" to "bugün",
        "yesterday" to "dün",
        "never" to "asla",
        "Album, playlist and artist pages use their picture's color instead (Artist & album pages, below)" to "Albüm, çalma listesi ve sanatçı sayfaları bunun yerine kendi resimlerinin rengini kullanır (aşağıdaki Sanatçı ve albüm sayfaları)",
        "From artists you listen to" to "Dinlediğiniz sanatçılardan",
        "Not in my library" to "Kitaplığımda değil",
        "MORE MUSIC" to "DAHA FAZLA MÜZİK",
        "LESS MUSIC" to "DAHA AZ MÜZİK",
        "Open in Prism" to "Prism'de aç",
        "See in Prism" to "Prism'de gör",
        "Behind the player, darkened so its white text reads" to "Oynatıcının arkasında, beyaz metinlerin okunabilmesi için karartılmış",
        "Color from what's playing, ready-made designs or your own photo" to "Çalan müzikten renk, hazır tasarımlar veya kendi fotoğrafınız",
        "Make my account" to "Hesabımı oluştur",
        "Copy again" to "Yeniden kopyala",
        "Copy into Prism" to "Prism'e kopyala",
        "Import playlist" to "Çalma listesini içe aktar",
        "Hide" to "Gizle",
        "Show" to "Göster",
        "The next song" to "Sıradaki şarkı",
        "The cover" to "Kapak",
        "Unknown album" to "Bilinmeyen albüm",
        "Not a Blend code" to "Bir Blend kodu değil",
        "Change the cover" to "Kapağı değiştir",
        "Couldn't make the picture" to "Resim oluşturulamadı",
        "Go back to it as saved" to "Kaydedilen haline geri dön",
        "Use this Look" to "Bu Görünümü kullan",
        "Save a copy to change" to "Değiştirmek için bir kopyasını kaydet",
        "Duplicate" to "Çoğalt",
        "Saved to your Looks" to "Görünümlerinize kaydedildi",
        "Censored" to "Sansürlü",
        "Better romaji for Japanese: tap to download the reading data (13 MB)" to "Japonca için daha iyi romaji: okuma verilerini indirmek için dokunun (13 MB)",
        "Couldn't download the Japanese kanji readings. Tap to try again" to "Japonca kanji okuma verileri indirilemedi. Tekrar denemek için dokunun",
        "That message didn't hold a Prism Blend code." to "Bu mesaj bir Prism Blend kodu içermiyordu.",
        "Prism makes a playlist from your tastes together. Your code (what's under \"What you share\") goes straight back to their phone over Wi-Fi, so you both have it." to "Prism, zevklerinizi birleştirerek bir çalma listesi oluşturur. Kodunuz (\"Neler paylaşıyorsunuz\" altındaki), her ikinizde de olması için Wi-Fi üzerinden doğrudan onların telefonuna geri gider.",
        "Prism makes a playlist from your tastes together, on this phone. Only your code (what's under \"What you share\") goes to them, if you send it back." to "Prism, bu telefonda zevklerinizi birleştirerek bir çalma listesi oluşturur. Yalnızca kodunuz (\"Neler paylaşıyorsunuz\" altındaki), geri gönderirseniz onlara iletilir.",
        "Share your Blend" to "Blend'inizi paylaşın",
        "Change what %s does" to "%s eylemini değiştir",
        "Couldn't get that correction: %s" to "Düzeltme alınamadı: %s",
        "Couldn't load AutoEq's list: %s" to "AutoEq listesi yüklenemedi: %s",
        "Drag %s" to "%s öğesini sürükleyin",
        "Keep Prism-%s.apk next to it" to "Prism-%s.apk dosyasını yanında saklayın",
        "Matched automatically — the song starts %s into the video, so the lyrics wait for it." to "Otomatik eşlendi — şarkı videonun %s sonrasında başlıyor, şarkı sözleri bunu bekliyor.",
        "Matched automatically — the video skips the song's first %s." to "Otomatik eşlendi — video şarkının ilk %s kısmını atlıyor.",
        "No headphones match \"%s\". AutoEq only has headphones someone has measured; you can also import a ParametricEQ file." to "\"%s\" ile eşleşen kulaklık yok. AutoEq'da yalnızca ölçümü yapılmış kulaklıklar bulunur; ayrıca bir ParametricEQ dosyası da içe aktarabilirsiniz.",
        "Options for %s" to "%s için seçenekler",
        "Prism %s is redrawn from the ground up and does more than ever. Here's a minute's tour: swipe, or tap Start." to "Prism %s baştan aşağı yeniden tasarlandı ve her zamankinden daha fazlasını yapıyor. İşte bir dakikalık tur: kaydırın veya Başlat'a dokunun.",
        "Show the %s section to see these on Home" to "Bunları Ana Sayfa'da görmek için %s bölümünü gösterin",
        "Then open Prism-%s.apk from your files" to "Ardından dosyalarınızdan Prism-%s.apk dosyasını açın",
        "What's new in Prism %s" to "Prism %s sürümündeki yenilikler",
        "Plain" to "Düz",
        "Accent tint" to "Vurgu tonu",
        "Grey, the frost in greys too" to "Gri, buzlu cam da gri tonlarında",
        "The cover's colors in the frost; a hint of the accent on plain pages" to "Buzlu camda kapağın renkleri; düz sayfalarda vurgunun hafif bir tonu",
        "Grey: the frost loses its color too" to "Gri: buzlu cam da rengini kaybeder",
        "The accent's color, frost included" to "Buzlu cam dahil vurgu rengi",
        "The accent's color, frost included (changes with each song)" to "Buzlu cam dahil vurgu rengi (her şarkıda değişir)",
        "A color you pick, frost included" to "Buzlu cam dahil seçtiğiniz bir renk",
        "Very easy to read" to "Okunması çok kolay",
        "Easy to read" to "Okunması kolay",
        "OK for big text" to "Büyük metin için uygun",
        "Hard to read" to "Okunması zor",
        "Text on it" to "Üzerindeki metin",
        "On dark" to "Koyu temada",
        "On light" to "Açık temada",
        "Wheel" to "Renk tekeri",
        "Values" to "Değerler",
        "Remove from saved colors" to "Kaydedilen renklerden kaldır",
        "Save this color" to "Bu rengi kaydet",
        "Top" to "Üst",
        "Bottom" to "Alt",
        "The song's cover's color" to "Şarkı kapağının rengi",
        "Your phone wallpaper's colors" to "Telefon duvar kağıdınızın renkleri",
        "One color you choose" to "Seçtiğiniz tek bir renk",
        "Soft grey text" to "Yumuşak gri metin",
        "Firmer" to "Daha belirgin",
        "Strongest, easiest to read" to "En güçlü, okunması en kolay",
        "Your accent" to "Sizin vurgunuz",
        "Like songs from the player and they'll show up here." to "Oynatıcıdan şarkıları beğenin, burada görünecekler.",
        "Add songs from any song's menu (⋯ or a long press) → Add to playlist." to "Herhangi bir şarkının menüsünden (⋯ veya uzun basarak) → Çalma listesine ekle seçeneğini kullanın.",
        "Songs you add will show up here." to "Eklediğiniz şarkılar burada görünecek.",
        "Download all" to "Tümünü indir",
        "Downloaded" to "İndirildi",
        "Downloading" to "İndiriliyor",
        "In your library" to "Kitaplığınızda",
        "Add to library" to "Kitaplığa ekle",
        "Other versions" to "Diğer sürümler",
        "Back in my taste" to "Zevkime geri dahil et",
        "Leave out of my taste" to "Zevkimden hariç tut",
        "It counts towards your recommendations again" to "Yeniden önerilerinizi şekillendirecek",
        "Its plays count towards your recommendations again" to "Çalmaları yeniden önerilerinizi şekillendirecek",
        "Its plays won't shape your recommendations" to "Çalmaları önerilerinizi şekillendirmeyecek",
        "Got it — Prism will steer clear of this song" to "Anlaşıldı — Prism bu şarkıdan uzak duracak",
        "Get missing lyrics" to "Eksik şarkı sözlerini al",
        "Delete all downloads" to "Tüm indirmeleri sil",
        "loading more…" to "daha fazlası yükleniyor…",
        " · loading more…" to " · daha fazlası yükleniyor…",
        "Change picture" to "Resmi değiştir",
        "Choose a photo" to "Bir fotoğraf seçin",
        "From your phone's photos" to "Telefonunuzun fotoğraflarından",
        "Or a cover from this playlist" to "Veya bu çalma listesinden bir kapak",
        "Use the original picture" to "Orijinal resmi kullan",
        "The picture shows everywhere in Prism, including Android Auto. YouTube Music keeps its own." to "Resim, Android Auto dahil olmak üzere Prism'in her yerinde gösterilir. YouTube Music kendininkini korur.",
        "Who can open it" to "Kimler açabilir",
        "Only you can see it." to "Yalnızca siz görebilirsiniz.",
        "Anyone with the link can open it; it doesn't show up in search." to "Bağlantıya sahip olan herkes açabilir; aramada görünmez.",
        "Anyone can find it and open it." to "Herkes bulabilir ve açabilir.",
        "Anyone with the link can open it, so it's easy to share." to "Bağlantıya sahip olan herkes açabilir, paylaşması kolaydır.",
        "Anyone can find it." to "Herkes bulabilir.",
        "Kept on this phone (and in your backups), no account needed. Sign in to YouTube Music for playlists on your account." to "Bu telefonda (ve yedeklerinizde) tutulur, hesap gerekmez. Hesabınızdaki çalma listeleri için YouTube Music'te oturum açın.",
        "Turn off Wi-Fi only" to "Yalnızca kablosuz ağ kuralını kapat",
        "See which" to "Hangileri olduğunu gör",
        "Try again" to "Tekrar dene",
        "Try all again" to "Tümünü tekrar dene",
        "Remove all" to "Tümünü kaldır",
        "Prism also tries them again by itself when the phone is back online." to "Prism, telefon tekrar çevrimiçi olduğunda bunları kendiliğinden yeniden dener.",
        "Failed before Prism kept the reason" to "Prism sebebi kaydetmeye başlamadan önce başarısız oldu",
        "Text size" to "Metin boyutu",
        "Line spacing" to "Satır aralığı",
        "Tight" to "Sıkı",
        "As usual" to "Her zamanki gibi",
        "Airy" to "Geniş",
        "Other lines" to "Diğer satırlar",
        "Faint" to "Çok soluk",
        "Dimmed" to "Soluk",
        "Bright" to "Parlak",
        "Background vocals" to "Geri vokaller",
        "Progress bar color" to "İlerleme çubuğu rengi",
        "The split light" to "Ayrık ışık",
        "Your accent color" to "Vurgu renginiz",
        "Plain white" to "Düz beyaz",
        "The song's cover's color" to "Şarkı kapağının rengi",
        "The player's own background" to "Oynatıcının kendi arka planı",
        "Filling the screen, as now" to "Şimdiki gibi, tüm ekranı kaplayarak",
        "Top color" to "Üst renk",
        "Bottom color" to "Alt renk",
        "Your color" to "Kendi renginiz",
        "From the cover" to "Kapak renginden",
        "Download video" to "Videoyu indir",
        "Remove downloaded video" to "İndirilen videoyu kaldır",
        "Saved" to "Kaydedildi",
        "Failed: tap to remove" to "Başarısız: kaldırmak için dokunun",
        "Save lyrics into the file" to "Şarkı sözlerini dosyaya kaydet",
        "Make your first playlist: it's kept on this phone, no account needed." to "İlk çalma listenizi oluşturun: bu telefonda tutulur, hesap gerekmez.",
        "This Phone" to "Bu telefon",
        "This phone" to "Bu telefon",
        "Steady" to "Sabit",
        "Build up" to "Yükselen",
        "Wind down" to "Sakinleşen",
        "Use mobile data" to "Mobil veri kullan",
        "DJ mode: no clear keys to order these by" to "DJ modu: bunları sıralamak için net tonlar bulunamadı",
        "DJ mode: in key order, beat-matched" to "DJ modu: ton sırasına göre, tempoya uyumlu",
        "DJ mode" to "DJ modu",
        "song" to "şarkı",
        "songs" to "şarkı",
        "play" to "çalma",
        "plays" to "çalma",
        "artist" to "sanatçı",
        "artists" to "sanatçı",
        "day" to "gün",
        "days" to "gün",
        "minute" to "dakika",
        "minutes" to "dakika",
        "hour" to "saat",
        "hours" to "saat",
        "minute listened" to "dakika dinlendi",
        "minutes listened" to "dakika dinlendi",
        "hour listened" to "saat dinlendi",
        "hours listened" to "saat dinlendi",
        "of music" to "müzik",
        "Mute" to "Sesi kapat",
        "Unmute" to "Sesi aç",
        "Gaming" to "Oyun",
        "On repeat" to "Tekrar tekrar",
    )
    private val trMap = trMap1 + trMap2
    private val azMap1 = mapOf(
        "\"Continue …\" picks up the album you were in" to "\"Davam et …\" dinlədiyiniz alboma qaldığı yerdən davam edir",
        "\"Not for me\" and \"Leave out of my taste\" keep things out" to "\"Mənə görə deyil\" və \"Zövqümdən kənar saxla\" istənməyənləri kənarda saxlayır",
        "\"On this phone\" searches your own music files" to "\"Bu telefonda\" öz musiqi fayllarınızı axtarır",
        "10 bands, bass boost, headphone correction" to "10 zolaq, bas gücləndirmə, qulaqlıq korreksiyası",
        "10-band equalizer" to "10 zolaqlı ekvayzer",
        "256 kbps with YouTube Music Premium" to "YouTube Music Premium ilə 256 kbps",
        "3 h 52 m" to "3 s 52 dəq",
        "3 min · Explicit" to "3 dəq · Açıq-saçıq məzmun",
        "3 tabs" to "3 vərəqə",
        "4 tabs" to "4 vərəqə",
        "42h 10m" to "42 s 10 dəq",
        "5 tabs" to "5 vərəqə",
        "A .prismlook file, with its photos and font" to "Fotoşəkilləri və şrifti ilə bir .prismlook faylı",
        "A Look keeps colors, type, icons, backgrounds, the player and lyrics' look together. Pick one and everything changes at once; Undo puts it back." to "Görünüş; rəngləri, şriftləri, nişanları, arxa planları, pleyer və mahnı sözlərinin görünüşünü bir yerdə saxlayır. Birini seçdikdə hər şey dərhal dəyişir; Geri qaytar əvvəlki vəziyyətinə gətirir.",
        "A Prism Account (Settings, at the top) is your name and picture (a photo or one of Prism's), all on this phone; it can keep a copy of your YouTube Music library" to "Prism Hesabı (Parametrlər, yuxarıda) adınız və şəklinizdir (foto və ya Prism təsvirlərindən biri), hamısı bu telefondadır; YouTube Music kitabxananızın surətini saxlaya bilər",
        "A background of their own: plain dark, the cover blurred or moving, its color, or yours; immersive mode too" to "Özlərinə məxsus arxa plan: sadə tünd, üz qabığı bulanıq və ya animasiyalı, rəngi və ya sizinki; immersiv rejim də daxil",
        "A band of refracted light down one side" to "Bir kənardan süzülən qırılmış işıq zolağı",
        "A bit of everything" to "Hər şeydən bir az",
        "A code is 6 hex digits, like #3A86FF" to "Kod, #3A86FF kimi 6 onaltılıq rəqəmdir",
        "A code someone sent you" to "Kimininsə sizə göndərdiyi kod",
        "A color, or two as a gradient" to "Bir rəng və ya qradiyent kimi iki rəng",
        "A dot with the Thumb style" to "Tutacaq üslubu ilə nöqtə",
        "A downloaded song's animated cover is kept on the phone too, so it plays offline. An album's songs share one copy." to "Endirilən mahnının animasiyalı üzlüyü də telefonda saxlanılır, beləliklə oflayn oxunur. Bir albomun mahnıları tək nüsxəni paylaşır.",
        "A faint wash of color and month bars" to "Yüngül rəng keçidi və ay zolaqları",
        "A few MB a song" to "Mahnı başına bir neçə MB",
        "A few sung lines stay in view" to "Oxunmuş bir neçə sətir görünən qalır",
        "A few things you asked for." to "İstədiyiniz bir neçə şey.",
        "A light tap on buttons and swipes" to "Düymələrə toxunarkən və sürüşdürərkən yüngül haptik əks-əlaqə",
        "A log for tracking down stutters" to "Kəsintiləri tapmaq üçün bir jurnal",
        "A long title scrolls across (off: it ends with …)" to "Uzun başlıq sürüşür (qapalı: … ilə bitir)",
        "A minute's tour of Prism" to "Prism-ə bir dəqiqəlik tur",
        "A minute's walk through Prism" to "Prism-ə bir dəqiqəlik baxış",
        "A music video in autoplay or a radio plays as its song, and videos with no song version are left out." to "Avto-oxutma və ya radioda musiqi videosu mahnı kimi oxunur, mahnı versiyası olmayan videolar kənarda saxlanılır.",
        "A new Prism is out" to "Yeni Prism versiyası çıxdı",
        "A playlist of two tastes" to "İki zövqdən ibarət pleylist",
        "A playlist of two tastes, made on both phones. Swap codes and it's ready." to "Hər iki telefonda yaradılan iki zövqün pleylisti. Kodları dəyişin və hazırdır.",
        "A small copy of each song, 1–4 MB" to "Hər mahnının kiçik bir nüsxəsi, 1–4 MB",
        "A small risk to your Discord account" to "Discord hesabınız üçün kiçik bir risk",
        "A song and its video as one" to "Bir mahnı və videosu vahid olaraq",
        "A star instead of a heart for likes" to "Bəyənmələr üçün ürək əvəzinə ulduz",
        "A tap still changes songs" to "Toxunmaq mahnını dəyişməyə davam edir",
        "A third down" to "Üçdə bir aşağıda",
        "A to Z" to "A-dan Z-yə",
        "A visualizer if you'd like one: bars, a wave, a ring, a pulse or a glow (off unless you pick it)" to "İstəsəniz vizuallaşdırıcı: zolaqlar, dalğa, həlqə, nəbz və ya parıltı (siz seçənə qədər qapalıdır)",
        "A waveform progress bar, its color, the title centred or bigger, and which times show" to "Dalğa forması irəliləyiş zolağı, rəngi, başlığın mərkəzləşdirilməsi və ya böyüdülməsi və hansı vaxtların göstəriləcəyi",
        "ALBUM" to "ALBOM",
        "AMOLED-friendly dark theme" to "AMOLED uyumlu tünd tema",
        "About 3–8 MB a song" to "Mahnı başına təxminən 3–8 MB",
        "About this" to "Bu haqda",
        "Accent color" to "Vurğu rəngi",
        "Accounts" to "Hesablar",
        "Accounts and channels" to "Hesablar və kanallar",
        "Add" to "Əlavə et",
        "Add a Google account" to "Google hesabı əlavə et",
        "Add a color" to "Bir rəng əlavə et",
        "Add a section" to "Bölmə əlavə et",
        "Add new sections automatically" to "Yeni bölmələri avtomatik əlavə et",
        "Add the Recognize widget or Quick Settings tile to do it from anywhere" to "Hər yerdən edə bilmək üçün Mahnı Tanıma vidjetini və ya Sürətli Parametrlər plitəsini əlavə edin",
        "Add your Look" to "Görünüşünüzü əlavə edin",
        "Added albums" to "Əlavə edilmiş albomlar",
        "Address" to "Ünvan",
        "Address on the host's screen" to "Qurucunun ekranındakı ünvan",
        "After Hours" to "After Hours",
        "After a video, the next song plays as video too" to "Bir videodan sonra növbəti mahnı da video kimi oxunur",
        "Ahead 10 s" to "10 san irəli",
        "Ahead 30 s" to "30 san irəli",
        "Album & playlist cards" to "Albom və pleylist kartları",
        "Album, playlist and artist pages use their picture's color instead (Artist & album pages, below)" to "Albom, pleylist və sənətçi səhifələri bunun əvəzinə öz şəkillərinin rəngini istifadə edir (Sənətçi və albom səhifələri, aşağıda)",
        "Albums" to "Albomlar",
        "Albums, artists & playlists as" to "Albomlar, sənətçilər və pleylistlər görünüşü:",
        "Alignment" to "Düzləndirmə",
        "All" to "Hamısı",
        "All time" to "Bütün zamanlar",
        "Allow Prism to install updates" to "Prism-in yeniləmələri quraşdırmasına icazə verin",
        "Allow access to lossless files" to "İtkisiz fayllara girişə icazə ver",
        "Allow notifications" to "Bildirişlərə icazə ver",
        "Allow the camera" to "Kameraya icazə ver",
        "Also checked every few hours" to "Həmçinin bir neçə saatdan bir yoxlanılır",
        "Also new" to "Həmçinin yeni",
        "Always colorful" to "Həmişə rəngarəng",
        "Always play at 256 kbps when on Wi-Fi" to "Wi-Fi olduqda həmişə 256 kbps ilə oxut",
        "Always plays the best audio there is, keeps hi-res at full resolution, and plays matching FLAC, WAV and AIFF files on your phone instead of the stream. Put them in your Music folder." to "Həmişə mövcud olan ən yaxşı səsi oxudur, yüksək ayırdetməli səsi tam keyfiyyətdə saxlayır və axın əvəzinə telefonunuzdakı uyğun gələn FLAC, WAV və AIFF fayllarını oxudur. Onları Musiqi qovluğunuza yerləşdirin.",
        "An AutoEq or EqualizerAPO .txt (Preamp and Filter lines)" to "Bir AutoEq və ya EqualizerAPO .txt faylı (Preamp və Filter sətirləri)",
        "Android Auto" to "Android Auto",
        "Android can't update across that change, so this once Prism is reinstalled. Your things come with you:" to "Android bu dəyişikliklə yenilənə bilmir, buna görə Prism bu dəfəlik yenidən quraşdırılır. Məlumatlarınız qalır:",
        "Animated cover" to "Animasiyalı üz qabığı",
        "Animated cover saved" to "Animasiyalı üzlük saxlanıldı",
        "Animated covers" to "Animasiyalı üzlüklər",
        "Any network" to "İstənilən şəbəkə",
        "Anyone can find it and open it." to "Hər kəs tapa və aça bilər.",
        "Anyone can find it." to "Hər kəs tapa bilər.",
        "Anyone with the link can open it, so it's easy to share." to "Keçidə sahib hər kəs aça bilər, paylaşmaq asandır.",
        "Anyone with the link can open it; it doesn't show up in search." to "Keçidə sahib hər kəs aça bilər; axtarışda görünmür.",
        "App icon" to "Tətbiq nişanı",
        "App info" to "Tətbiq haqqında",
        "Appearance: the Spectrum's colors (or plain white), your accent, fonts, icons and backgrounds" to "Görünüş: Spektr rəngləri (və ya sadə ağ), vurğunuz, şriftlər, nişanlar və arxa planlar",
        "Artist & album pages" to "Sənətçi və albom səhifələri",
        "Artist, album and playlist pages sit on frosted glass made from their picture; Home, Library, Search and Settings sit on frost from what's playing. Whether pages take their picture's color is under Color." to "Sənətçi, albom və pleylist səhifələri şəkillərindən hazırlanan buzlu şüşə üzərində dayanır; Əsas Səhifə, Kitabxana, Axtarış və Parametrlər oxunan mahnının buz effekti üzərində dayanır. Səhifələrin şəkil rəngini götürməsi Rəng bölməsindədir.",
        "Artists" to "Sənətçilər",
        "Artists not to play, and playlists or songs left out of your taste." to "Oxudulmayacaq sənətçilər və zövqünüzdən kənar saxlanılan pleylistlər və ya mahnılar.",
        "Artwork" to "Üzlük rəsmi",
        "As a song ends it fades out while the next fades in, as on Spotify. Never between an album's own tracks." to "Spotify-dakı kimi bir mahnı bitərkən səsi sönür, növbəti yavaşca artır. Heç vaxt bir albomun öz trekləri arasında tətbiq olunmur.",
        "As now" to "İndiki kimi",
        "Asking GitHub…" to "GitHub-dan soruşulur…",
        "At the end of Home" to "Əsas səhifənin sonunda",
        "At the top of Home" to "Əsas səhifənin yuxarısında",
        "Audio offload" to "Avadanlıq səs sürətləndirməsi",
        "Audio quality" to "Səs keyfiyyəti",
        "Aurora" to "Aurora",
        "Auto download" to "Avtomatik endirmə",
        "Automatic (follow the phone)" to "Avtomatik (telefonu izlə)",
        "Automatic length" to "Avtomatik uzunluq",
        "Autoplay and radios play songs" to "Avto-oxutma və radiolar mahnı oxuyur",
        "Autoplay from" to "Avto-oxutma mənbəyi",
        "Available for handoff" to "Ötürmə üçün əlçatandır",
        "BLEND" to "QARIŞIQ",
        "Back 10 s" to "10 san geri",
        "Back 30 s" to "30 san geri",
        "Back to Lyrics, Video and Up next" to "Mahnı Sözləri, Video və Növbətiyə qayıt",
        "Back to Prism's buttons" to "Prism-in düymələrinə qayıt",
        "Back to Prism's order" to "Prism-in ardıcıllığına qayıt",
        "Back to a built-in font" to "Daxili şriftə qayıt",
        "Back to the part people replay most" to "Ən çox təkrar oxudulan hissəyə qayıt",
        "Back up" to "Nüsxələ",
        "Back up Prism" to "Prism-i ehtiyat nüsxələ",
        "Backed up" to "Ehtiyat nüsxəsi yaradıldı",
        "Background" to "Arxa plan",
        "Background color" to "Arxa plan rəngi",
        "Backgrounds" to "Arxa planlar",
        "Backing up…" to "Ehtiyat nüsxəsi çıxarılır…",
        "Backup" to "Ehtiyat nüsxə",
        "Backup & restore" to "Yedəkləmə və bərpa",
        "Bass Boost" to "Bas Gücləndirmə",
        "Bass Reducer" to "Bas Azaltma",
        "Beats line up while songs overlap" to "Mahnılar üst-üstə düşərkən zərbələr düzlənir",
        "Behind the lyrics" to "Mahnı sözlərinin arxasında",
        "Best part jumps to where listeners replay most; hold it to pick your own" to "Ən yaxşı hissə, dinləyicilərin ən çox təkrar qulaq asdığı yerə keçir; özünüzünkünü seçmək üçün basıb saxlayın",
        "Between songs" to "Mahnılar arasında",
        "Blend" to "Qarışıq",
        "Blend makes a playlist of two tastes with a friend: scan each other's code and both phones get it" to "Blend, dostunuzla iki zövqdən ibarət pleylist yaradır: bir-birinizin kodunu skan edin və hər iki telefona da gəlsin",
        "Blinding Lights" to "Blinding Lights",
        "Bluetooth" to "Bluetooth",
        "Blurred cover" to "Bulanıq üz qabığı",
        "Bold" to "Qalın",
        "Bottom bar" to "Aşağı zolaq",
        "Bring back" to "Geri gətir",
        "Bring here" to "Bura gətir",
        "Bring it back from Customize Home" to "Əsas Səhifəni Fərdiləşdir bölməsindən geri gətirin",
        "Browse Looks people shared, under From the community" to "İcmadan bölməsində insanların paylaşdığı Görünüşlərə baxın",
        "Browse community Looks" to "İcma Görünüşlərinə bax",
        "Browser remote on" to "Brauzerdən uzaqdan idarəetmə aktivdir",
        "Built with" to "Bununla yaradılıb:",
        "Buttons" to "Düymələr",
        "Buttons and touch" to "Düymələr və toxunma",
        "By day" to "Gündüz",
        "By night" to "Gecə",
        "By pull request on GitHub" to "GitHub-da pull request ilə",
        "Cache" to "Keş",
        "Calmer, quicker animations" to "Daha sakit, daha cəld animasiyalar",
        "Capitals" to "Böyük hərflər",
        "Card mini player" to "Kart mini pleyer",
        "Card style" to "Kart tərzi",
        "Centered, as on a lyric sheet" to "Mahnı sözü vərəqindəki kimi mərkəzləşdirilmiş",
        "Centred" to "Mərkəzləşdirilmiş",
        "Change" to "Dəyişdir",
        "Change lyrics source" to "Mahnı sözü mənbəyini dəyişdir",
        "Change picture" to "Şəkli dəyişdir",
        "Changes the moment you pick" to "Seçdiyiniz anda dəyişir",
        "Check for updates" to "Yeniləmələri yoxla",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another" to "Bağlantınızı yoxlayın. İş və məktəb şəbəkələri kimi bəzi şəbəkələr Discord-u bloklaya bilər: başqa birini yoxlayın",
        "Checking…" to "Yoxlanılır…",
        "Choose the display language for Prism" to "Prism üçün interfeys dilini seçin",
        "Choose what swipes, a double tap and a long press do on the cover and the mini player" to "Üz qabığında və mini oxuducuda sürüşdürmələrin, ikiqat toxunmanın və uzun basmanın nə edəcəyini seçin",
        "Choose where" to "Yer seç",
        "Chosen" to "Seçildi",
        "Classical" to "Klassik",
        "Clear diagnostics" to "Diaqnostikanı təmizlə",
        "Clear search" to "Axtarışı təmizlə",
        "Clear sung songs" to "Oxunmuş mahnıları təmizlə",
        "Codes leave out photos and your own font; a file can carry them." to "Kodlar şəkilləri və öz şriftinizi kənarda qoyur; bir fayl onları daşıya bilər.",
        "Color" to "Rəng",
        "Color code" to "Rəng kodu",
        "Color fields drift, waves roll and ripples spread, slowly" to "Rəng sahələri süzülür, dalğalar diyirlənir və dalğacıqlar yavaş-yavaş yayılır",
        "Color mesh" to "Rəng toru",
        "Color wheel" to "Rəng çarxı",
        "Color, your way" to "Rəng, sizin zövqünüzə görə",
        "Colors" to "Rənglər",
        "Confirm in Android's installer" to "Android quraşdırıcısında təsdiqləyin",
        "Connecting…" to "Qoşulur…",
        "Content country" to "Məzmun ölkəsi",
        "Continue line" to "Sətirə davam et",
        "Continue listening" to "Dinləməyə davam et",
        "Control Prism from a browser on your computer" to "Prism-i kompüterinizdəki brauzerdən idarə edin",
        "Control from a browser" to "Brauzerdən idarə et",
        "Controls" to "Nəzarət elementləri",
        "Copy" to "Kopyala",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out." to "Pleylistləri, yadda saxlanılan albomları və sənətçiləri Prism-ə kopyalayın, beləliklə çıxış edilsə belə bu telefonda qalarlar.",
        "Corners" to "Künclər",
        "Couldn't build your Replay" to "Təkrar xülasəniz yaradıla bilmədi",
        "Couldn't build your Rewind" to "Geri Sarma xülasəniz yaradıla bilmədi",
        "Couldn't create playlist" to "Pleylist yaradıla bilmədi",
        "Couldn't load the credits. Check your connection and try again." to "Müəlliflər yüklənə bilmədi. Bağlantınızı yoxlayın və yenidən cəhd edin.",
        "Couldn't load the gallery" to "Qalereya yüklənə bilmədi",
        "Couldn't load your history" to "Tarixçəniz yüklənə bilmədi",
        "Couldn't match this video to the song automatically. Use the controls above to line the lyrics up." to "Bu video avtomatik olaraq mahnı ilə uyğunlaşdırıla bilmədi. Sözləri düzləndirmək üçün yuxarıdakı idarəetmələrdən istifadə edin.",
        "Couldn't reach Discord" to "Discord-a qoşulmaq mümkün olmadı",
        "Couldn't reach GitHub · try again in a moment" to "GitHub-a qoşulmaq olmadı · bir azdan yenidən cəhd edin",
        "Couldn't recognize that one" to "Bu mahnı tanınmadı",
        "Cover" to "Üzlük",
        "Cover art" to "Üz qabığı şəkli",
        "Cover size" to "Üzlük ölçüsü",
        "Covers in a grid" to "Üzlüklər şəbəkə şəklində",
        "Create" to "Yarat",
        "Crossfade" to "Çarpaz keçid",
        "Crossfade (Settings → Playback & sound) blends any two songs" to "Çarpaz Keçid (Parametrlər → Oxutma və səs) istənilən iki mahnını bir-birinə qovuşdurur",
        "Crossfade songs" to "Mahnılar arasında çarpaz keçid",
        "Custom" to "Xüsusi",
        "Customize Home" to "Əsas səhifəni fərdiləşdir",
        "Customize button at the bottom" to "Aşağıdakı Fərdiləşdir düyməsi",
        "Customize button at the top" to "Yuxarıdakı Fərdiləşdir düyməsi",
        "Customize button on Home" to "Əsas səhifədəki Fərdiləşdir düyməsi",
        "Customize by tapping" to "Toxunaraq fərdiləşdirin",
        "Customize by tapping: hold the Settings tab, or turn it on in Appearance, then tap the mini player, tab bar, player or a Home section" to "Toxunaraq fərdiləşdirin: Parametrlər vərəqəsini basıb saxlayın və ya Görünüşdə aktiv edin, sonra mini oxuducuya, vərəqə panelinə, oxuducuya və ya Əsas Səhifə bölməsinə toxunun",
        "Customize home" to "Əsas səhifəni fərdiləşdir",
        "Customize this" to "Bunu fərdiləşdir",
        "DJ mode and Crossfade" to "DJ rejimi və Çarpaz Keçid",
        "Daily Mixes group the artists you play by what goes together" to "Gündəlik Mikslər dinlədiyiniz sənətçiləri bir-birinə uyğunluğuna görə qruplaşdırır",
        "Dark" to "Qaranlıq",
        "Dark mode" to "Qaranlıq rejim",
        "Dark theme" to "Tünd tema",
        "Data saver" to "Data qənaəti",
        "Date added" to "Əlavə edilmə tarixi",
        "Day and night" to "Gündüz və gecə",
        "Day and night Looks" to "Gündüz və gecə Görünüşləri",
        "Day starts at" to "Gündüz başlanğıcı",
        "Delete all downloads" to "Bütün endirmələri sil",
        "Delete playlist" to "Pleylisti sil",
        "Delete the playlist" to "Pleylisti sil",
        "Delete the playlist?" to "Pleylist silinsin?",
        "Design gallery" to "Dizayn qalereyası",
        "Diagnostics" to "Diaqnostika",
        "Diagnostics cleared" to "Diaqnostika təmizləndi",
        "Different color for light mode" to "Açıq rejim üçün fərqli rəng",
        "Discord has no way for Android apps to do this officially, so Prism uses your Discord sign-in the way other Android music players do. Discord doesn't allow that for third-party apps, so there's a small risk to your account. Prism only ever changes your status." to "Discord-un Android tətbiqlərinin bunu rəsmi şəkildə etməsi üçün yolu yoxdur, buna görə də Prism digər Android musiqi oxuducuları kimi Discord girişinizdən istifadə edir. Discord üçüncü tərəf tətbiqlərinə icazə vermir, buna görə hesabınız üçün kiçik risk var. Prism yalnız statusunuzu dəyişir.",
        "Discover together" to "Birlikdə kəşf edin",
        "Dismiss" to "Bağla",
        "Docked mini player" to "Sabit mini pleyer",
        "Double-tap the cover's sides to skip back or ahead" to "Geri və ya irəli keçmək üçün üz qabığının kənarlarına iki dəfə toxunun",
        "Download liked songs automatically" to "Bəyənilən mahnıları avtomatik endir",
        "Download lyrics again" to "Mahnı sözlərini yenidən endir",
        "Download on Wi-Fi only" to "Yalnız Wi-Fi ilə endir",
        "Download progress" to "Endirmə gedişatı",
        "Downloaded songs keep theirs" to "Endirilən mahnılar özlərinkini saxlayır",
        "Downloading" to "Endirilir",
        "Downloading its photos…" to "Fotoşəkilləri endirilir…",
        "Downloads on Wi-Fi only" to "Yalnız Wi-Fi ilə endir",
        "Drag to reorder" to "Sıralamaq üçün sürüşdürün",
        "EVERY LINE IN CAPITALS" to "HƏR SƏTİR BÖYÜK HƏRFLƏRLƏ",
        "Each group says everything it changes in the app" to "Hər qrup tətbiqdə dəyişdiyi hər şeyi izah edir",
        "Each pair of headphones keeps its own correction, and the phone's speaker and the car never get one. Corrections come from the AutoEq project (Jaakko Pasanen, MIT licence), from measurements by oratory1990, crinacle and others. Only the headphone's name is looked up, on GitHub." to "Hər qulaqlıq öz düzəlişini saxlayır; telefonun dinamiki və avtomobil heç vaxt düzəliş almır. Düzəlişlər AutoEq layihəsindən (Jaakko Pasanen, MIT lisenziyası), oratory1990, crinacle və digərlərinin ölçmələrindən gəlir. GitHub-da yalnız qulaqlığın adı axtarılır.",
        "Each song fades into the next" to "Hər mahnı tədricən növbətiyə keçir",
        "Each song is measured on your phone and brought to the same level (-14 LUFS, like Spotify): loud ones down, quiet ones up, with a limiter so nothing clips. Works offline too." to "Hər mahnı telefonunuzda ölçülür və eyni səviyyəyə gətirilir (Spotify kimi -14 LUFS): uca səslilər azaldılır, sakit səslilər artırılır; məhdudlaşdırıcı sayəsində səs xırıldamır. Oflayn da işləyir.",
        "Earlier" to "Daha əvvəl",
        "Edge to edge at the top" to "Yuxarıda kənardan kənara",
        "Edge to edge, like an artist page" to "Sənətçi səhifəsi kimi kənardan kənara",
        "Edit details" to "Təfərrüatları redaktə et",
        "Elapsed" to "Keçən vaxt",
        "Electronic" to "Elektron",
        "End of song" to "Mahnının sonu",
        "Episode" to "Epizod",
        "Episodes" to "Epizodlar",
        "Episodes for later" to "Daha sonrası üçün epizodlar",
        "Equalizer & sound" to "Ekvalayzer və səs",
        "Every color finds its way" to "Hər rəng öz yolunu tapır",
        "Every component of the redesign, in each state" to "Yenidən dizaynın hər komponenti, hər vəziyyətdə",
        "Every look page shows Home, the player and lyrics as you change them; Undo takes a change back" to "Hər görünüş səhifəsi siz dəyişdikcə Əsas Səhifəni, oxuducunu və sözləri göstərir; Geri Qaytar dəyişikliyi geri qaytarır",
        "Every major feature of the redesign, in eight cards. Swipe, or tap Start." to "Yenidən dizaynın hər vacib xüsusiyyəti səkkiz kartda. Sürüşdürün və ya Başla vurun.",
        "Every song at the same loudness" to "Hər mahnı eyni səs səviyyəsində",
        "Everyone in the session hears this" to "Sessiyadakı hər kəs bunu eşidir",
        "Everything you keep, with or without a YouTube Music account." to "YouTube Music hesabı olsun və ya olmasın saxladığınız hər şey.",
        "Everywhere" to "Hər yerdə",
        "Exclusions" to "İstisnalar",
        "Exit full screen" to "Tam ekrandan çıx",
        "Explicit" to "Açıq-saçıq məzmun",
        "Failed before Prism kept the reason" to "Prism səbəbi qeyd etməzdən əvvəl xəta baş verdi",
        "Faster" to "Daha Sürətli",
        "Favourites" to "Sevimli",
        "Fewer" to "Daha az",
        "Fewest first" to "Ən az olan başda",
        "File size" to "Fayl ölçüsü",
        "Fill" to "Doldur",
        "Fill the player" to "Pleyeri doldur",
        "Fills in starred-out words" to "Ulduzlanmış senzuralı sözləri doldurur",
        "Filters for songs, videos, albums, artists, podcasts and live" to "Mahnılar, videolar, albomlar, sənətçilər, podkastlar və canlı ifalar üçün filtrlər",
        "Find anything in Prism Music, or name the song playing around you." to "Prism Music-dəki hər şeyi tapın və ya ətrafınızda oxunan mahnını müəyyən edin.",
        "Fitted to how songs end and begin" to "Mahnıların bitmə və başlama şəklinə uyğunlaşdırılıb",
        "Flat" to "Düz",
        "Floating bar" to "Üzən zolaq",
        "Floating mini player" to "Üzən mini pleyer",
        "Font" to "Şrift",
        "Font, text size, corners, spacing, navigation bar, tabs, mini player and player style go back to how Prism ships. Your colors, backgrounds and everything else stay as they are." to "Şrift, mətn ölçüsü, künclər, boşluqlar, naviqasiya paneli, vərəqələr, mini oxuducu və oxuducu tərzi Prism-in ilkin vəziyyətinə qayıdır. Rəngləriniz, arxa planlarınız və digər hər şey olduğu kimi qalır.",
        "Fonts" to "Şriftlər",
        "For songs in another language. Machine translation: the lyrics' text (nothing else) is sent to Google Translate." to "Başqa dildəki mahnılar üçün. Maşın tərcüməsi: mahnı sözləri mətni (başqa heç nə) Google Tərcüməyə göndərilir.",
        "For you" to "Sizin üçün",
        "Forget crashes" to "Çökmələri unut",
        "Forget my best part" to "Ən yaxşı hissəmi unut",
        "Forgets the sign-in on this phone" to "Bu telefondakı girişi unudur",
        "Found it" to "Tapıldı",
        "Framed artwork" to "Çərçivəli üzlük",
        "Fresh Daily Mixes now" to "Gündəlik Miksləri indi yenilə",
        "Friends on this Wi-Fi join with a code. They can listen along on their phones or add songs to your queue." to "Bu Wi-Fi-dakı dostlarınız kodla qoşulur. Öz telefonlarından dinləyə və ya növbənizə mahnı əlavə edə bilərlər.",
        "Friends open Listen together in Prism on the same Wi-Fi, tap your session and enter this code." to "Dostlarınız eyni Wi-Fi şəbəkəsində Prism-də Birlikdə Dinlə-ni açıb sessiyanıza toxunur və bu kodu daxil edir.",
        "From Apple Music" to "Apple Music-dən",
        "From GitHub" to "GitHub-dan",
        "From Prism" to "Prism-dən",
        "From Prism's next start." to "Prism-in növbəti başlanğıcından etibarən.",
        "From Spotify" to "Spotify-dan",
        "From Spotify, Apple Music and more" to "Spotify, Apple Music və daha çoxundan",
        "From Spotify, Apple Music…" to "Spotify, Apple Music… vasitəsilə",
        "From YouTube Music" to "YouTube Music-dən",
        "From a computer or tablet on this Wi-Fi" to "Bu Wi-Fi şəbəkəsindəki kompüter və ya planşetdən",
        "From a friend's Prism" to "Dostunun Prism-indən",
        "From another service or a file" to "Başqa bir xidmətdən və ya fayldan",
        "From the community" to "İcmadan",
        "From your liked songs" to "Bəyəndiyiniz mahnılardan",
        "Frosted Glass" to "Buzlu Şüşə",
        "Frosted pages" to "Buzlu səhifələr",
        "Full color, like a Rewind slide" to "Geri Sarma slaydı kimi tam rəngli",
        "Full-bleed artwork" to "Kənarsız üzlük",
        "Full-width playlist pictures" to "Tam enli pleylist şəkilləri",
        "GPL-3.0-or-later, and what it's built with" to "GPL-3.0-və-ya-sonrası və nələrlə hazırlanıb",
        "Gentle motion" to "Yumşaq hərəkət",
        "Gestures" to "Jestlər",
        "Get a Look" to "Bir Görünüş Əldə Et",
        "Get missing lyrics" to "Çatışmayan sözləri əldə et",
        "Get songs ready on mobile data" to "Mahnıları mobil datada hazırla",
        "Get songs ready while Sing is off" to "Sing qapalı olarkən mahnıları hazırla",
        "Glass" to "Şüşə",
        "Glass ringed in split light, the time in color" to "Bölünmüş işıqla əhatələnmiş şüşə, rəngli vaxt",
        "Glass style" to "Şüşə tərzi",
        "Glow" to "Parıltı",
        "Go to" to "Get",
        "Good evening" to "Axşamınız xeyir",
        "Good morning / afternoon / evening" to "Sabahınız xeyir / Hər vaxtınız xeyir / Axşamınız xeyir",
        "Greeting" to "Salamlama",
        "Grey or black-and-white covers still give a color" to "Boz və ya ağ-qara üzlüklər yenə də bir rəng verir",
        "Guests can control playback" to "Qonaqlar oxutmanı idarə edə bilər",
        "Hand what's playing to another phone or tablet with Prism" to "Oxunan musiqini Prism quraşdırılmış başqa telefona və ya planşetə ötürün",
        "Handoff" to "Cihazlararası ötürmə",
        "Haptics" to "Haptik əks-əlaqə",
        "Headline" to "Başlıq",
        "Indie & alternative" to "İndi və alternativ",
        "Dance & electronic" to "Rəqs və elektron",
        "Soundtracks & musicals" to "Film musiqiləri və müzikllər",
        "Country & Americana" to "Kantri və Amerikana",
        "Folk & acoustic" to "Xalq musiqisi və akustik",
        "R&B & soul" to "R&B və soul",
        "Sorting…" to "Sıralanır…",
        "Search in album" to "Albomda axtar",
        "Hear a song you like? Let Prism listen for a few seconds: what it finds is kept here." to "Bəyəndiyiniz mahnı eşitdiniz? Prism-in bir neçə saniyə dinləməsinə icazə verin: tapdıqları burada saxlanılır.",
        "Helps the words read over photos and moving covers" to "Sözlərin foto və animasiyalı üzlüklər üzərində daha rahat oxunmasına kömək edir",
        "Hidden" to "Gizlədilən",
        "Hide Sing's controls" to "Müşayiət idarəetmələrini gizlət",
        "Hide details" to "Təfərrüatları gizlət",
        "Hide the status bar" to "Status panelini gizlət",
        "Hide the status bar (Layout & navigation)" to "Status panelini gizlət (Düzən və naviqasiya)",
        "Hide this section" to "Bu bölməni gizlət",
        "High quality on Wi-Fi" to "Wi-Fi üzərindən yüksək keyfiyyət",
        "High quality on mobile data" to "Mobil datada yüksək keyfiyyət",
        "High · Opus 160 kbps" to "Yüksək · Opus 160 kbps",
        "History" to "Tarixçə",
        "Hold Prism's icon for Search, Recognize, Liked songs and Downloads" to "Axtarış, Mahnı Tanıma, Bəyənilən mahnılar və Endirmələr üçün Prism nişanını basıb saxlayın",
        "Hold a section (or drag its grip) to move it; tap it to show or hide it." to "Daşımaq üçün bölməni basıb saxlayın (və ya tutacaqdan sürüşdürün); göstərmək və ya gizlətmək üçün toxunun.",
        "Hold and drag, or use the arrows" to "Basıb saxlayaraq sürüşdürün və ya oxlardan istifadə edin",
        "Hold previous / next to seek" to "İrəli/geri çəkmək üçün əvvəlki / növbəti düyməsini basılı saxlayın",
        "Hold previous or next to seek" to "İrəli-geri çəkmək üçün əvvəlki və ya növbətini basıb saxlayın",
        "Hold your phone near the music" to "Telefonunuzu musiqiyə yaxın saxlayın",
        "Home and Library as cover tiles" to "Əsas səhifə və Kitabxana üzlük plitələri kimi",
        "Home greets you by it; Blend, Listen Together and other phones see it." to "Əsas səhifə sizi bu adla salamlayır; Blend, Birlikdə Dinlə və digər telefonlar bunu görür.",
        "Home, Search, Library, Replay and Settings" to "Əsas Səhifə, Axtarış, Kitabxana, Təkrar və Parametrlər",
        "Home, the player and lyrics, as you change them" to "Dəyişdirdikcə Əsas səhifə, pleyer və mahnı sözləri",
        "Hours by month" to "Aylara görə saatlar",
        "How a translation, or a line spelled out in Latin letters, sits with each line." to "Tərcümənin və ya latın qrafikalı sətrin hər sətirlə necə yerləşəcəyi.",
        "How it will look" to "Necə görünəcək",
        "How it works" to "Necə işləyir",
        "How it's used" to "Necə istifadə olunur",
        "How many of the next lines show; the rest appear as the song gets to them." to "Növbəti sətirlərdən neçəsinin göstəriləcəyi; qalanı mahnı həmin yerə çatdıqca görünür.",
        "How much the theme color washes over the background, for easier reading" to "Daha asan oxumaq üçün tema rənginin arxa plana nə dərəcədə yayılacağı",
        "How strong grey text and lines are against the page." to "Boz mətn və xətlərin səhifəyə qarşı nə dərəcədə aydın görünəcəyi.",
        "Icon pack and weight, app icon, corners" to "Nişan paketi və qalınlığı, tətbiq nişanı, künclər",
        "Icons" to "Nişanlar",
        "If Google blocks the embedded sign-in, copy the Cookie header from a signed-in music.youtube.com browser session and paste it here. It's stored only on this device." to "Google daxili girişi bloklayarsa, daxil olunmuş music.youtube.com brauzer sessiyasından Cookie başlığını kopyalayıb bura yapışdırın. Yalnız bu cihazda saxlanılır.",
        "If a session doesn't show up here" to "Sessiya burada görünmürsə",
        "If something still stutters, Settings → About → Diagnostics notes where it happened, to share" to "Hələ də kəsinti olarsa, Parametrlər → Haqqında → Diaqnostika paylaşmağınız üçün harada baş verdiyini qeyd edir",
        "Immersive mode" to "Tam ekran rejimi",
        "Immersive mode settings" to "İmmersiv rejim parametrləri",
        "Import a ParametricEQ file" to "Parametrik Ekvayzer faylını idxal et",
        "Import playlists" to "Pleylistləri idxal et",
        "Imported playlists go to your YouTube Music account, then show up in Prism." to "İdxal edilmiş pleylistlər YouTube Music hesabınıza gedir, sonra Prism-də görünür.",
        "In Your Eyes" to "In Your Eyes",
        "In dark mode, pages sit on true black, whichever background you picked: its colors and patterns stay, quieter, over black." to "Tünd rejimdə səhifələr tam qara üzərində yerləşir: seçdiyiniz arxa planın rəng və naxışları qara üzərində daha sakit qalır.",
        "In place of the song title and cover. The car's Lyrics button turns them on and off too." to "Mahnı adı və üzlüyü əvəzinə. Avtomobilin Sözlər düyməsi də onları açıb-bağlayır.",
        "In the middle" to "Ortada",
        "In the queue, tap DJ, then pick Steady, Build up or Wind down" to "Növbədə DJ-ə toxunun, sonra Sabit, Yüksələn və ya Sakitləşən seçimlərindən birini seçin",
        "In use" to "İstifadədədir",
        "In use, changed since saved" to "İstifadədədir, saxlanıldıqdan bəri dəyişdirilib",
        "Include downloaded songs" to "Endirilən mahnıları daxil et",
        "Include its font" to "Şriftini daxil et",
        "Include its photos" to "Fotoşəkillərini daxil et",
        "Including likes from other devices" to "Digər cihazlardan bəyənmələr daxil olmaqla",
        "Inline style" to "Sətir içi tərz",
        "Instead" to "Əvəzinə",
        "Instead of the time left" to "Qalan vaxt əvəzinə",
        "Instrumental" to "İnstrumental",
        "Intro" to "Giriş",
        "It goes away once they're paired, or after three minutes." to "Cütləşdikdə və ya üç dəqiqədən sonra itir.",
        "It listens to Prism's own sound (no microphone) and only runs while the player is open and playing. On an older phone, Off keeps the player lightest." to "Prism-in öz səsini dinləyir (mikrofon yoxdur) və yalnız oxuducu açıq və ifa edərkən işləyir. Köhnə telefonlarda Qapalı seçimi oxuducunu ən yüngül saxlayır.",
        "It'll be looked up when you're back online, with a notification when it's found." to "Yenidən onlayn olduqda axtarılacaq və tapıldıqda bildiriş göndəriləcək.",
        "It's the same service YouTube Music's own app uses for transfers." to "YouTube Music-in öz tətbiqinin köçürmələr üçün istifadə etdiyi xidmətdir.",
        "Italics" to "Kursiv",
        "Japanese kanji readings" to "Yapon kanji oxunuşları",
        "Join a session" to "Sessiyaya qoşul",
        "Join with an address" to "Ünvan ilə qoşul",
        "Joining" to "Qoşulur",
        "Just sign out" to "Sadəcə çıxış et",
        "Karaoke lyrics (lit up word by word) from any source that has them come first, then time-synced lines, then plain text." to "Kəlmə-kəlmə yanan karaoke sözləri hansı mənbədə varsa əvvəl gəlir, sonra vaxtla sinxronlaşdırılmış sətirlər, sonra sadə mətn gəlir.",
        "Karaoke with the song's own music: Prism takes the voice out, on your phone." to "Mahnının öz musiqisi ilə karaoke: Prism, telefonunuzda vokal səsini çıxarır.",
        "Karaoke · lights up word by word" to "Karaoke · kəlmə-kəlmə işıqlanır",
        "Keep a copy" to "Surətini saxla",
        "Keep a copy of its playlists, saved albums and artists in your Prism Account first? Liked songs, downloads and Replay stay either way." to "Əvvəlcə pleylistlərin, yadda saxlanılan albomların və sənətçilərin bir surəti Prism Hesabınızda saxlanılsın? Bəyənilən mahnılar, endirmələr və Replay hər vəziyyətdə qalır.",
        "Keep a little of it in to sing along with, or none for karaoke. Backing vocals go with it." to "Müşayiət üçün səsin bir azını saxlayın və ya karaoke üçün tamamilə bağlayın. Arxa vokallar da onunla gedir.",
        "Keep controls on screen" to "İdarəetmələri ekranda saxla",
        "Keep downloads updated" to "Endirmələri yenilənmiş saxla",
        "Keep holding to leave immersive mode (or press Back)" to "İmmersiv rejimdən çıxmaq üçün basıb saxlamağa davam edin (və ya Geri basın)",
        "Keep it" to "Saxla",
        "Keep playing videos" to "Videoları oxutmağa davam et",
        "Keep seconds of music ready ahead of playback" to "Oxutmazdan əvvəl bir neçə saniyəlik musiqini hazır saxla",
        "Keep the song title" to "Mahnı adını saxla",
        "Keeps a log on this phone of what the audio does. Nothing is sent anywhere unless you share it. When you hear a stutter, tap \"Mark a stutter\" in the player's ⋯ menu, then share the log here." to "Bu telefonda səsin nə etdiyinə dair jurnal saxlayır. Siz paylaşmadığınız müddətcə heç yerə heç nə göndərilmir. Kəsinti eşitdikdə oxuducunun ⋯ menyusunda \"Kəsintini qeyd et\"ə toxunun, sonra jurnalı buradan paylaşın.",
        "Kept (up to 400 MB) so they start at once next time." to "Növbəti dəfə dərhal başlamaları üçün saxlanılır (400 MB-a qədər).",
        "Kept dark enough for white words." to "Ağ sözlər üçün kifayət qədər tünd saxlanılır.",
        "Kept on this phone" to "Bu telefonda saxlanılır",
        "Kept on this phone (and in your backups), no account needed. Sign in to YouTube Music for playlists on your account." to "Bu telefonda (və ehtiyat nüsxələrinizdə) saxlanılır, hesaba ehtiyac yoxdur. Hesabınızdakı pleylistlər üçün YouTube Music-ə daxil olun.",
        "Kept on this phone, for this song only" to "Yalnız bu mahnı üçün bu telefonda saxlanılır",
        "Kept on this phone. No email, no password, no server." to "Bu telefonda saxlanılır. E-poçt yox, şifrə yox, server yox.",
        "Kept up to date" to "Yenilənmiş saxlanılır",
        "Key" to "Tonallıq",
        "Knob at the playhead" to "Oxutma nöqtəsindəki tutacaq",
        "Korean, Japanese, Russian and Greek are spelled out on the phone (word by word with karaoke); other scripts by Google Translate, which is sent only the lyrics' text. Turn it on or off for one song from the player's ⋯ menu." to "Koreya, Yapon, Rus və Yunan dilləri telefonda hecalanır (karaoke ilə kəlmə-kəlmə); digər əlifbalar yalnız söz mətni göndərilən Google Tərcümə ilə çevrilir. Oxuducunun ⋯ menyusundan tək mahnı üçün açıb-bağlaya bilərsiniz.",
        "KuGou first" to "Əvvəlcə KuGou",
        "LIVE" to "CANLI",
        "Labels" to "Etiketlər",
        "Largest first" to "Ən böyük başda",
        "Last 30 days" to "Son 30 gün",
        "Last copied" to "Son kopyalanan",
        "Last crash" to "Son çökmə",
        "Later" to "Daha sonra",
        "Latest episode" to "Son epizod",
        "Layout" to "Düzən",
        "Layout: the tab bar, your tabs and the mini player" to "Düzən: vərəqə paneli, vərəqələriniz və mini oxuducu",
        "Layouts: Standard, a big Cover, Lyrics first, Minimal, Vinyl or Cassette (they turn as it plays)" to "Düzənlər: Standart, böyük Üz qabığı, əvvəlcə Mahnı Sözləri, Minimal, Vinil və ya Kaset (oxudulduqda fırlanırlar)",
        "Lead voice" to "Əsas vokal",
        "Leave a little of the voice in to sing along, or none" to "Birlikdə oxumaq üçün vokal səsini bir az saxlayın və ya tamamilə bağlayın",
        "Ledger" to "Dəftər",
        "Left" to "Sol",
        "Less work while lists scroll, while you type in Search, and while a song plays" to "Siyahılar sürüşdürülərkən, Axtarışda yazarkən və mahnı oxunarkən daha az resurs sərfiyyatı",
        "Let Prism mix your music: songs blend into each other, in key and on the beat." to "Prism musiqinizi qarışdırsın: mahnılar tonunda və ritmində bir-birinə qovuşur.",
        "Let Prism tell you when something needs you." to "Nəsə diqqətinizi tələb etdikdə Prism-in sizə xəbər verməsinə icazə verin.",
        "Let the audio chip decode songs directly" to "Mahnıların birbaşa səs çipi tərəfindən oxunmasına icazə ver",
        "Library tiles" to "Kitabxana plitələri",
        "Library → History: what you played, by day, on this phone or on your account" to "Kitabxana → Tarixçə: bu telefonda və ya hesabınızda gün üzrə nə oxutduğunuz",
        "Library's tiles: the edit button at the top of Library" to "Kitabxananın plitələri: Kitabxananın yuxarısındakı redaktə düyməsi",
        "Library, Replay, settings and sign-in, to a file" to "Kitabxana, Təkrar, parametrlər və giriş bir fayla",
        "Library: pick its tiles, or put your playlists first (the edit button at the top of Library)" to "Kitabxana: plitələrini seçin və ya pleylistlərinizi önə qoyun (Kitabxananın yuxarısındakı redaktə düyməsi)",
        "Licenses" to "Lisenziyalar",
        "Light" to "Yüngül",
        "Light mode" to "İşıqlı rejim",
        "Light mode accent" to "Açıq rejim vurğusu",
        "Light pages get an accent of their own" to "Açıq səhifələr özünəməxsus vurğu əldə edir",
        "Light theme" to "Açıq tema",
        "Like Theme: System, for whole Looks. Sunrise and sunset are worked out from your time zone, without your location. A Look you pick in between stays until the next switch." to "Bütün Görünüşlər üçün Tema: Sistem kimidir. Gün çıxması və gün batması məkanınız olmadan saat qurşağınızdan hesablanır. Arada seçdiyiniz Görünüş növbəti keçidə qədər qalır.",
        "Like a lyric video. Tap the screen for its settings; press Back, or hold the settings button, to leave. It's also in the player's ⋯ menu." to "Mahnı sözü videosu kimi. Parametrləri üçün ekrana toxunun; çıxmaq üçün Geri basın və ya parametrlər düyməsini basıb saxlayın. Həmçinin oxuducunun ⋯ menyusundadır.",
        "Like or download songs, or star artists, and they'll show up here." to "Mahnıları bəyənin və ya endirin, ya da sənətçilərə ulduz verin; burada görünəcəklər.",
        "Like songs from your phone (♥ on the player or in a song's menu) and they gather here." to "Telefonunuzdakı mahnıları bəyənin (oxuducuda ♥ və ya mahnı menyusunda), burada toplanacaqlar.",
        "Liked a song and its video? They show once, as the song" to "Mahnını və videosunu bəyəndiniz? Mahnı kimi bir dəfə görünürlər",
        "Liked both? They show once, as the song" to "Hər ikisini bəyəndiniz? Mahnı kimi bir dəfə göstərilir",
        "Liked songs" to "Bəyənilən mahnılar",
        "Liked songs playlist" to "Bəyənilən mahnılar pleylisti",
        "Liked songs, Downloads and the music files on your phone" to "Bəyənilən mahnılar, Endirmələr və telefonunuzdakı musiqi faylları",
        "Likes as stars" to "Bəyənmələr ulduz kimi",
        "Lines to come" to "Gələcək sətirlər",
        "Link" to "Keçid",
        "Liquid Glass" to "Axıcı Şüşə",
        "Listen again" to "Yenidən dinlə",
        "Listen for a while — songs you play for 10 seconds or more count toward your Replay." to "Bir müddət dinləyin — 10 saniyə və ya daha çox oxutduğunuz mahnılar Təkrar xülasənizə sayılır.",
        "Listen from here" to "Buradan dinlə",
        "Listen together plays in step with friends on the same Wi-Fi" to "Birlikdə Dinlə, eyni Wi-Fi-dakı dostlarla eyni vaxtda oxudur",
        "Listened" to "Dinlənildi",
        "Listening" to "Dinləyənlər",
        "Load ahead" to "Qabaqcadan yüklə",
        "Load ahead on mobile data" to "Mobil datada qabaqcadan yüklə",
        "Loading" to "Yüklənir",
        "Lock screen and notification" to "Kilid ekranı və bildiriş",
        "Long-press an album or playlist → Play as a DJ set" to "Alboma və ya pleylistə uzun basın → DJ seti kimi oxut",
        "Longest first" to "Ən uzun başda",
        "Look" to "Görünüş",
        "Look & feel" to "Görünüş və hissiyyat",
        "Look now" to "İndi bax",
        "Looking on this Wi-Fi…" to "Bu Wi-Fi şəbəkəsində axtarılır…",
        "Looking round your artists…" to "Sənətçilərinizə baxılır…",
        "Looks" to "Görünüşlər",
        "Looks people shared on GitHub" to "İstifadəçilərin GitHub-da paylaşdığı Görünüşlər",
        "Looks you save show here. Save one above, or get one from a friend below." to "Saxladığınız Görünüşlər burada göstərilir. Yuxarıdan saxlayın və ya aşağıdan dostunuzdan əldə edin.",
        "Lossless" to "İtkisiz",
        "Lossless playback" to "İtkisiz oxutma",
        "Lossless · Crossfade · Normalized" to "İtkisiz · Çarpaz Keçid · Normallaşdırılmış",
        "Lyrics" to "Mahnı sözləri",
        "Lyrics font" to "Mahnı sözləri şrifti",
        "Lyrics in the car" to "Avtomobildə mahnı sözləri",
        "Lyrics on mobile data" to "Mobil datada mahnı sözləri",
        "Lyrics on the cover only" to "Mahnı sözləri yalnız üzlükdə",
        "Lyrics position" to "Mahnı sözlərinin yeri",
        "Lyrics timing" to "Mahnı sözlərinin vaxtı",
        "Lyrics, your way" to "Mahnı sözləri, sizin tərzinizdə",
        "MMMM d" to "d MMMM",
        "MORE" to "DAHA ÇOX",
        "Made for you" to "Sizin üçün hazırlandı",
        "Made for you also has mixes from your own music, and On repeat: they come from your plays alone and work offline" to "Sizin Üçün Hazırlandı həmçinin öz musiqinizdən mikslər və Təkrarda siyahısını ehtiva edir: yalnız dinləmələrinizdən yaranır və oflayn işləyir",
        "Made for you: Daily Mixes, your time-of-day mix and Release Radar" to "Sizin üçün hazırlandı: Gündəlik Mikslər, günün saatına uyğun miksiniz və Yeni Buraxılışlar Radarı",
        "Made on your phone from what you play" to "Dinlədikləriniz əsasında telefonunuzda yaradıldı",
        "Made with Prism" to "Prism ilə hazırlanıb",
        "Made with Prism Replay" to "Prism Replay ilə yaradılıb",
        "Make a Prism Account" to "Prism Hesabı Yarat",
        "Make it yours" to "Özünüzə uyğunlaşdırın",
        "Make my mixes again" to "Mikslərimi yenidən yarat",
        "Make one on YouTube Music" to "YouTube Music-də birini yaradın",
        "Make one with New playlist, or from any song's menu (Add to playlist). They're kept on this phone, no account needed." to "Yeni pleylist ilə və ya hər hansı bir mahnının menyusundan (Pleylistə əlavə et) birini yaradın. Hesaba ehtiyac olmadan bu telefonda saxlanılırlar.",
        "Make playlist" to "Pleylist yarat",
        "Make playlists and save albums: without an account they're kept on this phone" to "Pleylistlər yaradın və albomları yadda saxlayın: hesab olmadan bu telefonda saxlanılırlar",
        "Make the Blend" to "Blend Yarat",
        "Make unlisted" to "Siyahıdan kənar et",
        "Makes a YouTube Music playlist of every song you've liked, one you can share, pin or open in other apps. Prism keeps it up to date: songs you like are added, songs you unlike are taken out." to "Bəyəndiyiniz hər mahnıdan paylaşa biləcəyiniz və ya başqa tətbiqlərdə aça biləcəyiniz bir YouTube Music pleylisti yaradır. Prism bunu yenilənmiş saxlayır.",
        "Making it…" to "Yaradılır…",
        "Manage downloads" to "Endirmələri idarə et",
        "Mark a stutter" to "Kəkələməni işarələ",
        "Match again" to "Yenidən uyğunlaşdır",
        "Match tempo and beats (DJ-style)" to "Tempo və ritmləri uyğunlaşdır (DJ üslubu)",
        "Matched automatically — the video lines up with the song." to "Avtomatik uyğunlaşdırıldı — video mahnı ilə tam uyğundur.",
        "Matching the lyrics to the video's audio…" to "Mahnı sözləri videonun səsi ilə uyğunlaşdırılır…",
        "Measure songs on mobile data" to "Mahnıları mobil datada analiz et",
        "Medium" to "Orta",
        "Mini player" to "Mini pleyer",
        "Minutes by month" to "Aylara görə dəqiqələr",
        "Mixes made on your phone from what you play. Nothing about your listening leaves it." to "Dinlədiklərinizdən telefonunuzda yaradılan mikslər. Dinləmə məlumatlarınız heç vaxt kənara çıxmır.",
        "Mobile data" to "Mobil data",
        "Monday 19 October" to "19 Oktyabr Bazar ertəsi",
        "More about" to "Haqqında ətraflı məlumat",
        "More about %s" to "%s haqqında ətraflı məlumat",
        "More episodes" to "Daha çox epizod",
        "More room; swipe down from the top to see it" to "Daha çox yer; görmək üçün yuxarıdan aşağı sürüşdürün",
        "Most first" to "Ən çox olan başda",
        "Motion" to "Hərəkət",
        "Motion artwork and video covers. Turn them off for one song from the player's ⋯ menu." to "Hərəkətli üzlüklər və video üzlükləri. Pleyerin ⋯ menyusundan tək bir mahnı üçün onları bağlaya bilərsiniz.",
        "Move down" to "Aşağı daşı",
        "Move music between your Prism devices" to "Musiqini Prism cihazlarınız arasında ötürün",
        "Move the key up or down to suit your voice" to "Səsinizə uyğunlaşdırmaq üçün tonu yuxarı və ya aşağı kökləyin",
        "Move the music there" to "Musiqini ora köçür",
        "Move up" to "Yuxarı daşı",
        "Moves the song up or down to suit your voice (the tempo stays)." to "Mahnını səsinizə uyğun olaraq yuxarı və ya aşağı kökləyir (tempo eyni qalır).",
        "Moving artwork, when a song has it" to "Mahnıda olduqda hərəkətli üzlük təsviri",
        "Music beyond your phone." to "Telefonunuzdan kənarda musiqi.",
        "Music buffer" to "Musiqi buferi",
        "Music files on this phone" to "Bu telefondakı musiqi faylları",
        "Music video" to "Musiqi videosu",
        "Music video quality" to "Musiqi videosu keyfiyyəti",
        "Music videos in search, albums, playlists, Liked songs and downloads play as their song, with its album and cover. The Video button still shows the video; a video with no song plays as it is." to "Axtarışdakı, albomlardakı, pleylistlərdəki, Bəyənilən mahnılardakı və endirmələrdəki musiqi videoları öz albomu və üz qabığı ilə mahnı kimi oxunur. Video düyməsi videonu göstərməyə davam edir; mahnısı olmayan video olduğu kimi oxunur.",
        "NEW TO YOU" to "SİZİN ÜÇÜN YENİ",
        "Navigation" to "Naviqasiya",
        "Navigation bar" to "Naviqasiya zolağı",
        "Near the top" to "Yuxarıya yaxın",
        "Never download songs over mobile data" to "Mobil data ilə heç vaxt mahnı endirmə",
        "New YouTube Music shelves appear on Home" to "Yeni YouTube Music rəfləri Əsas səhifədə görünür",
        "New albums, singles and EPs from artists you listen to" to "Dinlədiyiniz sənətçilərdən yeni albomlar, sinqllar və EP-lər",
        "New code" to "Yeni kod",
        "New playlist" to "Yeni pleylist",
        "New release notifications" to "Yeni buraxılış bildirişləri",
        "New releases from artists you star" to "Ulduzladığınız sənətçilərdən yenilər",
        "New shelves from YouTube Music appear at the bottom" to "YouTube Music-in yeni rəfləri ən aşağıda görünür",
        "New to you both, like what you share" to "Paylaşdıqlarınız kimi hər ikiniz üçün yeni",
        "Newest first" to "Ən yeni başda",
        "Next button" to "Növbəti düyməsi",
        "Next song" to "Növbəti mahnı",
        "Night starts at" to "Gecə başlanğıcı",
        "No Podcasts page here" to "Burada Podkastlar səhifəsi yoxdur",
        "No albums yet" to "Hələ albom yoxdur",
        "No artists yet" to "Hələ sənətçi yoxdur",
        "No black bars when a video plays as a song" to "Video mahnı kimi oxunarkən qara zolaqlar olmur",
        "No community Looks yet. Yours could be the first." to "Hələ icma Görünüşü yoxdur. Birinci sizinki ola bilər.",
        "No downloads yet" to "Hələ endirmə yoxdur",
        "No drifting backgrounds, no artwork bounce, quicker transitions." to "Süzülən arxa planlar və üzlük sıçrayışı yoxdur, daha cəld keçidlər.",
        "No favourites yet" to "Hələ sevimli yoxdur",
        "No history on your account" to "Hesabınızda tarixçə tapılmadı",
        "No liked songs yet" to "Hələ bəyənilən mahnı yoxdur",
        "No lyrics found" to "Mahnı sözü tapılmadı",
        "No matches" to "Uyğunluq yoxdur",
        "No music files found" to "Musiqi faylı tapılmadı",
        "No one yet." to "Hələ heç kim yoxdur.",
        "No results" to "Nəticə yoxdur",
        "No synced lyrics for this song, so the car shows it as usual." to "Bu mahnı üçün sinxron sözlər yoxdur, buna görə avtomobil adi qaydada göstərir.",
        "None" to "Heç biri",
        "None found. They show here when they're on this Wi-Fi with Google Cast (Chromecast, Google TV) or DLNA / UPnP (often called media sharing)." to "Heç bir cihaz tapılmadı. Bu Wi-Fi şəbəkəsində Google Cast və ya DLNA / UPnP ilə açıq olduqda burada görünəcəklər.",
        "Normalization" to "Səs normallaşdırılması",
        "Normalize volume" to "Səs səviyyəsini normallaşdır",
        "Normalize volume and Crossfade measure each song once: its loudness, how its music starts and ends, its beat. Songs on your phone are measured from there. Off, the rest wait for Wi-Fi." to "Səsi normallaşdır və Çarpaz Keçid hər mahnını bir dəfə ölçür: səs ucalığı, musiqinin necə başlayıb bitməsi, zərbəsi. Telefonunuzdakı mahnılar oradan ölçülür. Qapalı olduqda qalanı Wi-Fi gözləyir.",
        "Normalized" to "Normallaşdırılmış",
        "Northern Lights" to "Qütb Parıltısı",
        "Not available for this song" to "Bu mahnı üçün mövcud deyil",
        "Not now" to "İndi yox",
        "Not showing up for them? They can join with" to "Onlarda görünmür? Bununla qoşula bilərlər:",
        "Not showing up for them? They can join with " to "Onlarda görünmür? Bununla qoşula bilərlər: ",
        "Nothing" to "Heç nə",
        "Nothing downloaded yet" to "Hələ heç nə endirilməyib",
        "Nothing here yet" to "Hələlik burada heç nə yoxdur",
        "Nothing matches these filters. Try a longer time or another type." to "Bu filtrlərlə uyğunlaşan heç nə tapılmadı. Daha uzun vaxt kəsiyi və ya başqa növ yoxlayın.",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred," to "Son üç ayda sənətçilərinizdən yeni heç nə yoxdur. Prism ulduzladığınız sənətçiləri bir neçə gündən bir yoxlayır,",
        "Nothing on this phone matches" to "Bu telefonda uyğun gələn heç nə yoxdur",
        "Nothing played yet" to "Hələ heç nə oxunmayıb",
        "Nothing recognized yet" to "Hələ tanınmış mahnı yoxdur",
        "Nothing to replay yet" to "Hələ təkrar olunacaq heç nə yoxdur",
        "Notification and car" to "Bildiriş və avtomobil",
        "Notifications are on." to "Bildirişlər aktivdir.",
        "Now" to "İndi",
        "Now playing" to "İndi oxunur",
        "Number of albums" to "Albom sayı",
        "Number of songs" to "Mahnı sayı",
        "Off" to "Bağlı",
        "Off, Podcasts opens from Library → Playlists." to "Bağlı olduqda Podkastlar Kitabxana → Pleylistlər bölməsindən açılır.",
        "Off, Prism doesn't look up lyrics on mobile data until you open them (the player's lyrics, Immersive mode or the source list). Lyrics already saved on the phone still show, and on Wi-Fi nothing changes." to "Qapalı olanda Prism siz açana qədər (oxuducu sözləri, İmmersiv rejim və ya mənbə siyahısı) mobil internetdə mahnı sözlərini axtarmır. Telefonda artıq saxlanılan sözlər göstərilməyə davam edir, Wi-Fi-da heç nə dəyişmir.",
        "Off, it can recognize what Prism itself is playing" to "Söndürüldükdə, Prism-in özünün oxutduğu mahnıları da tanıya bilər",
        "Off, songs are only loaded ahead on Wi-Fi. Whole songs loaded ahead count toward Smart Downloads' space." to "Qapalı olduqda mahnılar yalnız Wi-Fi-da qabaqcadan yüklənir. Qabaqcadan yüklənən tam mahnılar Ağıllı Endirmələr yerinə daxil edilir.",
        "Oldest first" to "Ən köhnə başda",
        "On" to "Açıq",
        "On December 1, when your year is ready" to "İl xülasəniz hazır olduqda 1 Dekabrda",
        "On mobile data: pictures at the size they're shown, no artist photos for lists, no animated covers (saved ones still play), songs at your mobile data quality and at most Normal (even with lossless on), and videos at 480p at most. Wi-Fi is unaffected." to "Mobil internetdə: şəkillər göstərildiyi ölçüdə, siyahılar üçün sənətçi şəkli yoxdur, animasiyalı üz qabığı yoxdur (saxlanılanlar oxudulur), mahnılar mobil internet keyfiyyətinizdə və ən çox Normal (itkisiz açıq olsa belə) və videolar ən çox 480p. Wi-Fi təsirlənmir.",
        "On the car's player" to "Avtomobilin pleyerində",
        "On the player's cover. Swiping down always closes the player." to "Pleyerin üzlüyündə. Aşağı sürüşdürmək həmişə pleyeri bağlayır.",
        "On this phone" to "Bu telefonda",
        "On this phone too" to "Bu telefonda da",
        "On top of your phone's own text size." to "Telefonunuzun öz mətn ölçüsünə əlavə olaraq.",
        "On, the line above the progress bar and immersive mode draw the lyrics in the style, colors, weight and capitals picked here. Off, they keep Prism's own look." to "Açıq olanda, irəliləyiş zolağının üstündəki sətir və immersiv rejim mahnı sözlərini burada seçilən tərz, rənglər, qalınlıq və böyük hərflərlə göstərir. Qapalı olanda Prism-in öz görünüşünü saxlayırlar.",
        "One Look by day and another by night, at sunrise and sunset" to "Gün çıxanda və gün batanda; gündüz bir Görünüş, gecə başqa bir Görünüş",
        "One Look by day, another by night" to "Gündüz bir Görünüş, gecə başqa Görünüş",
        "One color" to "Tək rəng",
        "One color taken from the cover" to "Üz qabığından götürülən tək bir rəng",
        "One moment…" to "Bir dəqiqə…",
        "One space for music on your phone: songs you stream stay, so replays start at once and use no data, and the songs you're most likely to play next are downloaded ahead, a little at a time. When it's full, the songs you're least likely to come back to make room. Learned on your phone from what you play, finish, skip and like. Off, it only keeps songs you've played." to "Telefonunuzdakı musiqi üçün tək bir yer: dinlədiyiniz mahnılar qalır, beləliklə təkrar ifalar dərhal başlayır və internet sərf etmir; ardınca oxutmağınız ən çox ehtimal olunan mahnılar az-az qabaqcadan endirilir. Dolduqda, yenidən qulaq asma ehtimalınız ən az olan mahnılar yer açır. Nə oxutduğunuz, bitirdiyiniz, ötürdüyünüz və bəyəndiyinizə əsasən telefonunuzda öyrənilir. Qapalı olduqda yalnız oxutduğunuz mahnıları saxlayır.",
        "Ones that aren't connected yet" to "Hələ qoşulmayanlar",
        "Only if the font's license lets you share it" to "Yalnız şriftin lisenziyası paylaşmağa icazə verirsə",
        "Only you can see it." to "Yalnız siz görə bilərsiniz.",
        "Only your name and picture go. Your likes, playlists, downloads, Replay and everything else on this phone stay as they are." to "Yalnız adınız və şəkliniz silinir. Bəyənmələriniz, pleylistləriniz, endirmələriniz, Təkrar xülasəniz və bu telefondakı digər hər şey olduğu kimi qalır.",
        "Open Library on" to "Kitabxananı burada aç:",
        "Open Prism on" to "Prism-i burada aç:",
        "Open a Look file" to "Görünüş faylı aç",
        "Open album" to "Albomu aç",
        "Open downloads →" to "Endirmələri aç →",
        "Open on GitHub" to "GitHub-da aç",
        "Open the keyboard" to "Klaviaturanı aç",
        "Open the playlist" to "Pleylisti aç",
        "Open them from the button under the controls. Many songs light up word by word." to "İdarəedicilərin altındakı düymədən açın. Bir çox mahnı kəlmə-kəlmə aydınlanır.",
        "Open-source licenses" to "Açıq mənbə lisenziyaları",
        "Optional: your library, history and recommendations" to "İstəyə bağlı: kitabxananız, tarixçəniz və tövsiyələriniz",
        "Options" to "Seçimlər",
        "Or a cover from this playlist" to "Və ya bu pleylistdən bir üz qabığı",
        "Or sign in to bring your YouTube Music playlists" to "Və ya YouTube Music pleylistlərinizi gətirmək üçün daxil olun",
        "Or sign in to sync your YouTube Music library" to "Və ya YouTube Music kitabxananızı sinxronlaşdırmaq üçün daxil olun",
        "Order" to "Sıralama",
        "Original order" to "Orijinal sıralama",
        "Other Bluetooth devices" to "Digər Bluetooth cihazları",
        "Other devices with Prism on this Wi-Fi can move what they're playing here, or bring it over. On the device that's playing, open the player's device list and pick this one under Prism devices (Prism has to be open or playing here). The first time, a code shows to type in." to "Bu Wi-Fi-dakı Prism quraşdırılmış digər cihazlar oxutduqlarını bura daşıya və ya bura gətirə bilər. Oxudan cihazda oxuducunun cihaz siyahısını açın və Prism cihazları bölməsindən bunu seçin (Prism burada açıq və ya oxudur olmalıdır). İlk dəfə daxil etmək üçün kod göstərilir.",
        "Other scripts in Latin letters, to sing along." to "Birlikdə oxumaq üçün digər əlifbaların latın hərfləri ilə yazılışı.",
        "Other versions" to "Digər versiyalar",
        "Otherwise they wait for Wi-Fi" to "Əks halda Wi-Fi gözləyir",
        "Out of step" to "Sinxron xaricində",
        "Over the line" to "Sətrin üstündə",
        "PREVIEW" to "ÖNCƏDƏN BAXIŞ",
        "PRIME TIME" to "ƏN ÇOX DİNLƏNİLƏN SAAT",
        "PRISM" to "PRISM",
        "PUBLIC" to "HAMIYA AÇIQ",
        "Pack" to "Paket",
        "Page background" to "Səhifə arxa planı",
        "Page titles" to "Səhifə başlıqları",
        "Pages" to "Səhifələr",
        "Pages frosted with their picture" to "Şəkilləri ilə buzlanmış səhifələr",
        "Pair" to "Cütləşdir",
        "Paired" to "Cütləşdirildi",
        "Pairing code" to "Cütləşdirmə kodu",
        "Paste a Look code" to "Görünüş kodu yapışdır",
        "Paste a code" to "Kod yapışdır",
        "Paste a color code" to "Rəng kodunu yapışdır",
        "Phone speaker" to "Telefon dinamiki",
        "Photos" to "Fotoşəkillər",
        "Pick a cover" to "Üzlük seç",
        "Pick a few artists you like" to "Bəyəndiyiniz bir neçə sənətçini seçin",
        "Pick a moment on the bar" to "Zolaq üzərindən bir an seçin",
        "Pick a photo" to "Fotoşəkil seç",
        "Pick a picture" to "Şəkil seçin",
        "Pick artists you like" to "Bəyəndiyiniz sənətçiləri seçin",
        "Pick it from the device line on the player" to "Pleyerdəki cihaz sətrindən seçin",
        "Pick the buttons under the controls (speed is one), and the two beside play in your notification and car" to "İdarəedicilərin altındakı düymələri (sürət bunlardan biridir) və bildirişinizlə avtomobilinizdə oxutmanın yanındakı iki düyməni seçin",
        "Pick these headphones from thousands measured by AutoEq, to make them sound neutral (the Harman target)" to "Səslərini neytral etmək üçün AutoEq tərəfindən ölçülmüş qulaqlıqlar arasından seçim edin",
        "Pick where the music plays" to "Musiqinin harada oxunacağını seçin",
        "Picked" to "Seçildi",
        "Picked for this queue by Smart Shuffle" to "Ağıllı Qarışıq tərəfindən bu növbə üçün seçildi",
        "Pill bar" to "Kapsul zolaq",
        "Pin Prism playlists to Home (Customize Home → Pinned playlists)" to "Prism pleylistlərini Əsas Səhifəyə sancaq vurun (Əsas Səhifəni Fərdiləşdir → Sancaq vurulmuş pleylistlər)",
        "Pinned" to "Sancaqlandı",
        "Pinned playlists" to "Sancaq vurulmuş pleylistlər",
        "Plain text" to "Sadə mətn",
        "Play / pause" to "Oxut / fasilə ver",
        "Play a song to see how its lyrics look in the car." to "Mahnı sözlərinin avtomobildə necə göründüyünü görmək üçün bir mahnı oxudun.",
        "Play here too" to "Burada da oxut",
        "Play on a speaker or TV" to "Dinamikdə və ya televizorda oxut",
        "Play on mobile data" to "Mobil datada oxut",
        "Play on speakers, TVs and Chromecasts: tap the device line under the controls" to "Dinamiklərdə, TV-lərdə və Chromecast-lərdə oxudun: idarəedicilərin altındakı cihaz sətirinə toxunun",
        "Play something and everyone hears it" to "Bir şey oxudun və hamı eşitsin",
        "Play the song to see its audio details" to "Səs detallarını görmək üçün mahnını oxudun",
        "Play the songs on your phone (MP3, M4A, FLAC, OGG, WAV…) in Prism. They stay where they are; Prism only reads them." to "Telefonunuzdakı mahnıları (MP3, M4A, FLAC, OGG, WAV…) Prism-də oxudun. Fayllarınız yerində qalır; Prism yalnız onları oxuyur.",
        "Play, pause and skip from their phones too. They can always add songs." to "Öz telefonlarından da oxuda, dayandıra və keçə bilərlər. Həmişə mahnı əlavə edə bilərlər.",
        "Play, search, and see the queue and lyrics. Only browsers on this Wi-Fi that type a code shown here get in, and only while Prism is open or playing. Nothing goes through the internet." to "Oxudun, axtarın, növbəni və mahnı sözlərini görün. Yalnız bu Wi-Fi-da burada göstərilən kodu yazan brauzerlər daxil ola bilər və yalnız Prism açıq və ya oxudarkən işləyir. İnternetdən heç nə keçmir.",
        "Playback" to "Oxutma",
        "Playback diagnostics" to "Oxutma diaqnostikası",
        "Playback speed" to "Oxutma sürəti",
        "Playback stops for a moment" to "Oxutma bir anlıq dayanır",
        "Player settings" to "Pleyer parametrləri",
        "Player: its background, the cover and what shows on it" to "Oxuducu: arxa planı, üz qabığı və üzərində göstərilənlər",
        "Playing" to "Oxunur",
        "Playlist •" to "Pleylist •",
        "Playlists" to "Pleylistlər",
        "Plug in or connect your headphones to pick their correction." to "Korreksiyanı seçmək üçün qulaqlığınızı taxın və ya qoşun.",
        "Podcast" to "Podkast",
        "Podcasts" to "Podkastlar",
        "Podcasts (the button at the top of Home) has its own search for shows and episodes" to "Podkastlar (Əsas Səhifənin yuxarısındakı düymə) proqramlar və epizodlar üçün öz axtarışına malikdir",
        "Podcasts button" to "Podkastlar düyməsi",
        "Pop" to "Pop",
        "Popular" to "Populyar",
        "Prefer karaoke & synced lyrics" to "Karaoke və sinxronlaşdırılmış sözlərə üstünlük ver",
        "Premium quality" to "Premium keyfiyyət",
        "Previous button" to "Əvvəlki düyməsi",
        "Previous song" to "Əvvəlki mahnı",
        "Previous, play and next stay up" to "Əvvəlki, oxut və növbəti düymələri ekranda qalır",
        "Prism" to "Prism",
        "Prism Connect" to "Prism Connect",
        "Prism Music's Podcasts page isn't offered in your country. Search can still find shows and episodes: search, then pick Podcasts or Episodes." to "Prism Music-in Podkastlar səhifəsi ölkənizdə təklif olunmur. Axtarışla şouları və epizodları tapa bilərsiniz: axtarın, sonra Podkastları və ya Epizodları seçin.",
        "Prism Sample" to "Prism Nümunəsi",
        "Prism Spatial" to "Prism Məkan",
        "Prism also checks on its own" to "Prism özü də yoxlayır",
        "Prism also tries them again by itself when the phone is back online." to "Telefon yenidən onlayn olduqda Prism özü bunları yenidən cəhd edir.",
        "Prism can soften it to suit dark and light pages, or use it exactly." to "Prism bunu tünd və açıq səhifələrə uyğunlaşdırmaq üçün yumşalda bilər və ya olduğu kimi istifadə edə bilər.",
        "Prism devices" to "Prism cihazları",
        "Prism font" to "Prism şrifti",
        "Prism has no server" to "Prism server istifadə etmir",
        "Prism listens for up to 12 seconds. The sound stays on your phone: only a fingerprint of it goes to Shazam to find the song." to "Prism 12 saniyəyə qədər dinləyir. Səs telefonunuzda qalır: mahnını tapmaq üçün Shazam-a yalnız səsin rəqəmsal izi göndərilir.",
        "Prism listens to how each song ends and the next begins: a long blend over a fade-out or quiet intro, a short one between two hard edges." to "Prism hər mahnının necə bitdiyini və digərinin necə başladığını analiz edir: sakit girişlərdə uzun keçid, sərt keçidlərdə qısa keçid.",
        "Prism needs the camera to scan a code" to "Prism kodu skan etmək üçün kameraya ehtiyac duyur",
        "Prism normally fetches songs without your account, which starts them fastest but gets YouTube's standard 128–160 kbps stream. On, each song is asked for as you, and with Music Premium that brings its 256 kbps version. Songs can take a moment longer to start. Without Premium, Prism notices and plays as usual. YouTube Music has no lossless streams, even with Premium." to "Prism normalda mahnıları hesabınız olmadan gətirir; bu ən sürətli başladır, lakin YouTube-un standart 128–160 kbps axınını alır. Açıq olanda, hər mahnı sizin adınızdan istənilir və Music Premium ilə 256 kbps versiyası gətirilir. Mahnıların başlaması bir anlıq daha çox vaxt apara bilər. Premium olmadan Prism bunu anlayır və həmişəki kimi oxudur. YouTube Music-də Premium ilə belə itkisiz axın yoxdur.",
        "Prism playlists" to "Prism pleylistləri",
        "Prism scrolls, searches and opens the player more smoothly, most of all on older phones." to "Prism, xüsusilə köhnə telefonlarda daha rəvan sürüşdürür, axtarır və oxuducunu açır.",
        "Prism style" to "Prism tərzi",
        "Prism takes its color from what's playing. Change as much of it as you like." to "Prism rəngini oxunan mahnıdan alır. İstədiyiniz qədərini dəyişə bilərsiniz.",
        "Prism tells Android which of its parts to get ready ahead, and updates from the banner come ready, so they no longer run slow" to "Prism, Android-ə hansı hissələrini qabaqcadan hazırlayacağını bildirir və başlıqdan gələn yeniləmələr hazır gəlir, buna görə artıq yavaş işləmirlər",
        "Prism's Looks" to "Prism Görünüşləri",
        "Prism's library, history and settings on this phone are replaced with the backup's, then Prism restarts." to "Bu telefondakı Prism kitabxanası, tarixçəsi və parametrləri ehtiyat nüsxədəki ilə əvəz olunur, sonra Prism yenidən başlayır.",
        "Prism's own volume" to "Prism-in öz səs səviyyəsi",
        "Prism's own volume, apart from the phone's (Settings → Player)" to "Telefonunkindən asılı olmayaraq Prism-in öz səs səviyyəsi (Parametrlər → Oxuducu)",
        "Private" to "Məxfi",
        "Progress" to "Tərəqqi",
        "Progress bar" to "İrəliləyiş zolağı",
        "Progress bar color" to "İrəliləyiş zolağı rəngi",
        "Progress line" to "Tərəqqi xətti",
        "Project page" to "Layihə səhifəsi",
        "Public" to "İctimai",
        "Pure black" to "Xalis qara",
        "Put the lyric line, progress bar, controls and volume in your order" to "Söz sətirini, irəliləyiş zolağını, idarəediciləri və səs səviyyəsini öz ardıcıllığınıza qoyun",
        "Quality" to "Keyfiyyət",
        "Quick picks" to "Cəld seçimlər",
        "Quick picks start a radio" to "Cəld seçimlər radio başladır",
        "Quick picks: songs around the artists you play, swipe across for more" to "Sürətli seçimlər: dinlədiyiniz sənətçilər ətrafında mahnılar, daha çoxu üçün sürüşdürün",
        "Ready for when you're offline" to "Oflayn olduğunuz vaxtlar üçün hazır",
        "Ready to type when Search opens" to "Axtarış açıldıqda yazmağa hazır",
        "Rearrange playlists" to "Pleylistləri yenidən nizamla",
        "Recent searches" to "Son axtarışlar",
        "Recently added" to "Son əlavə edilənlər",
        "Recently played albums" to "Son oxudulan albomlar",
        "Recently played covers" to "Son oxudulan üz qabıqları",
        "Recognize" to "Tanı",
        "Recognize a song" to "Mahnı tanı",
        "Recognize songs from your home screen" to "Əsas ekranınızdan mahnıları tanıyın",
        "Recognized" to "Tanınanlar",
        "Recommendations" to "Tövsiyələr",
        "Reduce motion" to "Hərəkəti azalt",
        "Reduce motion is on, so it stays still." to "Hərəkəti azalt açıqdır, ona görə sabit qalır.",
        "Reduced motion" to "Azaldılmış hərəkət",
        "Refractive bars and controls" to "Qırılmalı zolaqlar və idarəetmələr",
        "Refresh the list" to "Siyahını yenilə",
        "Region" to "Region",
        "Regular" to "Normal",
        "Release Radar finds new music from the artists you follow" to "Yeni Buraxılışlar Radarı izlədiyiniz sənətçilərin yeni musiqilərini tapır",
        "Remove Prism Account" to "Prism Hesabını Sil",
        "Remove from playlist" to "Pleylistdən sil",
        "Remove from this playlist" to "Bu pleylistdən sil",
        "Remove the lyrics font file" to "Mahnı sözü şrift faylını sil",
        "Remove this Blend" to "Bu Blend-i sil",
        "Remove this account?" to "Bu hesab silinsin?",
        "Remove your Prism Account?" to "Prism Hesabınız silinsin?",
        "Remove your font" to "Şriftinizi silin",
        "Removes the songs it downloaded ahead and the ones kept from streaming." to "Qabaqcadan endirdiyi mahnıları və axından saxlanılanları silir.",
        "Rename" to "Adını dəyişdir",
        "Replaces what's here, then restarts" to "Buradakıları əvəz edir, sonra yenidən başlayır",
        "Replay and Rewind" to "Replay və Rewind",
        "Replay card" to "Replay kartı",
        "Replay: your top songs, artists and genres for any stretch of time" to "Replay: istənilən vaxt aralığı üçün ən yaxşı mahnılarınız, sənətçiləriniz və janrlarınız",
        "Reset all to Ambient" to "Hamısını Ambiyansa sıfırla",
        "Reset colors to defaults" to "Rəngləri defolta sıfırla",
        "Reset colors?" to "Rənglər sıfırlansın?",
        "Reset look & layout to defaults" to "Görünüş və düzəni defolta sıfırla",
        "Reset look & layout?" to "Görünüş və düzən sıfırlansın?",
        "Reset this page" to "Bu səhifəni sıfırla",
        "Restart Prism to see its icons" to "Nişanlarını görmək üçün Prism-i yenidən başladın",
        "Restart Prism to see them" to "Görmək üçün Prism-i yenidən başladın",
        "Restore" to "Bərpa et",
        "Restore from a backup" to "Ehtiyat nüsxədən bərpa et",
        "Restore this backup?" to "Bu ehtiyat nüsxəsi bərpa edilsin?",
        "Restoring…" to "Bərpa olunur…",
        "Reverse" to "Əksinə çevir",
        "Rewind notification" to "Geri Sarma bildirişi",
        "Rewind: your year in music, as a story, each December" to "Rewind: hər Dekabrda hekayə kimi musiqi ilə keçən iliniz",
        "Rock" to "Rok",
        "Romanize lyrics" to "Mahnı sözlərini latınlaşdır",
        "Romanize my own language too" to "Mənim dilimi də latın əlifbasına çevir",
        "Round ends and softer corners" to "Dairəvi uclar və daha yumşaq künclər",
        "Rounded" to "Dairəvi",
        "SAPISID" to "SAPISID",
        "Same as Home" to "Əsas səhifə ilə eyni",
        "Same look everywhere" to "Hər yerdə eyni görünüş",
        "Same on every screen" to "Hər ekranda eyni",
        "Save animated cover" to "Animasiyalı üzlüyü saxla",
        "Save as a Look" to "Görünüş kimi saxla",
        "Save as a playlist" to "Pleylist kimi saxla",
        "Save as new" to "Yeni kimi saxla",
        "Save lyrics into your music files" to "Mahnı sözlərini musiqi fayllarınıza saxlayın",
        "Save on mobile data too" to "Mobil datada da saxla",
        "Save one from the player's ⋯ menu and it never has to load again." to "Oxuducunun ⋯ menyusundan yadda saxlayın və bir daha yüklənməyə ehtiyac qalmasın.",
        "Save the new Prism" to "Yeni Prism-i saxla",
        "Save to YouTube Music" to "YouTube Music-də saxla",
        "Save with downloads" to "Endirmələrlə birlikdə saxla",
        "Save your Look, share it as text, and add its code to themes/index.json in Prism's repository. The page says how." to "Görünüşünüzü yadda saxlayın, mətn kimi paylaşın və kodunu Prism-in repozitoriyasındakı themes/index.json faylına əlavə edin. Səhifə necə ediləcəyini izah edir.",
        "Save yours, update it when you change it, and share it as a QR code, a code or a file" to "Özünüzünkünü yadda saxlayın, dəyişdikdə yeniləyin və QR kod, kod və ya fayl kimi paylaşın",
        "Save, switch and share whole looks; day and night" to "Görünüşləri saxlayın, dəyişin və paylaşın; gündüz və gecə",
        "Saved animated covers" to "Saxlanılan animasiyalı üzlüklər",
        "Saved covers play either way" to "Saxlanılan üzlüklər hər iki halda oxunur",
        "Scan a Look's QR code" to "Görünüşün QR kodunu skan et",
        "Scan a code" to "Kodu skan et",
        "Scan for lossless files again" to "İtkisiz faylları yenidən axtar",
        "Scan it in Prism: Appearance → Looks → Scan" to "Prism-də skan edin: Görünüş → Görünüşlər → Skan et",
        "Screen" to "Ekran",
        "Screen backgrounds" to "Ekran arxa planları",
        "Scrolling titles" to "Sürüşən başlıqlar",
        "Search" to "Axtar",
        "Search Settings from the box at the top of Settings" to "Parametrlərin yuxarısındakı qutudan Parametrlər daxilində axtarın",
        "Search and Recognize" to "Axtarış və Mahnı Tanıma",
        "Search for an artist" to "Sənətçi axtarın",
        "Search for it" to "Bunu axtarın",
        "Search with another title" to "Başqa bir başlıqla axtar",
        "Sections" to "Bölmələr",
        "Sections, order and styles" to "Bölmələr, ardıcıllıq və tərzlər",
        "Sections, shortcuts and greeting" to "Bölmələr, qısayollar və salamlama",
        "See all" to "Hamısına bax",
        "See and delete what's on your phone" to "Telefonunuzdakıları görün və silin",
        "See which" to "Hansılar olduğuna bax",
        "See which downloads failed, and why" to "Hansı endirmələrin nə üçün uğursuz olduğunu görün",
        "Seek by side" to "Kənara görə çək",
        "Selected" to "Seçildi",
        "Send as a file" to "Fayl kimi göndər",
        "Send as text" to "Mətn kimi göndər",
        "Send my code" to "Kodumu göndər",
        "Send my code back" to "Kodumu geri göndər",
        "Session code" to "Sessiya kodu",
        "Sessions nearby" to "Yaxınlıqdakı sessiyalar",
        "Sets them apart from the lyrics" to "Onları mahnı sözlərindən fərqləndirir",
        "Settings pages are tidier: tap ⓘ beside a setting for the details" to "Parametrlər səhifələri daha səliqəlidir: təfərrüatlar üçün parametrin yanındakı ⓘ nişanına toxunun",
        "Settings → Appearance → Color: every choice shows what it looks like before you pick it." to "Parametrlər → Görünüş → Rəng: hər seçim seçməzdən əvvəl necə göründüyünü göstərir.",
        "Settings → Appearance → Looks: your whole look, saved, switched and shared in one tap." to "Parametrlər → Görünüş → Görünüşlər: bütün görünüşünüz tək toxunuşla saxlanılır, dəyişdirilir və paylaşılır.",
        "Settings → Appearance → Player, or ⋯ → Player settings on the player itself." to "Parametrlər → Görünüş → Oxuducu və ya oxuducunun üzərindəki ⋯ → Oxuducu parametrləri.",
        "Settings → Lyrics: how your lyrics look, with an example of every choice." to "Parametrlər → Mahnı sözləri: hər seçimin nümunəsi ilə sözlərinizin necə görünəcəyi.",
        "Shadow" to "Kölgə",
        "Shape" to "Forma",
        "Share any slide as a picture" to "İstənilən slaydı şəkil kimi paylaşın",
        "Share as a picture" to "Şəkil kimi paylaş",
        "Share diagnostics" to "Diaqnostikanı paylaş",
        "Share this slide" to "Bu slaydı paylaş",
        "Shazam asks to wait a little" to "Shazam bir az gözləməyinizi istəyir",
        "Shortcuts appear in the order you pick them." to "Qısayollar seçdiyiniz ardıcıllıqla görünür.",
        "Shortest first" to "Ən qısa başda",
        "Show all, in Prism's order" to "Hamısını Prism-in ardıcıllığında göstər",
        "Show hours" to "Saatları göstər",
        "Show me" to "Mənə göstər",
        "Show minutes" to "Dəqiqələri göstər",
        "Show more" to "Daha çox göstər",
        "Show on the player" to "Pleyerdə göstər",
        "Show the player" to "Pleyeri göstər",
        "Show time in hours" to "Vaxtı saatla göstər",
        "Show what you're playing" to "Oxutduğunuz mahnını göstərin",
        "Show what you're playing on your profile" to "Profilinizdə nə oxutduğunuzu göstərin",
        "Show your name" to "Adınızı göstərin",
        "Showing what you play on your profile" to "Profilinizdə oxutduğunuz musiqi göstərilir",
        "Shown" to "Göstərilən",
        "Shown as tiles after the shortcuts" to "Qısayollardan sonra plitələr kimi göstərilir",
        "Shows" to "Şoular",
        "Shows and episodes" to "Şoular və epizodlar",
        "Shrink when paused" to "Fasilə zamanı kiçilt",
        "Shrink while scrolling" to "Sürüşdürərkən kiçilt",
        "Sign in" to "Daxil ol",
        "Sign in to Discord" to "Discord-a daxil ol",
        "Sign in to YouTube Music" to "YouTube Music-ə daxil ol",
        "Sign in to YouTube Music to turn Liked songs into a playlist of your own." to "Bəyənilən mahnıları öz pleylistinizə çevirmək üçün YouTube Music-ə daxil olun.",
        "Sign in to import playlists" to "Pleylistləri idxal etmək üçün daxil olun",
        "Sign in to see the shows you follow on YouTube Music. Shows you open here can be shared or played without an account." to "YouTube Music-də izlədiyiniz şouları görmək üçün daxil olun. Burada açdığınız şoular hesab olmadan da paylaşıla və ya oxuna bilər.",
        "Sign in with Google" to "Google ilə daxil ol",
        "Sign in with a cookie" to "Kuki ilə daxil ol",
        "Sign out" to "Çıxış et",
        "Sign out of Discord" to "Discord-dan çıx",
        "Sign out of YouTube Music?" to "YouTube Music-dən çıxış edilsin?",
        "Signature" to "İmza",
        "Signed out" to "Çıxış edildi",
        "Signing you in to Prism…" to "Prism-ə daxil olunur…",
        "Similar music plays next" to "Növbədə oxşar musiqilər oxunacaq",
        "Similar music when the queue ends" to "Növbə bitdikdə oxşar musiqi",
        "Similar music will play after your queue" to "Növbəniz bitdikdən sonra oxşar musiqilər oxunacaq",
        "Sing" to "Vokal",
        "Sing doesn't run on this phone's kind of processor." to "Müşayiət bu telefonun prosessor növündə işləmir.",
        "Sing needs each song whole on the phone. Off, it waits for Wi-Fi unless the song is downloaded or already played through." to "Müşayiət hər mahnının bütöv şəkildə telefonda olmasına ehtiyac duyur. Bağlı olduqda, mahnı endirilməyibsə və ya əvvəldən sonadək oxunmayıbsa Wi-Fi gözləyir.",
        "Sing works with songs, not live streams or podcasts." to "Müşayiət canlı yayımlar və ya podkastlarla deyil, mahnılarla işləyir.",
        "Sing's voice separation" to "Sing vokal ayırma",
        "Six styles: Prism, Classic karaoke, Bold card, Glow, Typewriter and Calm" to "Altı tərz: Prism, Klassik karaoke, Qalın kart, Parıltı, Yazı makinası və Sakit",
        "Skip" to "Ötür",
        "Skip for now" to "Hələlik keç",
        "Skip silence" to "Səssizliyi keç",
        "Skip silent stretches between songs" to "Mahnılar arasındakı səssiz hissələri keç",
        "Skip to the best part" to "Ən yaxşı hissəyə keç",
        "Skip tour" to "Turu keç",
        "Slims down as you scroll" to "Sürüşdürdükcə incəlir",
        "Smaller things that make Prism yours." to "Prism-i sizə özəl edən daha kiçik detallar.",
        "Smallest first" to "Ən kiçik başda",
        "Smart Downloads" to "Ağıllı Endirmələr",
        "Smart Downloads 5 GB" to "Ağıllı Endirmələr 5 GB",
        "Smart Downloads on mobile data" to "Mobil datada Ağıllı Endirmələr",
        "Smart downloads" to "Ağıllı endirmələr",
        "So Sing starts at once when you turn it on" to "Beləliklə açdığınızda Sing dərhal başlayır",
        "So other players show them too" to "Beləliklə digər pleyerlər də onları göstərir",
        "Soft blur, no refraction" to "Yumşaq bulanıqlıq, qırılma yoxdur",
        "Softness" to "Yumşaqlıq",
        "Software spatial audio: a wider stage, sound placed outside your head and a sense of room. Built into Prism, so it needs no Dolby Atmos or spatial audio hardware." to "Proqram təminatlı məkan səsi: daha geniş səhnə, başınızın xaricində yerləşdirilmiş səs və otaq hissi. Prism-ə daxil edilmişdir, buna görə Dolby Atmos və ya məkan səsi avadanlığına ehtiyac duymur.",
        "Solid bars" to "Düz zolaqlar",
        "Song credits in any song's menu" to "İstənilən mahnının menyusunda mahnı müəllifləri",
        "Song length" to "Mahnı müddəti",
        "Song menu" to "Mahnı menyusu",
        "Song options" to "Mahnı seçimləri",
        "Songs" to "Mahnılar",
        "Songs Prism found by listening" to "Prism-in dinləyərək tapdığı mahnılar",
        "Songs are worked out again the next time you sing them." to "Mahnılar növbəti oxuduğunuz vaxt yenidən işlənir.",
        "Songs blend into each other" to "Mahnılar bir-birinə qovuşaraq keçir",
        "Songs found by listening" to "Dinlənilərək tapılan mahnılar",
        "Songs from your phone that you play show up here." to "Telefonunuzdan oxutduğunuz mahnılar burada görünür.",
        "Songs you copy onto your phone, or download with another app, show up here." to "Telefonunuza köçürdüyünüz və ya başqa tətbiqlə endirdiyiniz mahnılar burada görünür.",
        "Songs you download in Prism show up here too." to "Prism-də endirdiyiniz mahnılar burada da görünür.",
        "Songs you download play without a connection." to "Endirdiyiniz mahnılar bağlantı olmadan da oxunur.",
        "Songs you play in Prism show up here, newest first. They're kept on this phone." to "Prism-də oxutduğunuz mahnılar ən yenidən başlayaraq burada görünür. Bu telefonda saxlanılırlar.",
        "Songs you play on YouTube Music, in Prism or anywhere else signed in, show up here." to "Prism-də və ya daxil olduğunuz başqa yerdə YouTube Music-də oxutduğunuz mahnılar burada görünür.",
        "Songs you'll likely play, ready offline" to "Böyük ehtimalla dinləyəcəyiniz mahnılar, oflayn hazır",
        "Songs, not videos" to "Videolar deyil, mahnılar",
        "Sort" to "Sırala",
        "Sort albums" to "Albomları sırala",
    )
    private val azMap2 = mapOf(
        "Sort artists" to "Sənətçiləri sırala",
        "Sort by" to "Sıralama meyarı",
        "Sort songs" to "Mahnıları sırala",
        "Sound" to "Səs",
        "Sound & playback" to "Səs və oxutma",
        "Source code" to "Mənbə kodu",
        "Sources" to "Mənbələr",
        "Spacing" to "Boşluq",
        "Speakers & TVs" to "Dinamiklər və TV-lər",
        "Speakers, TVs and receivers" to "Dinamiklər, TV-lər və qəbuledicilər",
        "Spectrum" to "Spektr",
        "Spectrum · every component, every state" to "Spektr · hər komponent, hər vəziyyət",
        "Split light under the line being sung" to "Oxunan sətrin altında bölünmüş işıq",
        "Square video covers" to "Kvadrat video üzlükləri",
        "Star an artist on their page, or like their songs, and they show up here." to "Səhifəsində sənətçiyə ulduz verin və ya mahnılarını bəyənin; burada görünəcəklər.",
        "Start" to "Başla",
        "Start a session" to "Sessiya başlat",
        "Starts the log again" to "Jurnalı yenidən başladır",
        "Stats for nerds" to "Ətraflı statistika",
        "Stay in the loop" to "Məlumatlı qalın",
        "Stop" to "Dayandır",
        "Stop casting" to "Yayımı dayandır",
        "Stop updating it" to "Yeniləməni dayandır",
        "Stop when swiped away" to "Sürüşdürülüb bağlandıqda dayandır",
        "Stops when this song ends" to "Bu mahnı bitdikdə dayanır",
        "Storage" to "Yaddaş",
        "Storage & network" to "Yaddaş və şəbəkə",
        "Streaming" to "Yayım",
        "Streaming quality on Wi-Fi" to "Wi-Fi üzərində yayım keyfiyyəti",
        "Streaming quality on mobile data" to "Mobil datada yayım keyfiyyəti",
        "Streaming quality on mobile data (data saver)" to "Mobil internetdə axın keyfiyyəti (məlumat qənaəti)",
        "Strength" to "İntensivlik",
        "Style" to "Tərz",
        "Style, light, accent, background, contrast and page colors go back to how Prism ships. Your saved colors stay." to "Tərz, işıq, vurğu, arxa plan, kontrast və səhifə rəngləri Prism-in ilkin vəziyyətinə qayıdır. Saxlanılan rəngləriniz qalır.",
        "Swear words starred out (f**k) are filled back in from Genius, keeping the word timings, and a source that still stars them out is passed over." to "Ulduzlanan söyüş kəlmələri kəlmə vaxtları qorunaraq Genius-dan tamamlanır və bunları ulduzlamaqda davam edən mənbələr ötürülür.",
        "Swings onto the record while it plays" to "Oxudulduqda valın üzərinə doğru hərəkət edir",
        "Swiping Prism out of recent apps stops it" to "Prism-i son tətbiqlərdən sürüşdürərək bağlamaq oxutmanı dayandırır",
        "Swiping left skips too" to "Sola sürüşdürmək də ötürür",
        "Swiping right goes back too" to "Sağa sürüşdürmək də geri qayıdır",
        "Switch" to "Dəyişdir",
        "Switch account" to "Hesabı dəyişdir",
        "Synced lyrics go into your FLAC and MP3 files' tags (as LRC): Local files, and the lossless files played for songs. Lyrics already saved are used, others are looked up. Android asks once before any file is changed. For one song, use its ⋯ menu." to "Sinxron mahnı sözləri FLAC və MP3 fayllarınızın teqlərinə (LRC kimi) yazılır: Yerli fayllar və mahnılar üçün oxudulan itkisiz fayllar. Artıq saxlanılmış sözlər istifadə olunur, digərləri axtarılır. Hər hansı fayl dəyişdirilməzdən əvvəl Android bir dəfə icazə istəyir. Tək mahnı üçün ⋯ menyusunu istifadə edin.",
        "System" to "Sistem",
        "System font" to "Sistem şrifti",
        "System theme" to "Sistem teması",
        "TOP GENRE" to "ƏN ÇOX DİNLƏNİLƏN JANR",
        "TOP RESULT" to "ƏN YAXŞI NƏTİCƏ",
        "Tabs" to "Vərəqlər",
        "Take a color from" to "Buradan rəng götür:",
        "Take the tour" to "Tura başla",
        "Takes the singer's voice out of songs, on your phone, for karaoke. Downloaded once." to "Karaoke üçün ifaçının səsini telefonunuzda mahnılardan çıxarır. Bir dəfə endirilir.",
        "Tap a color to change or remove it, + to add one (2 to 7)." to "Dəyişmək və ya silmək üçün rəngə toxunun, əlavə etmək üçün + vurun (2-dən 7-yə qədər).",
        "Tap a line to jump there" to "Oraya keçmək üçün sətirə toxunun",
        "Tap anything outlined to change it" to "Dəyişmək üçün çərçivəyə alınmış hər hansı bir şeyə toxunun",
        "Tap one to read its license." to "Lisenziyasını oxumaq üçün birinə toxunun.",
        "Tap or drag to pick a color" to "Rəng seçmək üçün toxunun və ya sürüşdürün",
        "Tap shuffle twice on a playlist for Smart Shuffle: new songs slip in" to "Ağıllı Qarışdırma üçün pleylistdə qarışdırmaya iki dəfə toxunun: araya yeni mahnılar daxil olur",
        "Tap the bookmark on an album's page to keep it here. Albums you like or download songs from show up too." to "Burada saxlamaq üçün albom səhifəsindəki əlfəcinə toxunun. Bəyəndiyiniz və ya mahnı endirdiyiniz albomlar da görünür.",
        "Tap the heart on the player and the song shows up here, on this phone." to "Pleyerdəki ürək nişanına toxunun; mahnı burada, bu telefonda görünür.",
        "Tap the line under the player's controls (it says which device is playing) and pick a speaker, TV or receiver." to "Oxuducu idarəedicilərinin altındakı sətirə toxunun (hansı cihazın oxutduğunu göstərir) və dinamik, TV və ya qəbuledici seçin.",
        "Tap the mini player (or swipe it up) to open it; swipe down to close." to "Açmaq üçün mini oxuducuya toxunun (və ya yuxarı sürüşdürün); bağlamaq üçün aşağı sürüşdürün.",
        "Tap the mini player, tab bar, player or a Home section" to "Mini pleyerə, vərəqə zolağına, pleyerə və ya Əsas səhifə bölməsinə toxunun",
        "Tap to find out what's playing" to "Nə oxunduğunu öyrənmək üçün toxunun",
        "Tap to go on · hold to pause" to "Davam etmək üçün toxunun · fasilə üçün basıb saxlayın",
        "Tap to join with their code" to "Kodları ilə qoşulmaq üçün toxunun",
        "Tap to pick a different file" to "Fərqli fayl seçmək üçün toxunun",
        "Text" to "Mətn",
        "Text contrast" to "Mətn kontrastı",
        "The Ambient frost behind Home, Search, Library, Replay and Settings (Automatic keeps the cover's colors in it," to "Əsas Səhifə, Axtarış, Kitabxana, Təkrar və Parametrlər arxasındakı Ambiyans buzlu şüşə effekti (Avtomatik, üzlüyün rənglərini daxilində saxlayır,",
        "The Replay card at the top: your year so far (pick its look in Settings → Home screen)" to "Yuxarıdakı Replay kartı: indiyə qədərki iliniz (görünüşünü Parametrlər → Əsas ekran bölməsindən seçin)",
        "The Weeknd" to "The Weeknd",
        "The Weeknd · 2020" to "The Weeknd · 2020",
        "The Weeknd · After Hours" to "The Weeknd · After Hours",
        "The album you were last playing (or your Rewind, in December), under Home's greeting. Tap it to open." to "Əsas Səhifə salamlamasının altında, ən son oxutduğunuz albom (və ya Dekabrda Rewind). Açmaq üçün toxunun.",
        "The animated cover plays behind everything" to "Animasiyalı üzlük hər şeyin arxasında oxunur",
        "The car shows Home's sections as rows of covers under their headings, and Library and Made for you as covers, like Spotify's car screen. Off, they're plain lists. Takes effect the next time the car connects." to "Avtomobil; Əsas Səhifə bölmələrini başlıqların altında üz qabığı sıraları kimi, Kitabxana və Sizin Üçün Hazırlandı bölmələrini Spotify-ın avtomobil ekranı kimi üz qabıqları olaraq göstərir. Qapalı olduqda sadə siyahıdır. Avtomobil növbəti dəfə qoşulduqda tətbiq olunur.",
        "The car's small media card then reads as usual (its cover is tiny), and the full player shows the lyric card big. Android Auto doesn't tell apps which of the two is showing." to "Avtomobilin kiçik media kartı həmişəki kimi oxunur (üz qabığı çox kiçikdir) və tam oxuducu söz kartını böyük göstərir. Android Auto tətbiqlərə ikisindən hansının göstərildiyini bildirmir.",
        "The clock, battery and notification icons at the top stay hidden while Prism is open. Swipe down from the top edge and they show for a moment. Immersive mode and full-screen video hide the other bars too, as before." to "Prism açıq olarkən yuxarıdakı saat, batareya və bildiriş nişanları gizli qalır. Yuxarı kənardan aşağı sürüşdürdükdə bir anlıq görünürlər. İmmersiv rejim və tam ekran video digər panelləri də əvvəlki kimi gizlədir.",
        "The cover eases back while paused" to "Fasilə zamanı üzlük yüngülcə geri çəkilir",
        "The cover fills the screen, lyrics over it" to "Üz qabığı ekranı doldurur, sözlər üzərindədir",
        "The cover runs to the screen's edges at the top of the player and fades into the background. Cover size then sets how far down it reaches." to "Üzlük pleyerin yuxarı hissəsində ekranın kənarlarına qədər uzanır və arxa planda itir. Üzlük ölçüsü onun nə qədər aşağı çatacağını təyin edir.",
        "The cover's color" to "Üz qabığının rəngi",
        "The cover, soft and dimmed" to "Yumşaldılmış və solğun üz qabığı",
        "The current-lyric line and immersive mode follow these settings" to "Cari mahnı sözü sətri və immersiv rejim bu parametrlərə tabe olur",
        "The equalizer and Crossfade are the phone's own, so they're off while casting." to "Ekvayzer və Çarpaz Keçid telefonun özünə məxsusdur, buna görə yayım zamanı söndürülür.",
        "The grid button at the top arranges Home's sections" to "Yuxarıdakı tor düyməsi Əsas Səhifənin bölmələrini nizamlayır",
        "The light: 12 presets, White (Black in light mode), or your own colors" to "İşıq: 12 hazır parametr, Ağ (açıq rejimdə Qara) və ya öz rəngləriniz",
        "The line being sung" to "Oxunan sətir",
        "The list is downloaded from Prism's GitHub repository when you open it (GitHub sees the download, nothing else is sent). Each Look shows as a preview first, and can only change how Prism looks." to "Siyahı açdığınızda Prism-in GitHub repozitoriyasından endirilir (GitHub endirməni görür, başqa heç nə göndərilmir). Hər Görünüş əvvəlcə önbaxış kimi göstərilir və yalnız Prism-in görünüşünü dəyişə bilər.",
        "The log and audio settings, as text" to "Mətn kimi jurnal və səs parametrləri",
        "The most lines ahead show" to "Ən çox növbəti sətirlər görünür",
        "The moving artwork fills the whole player, darkened under the controls, and the cover itself shows the still picture. Not with full-bleed artwork, which already shows it edge to edge." to "Animasiyalı təsvir bütün oxuducunu doldurur, idarəedicilərin altında qaralır və üz qabığının özü sabit şəkli göstərir. Artıq kənardan-kənara göstərən çərçivəsiz təsvirlərdə tətbiq olunmur.",
        "The music pauses; pick this phone to carry on here" to "Musiqi dayandırılır; buradan davam etmək üçün bu telefonu seçin",
        "The next song plays at the ending one's tempo with its beats lined up while they overlap, then eases back. Off, they crossfade at their own speed." to "Növbəti mahnı bitən mahnının temposunda, üst-üstə düşərkən zərbələri düzlənmiş şəkildə oxunur, sonra normal temposuna qayıdır. Qapalı olduqda öz sürətlərində çarpaz keçid edirlər.",
        "The other lines" to "Digər sətirlər",
        "The page background: plain, tinted with your accent, or a color of your own" to "Səhifə arxa planı: sadə, vurğunuzla rənglənmiş və ya öz rənginiz",
        "The part people replay most" to "Ən çox təkrar oxudulan hissə",
        "The phone's volume" to "Telefonun səs səviyyəsi",
        "The picture shows everywhere in Prism, including Android Auto. YouTube Music keeps its own." to "Şəkil Android Auto daxil olmaqla Prism-in hər yerində göstərilir. YouTube Music öz şəklini saxlayır.",
        "The player" to "Oxuducu",
        "The player follows Home's background" to "Pleyer Əsas səhifənin arxa planını izləyir",
        "The player's background, or the cover in immersive mode" to "Oxuducunun arxa planı və ya immersiv rejimdə üz qabığı",
        "The player, your way" to "Oxuducu, sizin tərzinizdə",
        "The playing song and the next are separated in the background even with Sing off. It uses more battery while music plays; on mobile data it follows the setting above." to "Oxunulan mahnı və növbəti mahnı Sing qapalı olsa belə arxa planda ayrılır. Musiqi oxunarkən daha çox batareya sərf edir; mobil internetdə yuxarıdakı parametri izləyir.",
        "The progress bar and Play ring in the player and mini player, the song that's playing in every list (and its" to "Pleyer və mini pleyerdəki tərəqqi zolağı və Oxut halqası, hər siyahıda oxunan mahnı (və bunun",
        "The song's moving cover when it has one" to "Varsa mahnının animasiyalı üz qabığı",
        "The song's own music, with the voice taken out" to "Mahnının vokal çıxarılmış öz musiqisi",
        "The sung line and the others in white, your light, the accent, the cover's color or your own" to "Oxunan sətir və digərləri ağda, işığınızda, vurğuda, üz qabığı rəngində və ya öz rənginizdə",
        "The sung line near the top, a third down or in the middle, and how many lines to come show" to "Oxunan sətir yuxarıya yaxın, üçdə bir aşağıda və ya ortada və gələcək sətirlərdən neçəsinin göstəriləcəyi",
        "The time on the right shows how long the song is rather than how much is left. Tapping the time on the player switches too." to "Sağdakı vaxt qalan vaxt əvəzinə mahnının ümumi müddətini göstərir. Pleyerdəki vaxta toxunmaq da bunu dəyişir.",
        "The video uses the song's own timing." to "Video mahnının öz vaxt nizamını istifadə edir.",
        "The volume slider changes" to "Səs səviyyəsi sürüşdürücüsü dəyişir",
        "The waveform button in the search box listens for a song" to "Axtarış qutusundakı dalğa forması düyməsi oxunan mahnını dinləyir",
        "Their source is at the bottom: tap it to pick another, or fix the timing from ⋯" to "Mənbələri aşağıdadır: başqasını seçmək üçün toxunun və ya ⋯ menyusundan vaxtı düzəldin",
        "Theme" to "Mövzu",
        "They shape your Daily Mixes and Release Radar. They're starred on this phone; nothing is followed on YouTube." to "Gündəlik Mikslərinizi və Yeni Buraxılışlar Radarını formalaşdırırlar. Bu telefonda ulduzlanırlar; YouTube-da heç nə izlənilmir.",
        "They shape your mixes and Release Radar" to "Mikslərinizi və Yeni Buraxılışlar Radarını formalaşdırırlar",
        "They'll need a new code" to "Yeni koda ehtiyacları olacaq",
        "Thin" to "İncə",
        "This month" to "Bu ay",
        "This page's look goes back to how Prism comes. Everything else stays, and Undo brings it back." to "Bu səhifənin görünüşü Prism-in ilkin vəziyyətinə qayıdır. Qalan hər şey qalır və Geri qaytar əməliyyatı onu bərpa edir.",
        "This phone" to "Bu telefon",
        "This playlist is private, so its link only works for you." to "Bu pleylist gizlidir, buna görə keçidi yalnız sizin üçün işləyir.",
        "This section" to "Bu bölmə",
        "Three parts, numbered in the preview: ① the light, ② the accent and ③ the background." to "Öncədən baxışda nömrələnmiş üç hissə: ① işıq, ② vurğu və ③ arxa plan.",
        "Tick the sections you want; hold one (or its grip) to move it." to "İstədiyiniz bölmələri seçin; daşımaq üçün basıb saxlayın.",
        "Tick the tiles to show at the top of Library; hold one to move it." to "Kitabxananın üstündə göstərmək üçün plitələri qeyd edin; daşımaq üçün birini basıb saxlayın.",
        "Tick your tabs and hold one to move it. Keep Home, Library or Settings, so Settings can always be reached." to "Vərəqələrinizi işarələyin və köçürmək üçün birini basıb saxlayın. Parametrlərə həmişə çatmaq üçün Əsas Səhifə, Kitabxana və ya Parametrləri saxlayın.",
        "Time left" to "Qalan vaxt",
        "Time-synced lines" to "Vaxtla sinxronlaşdırılmış sətirlər",
        "Times under the progress bar" to "İrəliləyiş zolağının altındakı vaxtlar",
        "Tint strength" to "Rəng çalarının intensivliyi",
        "Title and times" to "Başlıq və vaxtlar",
        "Title size" to "Başlıq ölçüsü",
        "Tonearm" to "Val qolu",
        "Too much for a QR code: send it as text or a file" to "QR kod üçün çox böyükdür: mətn və ya fayl kimi göndərin",
        "Top artists" to "Ən çox dinlənilən sənətçilər",
        "Top genres" to "Ən çox dinlənilən janrlar",
        "Top of the Blend" to "Blend-in zirvəsi",
        "Top right of Home" to "Əsas səhifənin yuxarı sağ küncü",
        "Top songs" to "Ən çox dinlənilən mahnılar",
        "Top to bottom, as they sit on the player; hold one to move it. The progress bar, controls and buttons are always there." to "Oxuducuda durduqları kimi yuxarıdan aşağıya; daşımaq üçün birini basıb saxlayın. İrəliləyiş zolağı, idarəedicilər və düymələr həmişə oradadır.",
        "Translate into" to "Bu dilə tərcümə et:",
        "Translate lyrics" to "Mahnı sözlərini tərcümə et",
        "Translate them, or read other scripts in Latin letters (Settings → Lyrics)" to "Sözləri tərcümə edin və ya digər əlifbaları Latın hərfləri ilə oxuyun (Parametrlər → Mahnı sözləri)",
        "Translations & romanized lines" to "Tərcümələr və latınlaşdırılmış sətirlər",
        "Translations over or under each line, their size, color and italics" to "Hər sətrin üstündə və ya altında tərcümələr, ölçüləri, rəngləri və kursiv yazı",
        "Treble Boost" to "Zil Gücləndirmə",
        "Tried top to bottom; hold one to move it. Switch source per song from the player's ⋯." to "Yuxarıdan aşağıya doğru yoxlanılır; daşımaq üçün birini basıb saxlayın. Oxuducunun ⋯ menyusundan hər mahnı üçün mənbəni dəyişin.",
        "Trims silence at the start and end" to "Başlanğıc və sondakı səssizliyi kəsir",
        "Try Prism's own: Paper, Midnight, Neon, Soft, Studio and Vinyl" to "Prism-in öz görünüşlərini sınayın: Paper, Midnight, Neon, Soft, Studio və Vinyl",
        "Try again closer to the music, or where it's louder." to "Musiqiyə daha yaxın və ya səsin daha yüksək olduğu yerdə yenidən cəhd edin.",
        "Try again in a minute." to "Bir dəqiqə sonra yenidən cəhd edin.",
        "TuneMyMusic copies your playlists, Liked Songs included, into your YouTube Music account." to "TuneMyMusic, Bəyənilən Mahnılar daxil olmaqla pleylistlərinizi YouTube Music hesabınıza kopyalayır.",
        "TuneMyMusic is a separate service, not part of Prism. It asks for access to the accounts you connect and sees the" to "TuneMyMusic ayrı bir xidmətdir, Prism-in hissəsi deyil. Qoşduğunuz hesablara giriş icazəsi istəyir və",
        "Turn off Wi-Fi only" to "Yalnız Wi-Fi seçimini söndür",
        "Turn them on in Android's settings for Prism." to "Prism üçün Android parametrlərindən bildirişləri aktiv edin.",
        "Typeface" to "Şrift",
        "USB" to "USB",
        "Uncensor lyrics" to "Mahnı sözlərindən senzuranı qaldır",
        "Under each line" to "Hər sətrin altında",
        "Under the cover's left edge" to "Üz qabığının sol kənarının altında",
        "Under the line" to "Sətrin altında",
        "Under the title" to "Başlığın altında",
        "Undo" to "Geri qaytar",
        "Uninstall" to "Sil",
        "Uninstall this Prism" to "Bu Prism-i sil",
        "United States" to "Birləşmiş Ştatlar",
        "Unknown song" to "Bilinməyən mahnı",
        "Unlisted" to "Siyahıda olmayan",
        "Unofficial" to "Rəsmi deyil",
        "Unofficial · not affiliated with Google or YouTube" to "Rəsmi deyil · Google və ya YouTube ilə heç bir əlaqəsi yoxdur",
        "Unpair all browsers" to "Bütün brauzerlərin cütləşməsini ləğv et",
        "Update" to "Yenilə",
        "Update now" to "İndi yenilə",
        "Use 256 kbps over mobile networks" to "Mobil şəbəkələrdə 256 kbps istifadə et",
        "Use Prism's cover" to "Prism-in üz qabığını istifadə et",
        "Use cookie" to "Kukidən istifadə et",
        "Use it" to "Bunu istifadə et",
        "Use mine" to "Mənimkindən istifadə et",
        "Use mobile data" to "Mobil datadan istifadə et",
        "Use my initial" to "Baş hərfimi istifadə et",
        "Use the song's own" to "Mahnının öz adını istifadə et",
        "Use theme colors" to "Tema rənglərindən istifadə et",
        "Use this color" to "Bu rəngdən istifadə et",
        "Uses much less data off Wi-Fi" to "Wi-Fi xaricində çox daha az data istifadə edir",
        "Version" to "Versiya",
        "Video saved" to "Video saxlanıldı",
        "Videos everywhere play as their song" to "Hər yerdəki videolar mahnı kimi oxunur",
        "Visualizer" to "Vizuallaşdırıcı",
        "Visualizer color" to "Vizualizator rəngi",
        "Vocal Boost" to "Vokal Gücləndirmə",
        "Voice" to "Vokal",
        "Volume" to "Səs səviyyəsi",
        "WHEN YOU LISTEN" to "NƏ VAXT DİNLƏYİRSİNİZ",
        "WHERE IT STARTED" to "HARADA BAŞLADI",
        "Waiting for a network" to "Şəbəkə gözlənilir",
        "Watch your Replay" to "Təkrar xülasənizə baxın",
        "Watch your Rewind" to "Geri Sarma xülasənizə baxın",
        "Waterfalls Coming Out Your Mouth" to "Waterfalls Coming Out Your Mouth",
        "Weight" to "Qalınlıq",
        "Weight, line spacing, how dim the other lines are, blur strength, capitals and a shadow" to "Qalınlıq, sətir aralığı, digər sətirlərin solğunluğu, bulanıqlıq gücü, böyük hərflər və kölgə",
        "Welcome to Prism" to "Prism-ə Xoş Gəlmisiniz",
        "What Prism leaves out of your recommendations" to "Prism-in tövsiyələrinizdən kənar saxladıqları",
        "What's kept out of your music" to "Musiqinizdən kənar saxlanılanlar",
        "When a starred artist puts out music" to "Ulduz verilmiş sənətçi musiqi buraxdıqda",
        "When the lyrics are listed under a different name" to "Mahnı sözləri başqa ad altında siyahıya alındıqda",
        "When the queue ends, Prism's radio picks from your music (Settings → Playback & sound → Autoplay from)" to "Növbə bitdikdə, Prism radiosu musiqinizdən mahnılar seçir (Parametrlər → Oxutma və səs → Avtomatik oxutma mənbəyi)",
        "When you've liked a song and its music video, Liked songs, Library and the car show just the song. The video stays liked: unlike the song and it shows again. Nothing changes on YouTube Music." to "Mahnını və musiqi videosunu bəyəndiyinizdə Bəyənilən mahnılar, Kitabxana və avtomobil yalnız mahnını göstərir. Video bəyənilmiş olaraq qalır: mahnının bəyənməsini silsəniz video yenidən görünər. YouTube Music-də heç nə dəyişmir.",
        "Where Best part takes you in this song, and where it starts in Rewind and Blend" to "Bu mahnıda Ən Yaxşı Hissənin sizi hara apardığı və Geri Sarma ilə Qarışıqda haradan başladığı",
        "Where the lines go" to "Sətirlərin yeri",
        "Where your playlists go" to "Pleylistlərinizin yerləşəcəyi yer",
        "Which background" to "Hansı arxa plan",
        "Which of its colors" to "Hansı rəngləri",
        "While it's on, those parts of Prism are outlined, and tapping one opens just its settings. Done, at the top of the screen, turns it off. Holding the Settings tab (when it's in the tab bar) turns it on and off too." to "Açıq olduqda Prism-in bu hissələri çərçivəyə alınır və birinə toxunduqda yalnız həmin parametrlər açılır. Ekranın yuxarısındakı Hazırdır bunu bağlayır. Parametrlər vərəqəsini basıb saxlamaq da (vərəqə panelində olanda) bunu açıb-bağlayır.",
        "Who you are in Prism, kept on this phone and in your backups. No email, no password, no server." to "Prism-dəki kimliyiniz; bu telefonda və ehtiyat nüsxələrinizdə saxlanılır. E-poçt yoxdur, şifrə yoxdur, server yoxdur.",
        "Wi-Fi only" to "Yalnız Wi-Fi",
        "Wi-Fi or mobile data." to "Wi-Fi və ya mobil data.",
        "Wider sound for any headphones" to "Hər qulaqlıq üçün daha geniş səs səhnəsi",
        "Wired" to "Simli",
        "With friends on the same Wi-Fi" to "Eyni Wi-Fi-dakı dostlarla",
        "With phones on the same Wi-Fi" to "Eyni Wi-Fi şəbəkəsindəki telefonlarla",
        "With the lyrics open, tap Sing at the bottom" to "Mahnı sözləri açıq olarkən aşağıdakı Sing-ə toxunun",
        "Word by word first, then by line" to "Əvvəlcə kəlmə-kəlmə, sonra sətir-sətir",
        "YOU LISTENED FOR" to "DİNLƏMƏ MÜDDƏTİNİZ",
        "YOUR #1 SONG" to "1 NÖMRƏLİ MAHNINIZ",
        "YOUR BIGGEST MONTH" to "ƏN ÇOX DİNLƏDİYİNİZ AY",
        "YOUR LISTENING PERSONALITY" to "DİNLƏMƏ XASİYYƏTİNİZ",
        "YOUR TOP ALBUM" to "ZİRVƏDƏKİ ALBOMUNUZ",
        "YOUR TOP ARTIST" to "ZİRVƏDƏKİ SƏNƏTÇİNİZ",
        "YOUR TOP ARTISTS" to "ZİRVƏDƏKİ SƏNƏTÇİLƏRİNİZ",
        "YOUR TOP GENRE" to "ZİRVƏDƏKİ JANRINIZ",
        "YOUR TOP SONGS" to "ZİRVƏDƏKİ MAHNILARINIZ",
        "YOUR YEAR IN PRISM" to "PRISM İLƏ KEÇƏN İLİNİZ",
        "YOUR YEAR, SEASON BY SEASON" to "FƏSİL-FƏSİL İLİNİZ",
        "You both play" to "Hər ikiniz dinləyirsiniz",
        "You can take it again from Settings → About." to "Parametrlər → Haqqında bölməsindən yenidən başlaya bilərsiniz.",
        "You see a Look first, and choose to try it or keep it." to "Əvvəlcə Görünüşü görürsünüz, sonra yoxlamağı və ya saxlamağı seçirsiniz.",
        "You're offline, so Prism kept what it heard" to "Oflaynsınız, buna görə Prism eşitdiklərini saxladı",
        "You're on it now" to "Hazırda buradasınız",
        "You're up to date" to "Tətbiqiniz yenidir",
        "YouTube Music playlists" to "YouTube Music pleylistləri",
        "YouTube didn't list any other channels. Sign out and in again if you've just made one." to "YouTube başqa kanal göstərmədi. Əgər yeni kanal yaratmısınızsa çıxış edib yenidən daxil olun.",
        "YouTube's video pictures are wide, with black bars above and below. On, Prism trims the bars and uses the middle of the picture as a square cover: on the player, in lists, the notification and Android Auto." to "YouTube-un video şəkilləri genişdir, üstdə və altdan qara zolaqlar var. Açıq olduqda Prism bu zolaqları kəsir və şəklin ortasını kvadrat üz qabığı kimi istifadə edir: oxuducuda, siyahılarda, bildirişdə və Android Auto-da.",
        "Your #1 song" to "1 nömrəli mahnınız",
        "Your Blends" to "Blend-ləriniz",
        "Your Looks" to "Görünüşləriniz",
        "Your Prism" to "Sizin Prism-iniz",
        "Your Rewind, ready on December 1" to "Rewind xülasəniz, 1 Dekabrda hazır",
        "Your YouTube Music library" to "YouTube Music kitabxananız",
        "Your accent instead of Prism's gradient" to "Prism-in qradiyenti əvəzinə sizin vurğunuz",
        "Your accent: any color, from a wheel, a code or the eyedropper" to "Vurğunuz: çarxdan, koddan və ya damcıdan seçilən istənilən rəng",
        "Your artists" to "Sənətçiləriniz",
        "Your background photos go in the file" to "Arxa plan fotoşəkilləriniz fayla daxil edilir",
        "Your best part" to "Ən yaxşı hissəniz",
        "Your color" to "Öz rənginiz",
        "Your colors" to "Öz rəngləriniz",
        "Your data stays here" to "Məlumatlarınız burada qalır",
        "Your go-to music" to "Əsas musiqiniz",
        "Your headphones" to "Qulaqlığınız",
        "Your history, Replay and settings live only on this phone." to "Tarixçəniz, Replay və parametrləriniz yalnız bu telefonda saxlanılır.",
        "Your language under each line" to "Hər sətrin altında sizin diliniz",
        "Your launcher may take a moment to update." to "Başladıcınızın yenilənməsi bir qədər vaxt apara bilər.",
        "Your library" to "Kitabxananız",
        "Your library, Replay history, settings, sign-in, covers and backgrounds go into one file. Keep it private: it can sign in as you." to "Kitabxananız, Replay tarixçəniz, parametrləriniz, girişiniz, üz qabıqları və arxa planlar tək bir fayla yazılır. Məxfi saxlayın: sizin adınızdan daxil ola bilər.",
        "Your listening recap" to "Dinləmə xülasəniz",
        "Your listening, recapped on your phone." to "Dinləmə tarixçəniz, telefonunuzda xülasə olundu.",
        "Your listening, recapped on-device" to "Cihazınızda xülasələnən dinləmə tarixçəniz",
        "Your mixes and new releases start from them" to "Miks və yeni buraxılışlar bunlardan başlayır",
        "Your music files" to "Musiqi fayllarınız",
        "Your music, refracted." to "Musiqiniz, işıq kimi qırıldı.",
        "Your music, refracted. Here's a minute's tour of what it can do: swipe, or tap Start." to "Musiqiniz, sınan işıq kimi. Nələr edə bildiyinə bir dəqiqəlik baxış: sürüşdürün və ya Başla vurun.",
        "Your name" to "Adınız",
        "Your name and picture will be removed from this phone." to "Adınız və şəkliniz bu telefondan silinəcək.",
        "Your name and picture, kept on this phone. Nothing you have changes" to "Adınız və şəkliniz bu telefonda saxlanılır. Mövcud heç bir şeyiniz dəyişmir",
        "Your name in Blends" to "Blend-lərdəki adınız",
        "Your own downloads stay" to "Öz endirmələriniz qalır",
        "Your own light's colors, left to right" to "İşığınızın soldan sağa öz rəngləri",
        "Your phone's notification and lock screen show the first two beside play; Android Auto shows them all, in this order. Hold one to move it." to "Telefonunuzun bildirişi və kilid ekranı oxutmanın yanında ilk ikisini göstərir; Android Auto hamısını bu ardıcıllıqla göstərir. Daşımaq üçün basıb saxlayın.",
        "Your pick" to "Sizin seçiminiz",
        "Your playlists" to "Pleylistləriniz",
        "Your playlists show up here once your library has loaded" to "Kitabxananız yükləndikdən sonra pleylistləriniz burada görünər",
        "Your profile shows the song and how far in. You sign in on Discord's own page, and the sign-in stays on this phone. While it's on, song names and artists go to Discord as you listen." to "Profiliniz mahnını və nə qədər irəlilədiyini göstərir. Discord-un öz səhifəsində daxil olursunuz və giriş bu telefonda qalır. Açıq olduqda, siz qulaq asdıqca mahnı adları və sənətçilər Discord-a göndərilir.",
        "Your shows" to "Şoularınız",
        "Your starting point, made from what you play." to "Oxutduqlarınızdan yaradılan başlanğıc nöqtəniz.",
        "Your top genres" to "Zirvədəki musiqi janrlarınız",
        "Your top songs, artists and genres" to "Zirvədəki mahnılarınız, sənətçiləriniz və janrlarınız",
        "Your year in music" to "Musiqi ilə keçən iliniz",
        "Your year so far" to "İlin indiyədək olan xülasəsi",
        "Z to A" to "Z-dən A-ya",
        "and pick the backup." to "və ehtiyat nüsxəni seçin.",
        "days" to "gün",
        "found their way into your rotation." to "pleylistinizə daxil olmağı bacardı.",
        "in the player's ⋯ menu, then share the log here." to "pleyerin ⋯ menyusunda, sonra jurnalı burada paylaşın.",
        "not affiliated with Google or YouTube" to "Google və ya YouTube ilə əlaqəsi yoxdur",
        "pairs the first time" to "ilk dəfədə cütləşir",
        "pending" to "gözləmədə",
        "taste match" to "zövq uyğunluğu",
        "tnum" to "tnum",
        "under the greeting" to "salamlamanın altında",
        "• Each phone streams the music itself, so guests use their own data or Wi-Fi." to "• Hər telefon musiqini özü yayır, buna görə qonaqlar öz məlumatlarını və ya Wi-Fi-dan istifadə edirlər.",
        "• Everyone needs Prism on the same Wi-Fi, or on one phone's hotspot." to "• Hər kəsin eyni Wi-Fi şəbəkəsində və ya bir telefonun giriş nöqtəsində Prism-ə ehtiyacı var.",
        "• Phones talk to each other directly. There's no Prism server, and nothing is shared once the session ends." to "• Telefonlar bir-biri ilə birbaşa əlaqə qurur. Prism serveri yoxdur və sessiya bitdikdə heç nə paylaşılmır.",
        "• Some public and work Wi-Fi keeps phones apart; a hotspot works there." to "• Bəzi ictimai və iş yeri Wi-Fi şəbəkələri cihazları ayırır; orada şəxsi giriş nöqtəsi işləyir.",
        "⋯ has the sleep timer, stats, downloads and Player settings" to "⋯ menyusunda yuxu taymeri, statistikalar, endirmələr və Oxuducu parametrləri var",
        "① The light: the colors Prism lights its highlights with." to "① İşıq: Prism-in vurğularını işıqlandırdığı rənglər.",
        "③ The background: what Prism's own screens sit on." to "③ Arxa plan: Prism-in ekranlarının üzərində durduğu zəmin.",
        "Welcome to the new Prism" to "Yeni Prism-ə Xoş Gəlmisiniz",
        "Vocal" to "Vokal",
        "Hip-Hop" to "Hip-Hop",
        "Jazz" to "Caz",
        "Acoustic" to "Akustik",
        "Late Night" to "Gecə Vaxtı",
        "not corrected" to "düzəliş edilmədi",
        "That file has no ParametricEQ filters in it" to "Bu faylda heç bir ParametricEQ filtri yoxdur",
        "Search headphones (e.g. Sony WH-1000XM5)" to "Qulaqlıq axtar (məs. Sony WH-1000XM5)",
        "Strength" to "Güc",
        "Your headphones" to "Qulaqlıqlarınız",
        "TuneMyMusic copies your playlists, Liked Songs included, into your YouTube Music account. It's the same service YouTube Music's own app uses for transfers." to "TuneMyMusic Bəyənilən Mahnılar daxil olmaqla pleylistlərinizi YouTube Music hesabınıza kopyalayır. Bu, YouTube Music-in öz tətbiqinin köçürmələr üçün istifadə etdiyi xidmətdir.",
        "From Spotify" to "Spotify-dan",
        "From Apple Music" to "Apple Music-dən",
        "From another service or a file" to "Başqa bir xidmətdən və ya fayldan",
        "How it works" to "Necə işləyir",
        "1. Sign in to Spotify or Apple Music on TuneMyMusic and pick the playlists." to "1. TuneMyMusic vasitəsilə Spotify və ya Apple Music-ə daxil olun və pleylistləri seçin.",
        "2. Choose YouTube Music as the destination and sign in with the Google account you use in Prism%s." to "2. Hədəf kimi YouTube Music-i seçin və Prism-də istifadə etdiyiniz Google hesabı ilə%s daxil olun.",
        "3. When the transfer finishes, come back here. Prism syncs your library and the playlists appear under Library → Playlists." to "3. Köçürmə başa çatdıqda bura qayıdın. Prism kitabxananızı sinxronlaşdırır və pleylistlər Kitabxana → Pleylistlər bölməsində görünür.",
        "TuneMyMusic is a separate service, not part of Prism. It asks for access to the accounts you connect and sees the playlists you move; its free plan has limits. Prism doesn't share anything with it." to "TuneMyMusic ayrı bir xidmətdir, Prism-in hissəsi deyil. Qoşduğunuz hesablara giriş icazəsi istəyir və köçürdüyünüz pleylistləri görür; pulsuz planının məhdudiyyətləri var. Prism onunla heç bir şey paylaşmır.",
        "Preamp" to "Ön Gücləndirici",
        "Software spatial audio" to "Proqram təminatı ilə məkan səsi",
        "Intensity" to "İntensivlik",
        "Focus blur needs Android 12 or later; on this phone the other lines are only dimmed." to "Fokus bulanıqlığı Android 12 və ya daha yenisini tələb edir; bu telefonda digər sətirlər yalnız sönükləşdirilir.",
        "Bold card's color shows with the background As now or The cover's color (Background, below); here it keeps its bold type." to "Qalın kartın rəngi İndiki kimi və ya Üz qabığının rəngi fonu ilə görünür (Fon, aşağıda); burada qalın şriftini qoruyur.",
        "Pure black (under Theme) keeps dark pages black; the tint then shows on cards and in light mode" to "Saf qara (Mövzu altında) qaranlıq səhifələri qara saxlayır; çalar daha sonra kartlarda və açıq rejimdə görünür",
        "Immersive mode settings (hold to leave)" to "İmmersiv rejim tənzimləmələri (çıxmaq üçün basıb saxlayın)",
        "Signature style" to "İmza üslubu",
        "MORE THAN\\nLISTENING" to "DİNLƏMƏKDƏN\\nDAHA ÇOX",
        "Looking on this network…" to "Bu şəbəkədə axtarılır…",
        "Not found in Prism Music" to "Prism Music daxilində tapılmadı",
        "album" to "albom",
        "artist" to "sənətçi",
        "playlist" to "pleylist",
        "podcast" to "podkast",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred, saved and play most; the first look only learns what's already out, so new music shows up from the next one." to "Son üç ayda sənətçilərinizdən yeni bir şey yoxdur. Prism bir neçə gündən bir ulduzladığınız, yadda saxladığınız və ən çox oxutduğunuz sənətçiləri yoxlayır; ilk baxış yalnız artıq çıxmış olanları öyrənir, ona görə növbəti baxışdan yeni musiqilər burada görünür.",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another Wi-Fi or mobile data." to "Bağlantınızı yoxlayın. İş və məktəb şəbəkələri kimi bəzi şəbəkələr Discord-u bloklayır: başqa bir Wi-Fi və ya mobil məlumatı sınayın.",
        "YouTube is limiting playback on this network right now. Try again in a while, switch networks (or turn off a VPN), or sign in." to "YouTube hazırda bu şəbəkədə oxutmanı məhdudlaşdırır. Bir azdan yenidən cəhd edin, şəbəkəni dəyişin (və ya VPN-i söndürün) yaxud daxil olun.",
        "Sync library now" to "Kitabxananı indi sinxronlaşdır",
        "Syncing…" to "Sinxronlaşdırılır…",
        "Sign in to import playlists" to "Pleylistləri idxal etmək üçün daxil olun",
        "Imported playlists go to your YouTube Music account, then show up in Prism." to "İdxal edilmiş pleylistlər YouTube Music hesabınıza gedir, sonra Prism-də görünür.",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out. Your account isn't changed; copy again any time to bring Prism's copies up to date." to "Pleylistləri, saxlanılan albomları və sənətçiləri Prism-ə kopyalayın, beləliklə çıxış etsəniz belə bu telefonda qalarlar. Hesabınız dəyişmir; Prism-in nüsxələrini yeniləmək üçün istənilən vaxt yenidən kopyalayın.",
        "backup, updates" to "yedəkləmə, yeniləmələr",
        "List view" to "Siyahı görünüşü",
        "Grid view" to "Tor görünüşü",
        "hours" to "saat",
        "minutes" to "dəqiqə",
        "Docked bar" to "Bərkidilmiş zolaq",
        "Hidden bar" to "Gizli zolaq",
        "Full mini player" to "Tam mini oxuducu",
        "High quality" to "Yüksək keyfiyyət",
        "Medium quality" to "Orta keyfiyyət",
        "Low quality" to "Aşağı keyfiyyət",
        "Accent from the cover" to "Üz qabığından vurğu",
        "Accent from the wallpaper" to "Divar kağızından vurğu",
        "About %s; downloads are fetched again after restoring" to "Təxminən %s; endirmələr bərpa edildikdən sonra yenidən əldə edilir",
        "About %s" to "Təxminən %s",
        "From %s, Prism is signed with its own key instead of a shared test key, so Android stops flagging it. Android can't update across that change, so this once Prism is reinstalled. Your things come with you:" to "%s versiyasından etibarən Prism ortaq test açarı əvəzinə öz açarı ilə imzalanır, beləliklə Android xəbərdarlıq etməyi dayandırır. Android bu dəyişiklik üzərindən yeniləyə bilmir, ona görə bu dəfəlik Prism yenidən quraşdırılır. Məlumatlarınız qorunur:",
        "Couldn't restore: %s" to "Bərpa edilmədi: %s",
        "Couldn't save it: %s" to "Yadda saxlanılmadı: %s",
            "Floating" to "Üzən",
        "Docked" to "Bərkidilmiş",
        "Minimal" to "Minimal",
        "Always" to "Həmişə",
        "Selected" to "Seçilmiş",
        "Never" to "Heç vaxt",
        "Card" to "Kart",
        "Slim" to "İncə",
        "Pill" to "Kapsul",
        "Line" to "Xətt",
        "Fill" to "Doldurma",
        "None" to "Yoxdur",
        "Color mesh" to "Rəng toru",
        "Blurred cover" to "Bulanıq örtük",
        "Your background" to "Arxa planınız",
        "Theme" to "Tema",
        "Black" to "Qara",
        "Classic" to "Klassik",
        "Play button" to "Oynatma düyməsi",
        "Rings" to "Halqalar",
        "Standard" to "Standart",
        "Large" to "Böyük",
        "Full width" to "Tam en",
        "Next song's start" to "Növbəti mahnının başlanğıcı",
        "Next song" to "Növbəti mahnı",
        "Next 3 songs" to "Növbəti 3 mahnı",
        "High" to "Yüksək",
        "Middle" to "Orta",
        "Low" to "Aşağı",
        "Full screen" to "Tam ekran",
        "Fill the screen" to "Ekranı doldur",
        "Zoomed out" to "Uzaqlaşdırılmış",
        "Whole cover" to "Bütün örtük",
        "Hairline" to "İncə xətt",
        "Bold" to "Qalın",
        "Thumb" to "Düyməli",
        "Waveform" to "Dalğa forması",
        "Compact" to "Kompakt",
        "Comfortable" to "Rahat",
        "Roomy" to "Geniş",
        "Medium" to "Orta",
        "Small" to "Kiçik",
        "Songs" to "Mahnılar",
        "Favourites" to "Sevimlilər",
        "Artists" to "Sənətçilər",
        "Albums" to "Albomlar",
        "Recently added" to "Son əlavə edilənlər",
        "Added albums" to "Əlavə edilən albomlar",
        "Downloads" to "Yükləmələr",
        "Back to Lyrics, Video and Up next" to "Mahnı sözləri, Video və Növbətilərə qayıt",
        "Back to Prism's buttons" to "Prism düymələrinə qayıt",
        "Back to Prism's order" to "Prism sırasına qayıt",
        "Wallpaper" to "Divar kağızı",
        "White light" to "Ağ işıq",
        "Automatic" to "Avtomatik",
        "Neutral" to "Neytral",
        "Accent" to "Vurğu",
        "Vibrant" to "Canlı",
        "Muted" to "Sakit",
        "Main color" to "Əsas rəng",
        "At once" to "Dərhal",
        "Fade" to "Solma",
        "Slow fade" to "Yavaş solma",
        "New albums only" to "Yalnız yeni albomlar",
        "Clean" to "Təmiz",
        "Geometric" to "Həndəsi",
        "Airy" to "Fərəhli",
        "Editorial" to "Jurnal üslubu",
        "Mono" to "Mono",
        "Your font" to "Şriftiniz",
        "Sharp" to "Kəskin",
        "Subtle" to "İncə",
        "Round" to "Dəyirmi",
        "Extra" to "Əlavə",
        "Vinyl" to "Vinil",
        "Cassette" to "Kaset",
        "With the style" to "Üsluba uyğun",
        "Dot" to "Nöqtə",
        "Ring" to "Halqa",
        "Bars" to "Sütunlar",
        "Wave" to "Dalğa",
        "Pulse" to "Nəbz",
        "Current lyric" to "Hazırkı söz",
        "Your light" to "İşığınız",
        "White" to "Ağ",
        "From the cover" to "Örtükdən",
        "Classic karaoke" to "Klassik karaoke",
        "Bold card" to "Qalın kart",
        "Typewriter" to "Yazı makinası",
        "Calm" to "Sakit",
        "Three" to "Üç",
        "One" to "Bir",
        "Plain dark" to "Sadə qaranlıq",
        "Center" to "Mərkəz",
        "Both" to "Hər ikisi",
        "Your music" to "Musiqiniz",
        "Carousel" to "Karusel",
        "Grid" to "Tor",
        "List" to "Siyahı",
        "Spotlight" to "Diqqət mərkəzində",
        "Title only" to "Yalnız başlıq",
        "Line by line" to "Sətir-sətir",
        "Karaoke" to "Karaoke",
        "Section style" to "Bölmə üslubu",
        "This section" to "Bu bölmə",
        "Hide this section" to "Bu bölməni gizlə",
        "Bring it back from Customize Home" to "Əsas səhifəni fərdiləşdir bölməsindən geri qaytarın",
        "Immersive mode" to "İmmersiv rejim",
        "Show the player" to "Oynatıcını göstər",
        "Artwork" to "Örtük şəkli",
        "Keep controls on screen" to "İdarəediciləri ekranda saxla",
        "Song options" to "Mahnı seçimləri",
        "Lyrics position" to "Sözlərin mövqeyi",
        "Lyrics timing" to "Sözlərin vaxtı",
        "Lyrics source" to "Sözlərin mənbəyi",
        "Keep holding to leave immersive mode (or press Back)" to "İmmersiv rejimdən çıxmaq üçün basıb saxlamağa davam edin (və ya Geri basın)",
        "Immersive mode settings" to "İmmersiv rejim tənzimləmələri",
        "Immersive mode settings (hold to leave)" to "İmmersiv rejim tənzimləmələri (çıxmaq üçün basıb saxlayın)",
        "Open immersive mode settings" to "İmmersiv rejim tənzimləmələrini aç",
        "Leave immersive mode" to "İmmersiv rejimdən çıx",
        "Close the player" to "Oynatıcını bağla",
        "Color wheel" to "Rəng çarxı",
        "Loading" to "Yüklənir",
        "LIVE" to "CANLI",
        "Clear Smart Downloads" to "Ağıllı Yükləmələri Təmizlə",
        "MORE THAN\\nLISTENING" to "DİNLƏMƏKDƏN\\nDAHA ARTIQ",
        "MORE THAN\nLISTENING" to "DİNLƏMƏKDƏN\nDAHA ARTIQ",
        "YOU LISTENED FOR" to "BU QƏDƏR DİNLƏDİNİZ",
        "YOUR TOP GENRE" to "ƏN ÇOX DİNLƏDİYİNİZ JANR",
        "YOUR TOP ARTIST" to "ƏN ÇOX DİNLƏDİYİNİZ SƏNƏTÇİ",
        "YOUR TOP ARTISTS" to "ƏN ÇOX DİNLƏDİYİNİZ SƏNƏTÇİLƏR",
        "YOUR #1 SONG" to "1 NÖMRƏLİ MAHNINIZ",
        "YOUR TOP SONGS" to "ƏN ÇOX DİNLƏDİYİNİZ MAHNILAR",
        "WHEN YOU LISTEN" to "NƏ VAXT DİNLƏYİRSİNİZ",
        "PRIME TIME" to "PİK VAXTI",
        "NEW TO YOU" to "SİZİN ÜÇÜN YENİ",
        "YOUR LISTENING PERSONALITY" to "DİNLƏMƏ ŞƏXSİYYƏTİNİZ",
        "YOUR YEAR, SEASON BY SEASON" to "FƏSİL-FƏSİL İLİNİZ",
        "YOUR BIGGEST MONTH" to "ƏN ÇOX DİNLƏDİYİNİZ AY",
        "TOP GENRE" to "ƏN ÇOX DİNLƏNİLƏN JANR",
        "Your top songs, artists and genres" to "Ən çox dinlədiyiniz mahnılar, sənətçilər və janrlar",
        "Good evening" to "Axşamınız xeyir",
        "Your year so far" to "İndiyə qədərki iliniz",
        "Quick picks" to "Sürətli seçimlər",
        "Made for you" to "Sizin üçün hazırlandı",
        "Smart Downloads" to "Ağıllı Yükləmələr",
        "Ready for when you're offline" to "Oflayn olduğunuz vaxtlar üçün hazır",
        "ALBUM" to "ALBOM",
        "MORE" to "DAHA ÇOX",
        "Explicit" to "Uyğunsuz məzmun",
        "3 min · Explicit" to "3 dəq · Uyğunsuz",
        "Use mine" to "Mənimkini istifadə et",
        "Tint strength" to "Rəng çalarının intensivliyi",
        "Prism Sample" to "Prism Nümunəsi",
        "Both of you" to "Hər ikiniz",
        "You" to "Siz",
        "Point at your friend's Blend code" to "Dostunuzun Blend koduna yönəldin",
        "On" to "Açıq",
        "Off" to "Bağlı",
        "Picked" to "Seçildi",
        "Song's cover" to "Mahnı örtüyü",
        "Your pick" to "Sizin seçiminiz",
        "Follows the song that's playing" to "Oxunan mahnını izləyir",
        "Unpair %s" to "%s cütləşməsini ləğv et",
        "Forget %s" to "%s cihazını unut",
        "Move %s up" to "%s elementini yuxarı köçür",
        "Move %s down" to "%s elementini aşağı köçür",
        "More about %s" to "%s haqqında ətraflı məlumat",
        "Hide details" to "Təfərrüatları gizlə",
        "Prism" to "Prism",
        "Every color finds its way" to "Hər rəng öz yolunu tapır",
        "Somewhere a light is turning on" to "Hardasa bir işıq yanır",
        "We follow the line of the sound" to "Səsin xəttini izləyirik",
        "Into the bright of the day" to "Günün aydınlığına doğru",
        "Northern Lights" to "Qütb Parıltısı",
        "Paper Planes" to "Kağız Təyyarələr",
        "Slow Tide" to "Sakit Qabarma",
        "Home, charts and search follow this country. If Prism Music isn't available where you live, pick a country where it is. Restart Prism for playback to follow too. Songs a label blocks in your country still won't play: that's decided by your connection, not this setting." to "Əsas səhifə, qrafiklər və axtarış bu ölkəyə uyğunlaşır. Yaşadığınız yerdə Prism Music mövcud deyilsə, mövcud olduğu bir ölkəni seçin. Oynatmanın da uyğunlaşması üçün Prism-i yenidən başladın. Şirkətin ölkənizdə blokladığı mahnılar yenə də səsləndirilməyəcək: buna bu ayar deyil, bağlantınız qərar verir.",
        "Copy its playlists, saved albums and artists into Prism, so they stay on this phone even signed out. " to "Pley-listlərini, saxlanılan albomları və sənətçiləri Prism-ə kopyalayın, beləliklə çıxış etsəniz belə bu telefonda qalarlar. ",
        "Prism closed unexpectedly. What went wrong is kept on this phone (only the last few crashes). Sharing it, through GitHub for example, helps fix it. Nothing is sent anywhere unless you share it." to "Prism gözlənilmədən bağlandı. Nəyin səhv getdiyi bu telefonda saxlanılır (yalnız son bir neçə çökmə). Məsələn GitHub vasitəsilə paylaşmaq düzəldilməsinə kömək edir. Siz paylaşmadığınız müddətcə heç yerə heç nə göndərilmir.",
        "Check your connection. Some networks, such as work and school ones, block Discord: try another " to "Bağlantınızı yoxlayın. İş və məktəb şəbəkələri kimi bəzi şəbəkələr Discord-u bloklayır: başqa bir şəbəkə sınayın ",
        "Nothing new from your artists in the last three months. Prism looks every few days at the artists you've starred, " to "Son üç ayda sənətçilərinizdən yeni heç nə yoxdur. Prism, ulduzladığınız sənətçiləri bir neçə gündən bir yoxlayır, ",
        "Tap the line under the player's controls (it says which device is playing) and pick a speaker, TV or receiver. " to "Oynatıcı idarəedicilərinin altındakı sətrə toxunun (hansı cihazın çaldığını göstərir) və dinamik, televizor və ya qəbuledici seçin. ",
        "Last copied " to "Son kopyalanan ",
        "Measured by %s" to "%s ilə ölçüldü",
        "Moving to Prism %s" to "Prism %s versiyasına keçilir",
        "%d min" to "%d dəq",
        "Stops in %d min" to "%d dəq ərzində dayanacaq",

        "Stats" to "Statistika",
        "Remove from liked" to "Bəyənilənlərdən sil",
        "Add to liked" to "Bəyənilənlərə əlavə et",
        "Playing next" to "Növbəti oxudulur",
        "Added to queue" to "Növbəyə əlavə edildi",
        "Repeat all" to "Hamısını təkrarla",
        "Repeat one" to "Birini təkrarla",
        "Repeat off" to "Təkrar bağlıdır",
        "Smart Shuffle" to "Ağıllı Qarışdırma",
        "Shuffle" to "Qarışdır",
        "Back to the song" to "Mahnıya qayıt",
        "Music video" to "Musiqi videosu",
        "No music video" to "Musiqi videosu yoxdur",
        "No music video for this song" to "Bu mahnı üçün musiqi videosu yoxdur",
        "Song end" to "Mahnı sonu",
        "Your best part" to "Ən sevdiyiniz hissə",
        "✦ Pick" to "✦ Seç",
        "Drag to move" to "Köçürmək üçün sürükləyin",
        " · Karaoke" to " · Karaoke",
        "Turn Sing off" to "Vokalı bağla",
        "Sing" to "Vokal",
        "Show or hide Sing's controls" to "Vokal idarəetmələrini göstər və ya gizlə",
        "Ready" to "Hazır",
        "Getting ready…" to "Hazırlanır…",
        "Original" to "Orijinal",
        "Off: the song plays as it is." to "Bağlı: mahnı olduğu kimi oxunur.",
        "Ready: the voice is out." to "Hazır: vokal çıxarıldı.",
        "Getting this song ready…" to "Bu mahnı hazırlanır…",
        "Couldn't make the picture to share" to "Paylaşılacaq şəkil yaradıla bilmədi",
        "Anyone with the link can now open it" to "Artıq linkə sahib olan hər kəs aça bilər",
        "Couldn't change who can see it" to "Kimlərin görə biləcəyi dəyişdirilə bilmədi",
        "Copy link" to "Linki kopyala",
        "Send link" to "Linki göndər",
        "Track list" to "Trek siyahısı",
        "Preparing…" to "Hazırlanır…",
        "Share image" to "Şəkli paylaş",
        "Listen on YouTube Music" to "YouTube Music-də dinləyin",
        "Link copied" to "Link kopyalandı",
        "Episode" to "Buraxılış",
        "Single" to "Sinql",
        "EP" to "EP",
        "Sunset" to "Qürub",
        "Ocean" to "Okean",
        "Forest" to "Meşə",
        "Ember" to "Köz",
        "Candy" to "Konfet",
        "Neon" to "Neon",
        "Ice" to "Buz",
        "Gold" to "Qızıl",
        "Silver" to "Gümüş",
        "Color-blind safe" to "Rəng korluğu üçün uyğun",
        "Couldn't open that file" to "Bu fayl açıla bilmədi",
        "That isn't a font file Android can use (pick a .ttf or .otf)" to "Bu, Android-in istifadə edə biləcəyi şrift faylı deyil (.ttf və ya .otf seçin)",
        "Couldn't save the font" to "Şrift yadda saxlanıla bilmədi",
        "That font couldn't be used" to "Bu şriftdən istifadə edilə bilmədi",
        "Icons & shapes" to "İkonlar və formalar",
        "Glass & backgrounds" to "Şüşə və arxa planlar",
        "Immersive" to "İmmersiv",
        "Lossless" to "İtkisiz",
        "Your own" to "Özünüzə məxsus",
        "Search settings" to "Parametrlərdə axtar",
        "Prism playback diagnostics" to "Prism oxutma diaqnostikası",
        "Share diagnostics" to "Diaqnostikanı paylaş",
        "\"Listening to Prism\" on your profile" to "Profilinizdə \"Prism Dinləyir\"",
        "Photo's color" to "Fotonun rəngi",
        "Focus blur" to "Fokus bulanıqlığı",
        "Double tap" to "İki dəfə toxunma",
        "Lyrics style" to "Mahnı sözü üslubu",
        "Left" to "Sol",
        "Centred" to "Mərkəzləşdirilmiş",
        "Small" to "Kiçik",
        "Medium" to "Orta",
        "Large" to "Böyük",
        "Both" to "Hər ikisi",
        "Elapsed" to "Keçən vaxt",
        "Time left" to "Qalan vaxt",
        "None" to "Heç biri",
        "Next song" to "Növbəti mahnı",
        "Previous song" to "Əvvəlki mahnı",
        "Back 10 s" to "10 san geriyə",
        "Ahead 10 s" to "10 san irəli",
        "Seek by side" to "Kənarlardan irəli-geri",
        "Play / pause" to "Oxut / fasilə",
        "Song menu" to "Mahnı menyusu",
        "Stop" to "Dayandır",
        "Nothing" to "Heç nə",
        "Under each line" to "Hər sətrin altında",
        "Instead" to "Əvəzinə",
        "Liked songs" to "Bəyənilən mahnılar",
        "Downloads" to "Endirilənlər",
        "Local files" to "Yerli fayllar",
        "Replay" to "Replay",
        "Podcasts" to "Podkastlar",
        "Listen together" to "Birlikdə dinləyin",
        "Blend" to "Blend",
        "Recognized" to "Tanınanlar",
        "New playlist" to "Yeni pleylist",
        "Import playlists" to "Pleylistləri idxal et",
        "Video ID" to "Video ID",
        "Source" to "Mənbə",
        "Stream" to "Yayım",
        "Codec" to "Kodek",
        "Bitrate" to "Bit sürəti",
        "Format" to "Format",
        "Output" to "Çıxış",
        "Device" to "Cihaz",
        "Spatializer" to "Məkanlaşdırıcı",
        "Loudness" to "Səs ucalığı",
        "Effects" to "Effektlər",
        "Buffer" to "Bufer",
        "Session" to "Sessiya",
        "The split light" to "Qırılan işıq",
        "Thinner" to "Daha incə",
        "As the style" to "Üsluba görə",
        "Thicker" to "Daha qalın",
        "Still" to "Hərəkətsiz",
        "Slow drift" to "Yavaş axış",
        "Drifting" to "Axır",
        "Soft" to "Yumşaq",
        "As the cover" to "Üzqabıq kimi",
        "Rich" to "Zəngin",
        "Swipe left" to "Sola sürüşdür",
        "Swipe right" to "Sağa sürüşdür",
        "Swipe up" to "Yuxarı sürüşdür",
        "Pull down" to "Aşağı çək",
        "Long press" to "Uzun basma",
        "The mark" to "İşarə",
        "Split light" to "Qırılan işıq",
        "Orbits" to "Orbitlər",
        "Color wheel" to "Rəng çarxı",
        "Waves" to "Dalğalar",
        "Night sky" to "Gecə səması",
        "Thin" to "İncə",
        "Regular" to "Normal",
        "Bold" to "Qalın",
        "Quiet" to "Sakit",
        "Plain glass, one hairline of split light" to "Sadə şüşə, tək bir incə qırılan işıq xətti",
        "Wash" to "Yuyulma",
        "A faint wash of color and month bars" to "Zəif rəng axını və ay çubuqları",
        "Spectrum frame" to "Spektr çərçivəsi",
        "Glass ringed in split light, the time in color" to "Qırılan işıqla haşiyələnmiş şüşə, rəngli vaxt",
        "Prism stripe" to "Prism zolağı",
        "A band of refracted light down one side" to "Bir kənar boyu qırılan işıq zolağı",
        "Spectrum bars" to "Spektr çubuqları",
        "Your months as big bars, red to violet" to "Qırmızıdan bənövşəyiyə böyük çubuqlar kimi aylarınız",
        "Listened" to "Dinlənildi",
        "Top artist" to "Ən çox dinlənilən sənətçi",
        "Top song" to "Ən çox dinlənilən mahnı",
        "Top artists" to "Ən çox dinlənilən sənətçilər",
        "Top songs" to "Ən çox dinlənilən mahnılar",
        "play" to "oxutma",
        "plays" to "oxutma",
        "day" to "gün",
        "days" to "gün",
        "PRISM REWIND" to "PRISM REWIND",
        "PRISM REPLAY" to "PRISM REPLAY",
        "the 30 days before" to "əvvəlki 30 gün",
        "of music" to "musiqi",
        "artist" to "sənətçi",
        "artists" to "sənətçi",
        "Favorite day" to "Ən sevilən gün",
        "Biggest day" to "Ən aktiv gün",
        "Longest streak" to "Ən uzun seriya",
        "NEW ARTIST" to "YENİ SƏNƏTÇİ",
        "NEW ARTISTS" to "YENİ SƏNƏTÇİLƏR",
        "Save Top 100" to "İlk 100-ü yadda saxla",
        "Save playlist" to "Pleylisti yadda saxla",
        "Search failed" to "Axtarış uğursuz oldu",
        "Every color finds its way" to "Hər rəng öz yolunu tapır",
        "Northern Lights" to "Qütb Parıltısı",
        "Prism Sample" to "Prism Nümunəsi",
        "Tap anything outlined to change it" to "Dəyişmək üçün haşiyələnmiş hər hansı yerə toxunun",
        "That's your own code" to "Bu öz kodunuzdur",
        "That isn't a Prism Blend code" to "Bu bir Prism Blend kodu deyil",
        "That isn't a Prism Look" to "Bu bir Prism Look deyil",
        "That file isn't a Prism Look" to "Bu fayl bir Prism Look deyil",
        "Couldn't make the playlist" to "Pleylist yaradıla bilmədi",
        "Couldn't use that picture" to "Bu şəkildən istifadə edilə bilmədi",
        "You're offline. Check your connection and try again." to "Oflaynsınız. Bağlantınızı yoxlayın və yenidən cəhd edin.",
        "Prism Music took too long to answer. Try again." to "Prism Music-in cavab verməsi çox uzun çəkdi. Yenidən cəhd edin.",
        "Couldn't connect securely. On public Wi-Fi or a VPN? Try another network." to "Təhlükəsiz qoşulmaq olmadı. İctimai Wi-Fi və ya VPN istifadə edirsiniz? Başqa şəbəkə sınayın.",
        "YouTube is limiting requests right now. Try again in a few minutes." to "YouTube hazırda sorğuları məhdudlaşdırır. Bir neçə dəqiqədən sonra yenidən cəhd edin.",
        "Prism Music is having trouble right now. Try again in a bit." to "Prism Music hazırda çətinlik çəkir. Bir azdan yenidən cəhd edin.",
        "Something went wrong" to "Xəta baş verdi",
        "tap to share its details" to "təfərrüatlarını paylaşmaq üçün toxunun",
        "Your own light" to "Özünüzə məxsus işıq",
        "White light" to "Ağ işıq",
        "Black light" to "Qara işıq",
        "Floating bar" to "Üzən panel",
        "Docked bar" to "Sabitlənmiş panel",
        "Minimal bar" to "Minimal panel",
        "High quality" to "Yüksək keyfiyyət",
        "Normal quality" to "Normal keyfiyyət",
        "Low quality" to "Aşağı keyfiyyət",
        "Grid view" to "Tor görünüşü",
        "List view" to "Siyahı görünüşü",
        "hours" to "saat",
        "minutes" to "dəqiqə",
        "That Look code couldn't be read" to "Bu Görünüş kodu oxuna bilmədi",
        "That file isn't a Prism Look" to "Bu fayl bir Prism Görünüşü deyil",
        "That isn't a YouTube or YouTube Music link" to "Bu YouTube və ya YouTube Music keçidi deyil",
        "Picture-in-picture is off for Prism in Android's settings" to "Android parametrlərində Prism üçün Şəkil içində şəkil sönülüdür",
        "Couldn't save the queue" to "Növbə yadda saxlanıla bilmədi",
        "Saved to your library" to "Kitabxananıza yadda saxlanıldı",
        "Removed from your library" to "Kitabxananızdan silindi",
        "Added to your library" to "Kitabxananıza əlavə edildi",
        "Couldn't update your library" to "Kitabxananız yenilənə bilmədi",
        "Couldn't start the radio" to "Radio başladıla bilmədi",
        "Its plays count towards your recommendations again" to "Səsləndirmələri yenidən tövsiyələrinizi formalaşdıracaq",
        "Its plays won't shape your recommendations" to "Səsləndirmələri tövsiyələrinizə təsir etməyəcək",
        "Saved" to "Yadda saxlanıldı",
        "Couldn't use that picture" to "Bu şəkildən istifadə edilə bilmədi",
        "Backed up" to "Yedəkləndi",
        "Account added. Pick its channel under Switch account" to "Hesab əlavə edildi. Hesabı dəyiş bölməsindən onun kanalını seçin",
        "That isn't a Prism Look" to "Bu bir Prism Görünüşü deyil",
        "Couldn't download that Look" to "Bu Görünüş endirilə bilmədi",
        "Couldn't make the file" to "Fayl yaradıla bilmədi",
        "Couldn't share your Rewind" to "Rewind-ınız paylaşıla bilmədi",
        "Couldn't share your Replay" to "Replay-iniz paylaşıla bilmədi",
        "Saved as a private playlist" to "Məxfi pleylist olaraq yadda saxlanıldı",
        "Couldn't save the Blend" to "Blend yadda saxlanıla bilmədi",
        "Couldn't reach YouTube Music. Try again." to "YouTube Music-ə qoşulmaq mümkün olmadı. Yenidən cəhd edin.",
        "Couldn't create playlist" to "Pleylist yaradıla bilmədi",
        "Couldn't make the playlist" to "Pleylist hazırlana bilmədi",
        "That's your own code" to "Bu sizin öz kodunuzdur",
        "That isn't a Prism Blend code" to "Bu bir Prism Blend kodu deyil",
        "The Loyalist" to "Sadiq Dinləyici",
        "The Explorer" to "Kəşfiyyatçı",
        "The Replayer" to "Təkrar Dinləyən",
        "The Night Owl" to "Gecə Bayquşu",
        "The Early Riser" to "Erkən Qalxan",
        "The Marathoner" to "Marafonçu",
        "The Shapeshifter" to "Cildini Dəyişən",
        "The Listener" to "Dinləyici",
        "Every play counted." to "Hər səsləndirmə dəyərli idi.",
        "No single sound could hold you. You moved between genres all the time." to "Tək bir səs sizi saxlaya bilmədi. Həmişə janrlar arasında keçid etdiniz.",
        "When a song hits, you run it back." to "Bir mahnı təsir edəndə, onu yenidən oxudursunuz.",
        "Songs you sang" to "Oxuduğunuz mahnılar",
        "Songs in DJ sets" to "DJ setlərindəki mahnılar",
        "Smart Shuffle finds played" to "Səsləndirilən Ağıllı Qarışıq kəşfləri",
        "Songs recognized" to "Tanınan mahnılar",
        "Blend made" to "Blend yaradıldı",
        "Blends made" to "Blend yaradıldı",
        "Release Radar finds" to "Yeni Buraxılışlar Radarı kəşfləri",
        "Listening" to "Dinləmə vaxtı",
        "Different songs" to "Fərqli mahnı",
        "Watch again" to "Yenidən izlə",
        "Longest streak" to "Ən uzun seriya",
        "Biggest day" to "Ən aktiv gün",
        "NEW ARTIST" to "YENİ SƏNƏTÇİ",
        "NEW ARTISTS" to "YENİ SƏNƏTÇİLƏR",
        "A bit of everything" to "Hər şeydən bir az",
        "PRISM REWIND" to "PRISM REWIND",
        "PRISM REPLAY" to "PRISM REPLAY",
        "REWIND" to "REWIND",
        "REPLAY" to "REPLAY",
        "Watch your Rewind" to "Rewind-ınızı izləyin",
        "Watch your Replay" to "Replay-inizi izləyin",
        "You're on your own mix of settings" to "Öz xüsusi parametr qarışığınızdasınız",
        "A Look keeps colors, type, icons, backgrounds, the player and lyrics' look together. Pick one and everything changes at once; Undo puts it back." to "Görünüş; rəngləri, şrifti, nişanları, arxa planları, pleyeri və mahnı sözü tərzini bir yerdə saxlayır. Birini seçdiyinizdə hər şey eyni anda dəyişir; Geri qaytar əvvəlki vəziyyətinə qaytarır.",
        "Looks you save show here. Save one above, or get one from a friend below." to "Yadda saxladığınız Görünüşlər burada görünür. Yuxarıdan bir dənə yadda saxlayın və ya aşağıdan bir dostunuzdan əldə edin.",
        "You see a Look first, and choose to try it or keep it." to "Bir Görünüşü əvvəlcə görür, sonra yoxlamağı və ya saxlamağı seçirsiniz.",
        "Scan a Look's QR code" to "Bir Görünüşün QR kodunu skan et",
        "From a friend's Prism" to "Bir dostunuzun Prism-indən",
        "Paste a Look code" to "Bir Görünüş kodu yapışdır",
        "A code someone sent you" to "Kiminisə sizə göndərdiyi bir kod",
        "Open a Look file" to "Bir Görünüş faylı aç",
        "A .prismlook file, with its photos and font" to "Şəkilləri və şrifti ilə birlikdə bir .prismlook faylı",
        "Couldn't add it to the playlist" to "Pleylistə əlavə edilə bilmədi",
        "Link" to "Keçid",
        "MORE" to "DAHA ÇOX",
        "Artist" to "Sənətçi",

        // Liked playlist and files
        "The playlist stays, but won't change any more" to "Pleylist qalır, lakin artıq dəyişməyəcək",
        "Lyrics saved into the file" to "Mahnı sözləri fayla yadda saxlanıldı",
        "Couldn't save the lyrics into the files" to "Mahnı sözləri fayllara yadda saxlanıla bilmədi",
        "Nothing was changed" to "Heç nə dəyişdirilmədi",
        "Prism needs permission to change your music files" to "Prism musiqi fayllarınızı dəyişmək üçün icazə tələb edir",
        "No FLAC or MP3 files to save lyrics into" to "Mahnı sözlərini yadda saxlamaq üçün FLAC və ya MP3 faylı yoxdur",
        "No lyrics found for this song" to "Bu mahnı üçün mahnı sözləri tapılmadı",
        "No lyrics found for these songs" to "Bu mahnılar üçün mahnı sözləri tapılmadı",
        "Find a playlist" to "Bir pleylist tapın",

        // Account progress
        "Starting…" to "Başladılır…",
        "Albums and artists" to "Albomlar və ifaçılar",

        // Replay Cards styles & notes
        "Three numbers side by side" to "Yan-yana üç rəqəm",
        "The year so far as a ring of split light" to "İlin indiyədək olan hissəsi ayrılmış işıq halqası kimi",
        "Your top song's cover sets the color" to "Rəngi ən çox dinlədiyiniz mahnının üzlüyü təyin edir",
        "A faint wash of color and month bars" to "Zəif rəng axını və ay zolaqları",
        "Glass ringed in split light, the time in color" to "Ayrılmış işıqla haşiyələnmiş şüşə, rəngli müddət",
        "A band of refracted light down one side" to "Bir kənar boyu sınmış işıq zolağı",
        "Your months as big bars, red to violet" to "Qırmızıdan bənövşəyiyə böyük zolaqlar şəklində aylarınız",
        "Full color, like a Rewind slide" to "Rewind slaydı kimi tam rəngli",
        "Plain glass, one hairline of split light" to "Sadə şüşə, alt hissədə tək incə işıq xətti",
        "<1 min" to "<1 dəq",

        // Replay Story
        "Your year in music." to "Musiqidəki iliniz.",
        "Your month in music." to "Musiqidəki ayınız.",
        "Your last 30 days in music." to "Musiqidəki son 30 gününüz.",
        "Everything you've played, in one story." to "Oxutduğunuz hər şey bir hekayədə.",
        "Couldn't share this slide" to "Bu slayd paylaşıla bilmədi",
        "Unmute" to "Səsi aç",

        // Search & local music
        "Allow access to your music files in Library → Local files to search them here too." to "Onları burada da axtarmaq üçün Kitabxana → Yerli fayllar bölməsindən musiqi fayllarınıza giriş icazəsi verin.",
        "Your music files and downloads are searched by title, artist and album." to "Musiqi fayllarınız və yükləmələriniz başlıq, ifaçı və alboma görə axtarılır.",
        "● Live" to "● Canlı",
        "● LIVE" to "● CANLI",
        "VIDEO" to "VİDEO",

        // Settings Screen
        "\"Continue …\" under the greeting" to "Salamlamanın altında \"Davam et …\"",
        "Making your mixes…" to "Miksləriniz hazırlanır…",
        "Prism Account · on this phone" to "Prism Hesabı · bu telefonda",
        "signed in" to "daxil olunub",
        "Signed in" to "Daxil olunub",
        "Turn on Crossfade songs and turn off Automatic length first" to "Əvvəlcə Mahnılar arası çarpaz keçidi aktivləşdirin və Avtomatik müddəti söndürün",
        "Lossless playback always plays the best audio; turn it off to pick a quality" to "İtkisiz oxutma həmişə ən yaxşı səsi oxudur; bir keyfiyyət seçmək üçün söndürün",
        "Pick a Romanize lyrics option first" to "Əvvəlcə bir Mahnı sözlərini latınlaşdır seçimi edin",

        // Settings summaries
        "Browser remote on" to "Brauzer pultu aktivdir",
        "Available for handoff" to "Ötürmə üçün əlçatandır",
        "Accent from the cover" to "Üz qabığından vurğu",
        "Accent from the wallpaper" to "Divar kağızından vurğu",
        "Showing what you play on your profile" to "Profilinizdə nə oxutduğunuz göstərilir",
        "Show what you're playing on your profile" to "Profilinizdə nə oxutduğunuzu göstərin",
        "Icon pack and weight, app icon, corners" to "İkon paketi və qalınlığı, tətbiq ikonu, künclər",
        "Save, switch and share whole looks; day and night" to "Görünüşləri yadda saxlayın, dəyişin və paylaşın; gündüz və gecə",
        "Sections, order and styles" to "Bölmələr, sıralama və üslublar",

        // Settings choices
        "Bands" to "Zolaqlar",
        "Smooth" to "Hamar",
        "Stripes of each color, like the logo" to "Loqo kimi hər rəngdən zolaqlar",
        "Each color blends into the next" to "Hər rəng növbəti rəngə rəvan qarışır",
        "Exactly as picked" to "Dəqiq seçildiyi kimi",
        "Softened" to "Yumşaldılmış",
        "Your color as it is, only changed where text wouldn't read" to "Rənginiz olduğu kimi, yalnız mətn oxunmayan yerlərdə dəyişdirilir",
        "Lighter on dark pages, deeper on light ones" to "Tünd səhifələrdə daha açıq, açıq səhifələrdə daha dərin",
        "Picture's color" to "Şəklin rəngi",
        "Each page and menu takes a color from its picture instead of yours (black-and-white ones keep yours)" to "Hər səhifə və menyu sizinki əvəzinə öz şəklinin rəngini alır (ağ-qara olanlar sizinkini saxlayır)",
        "Your accent on every page and menu" to "Hər səhifədə və menyuda sizin vurğu rənginiz",
        "Playlists first" to "Əvvəlcə pleylistlər",
        "Tiles first" to "Əvvəlcə plitələr",
        "Your playlists at the top, the tiles after them" to "Pleylistləriniz yuxarıda, plitələr onların altında",
        "The tiles at the top, your playlists below" to "Plitələr yuxarıda, pleylistləriniz aşağıda",
        "The player's own background" to "Oxuducunun öz fonu",
        "Filling the screen, as now" to "İndiki kimi ekranı dolduraraq",
        "Top color" to "Üst rəng",
        "Bottom color" to "Alt rəng",
        "Animated cover: songs without a moving cover show the cover blurred." to "Hərəkətli üz qabığı: hərəkətli üzlüyü olmayan mahnılar üzlüyü bulanıq göstərir.",

        // Settings notes
        "The line on the cover art, lighting up word by word, and as the title (unless the title's kept)" to "Üz qabığı üzərindəki sətir, kəlmə-kəlmə işıqlanaraq və başlıq kimi (başlıq saxlanmadığı halda)",
        "The current and next line on the cover art, and as the title (unless the title's kept)" to "Üz qabığı üzərindəki cari və növbəti sətir və başlıq kimi (başlıq saxlanmadığı halda)",
        "The current line in place of the song title; the cover stays as it is" to "Mahnı başlığı yerinə cari sətir; üzlük olduğu kimi qalır",
        "Apple Music's lyrics · word by word" to "Apple Music sözləri · kəlmə-kəlmə",
        "Apple Music, Musixmatch and Spotify's · word by word" to "Apple Music, Musixmatch və Spotify sözləri · kəlmə-kəlmə",
        "QQ Music · word by word, the most Chinese songs" to "QQ Music · kəlmə-kəlmə, ən çox Çin mahnıları",
        "Open lyrics database · line by line" to "Açıq mahnı sözləri bazası · sətir-sətir",
        "NetEase Cloud Music · word by word" to "NetEase Cloud Music · kəlmə-kəlmə",
        "KuGou · word by word, many Asian songs" to "KuGou · kəlmə-kəlmə, bir çox Asiya mahnıları",
        "Lyrics listeners submit · few songs so far" to "Dinləyicilərin təqdim etdiyi mahnı sözləri · hələlik az mahnı",
        "LyricFind · lines or plain" to "LyricFind · sətirlər və ya sadə mətn",
        "Plain text · also fills in starred-out words" to "Sadə mətn · ulduzlanmış sözləri də tamamlayır",
        "The cover, then everything under it" to "Üz qabığı, sonra onun altındakı hər şey",
        "A big cover; tap it for the controls" to "Böyük üzlük; idarəetmələr üçün toxunun",
        "Opens on the lyrics, a small cover beside the title" to "Mahnı sözləri ilə açılır, başlığın yanında kiçik üzlük",
        "The title and play; gestures do the rest" to "Başlıq və oxutma; qalanını jestlər həll edir",
        "The cover as a record's label, turning as it plays" to "Oxunduqca fırlanan val etiketi kimi üzlük",
        "The cover on a tape whose reels turn as it plays" to "Oxunduqca çarxları fırlanan kaset üzərindəki üzlük",
        "Nothing moves with the music" to "Musiqi ilə heç nə hərəkət etmir",
        "Along the bottom of the player" to "Oxuducunun aşağısı boyunca",
        "A soft wave behind the title" to "Başlığın arxasında zərif dalğa",
        "Around the cover" to "Üz qabığının ətrafında",
        "The progress bar pulses with the beat" to "İrəliləyiş zolağı ritmlə döyünür",
        "The background breathes with the music" to "Arxa fon musiqi ilə nəfəs alır",
        "Each word grows bolder as it's sung" to "Hər söz oxunduqca daha qalınlaşır",
        "Color fills the words as they're sung" to "Sözlər oxunduqca içləri rənglə dolur",
        "Big bold lines on the cover's color" to "Üz qabığının rəngində böyük qalın sətirlər",
        "The sung words glow" to "Oxunan sözlər parıldayır",
        "Words appear as they're sung" to "Sözlər oxunduqca görünür",
        "No animation: the line simply brightens" to "Animasiya yoxdur: sətir sadəcə işıqlanır",
        "Nothing but the words" to "Yalnız sözlər",
        "let me reorder or hide them" to "yenidən sıralamağıma və ya gizlətməyimə icazə ver",
        "Mixes from your music" to "Musiqinizdən mikslər",
        "Shortcut tiles" to "Qısayol plitələri",
        "New from your artists" to "İfaçılarınızdan yeni çıxanlar",
        "Replay teaser" to "Replay anonsu",
        "Speed dial" to "Sürətli yığım",
        "Repeat rewind" to "Daimi dinlənilənlər",
        "Forgotten favourites" to "Unudulmuş sevimlilər",
        "Mixed for you" to "Sizin üçün qarışıq",

        // Playback buttons
        "Shuffle off" to "Qarışıq oxutma sönülüdür",
        "Hide lyrics" to "Sözləri gizlət",
        "Show lyrics" to "Sözləri göstər",
        "Back 10 seconds" to "10 saniyə geri",
        "Ahead 30 seconds" to "30 saniyə irəli",

        // Notifications
        "Your year in music: your top songs, artists and more, made on your phone." to "Musiqidəki iliniz: ən çox dinlədiyiniz mahnılar, ifaçılar və daha çoxu telefonunuzda hazırlandı.",
        "Pairing codes when another device wants to play here" to "Başqa bir cihaz burada oxutmaq istədikdə cütləşdirmə kodları",
        "New music from artists you follow" to "İzlədiyiniz ifaçılardan yeni musiqilər",
        "When your year in music is ready" to "Musiqidəki iliniz hazır olduqda",
        "Songs recognized after you were offline" to "Oflayn olarkən tanınan mahnılar",

        "Appears On" to "Burada yer aldı",
        "Artist Playlists" to "İfaçı Pleylistləri",
        "Best part" to "Ən yaxşı hissə",
        "Your best part" to "Sizin ən yaxşı hissəniz",
        "Copied" to "Kopyalandı",
        "Copy a friend's code first" to "Əvvəlcə dostunuzun kodunu kopyalayın",
        "Downloading lyrics again" to "Mahnı sözləri yenidən endirilir",
        "Each group's ⓘ says everything it changes in the app, and each choice shows what it looks like. Tap one and the preview above changes at once. Reset colors, at the bottom, puts everything back." to "Hər qrupun ⓘ işarəsi tətbiqdə nəyi dəyişdiyini izah edir və hər seçim necə göründüyünü göstərir. Birinə toxunduqda yuxarıdakı önbaxış dərhal dəyişir. Ən aşağıdakı Rəngləri sıfırla hər şeyi geri qaytarır.",
        "Got it — Prism will steer clear of this song" to "Başa düşüldü — Prism bu mahnını oxutmaqdan çəkinəcək",
        "Livestreams" to "Canlı Yayımlar",
        "Music Videos" to "Musiqi Videoları",
        "Output device" to "Çıxış cihazı",
        "Prism is free software under the GNU General Public License, version 3 or later. You can use, study, share and change it; copies and changed versions have to stay under the same license, with their source." to "Prism, GNU Baş İctimai Lisenziyası 3 və ya daha sonrakı versiyası altında olan azad proqram təminatıdır. Siz onu istifadə edə, araşdıra, paylaşa və dəyişdirə bilərsiniz; nüsxələr və dəyişdirilmiş versiyalar mənbə kodu ilə birlikdə eyni lisenziya altında qalmalıdır.",
        "Saving animated covers for this album" to "Bu albom üçün animasiyalı üzlüklər yadda saxlanılır",
        "Shuffle & repeat" to "Qarışıq və təkrar",
        "Similar Artists" to "Oxşar İfaçılar",
        "Singles & EPs" to "Sinqllər və EP-lər",
        "Song / Video" to "Mahnı / Video",
        "Stream quality" to "Yayım keyfiyyəti",
        "Top Songs" to "Ən Populyar Mahnılar",
        "Type a name first" to "Əvvəlcə ad yazın",
        "When the new Prism opens, tap \"Restore from a backup\" and pick the backup." to "Yeni Prism açılanda \"Yedəkdən bərpa et\" toxunun və yedəyi seçin.",
        "You're offline, and this song isn't downloaded" to "Oflaynsınız və bu mahnı endirilməyib",
        "Your Prism Account is ready" to "Prism Hesabınız hazırdır",
        "Your Prism Account" to "Prism Hesabınız",
        "Your account" to "Hesabınız",
        "Your picture" to "Şəkliniz",
        "Your account isn't changed; copy again any time to bring Prism's copies up to date." to "Hesabınız dəyişdirilmir; Prism nüsxələrini yeniləmək üçün istənilən vaxt yenidən kopyalayın.",
        "Your color here is the one picked for the other lines (Colors, above)." to "Buradakı rənginiz digər sətirlər üçün seçiləndir (yuxarıdakı Rənglər).",
        "A photo" to "Bir fotoşəkil",
        "A .prismlook file, with its photos and font" to "Fotoşəkilləri və şrifti ilə birlikdə .prismlook faylı",
        "Open a Look file" to "Görünüş faylını aç",
        "Its brightest color" to "Ən parlaq rəngi",
        "A softer, dusty one" to "Daha yumşaq, pastel bir rəng",
        "The color it has most of" to "Ən çox olan rəng",
        "Which of this cover's colors becomes the accent." to "Bu üzlüyün hansı rənginin vurğu rəngi olacağı.",
        "Which of the cover's colors becomes the accent. Play a song to see its own colors here." to "Üzlüyün hansı rənginin vurğu rəngi olacağı. Öz rənglərini burada görmək üçün bir mahnı oxudun.",
        "Waiting for Wi-Fi" to "Wi-Fi gözlənilir",
        "Queued" to "Növbədə",
        "Paused" to "Fasilə verildi",
        "Restarting" to "Yenidən başladılır",
        "Starting" to "Başladılır",
        "Prism also tries them again by itself when the phone is back online." to "Telefon yenidən onlayn olduqda Prism bunları öz-özünə yenidən sınayır.",
        "Playing here" to "Burada oxunur",
        "★ Favorite" to "★ Sevimli",
        "● Live now" to "● İndi canlı",
        "What's playing" to "İndi oxunan",
        "Your wallpaper" to "Divar kağızınız",
        "today" to "bu gün",
        "yesterday" to "dünən",
        "never" to "heç vaxt",
        "Album, playlist and artist pages use their picture's color instead (Artist & album pages, below)" to "Albom, pleylist və ifaçı səhifələri bunun əvəzinə öz şəkillərinin rəngini istifadə edir (aşağıdakı İfaçı və albom səhifələri)",
        "From artists you listen to" to "Dinlədiyiniz ifaçılardan",
        "Not in my library" to "Kitabxanamda deyil",
        "MORE MUSIC" to "DAHA ÇOX MUSİQİ",
        "LESS MUSIC" to "DAHA AZ MUSİQİ",
        "Open in Prism" to "Prism-də aç",
        "See in Prism" to "Prism-də gör",
        "Behind the player, darkened so its white text reads" to "Oxuducunun arxasında, ağ mətnlərin oxunması üçün qaraldılmış",
        "Color from what's playing, ready-made designs or your own photo" to "Oxunan musiqidən rəng, hazır dizaynlar və ya öz fotoşəkliniz",
        "Make my account" to "Hesabımı yarat",
        "Copy again" to "Yenidən kopyala",
        "Copy into Prism" to "Prism-ə kopyala",
        "Import playlist" to "Pleylisti idxal et",
        "Hide" to "Gizlət",
        "Show" to "Göstər",
        "The next song" to "Növbəti mahnı",
        "The cover" to "Üzlük",
        "Unknown album" to "Bilinməyən albom",
        "Not a Blend code" to "Blend kodu deyil",
        "Change the cover" to "Üzlüyü dəyiş",
        "Couldn't make the picture" to "Şəkil yaradıla bilmədi",
        "Go back to it as saved" to "Yadda saxlanılan halına qayıt",
        "Use this Look" to "Bu Görünüşü istifadə et",
        "Save a copy to change" to "Dəyişmək üçün nüsxəsini saxla",
        "Duplicate" to "Dublikatını çıxart",
        "Saved to your Looks" to "Görünüşlərinizə saxlanıldı",
        "Censored" to "Senzuralı",
        "Better romaji for Japanese: tap to download the reading data (13 MB)" to "Yapon dili üçün daha yaxşı romaji: oxu məlumatlarını endirmək üçün toxunun (13 MB)",
        "Couldn't download the Japanese kanji readings. Tap to try again" to "Yapon kanci oxu məlumatları endirilə bilmədi. Yenidən cəhd etmək üçün toxunun",
        "That message didn't hold a Prism Blend code." to "Bu mesajda Prism Blend kodu yox idi.",
        "Prism makes a playlist from your tastes together. Your code (what's under \"What you share\") goes straight back to their phone over Wi-Fi, so you both have it." to "Prism, zövqlərinizi birləşdirərək bir pleylist yaradır. Kodunuz (\"Nə paylaşırsınız\" altındakı), hər ikinizdə olması üçün Wi-Fi üzərindən birbaşa onların telefonuna qayıdır.",
        "Prism makes a playlist from your tastes together, on this phone. Only your code (what's under \"What you share\") goes to them, if you send it back." to "Prism, bu telefonda zövqlərinizi birləşdirərək bir pleylist yaradır. Yalnız kodunuz (\"Nə paylaşırsınız\" altındakı), geri göndərsəniz onlara çatdırılar.",
        "Share your Blend" to "Blend-inizi bölüşün",
        "Change what %s does" to "%s əməliyyatını dəyiş",
        "Couldn't get that correction: %s" to "Düzəliş alına bilmədi: %s",
        "Couldn't load AutoEq's list: %s" to "AutoEq siyahısı yüklənə bilmədi: %s",
        "Drag %s" to "%s elementini sürükləyin",
        "Keep Prism-%s.apk next to it" to "Prism-%s.apk faylını yanında saxlayın",
        "Matched automatically — the song starts %s into the video, so the lyrics wait for it." to "Avtomatik uyğunlaşdırıldı — mahnı videonun %s sonra başlayır, mahnı sözləri bunu gözləyir.",
        "Matched automatically — the video skips the song's first %s." to "Avtomatik uyğunlaşdırıldı — video mahnının ilk %s hissəsini ötürür.",
        "No headphones match \"%s\". AutoEq only has headphones someone has measured; you can also import a ParametricEQ file." to "\"%s\" ilə uyğunlaşan qulaqlıq yoxdur. AutoEq-da yalnız ölçülmüş qulaqlıqlar mövcuddur; həmçinin ParametricEQ faylını da idxal edə bilərsiniz.",
        "Options for %s" to "%s üçün seçimlər",
        "Prism %s is redrawn from the ground up and does more than ever. Here's a minute's tour: swipe, or tap Start." to "Prism %s başdan-ayağa yenidən dizayn edildi və həmişəkindən daha çoxunu edir. Budur bir dəqiqəlik tur: sürüşdürün və ya Başla toxunun.",
        "Show the %s section to see these on Home" to "Bunları Əsas Səhifədə görmək üçün %s bölməsini göstərin",
        "Then open Prism-%s.apk from your files" to "Sonra fayllarınızdan Prism-%s.apk faylını açın",
        "What's new in Prism %s" to "Prism %s versiyasındakı yeniliklər",
        "Plain" to "Sadə",
        "Accent tint" to "Vurğu çaları",
        "Grey, the frost in greys too" to "Boz, buzlu şüşə də boz çalarlarda",
        "The cover's colors in the frost; a hint of the accent on plain pages" to "Buzlu şüşədə üzlüyün rəngləri; sadə səhifələrdə vurğunun yüngül çaları",
        "Grey: the frost loses its color too" to "Boz: buzlu şüşə də rəngini itirir",
        "The accent's color, frost included" to "Buzlu şüşə daxil vurğu rəngi",
        "The accent's color, frost included (changes with each song)" to "Buzlu şüşə daxil vurğu rəngi (hər mahnıda dəyişir)",
        "A color you pick, frost included" to "Buzlu şüşə daxil seçdiyiniz bir rəng",
        "Very easy to read" to "Oxunması çox asan",
        "Easy to read" to "Oxunması asan",
        "OK for big text" to "Böyük mətn üçün uyğun",
        "Hard to read" to "Oxunması çətin",
        "Text on it" to "Üzərindəki mətn",
        "On dark" to "Qaranlıq temada",
        "On light" to "Açıq temada",
        "Wheel" to "Rəng çarxı",
        "Values" to "Dəyərlər",
        "Remove from saved colors" to "Saxlanılan rənglərdən sil",
        "Save this color" to "Bu rəngi saxla",
        "Top" to "Üst",
        "Bottom" to "Alt",
        "The song's cover's color" to "Mahnı üzlüyünün rəngi",
        "Your phone wallpaper's colors" to "Telefon divar kağızınızın rəngləri",
        "One color you choose" to "Seçdiyiniz tək bir rəng",
        "Soft grey text" to "Yumşaq boz mətn",
        "Firmer" to "Daha aydın",
        "Strongest, easiest to read" to "Ən güclü, oxunması ən asan",
        "Your accent" to "Sizin vurğunuz",
        "Like songs from the player and they'll show up here." to "Oxuducudan mahnıları bəyənin, burada görünəcəklər.",
        "Add songs from any song's menu (⋯ or a long press) → Add to playlist." to "İstənilən mahnının menyusundan (⋯ və ya uzun basaraq) → Pleylistə əlavə et seçimindən istifadə edin.",
        "Songs you add will show up here." to "Əlavə etdiyiniz mahnılar burada görünəcək.",
        "Download all" to "Hamısını endir",
        "Downloaded" to "Endirildi",
        "Downloading" to "Endirilir",
        "In your library" to "Kitabxananızda",
        "Add to library" to "Kitabxanaya əlavə et",
        "Other versions" to "Digər versiyalar",
        "Back in my taste" to "Zövqümə yenidən daxil et",
        "Leave out of my taste" to "Zövqümdən kənar saxla",
        "It counts towards your recommendations again" to "Yenidən tövsiyələrinizi formalaşdıracaq",
        "Its plays count towards your recommendations again" to "Oxunmaları yenidən tövsiyələrinizi formalaşdıracaq",
        "Its plays won't shape your recommendations" to "Oxunmaları tövsiyələrinizi formalaşdırmayacaq",
        "Got it — Prism will steer clear of this song" to "Aydındır — Prism bu mahnıdan uzaq duracaq",
        "Get missing lyrics" to "Çatışmayan mahnı sözlərini əldə et",
        "Delete all downloads" to "Bütün endirmələri sil",
        "loading more…" to "daha çoxu yüklənir…",
        " · loading more…" to " · daha çoxu yüklənir…",
        "Change picture" to "Şəkli dəyişdir",
        "Choose a photo" to "Fotoşəkil seçin",
        "From your phone's photos" to "Telefonunuzun fotolarından",
        "Or a cover from this playlist" to "Və ya bu pleylistdən bir üzlük",
        "Use the original picture" to "Orijinal şəkildən istifadə et",
        "The picture shows everywhere in Prism, including Android Auto. YouTube Music keeps its own." to "Şəkil Android Auto daxil olmaqla Prism-in hər yerində göstərilir. YouTube Music özününkünü saxlayır.",
        "Who can open it" to "Kimlər aça bilər",
        "Only you can see it." to "Yalnız siz görə bilərsiniz.",
        "Anyone with the link can open it; it doesn't show up in search." to "Linkə sahib hər kəs aça bilər; axtarışda görünmür.",
        "Anyone can find it and open it." to "Hər kəs tapa və aça bilər.",
        "Anyone with the link can open it, so it's easy to share." to "Linkə sahib hər kəs aça bilər, paylaşmaq asandır.",
        "Anyone can find it." to "Hər kəs tapa bilər.",
        "Kept on this phone (and in your backups), no account needed. Sign in to YouTube Music for playlists on your account." to "Bu telefonda (və nüsxələrinizdə) saxlanılır, hesaba ehtiyac yoxdur. Hesabınızdakı pleylistlər üçün YouTube Music-ə daxil olun.",
        "Turn off Wi-Fi only" to "Yalnız Wi-Fi rejimini söndür",
        "See which" to "Hansılar olduğunu gör",
        "Try again" to "Yenidən cəhd et",
        "Try all again" to "Hamısını yenidən cəhd et",
        "Remove all" to "Hamısını sil",
        "Prism also tries them again by itself when the phone is back online." to "Telefon yenidən internetə bağlandıqda Prism bunları avtomatik yenidən yoxlayır.",
        "Failed before Prism kept the reason" to "Prism səbəbi qeyd etməyə başlamazdan əvvəl uğursuz oldu",
        "Text size" to "Mətn ölçüsü",
        "Line spacing" to "Sətir arası məsafə",
        "Tight" to "Sıx",
        "As usual" to "Həmişəki kimi",
        "Airy" to "Geniş",
        "Other lines" to "Digər sətirlər",
        "Faint" to "Çox solğun",
        "Dimmed" to "Solğun",
        "Bright" to "Parlaq",
        "Background vocals" to "Bek-vokallar",
        "Progress bar color" to "İrəliləyiş zolağının rəngi",
        "The split light" to "Ayrılmış işıq",
        "Your accent color" to "Vurğu rənginiz",
        "Plain white" to "Sadə ağ",
        "The song's cover's color" to "Mahnı üzlüyünün rəngi",
        "The player's own background" to "Oxuducunun öz arxa planı",
        "Filling the screen, as now" to "İndiki kimi, bütün ekranı dolduraraq",
        "Top color" to "Üst rəng",
        "Bottom color" to "Alt rəng",
        "Your color" to "Öz rənginiz",
        "From the cover" to "Üzlük rəngindən",
        "Download video" to "Videonı endir",
        "Remove downloaded video" to "Endirilmiş videonu sil",
        "Saved" to "Saxlanıldı",
        "Failed: tap to remove" to "Uğursuz: silmək üçün toxunun",
        "Save lyrics into the file" to "Mahnı sözlərini fayla saxla",
        "Make your first playlist: it's kept on this phone, no account needed." to "İlk çalğı siyahınızı yaradın: bu telefonda saxlanılır, hesab tələb olunmur.",
        "This Phone" to "Bu telefon",
        "This phone" to "Bu telefon",
        "Steady" to "Sabit",
        "Build up" to "Yüksələn",
        "Wind down" to "Sakitləşən",
        "Use mobile data" to "Mobil data istifadə et",
        "DJ mode: no clear keys to order these by" to "DJ rejimi: bunları sıralamaq üçün aydın tonlar tapılmadı",
        "DJ mode: in key order, beat-matched" to "DJ modu: ton sırasına görə, tempə uyğun",
        "DJ mode" to "DJ rejimi",
        "song" to "mahnı",
        "songs" to "mahnı",
        "play" to "oxunma",
        "plays" to "oxunma",
        "artist" to "sənətçi",
        "artists" to "sənətçi",
        "day" to "gün",
        "days" to "gün",
        "minute" to "dəqiqə",
        "minutes" to "dəqiqə",
        "hour" to "saat",
        "hours" to "saat",
        "minute listened" to "dəqiqə dinlənildi",
        "minutes listened" to "dəqiqə dinlənildi",
        "hour listened" to "saat dinlənildi",
        "hours listened" to "saat dinlənildi",
        "of music" to "musiqi",
        "Mute" to "Səsi bağla",
        "Unmute" to "Səsi aç",
        "Gaming" to "Oyun",
        "On repeat" to "Təkrar-təkrar",
    )
    private val azMap = azMap1 + azMap2
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

        val lang = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            val lm = context.getSystemService(android.app.LocaleManager::class.java)
            val appLocales = lm?.applicationLocales
            if (appLocales != null && !appLocales.isEmpty) {
                appLocales[0]?.language ?: context.resources.configuration.locales[0]?.language ?: ""
            } else {
                context.resources.configuration.locales[0]?.language ?: ""
            }
        } else {
            context.resources.configuration.locales[0]?.language ?: ""
        }

        val direct = when (lang) {
            "tr" -> trMap[clean]
            "az" -> azMap[clean]
            else -> null
        }
        if (direct != null) return direct

        val res = stringResMap[clean]
        if (res != null) return context.getString(res)

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
