plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    defaultConfig {
        namespace = ConfigurationData.namespace
        applicationId = ConfigurationData.applicationId
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }
}

dependencies {
    implementation(project(Modules.componentManager))
    implementation(project(Modules.authorization))
    implementation(project(Modules.authorization_api))
    implementation(project(Modules.core_utils))

    //design-system
//    implementation(project(Modules.design_system))

    // Core
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)
    implementation(Libraries.cicerone)
    implementation(Libraries.fragments)

    // Design
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Test
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.junitTest)

    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)

    //Desugar
    coreLibraryDesugaring(Libraries.desugaring)
}