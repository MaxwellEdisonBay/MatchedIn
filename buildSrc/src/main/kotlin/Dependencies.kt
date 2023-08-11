object Versions {
    const val ktlint = "0.45.2"
}

object Libs {

    object Kotlin {
        const val sdkVersion = "8.1.0"
        const val version = "1.8.10"

        const val application = "com.android.application"
        const val android = "org.jetbrains.kotlin.android"
        const val androidLib = "com.android.library"

        const val kapt = "kapt"
    }

    object Hilt {
        const val hiltPlugin = "com.google.dagger.hilt.android"
        const val hiltPluginVersion = "2.44"

        const val hilt = "com.google.dagger:hilt-android:$hiltPluginVersion"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltPluginVersion"
        const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:2.4.0"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.10.1"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.7.2"
        }

        object Compose {
            const val compilerVersion = "1.4.3"
            const val nav_version = "2.7.0"

            const val bom = "androidx.compose:compose-bom:2023.03.00"
            const val ui = "androidx.compose.ui:ui"
            const val uiGraphics = "androidx.compose.ui:ui-graphics"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview"
            const val material3 = "androidx.compose.material3:material3"
            const val navigation = "androidx.navigation:navigation-compose:$nav_version"
            const val tooling = "androidx.compose.ui:ui-tooling"
            const val testJUnit = "androidx.compose.ui:ui-test-junit4"
            const val testManifest = "androidx.compose.ui:ui-test-manifest"
        }

        object Test {
            const val jUnit = "junit:junit:4.13.2"
            const val testJUnit = "androidx.test.ext:junit:1.1.5"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
        }
    }
}