plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
}

dependencies {
    implementation(project(Modules.componentManager))
    //deps
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.junit)
    implementation(Libraries.junitTest)
    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)
}