plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    defaultConfig {
        namespace = ConfigurationData.namespace
    }
}

dependencies {
    implementation(Libraries.appCompat)
}