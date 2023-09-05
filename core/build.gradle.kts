plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)
    implementation(Libraries.material)
    implementation(Libraries.junit)
    implementation(Libraries.junitTest)
    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)
}