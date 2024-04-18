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

rootProject.name = "ArchitectureByFeatureDecoupled"
include(":app")
include(":data")
include(":domain")
include(":feature")
include(":ui")
include(":common")
include(":analytics")
include(":data:user-profile")
include(":data:recover-password")
include(":domain:user-profile")
include(":domain:recover-password")
include(":feature:recover-password")
include(":feature:user-profile")
include(":ui:compose")
include(":data:common")
include(":domain:common")
include(":ui:common")
