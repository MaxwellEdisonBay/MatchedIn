pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        // See https://jmfayard.github.io/refreshVersions
        id("de.fayard.refreshVersions") version "0.51.0"
        id("com.android.library") version "8.1.0"
        id("org.jetbrains.kotlin.android") version "1.8.10"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MatchedIn"
include(":app")
include(":base-ui")