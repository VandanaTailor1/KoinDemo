plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    id("koin")
    id("kotlin-kapt")
//    id("kotlin-android")

}

android {
    namespace = "com.demokoin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.demokoin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    viewBinding {
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//    implementation ("org.koin:koin-core:3.2.0")
//    // Koin Android features
//    implementation ("org.koin:koin-android:3.2.0")
//    implementation ("org.koin:koin-androidx-viewmodel:3.2.0")
    // Core Koin for Kotlin
    implementation ("io.insert-koin:koin-core:3.5.0")

    // Koin for Android
    implementation ("io.insert-koin:koin-android:3.5.0")

    // Koin for ViewModel (optional, if you use ViewModel)
    implementation ("io.insert-koin:koin-androidx-viewmodel:3.5.0")
}