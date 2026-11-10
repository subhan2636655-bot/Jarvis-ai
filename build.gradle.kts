plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.example.jarvisai"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.example.jarvisai"
        minSdk = 26
        targetSdk = 34
        versionCode = 2
        versionName = "2.0"
    }
}
