pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Birbank Invest"
include(":app")
include(":component_manager")
include(":authorization")
include(":authorization_api")
include(":core_utils")
include(":android-design-system")

include(":design-system-demo-app")
project(":design-system-demo-app").projectDir = file("android-design-system/design-system-demo-app")
