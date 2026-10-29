package com.prism.music

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner

/**
 * Runs Prism's in-app tests. Before Prism starts it puts [RecordedNetwork] in front of every request, so a test never
 * depends on YouTube or a lyrics site that day. `-Pandroid.testInstrumentationRunnerArguments.record=true` records the
 * answers the tests need instead (live), into /sdcard/prism-tests/recorded/ for tools/record.ps1 to pull into
 * src/androidTest/assets/recorded/.
 */
class PrismTestRunner : AndroidJUnitRunner() {
    override fun onCreate(arguments: Bundle?) {
        // Android calls this before PrismApp.onCreate, which builds Prism's network client with it.
        TestHooks.network = RecordedNetwork(record = arguments?.getString("record") == "true")
        super.onCreate(arguments)
    }
}
