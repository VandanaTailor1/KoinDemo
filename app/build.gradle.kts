plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    id("koin")
    id("kotlin-kapt")
//    id("kotlin-android")
    id ("kotlin-android")
}

android {
    namespace = "com.demokoin"
    compileSdk = 35

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
// implementation ("org.koin:koin-android:3.2.0")
//    implementation ("org.koin:koin-androidx-viewmodel:3.2.0")
    // Core Koin for Kotlin
    implementation(libs.koin.core)
    // Koin for Android
    implementation(libs.koin.android)

    // Koin for ViewModel (optional, if you use ViewModel)
    //implementation ("io.insert-koin:koin-androidx-viewmodel:3.5.0")
    //implementation ("io.insert-koin:koin-androidx-viewmodel:3.4.1")
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    //implementation("com.squareup.moshi:moshi:1.15.2")
    implementation("com.squareup.moshi:moshi:1.15.0") // Core Moshi library
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0") // Moshi Kotlin integration
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
}