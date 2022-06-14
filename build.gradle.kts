import org.jetbrains.compose.compose

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.1.0"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Exe, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb)
            packageName = "Kotlin Calculator"
            packageVersion = "1.0.0"
            windows {
                // a version for all Windows distributables
                packageVersion = "1.0.0"
                // a version only for the msi package
                msiPackageVersion = "1.0.0"
                // a version only for the exe package
                exePackageVersion = "1.0.0"
            }

        }
    }
}