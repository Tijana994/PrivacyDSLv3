#!/usr/bin/env bash
# Builds PrivacyModel without Eclipse and runs the OCL rule tests.
#
# Usage: ci/run-tests.sh
#
# Uses the jars in lib/ (as Eclipse does) plus ci/lib/, which holds the Eclipse
# platform jars that Eclipse normally provides itself (EMF, equinox, osgi) and JUnit.
# ci/lib/ is deliberately NOT on the Eclipse .classpath.
# The Eclipse project files (.project, .classpath, MANIFEST.MF) are not changed.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BUILD="$ROOT/build"
SEP=":"; case "$(uname -s)" in MINGW*|MSYS*|CYGWIN*) SEP=";";; esac
join() { local IFS="$SEP"; echo "$*"; }

rm -rf "$BUILD"
mkdir -p "$BUILD/classes" "$BUILD/test"

CP="$(join "$ROOT"/ci/lib/*.jar "$ROOT"/lib/*.jar "$ROOT"/lib/ocl6.10/*.jar)"

echo "== Compiling PrivacyModel"
# PrivacyModelTables.java is skipped: it needs a newer OCL than the one in lib/,
# is not referenced by any other class and is not needed for validation.
find "$ROOT/src-gen" -name "*.java" ! -name "PrivacyModelTables.java" > "$BUILD/main.txt"
javac -nowarn -encoding UTF-8 -d "$BUILD/classes" -cp "$CP" @"$BUILD/main.txt"

echo "== Compiling tests"
find "$ROOT/test" -name "*.java" > "$BUILD/test.txt"
javac -nowarn -encoding UTF-8 -d "$BUILD/test" -cp "$CP$SEP$BUILD/classes" @"$BUILD/test.txt"

TEST_CLASSES=$(cd "$ROOT/test" && find . -name "*Test.java" | sed 's#^\./##; s#\.java$##; s#/#.#g' | sort)
echo "== Running tests:"; echo "$TEST_CLASSES"

cd "$ROOT"   # tests read model/ and test-models/ relative to the project folder
java -cp "$CP$SEP$BUILD/classes$SEP$BUILD/test" org.junit.runner.JUnitCore $TEST_CLASSES
