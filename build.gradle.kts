// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Libs.Kotlin.application) version Libs.Kotlin.sdkVersion apply false
    id(Libs.Kotlin.android) version Libs.Kotlin.version apply false
    id(Libs.Kotlin.androidLib) version Libs.Kotlin.sdkVersion apply false
    id(Libs.Hilt.hiltPlugin) version Libs.Hilt.hiltPluginVersion apply false
}