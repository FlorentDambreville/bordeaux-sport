plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
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
        val ktorVersion = "1.4.0"

        commonMain {
            dependencies {
                implementation(project(":entity"))
                implementation("io.ktor:ktor-server-core:1.4.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9-native-mt")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.0-RC")
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-serialization:$ktorVersion")
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