# Translating Prism / Prism Çeviri Rehberi

Welcome! Prism has a modern, modular Internationalization (i18n) architecture designed to allow anyone to easily translate the app into their native language.

Translations are stored as simple, clean JSON files in:
📁 `app/src/main/assets/translations/`

You do **not** need to know Kotlin or edit complex code to contribute a translation!

---

## 🚀 Quick Start: Adding Your Language in 4 Steps

### 1. Create your language file
Copy the starter template:
```bash
cp app/src/main/assets/translations/template.json app/src/main/assets/translations/<your_language_code>.json
```
*(Example: `es.json` for Spanish, `de.json` for German, `fr.json` for French, `ru.json` for Russian, `ja.json` for Japanese, etc.)*

### 2. Translate the strings
Open your new JSON file in your favorite text editor.
Each entry has the English key on the left, and your translation on the right:
```json
{
  "Play": "Reproducir",
  "Pause": "Pausar",
  "Library": "Biblioteca",
  "Settings": "Ajustes",
  "Take out of \"%s\"": "Sacar de \"%s\""
}
```

### 3. Verify your translation
Run the automated verification tool from the repository root:
```bash
python3 tools/verify_translations.py <your_language_code>
```
*(Example: `python3 tools/verify_translations.py es`)*

The script checks for:
- ✅ JSON syntax validity
- 📊 Percentage of translated strings
- ⚠️ Missing strings
- 🔍 Placeholder consistency (`%s`, `%d`, etc.)

### 4. Test it!
You have two ways to test your translation:
1. **Live in-app without recompiling:**
   Transfer your `<lang>.json` file to your Android phone, open **Prism Settings → Language**, and tap **"Import community translation (.json)"**. The app will immediately load and display your translation!
2. **Compile and run:**
   ```bash
   ./gradlew assembleDebug
   ```
   The app will automatically discover your new language file in `assets/translations/` and list it in Settings!

### 5. Submit a Pull Request!
Commit your translation file and open a PR on GitHub. That's it! 🎉

---

## 📝 Translation Guidelines & Tips

### Placeholders (`%s`, `%d`, etc.)
Some strings include dynamic values, such as names, counts, or dates:
- `%s` represents text or names (e.g. `"In \"%s\""` → `"\"%s\" içinde"`).
- `%d` represents numbers (e.g. `"%d songs"` → `"%d şarkı"`).

> **Important:** Always keep the exact same placeholders in your translation so the app can format them properly at runtime.

### Quotes & Punctuation
- If a string contains quotes like `"Take out of \"%s\""`, preserve the escaped quotes `\"` or place them appropriately in your language.
- Ellipses `…` (single unicode character `…` or `...`) and bullets `·` should match the English punctuation style.

### Newlines (`\n`)
Some strings span multiple lines:
```json
"MORE THAN\nLISTENING": "DİNLEMEKTEN\nDAHA FAZLASI"
```
Keep `\n` in the same logical position in your translated text.

---

## 🛠️ Translation Tool Reference

To verify all languages at once:
```bash
python3 tools/verify_translations.py --all
```

To view translation progress:
```
=======================================================
🌐 Language: [tr] (tr.json)
📊 Progress: 2215 / 2215 keys translated (100.0%)
=======================================================
✅ [tr] is 100% complete and fully verified!
```

---

## ❤️ Current Languages & Maintainers
- **English (`en`)**: Upstream master
- **Türkçe (`tr`)**: @Omc725
- **Azərbaycanca (`az`)**: @Omc725

Feel free to open an issue or pull request if you want to become the maintainer for your language!
