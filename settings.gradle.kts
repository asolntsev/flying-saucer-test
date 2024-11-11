pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    plugins {
        val kotlinVersion = extra["kotlin.version"] as String

        kotlin("jvm").version(kotlinVersion)
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "flying-saucer-test"
