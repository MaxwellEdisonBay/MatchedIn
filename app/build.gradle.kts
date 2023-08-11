plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin(Libs.Kotlin.kapt)
    id(Libs.Hilt.hiltPlugin)
}

android {
    namespace = ConfigurationData.applicationId
    compileSdk = ConfigurationData.compileSdk

    defaultConfig {
        applicationId = ConfigurationData.applicationId
        minSdk = ConfigurationData.minSdk
        targetSdk = ConfigurationData.targetSdk
        versionCode = ConfigurationData.versionCode
        versionName = ConfigurationData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Libs.AndroidX.Compose.compilerVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.lifecycleRuntime)
    implementation(Libs.AndroidX.Activity.activityCompose)
    implementation(platform(Libs.AndroidX.Compose.bom))
    implementation(Libs.AndroidX.Compose.ui)
    implementation(Libs.AndroidX.Compose.uiGraphics)
    implementation(Libs.AndroidX.Compose.toolingPreview)
    implementation(Libs.AndroidX.Compose.material3)
    implementation(Libs.AndroidX.Compose.navigation)

    // Hilt
    implementation(Libs.Hilt.hilt)
    kapt(Libs.Hilt.hiltCompiler)
    implementation(Libs.Hilt.hiltNavigationCompose)

    // Coil
    implementation(Libs.Coil.coilCompose)

    // Firebase

    testImplementation(Libs.AndroidX.Test.jUnit)
    androidTestImplementation(Libs.AndroidX.Test.testJUnit)
    androidTestImplementation(Libs.AndroidX.Test.espressoCore)
    androidTestImplementation(platform(Libs.AndroidX.Compose.bom))
    androidTestImplementation(Libs.AndroidX.Compose.testJUnit)
    debugImplementation(Libs.AndroidX.Compose.tooling)
    debugImplementation(Libs.AndroidX.Compose.testManifest)
}

kapt {
    correctErrorTypes = true
}