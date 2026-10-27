#!/usr/bin/env python3
"""
Prism Translation Verification & Linter Tool
=============================================
Validates community translation JSON files against the master English template (en.json).

Usage:
    python3 tools/verify_translations.py [language_code]
    python3 tools/verify_translations.py tr
    python3 tools/verify_translations.py az
    python3 tools/verify_translations.py --all
"""

import sys
import os
import json
import re

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
TRANSLATIONS_DIR = os.path.join(REPO_ROOT, "app", "src", "main", "assets", "translations")
MASTER_FILE = os.path.join(TRANSLATIONS_DIR, "en.json")


def load_json(filepath):
    try:
        with open(filepath, "r", encoding="utf-8") as f:
            return json.load(f)
    except Exception as e:
        print(f"❌ Error loading {filepath}: {e}")
        return None


def extract_placeholders(text):
    # Matches %s, %1$s, %d, %2$d, etc.
    return re.findall(r"%(?:\d+\$)?[a-zA-Z]", text)


def verify_language(lang_code, master_dict):
    lang_file = os.path.join(TRANSLATIONS_DIR, f"{lang_code}.json")
    if not os.path.exists(lang_file):
        print(f"❌ File not found: {lang_file}")
        return False

    target_dict = load_json(lang_file)
    if target_dict is None:
        return False

    total_keys = len(master_dict)
    translated_count = 0
    missing_keys = []
    placeholder_mismatches = []

    for key, en_val in master_dict.items():
        if key not in target_dict or not target_dict[key].strip():
            missing_keys.append(key)
        else:
            translated_count += 1
            # Check placeholder consistency
            target_val = target_dict[key]
            en_ph = sorted(extract_placeholders(en_val))
            target_ph = sorted(extract_placeholders(target_val))
            if en_ph != target_ph:
                placeholder_mismatches.append((key, en_ph, target_ph))

    extra_keys = set(target_dict.keys()) - set(master_dict.keys())
    pct = (translated_count / total_keys) * 100 if total_keys > 0 else 0

    print(f"\n=======================================================")
    print(f"🌐 Language: [{lang_code}] ({os.path.basename(lang_file)})")
    print(f"📊 Progress: {translated_count} / {total_keys} keys translated ({pct:.1f}%)")
    print(f"=======================================================")

    success = True

    if missing_keys:
        print(f"⚠️  Missing keys ({len(missing_keys)}):")
        for k in missing_keys[:10]:
            print(f"   - {repr(k)}")
        if len(missing_keys) > 10:
            print(f"   ... and {len(missing_keys) - 10} more.")
        success = False

    if placeholder_mismatches:
        print(f"⚠️  Placeholder mismatches ({len(placeholder_mismatches)}):")
        for k, en_p, tr_p in placeholder_mismatches[:5]:
            print(f"   - Key: {repr(k)}")
            print(f"     Expected: {en_p}, Found: {tr_p}")
        if len(placeholder_mismatches) > 5:
            print(f"   ... and {len(placeholder_mismatches) - 5} more.")

    if extra_keys:
        print(f"ℹ️  Unknown / extra keys not in en.json ({len(extra_keys)}):")
        for k in list(extra_keys)[:5]:
            print(f"   - {repr(k)}")

    if pct == 100.0 and not placeholder_mismatches:
        print(f"✅ [{lang_code}] is 100% complete and fully verified!")
        return True
    elif pct >= 80.0:
        print(f"🟡 [{lang_code}] is usable ({pct:.1f}%), but has some missing strings.")
        return True
    else:
        print(f"🔴 [{lang_code}] is incomplete ({pct:.1f}%).")
        return False


def main():
    if not os.path.exists(MASTER_FILE):
        print(f"❌ Master file not found: {MASTER_FILE}")
        sys.exit(1)

    master_dict = load_json(MASTER_FILE)
    if master_dict is None:
        sys.exit(1)

    args = sys.argv[1:]
    if not args or "--all" in args:
        langs = [
            f.replace(".json", "")
            for f in os.listdir(TRANSLATIONS_DIR)
            if f.endswith(".json") and f not in ("en.json", "template.json")
        ]
    else:
        langs = [arg.replace(".json", "") for arg in args if not arg.startswith("--")]

    overall_ok = True
    for lang in sorted(langs):
        ok = verify_language(lang, master_dict)
        if not ok:
            overall_ok = False

    print("\n")
    if not overall_ok:
        sys.exit(1)


if __name__ == "__main__":
    main()
