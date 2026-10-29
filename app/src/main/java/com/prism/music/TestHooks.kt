package com.prism.music

/**
 * What Prism's in-app tests (app/src/androidTest, `PrismTestRunner`) set before Prism starts. Nothing sets them in a
 * real run, where they stay null.
 */
object TestHooks {
    /** Answers Prism's network requests in place of the internet (recorded YouTube and lyrics answers). */
    @Volatile var network: okhttp3.Interceptor? = null
}
