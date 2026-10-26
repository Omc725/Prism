package com.prism.music.ui.screens

import com.prism.music.data.model.quickPicks
import com.prism.music.ui.i18n.localized
import com.prism.music.ui.theme.PrismIcons
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.zIndex
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.prism.music.data.model.PlaylistItem
import com.prism.music.data.prefs.HomeSectionConfig
import com.prism.music.data.prefs.HomeSections
import com.prism.music.data.prefs.HomeShortcut
import com.prism.music.data.prefs.PinnedPlaylist
import com.prism.music.data.prefs.SectionStyle
import com.prism.music.ui.components.PrismChip
import com.prism.music.ui.components.RoundAction
import com.prism.music.ui.components.SubPage
import com.prism.music.ui.theme.LocalAppSettings
import com.prism.music.ui.theme.LocalContainer

private fun SectionStyle.icon(): ImageVector = when (this) {
    SectionStyle.CAROUSEL -> PrismIcons.Carousel
    SectionStyle.GRID -> PrismIcons.Customize
    SectionStyle.LIST -> PrismIcons.Queue
    SectionStyle.HERO -> PrismIcons.Rows
}

/**
 * Customize Home: the greeting, the sections Home shows (in order — hold and drag to move — each
 * with a look), the shortcut tiles, and a couple of options. Everything less common sits behind a row's ⋮ menu or a sheet.
 */
@OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)
@Composable
fun CatalogueScreen(bottomPadding: Dp) {
    val c = LocalContainer.current
    val settings = LocalAppSettings.current
    val ytShelves by homeShelfCache.collectAsState()
    val layout = settings.homeLayout
    // Every section Prism can show — built-in and every shelf YouTube Music has offered — that isn't on Home yet.
    val picks = ytShelves.quickPicks()
    val available = (HomeSections.defaults + ytShelves.filterNot { it === picks }.map { HomeSectionConfig(shelfKey(it.title), it.title) })
        .filter { cfg -> layout.none { it.key == cfg.key } }
        .distinctBy { it.key }
    var adding by remember { mutableStateOf(false) }
    var pinning by remember { mutableStateOf(false) }
    // The tiles only show while their section is on Home.
    val tilesOn = layout.any { it.key == HomeSections.GREETING && it.visible }

    fun save(list: List<HomeSectionConfig>) = c.settings.setHomeLayout(list)

    SubPage(
        "Customize Home", bottomPadding,
        horizontalPadding = 16.dp,
        spacing = 22.dp,
        actions = { RoundAction(PrismIcons.History, "Reset", glass = true) { save(HomeSections.initial) } },
    ) {
        item(key = "greeting") {
            Group("Greeting") {
                GreetingField()
                Toggle("Show your name", null, settings.greetingShowName) { c.settings.setGreetingShowName(it) }
            }
        }
        item(key = "sections") {
            Group("Sections", info = "Hold a section (or drag its grip) to move it; tap it to show or hide it.") {
                com.prism.music.ui.components.ReorderList(layout, { it.key }, { save(it) }) { cfg, i, held, mod ->
                    Column(mod) {
                        if (i > 0 && !held) HorizontalDivider(Modifier.padding(start = 52.dp), color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                        SectionRow(
                            cfg,
                            canUp = i > 0,
                            canDown = i < layout.lastIndex,
                            onMove = { by -> save(layout.toMutableList().apply { add(i + by, removeAt(i)) }) },
                            onChange = { new -> save(layout.map { if (it.key == cfg.key) new else it }) },
                            onRemove = { save(layout.filterNot { it.key == cfg.key }) },
                            held = held,
                            grip = Modifier.dragHandle(),
                        )
                    }
                }
                if (layout.isNotEmpty()) HorizontalDivider(Modifier.padding(start = 52.dp), color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
                Row(
                    Modifier.fillMaxWidth().clickable { adding = true }.padding(horizontal = 16.dp, vertical = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(PrismIcons.Add, null, Modifier.size(22.dp), tint = MaterialTheme.colorScheme.primary)
                    Spacer(Modifier.width(14.dp))
                    Text("Add a section".localized(), style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Medium)
                }
            }
        }
        item(key = "tiles") {
            // Greyed out (still editable) while the Shortcut tiles section is hidden or removed.
            Column(Modifier.alpha(if (tilesOn) 1f else 0.45f)) { Group(HomeSections.TILES_TITLE, info = "Shortcuts appear in the order you pick them.") {
                // Why they're greyed out: a state, so it stays in view.
                if (!tilesOn) Note("Show the %s section to see these on Home".localized(HomeSections.TILES_TITLE.localized()))
                FlowRow(
                    Modifier.padding(horizontal = 16.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    HomeShortcut.entries.forEach { sc ->
                        val on = sc in settings.homeShortcuts
                        PrismChip(
                            on, { c.settings.setHomeShortcuts(if (on) settings.homeShortcuts - sc else settings.homeShortcuts + sc) },
                            if (on) "${settings.homeShortcuts.indexOf(sc) + 1}  ${sc.label.localized()}" else sc.label.localized(),
                        )
                    }
                }
                Item(
                    "Pinned playlists",
                    settings.homePlaylists.takeIf { it.isNotEmpty() }?.joinToString(", ") { it.title } ?: "None".localized(),
                    onClick = { pinning = true },
                )
                Item("Recently played albums", null, onClick = { c.settings.setHomeRecentTiles((settings.homeRecentTiles + 1) % 7) }) {
                    Stepper(settings.homeRecentTiles, 0..6) { c.settings.setHomeRecentTiles(it) }
                }
            } }
        }
        item(key = "options") {
            Group("Options") {
                Toggle("Add new sections automatically", "New shelves from YouTube Music appear at the bottom", settings.autoAddSections) { c.settings.setAutoAddSections(it) }
                Toggle(
                    "Quick picks start a radio",
                    if (settings.quickPicksRadio) "Tapping a pick plays it, then songs like it" else "Tapping a pick plays Quick picks in order from it",
                    settings.quickPicksRadio,
                ) { c.settings.setQuickPicksRadio(it) }
                Toggle("Customize button on Home", null, settings.homeCustomizeButton) { c.settings.setHomeCustomizeButton(it) }
            }
        }
    }

    if (adding) AddSectionSheet(available, ytShelves.isEmpty(), { adding = false }) { cfg ->
        // Speed dial goes in at the top, where YouTube Music has it (#53); everything else at the bottom. Either can be dragged.
        save(if (cfg.key == HomeSections.SPEED_DIAL) listOf(cfg.copy(visible = true)) + layout else layout + cfg.copy(visible = true))
    }
    if (pinning) PinPlaylistsSheet { pinning = false }
}

/** One section on Home: tap to show or hide it; ⋮ moves, restyles or removes it. */
@Composable
private fun SectionRow(
    cfg: HomeSectionConfig,
    canUp: Boolean,
    canDown: Boolean,
    onMove: (Int) -> Unit,
    onChange: (HomeSectionConfig) -> Unit,
    onRemove: () -> Unit,
    held: Boolean = false,
    modifier: Modifier = Modifier,
    /** Dragging the grip moves the section at once (the row itself after a hold). */
    grip: Modifier = Modifier,
) {
    val scheme = MaterialTheme.colorScheme
    var menu by remember { mutableStateOf(false) }
    val fg = if (cfg.visible) scheme.onSurface else scheme.onSurfaceVariant.copy(alpha = 0.6f)
    Row(
        // No tap while held, so letting go of a drag doesn't also hide the section.
        modifier.fillMaxWidth().clickable(enabled = !held, onClickLabel = if (cfg.visible) "Hide".localized() else "Show".localized()) { onChange(cfg.copy(visible = !cfg.visible)) }
            .padding(start = 16.dp, end = 4.dp, top = 6.dp, bottom = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(if (cfg.visible) cfg.style.icon() else PrismIcons.Hidden, null, Modifier.size(22.dp), tint = if (cfg.visible) scheme.primary else fg)
        Spacer(Modifier.width(14.dp))
        Column(Modifier.weight(1f)) {
            Text(cfg.title.localized(), style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Medium, color = fg, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(
                if (cfg.visible) cfg.style.label.localized() else "Hidden".localized(),
                style = MaterialTheme.typography.bodySmall, color = scheme.onSurfaceVariant,
            )
        }
        com.prism.music.ui.components.DragGrip(grip, "Drag %s".localized(cfg.title.localized()))
        IconButton(onClick = { menu = true }) {
            Icon(PrismIcons.MoreVertical, "Options for %s".localized(cfg.title.localized()), tint = scheme.onSurfaceVariant)
            DropdownMenu(menu, { menu = false }) {
                SectionStyle.entries.forEach { st ->
                    DropdownMenuItem(
                        { Text(st.label.localized()) }, { onChange(cfg.copy(style = st, visible = true)); menu = false },
                        leadingIcon = { Icon(st.icon(), null) },
                        trailingIcon = { if (st == cfg.style) Icon(PrismIcons.Check, null) },
                    )
                }
                HorizontalDivider()
                if (canUp) DropdownMenuItem({ Text("Move up".localized()) }, { onMove(-1); menu = false }, leadingIcon = { Icon(PrismIcons.ChevronUp, null) })
                if (canDown) DropdownMenuItem({ Text("Move down".localized()) }, { onMove(1); menu = false }, leadingIcon = { Icon(PrismIcons.ChevronDown, null) })
                DropdownMenuItem(
                    { Text(if (cfg.visible) "Hide".localized() else "Show".localized()) }, { onChange(cfg.copy(visible = !cfg.visible)); menu = false },
                    leadingIcon = { Icon(if (cfg.visible) PrismIcons.Hidden else PrismIcons.Visible, null) },
                )
                DropdownMenuItem({ Text("Remove".localized()) }, { onRemove(); menu = false }, leadingIcon = { Icon(PrismIcons.Delete, null) })
            }
        }
    }
}

/** The headline, edited in place; empty follows the time of day. */
@Composable
private fun GreetingField() {
    val c = LocalContainer.current
    val settings = LocalAppSettings.current
    var text by remember { mutableStateOf(settings.greetingText) }
    val scheme = MaterialTheme.colorScheme
    Column(Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp)) {
        Text("Headline".localized(), style = MaterialTheme.typography.bodySmall, color = scheme.onSurfaceVariant)
        BasicTextField(
            text, { text = it; c.settings.setGreetingText(it) },
            Modifier.fillMaxWidth().padding(top = 2.dp),
            singleLine = true,
            textStyle = MaterialTheme.typography.bodyLarge.copy(color = scheme.onSurface, fontWeight = FontWeight.Medium),
            cursorBrush = SolidColor(scheme.primary),
            decorationBox = { inner ->
                if (text.isEmpty()) Text("Good morning / afternoon / evening".localized(), style = MaterialTheme.typography.bodyLarge, color = scheme.onSurfaceVariant.copy(alpha = 0.6f))
                inner()
            },
        )
    }
}

@Composable
private fun Stepper(value: Int, range: IntRange, onChange: (Int) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = { onChange(value - 1) }, enabled = value > range.first, modifier = Modifier.size(36.dp)) { Icon(PrismIcons.Remove, "Fewer".localized()) }
        Text(if (value == 0) "Off".localized() else "$value", style = MaterialTheme.typography.titleSmall, modifier = Modifier.width(32.dp), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
        IconButton(onClick = { onChange(value + 1) }, enabled = value < range.last, modifier = Modifier.size(36.dp)) { Icon(PrismIcons.Add, "More".localized()) }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AddSectionSheet(available: List<HomeSectionConfig>, notLoaded: Boolean, onDismiss: () -> Unit, onAdd: (HomeSectionConfig) -> Unit) {
    ModalBottomSheet(onDismissRequest = onDismiss) {
        Text("Add a section".localized(), style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 8.dp))
        val (prism, youtube) = available.partition { !it.key.startsWith(HomeSections.YT_PREFIX) }
        LazyColumn(Modifier.padding(bottom = 24.dp)) {
            if (prism.isNotEmpty()) item { SheetLabel("From Prism".localized()) }
            items(prism, key = { it.key }) { cfg -> SheetRow(cfg.title.localized()) { onAdd(cfg); onDismiss() } }
            item { SheetLabel("From YouTube Music".localized()) }
            if (youtube.isEmpty()) item {
                Text(
                    if (notLoaded) "Open Home once to load YouTube Music's sections".localized() else "Everything's already on Home".localized(),
                    style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),
                )
            }
            items(youtube, key = { it.key }) { cfg -> SheetRow(cfg.title.localized()) { onAdd(cfg); onDismiss() } }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PinPlaylistsSheet(onDismiss: () -> Unit) {
    val c = LocalContainer.current
    val settings = LocalAppSettings.current
    val library by c.library.playlists.collectAsState()
    val prismLists by c.prismLibrary.lists.collectAsState()
    // Prism's own playlists (kept on the phone) can be pinned too, as well as the library's.
    val mine = remember(prismLists) { prismLists.map { it.item() } }
    val playlists = remember(library, mine) { mine + library.filterIsInstance<PlaylistItem>().filterNot { l -> mine.any { it.id == l.id } } }
    // Pinned ones first (kept even if they've left the library), then Prism's playlists, then the rest of the library.
    val pinnedIds = settings.homePlaylists.map { it.id }
    val pinned = settings.homePlaylists.map { it.id to it.title }
    val prismOptions = mine.filter { it.id !in pinnedIds }.map { it.id to it.title }
    val youtubeOptions = playlists.filter { it.id !in pinnedIds && mine.none { m -> m.id == it.id } }.map { it.id to it.title }
    val options = pinned + prismOptions + youtubeOptions
    ModalBottomSheet(onDismissRequest = onDismiss) {
        Text("Pinned playlists".localized(), style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(horizontal = 24.dp))
        Text(
            "Shown as tiles after the shortcuts".localized(), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 8.dp),
        )
        LazyColumn(Modifier.padding(bottom = 24.dp)) {
            if (options.isEmpty()) item {
                Text(
                    "Your playlists show up here once your library has loaded".localized(), style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),
                )
            }
            fun row(scope: androidx.compose.foundation.lazy.LazyListScope, list: List<Pair<String, String>>) = scope.items(list, key = { it.first }) { (id, title) ->
                val on = id in pinnedIds
                SheetRow(title, checked = on) {
                    c.settings.setHomePlaylists(
                        if (on) settings.homePlaylists.filterNot { it.id == id }
                        else settings.homePlaylists + playlists.first { it.id == id }.let { PinnedPlaylist(it.id, it.title, it.thumbnail) }
                    )
                }
            }
            if (pinned.isNotEmpty()) { item { SheetLabel("Pinned".localized()) }; row(this, pinned) }
            if (prismOptions.isNotEmpty()) { item { SheetLabel("Prism playlists".localized()) }; row(this, prismOptions) }
            if (youtubeOptions.isNotEmpty()) { item { SheetLabel("YouTube Music playlists".localized()) }; row(this, youtubeOptions) }
        }
    }
}

@Composable
private fun SheetLabel(text: String) = com.prism.music.ui.components.Eyebrow(text, Modifier.padding(start = 24.dp, top = 12.dp, bottom = 4.dp))

@Composable
private fun SheetRow(title: String, checked: Boolean? = null, onClick: () -> Unit) {
    Row(
        Modifier.fillMaxWidth().clickable(onClick = onClick).padding(horizontal = 24.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(title, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.weight(1f), maxLines = 1, overflow = TextOverflow.Ellipsis)
        when (checked) {
            null -> Icon(PrismIcons.Add, "Add".localized(), tint = MaterialTheme.colorScheme.primary)
            true -> Icon(PrismIcons.Check, "Pinned".localized(), tint = MaterialTheme.colorScheme.primary)
            false -> {}
        }
    }
}
