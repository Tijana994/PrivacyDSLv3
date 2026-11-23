#!/usr/bin/env python3
"""OCL rule coverage: which constraints in model/privacyModel.ecore have example tests.

A rule counts as covered when test-models/ contains at least one <Rule>-valid*.xmi and
one <Rule>-invalid*.xmi (or <Class>.<Rule>-...; the tests themselves check that the
examples behave as expected).

Usage: ci/rule-coverage.py [--summary FILE] [--badge FILE]
Prints a Markdown report; --summary appends it to FILE (e.g. $GITHUB_STEP_SUMMARY),
--badge writes an SVG badge.
"""
import argparse
import os
import re
import xml.etree.ElementTree as ET

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
ECORE = os.path.join(ROOT, "model", "privacyModel.ecore")
MODELS = os.path.join(ROOT, "test-models")


def constraints():
    result = []
    for classifier in ET.parse(ECORE).getroot().findall("eClassifiers"):
        for annotation in classifier.findall("eAnnotations"):
            if annotation.get("source") == "http://www.eclipse.org/emf/2002/Ecore":
                for detail in annotation.findall("details"):
                    if detail.get("key") == "constraints":
                        for name in detail.get("value", "").split():
                            result.append((classifier.get("name"), name))
    return result


FILE_NAME = re.compile(r"^(.+?)-(valid|invalid)(-.*)?\.xmi$")


def examples(cls, rule):
    files = os.listdir(MODELS) if os.path.isdir(MODELS) else []
    counts = {"valid": 0, "invalid": 0}
    for f in files:
        m = FILE_NAME.match(f)
        if m and m.group(1) in (rule, f"{cls}.{rule}"):
            counts[m.group(2)] += 1
    return counts["valid"], counts["invalid"]


def badge(label, value, color):
    lw, vw = 6 * len(label) + 12, 6 * len(value) + 12
    w = lw + vw
    return f"""<svg xmlns="http://www.w3.org/2000/svg" width="{w}" height="20" role="img" aria-label="{label}: {value}">
<linearGradient id="s" x2="0" y2="100%"><stop offset="0" stop-color="#bbb" stop-opacity=".1"/><stop offset="1" stop-opacity=".1"/></linearGradient>
<clipPath id="r"><rect width="{w}" height="20" rx="3" fill="#fff"/></clipPath>
<g clip-path="url(#r)"><rect width="{lw}" height="20" fill="#555"/><rect x="{lw}" width="{vw}" height="20" fill="{color}"/><rect width="{w}" height="20" fill="url(#s)"/></g>
<g fill="#fff" text-anchor="middle" font-family="Verdana,Geneva,DejaVu Sans,sans-serif" font-size="11">
<text x="{lw / 2}" y="14">{label}</text><text x="{lw + vw / 2}" y="14">{value}</text></g>
</svg>
"""


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--summary")
    parser.add_argument("--badge")
    args = parser.parse_args()

    rows, per_class = [], {}
    for cls, rule in constraints():
        valid, invalid = examples(cls, rule)
        covered = valid > 0 and invalid > 0
        rows.append((cls, rule, valid, invalid, covered))
        done, total = per_class.get(cls, (0, 0))
        per_class[cls] = (done + covered, total + 1)

    covered = sum(r[4] for r in rows)
    total = len(rows)
    pct = 100 * covered / total if total else 0

    lines = [f"## OCL rule coverage: {covered}/{total} ({pct:.0f}%)", "",
             "| Class | Covered |", "|---|---|"]
    lines += [f"| {cls} | {done}/{n} |" for cls, (done, n) in per_class.items()]
    lines += ["", "<details><summary>All rules</summary>", "",
              "| Rule | valid | invalid | |", "|---|---|---|---|"]
    lines += [f"| {cls}::{rule} | {v} | {i} | {'✅' if c else '❌'} |" for cls, rule, v, i, c in rows]
    lines += ["", "</details>", ""]
    report = "\n".join(lines)
    print(report)

    if args.summary:
        with open(args.summary, "a", encoding="utf-8") as f:
            f.write(report + "\n")
    if args.badge:
        color = "#4c1" if pct >= 90 else "#97ca00" if pct >= 75 else "#dfb317" if pct >= 50 else "#fe7d37" if pct >= 25 else "#e05d44"
        os.makedirs(os.path.dirname(args.badge), exist_ok=True)
        with open(args.badge, "w", encoding="utf-8") as f:
            f.write(badge("OCL rules", f"{covered}/{total}", color))


if __name__ == "__main__":
    main()
