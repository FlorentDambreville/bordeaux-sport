import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}
repositories {
    jcenter()
    mavenCentral()
    maven {
        setUrl("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")
    }
}
kotlin {
    jvm()
    ios {
        binaries {
            framework {
                baseName = "shared"
            }
        }
    }
    targets {
        jvm()
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":entity"))
                implementation("io.ktor:ktor-server-core:1.4.0")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}