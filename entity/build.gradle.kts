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
                baseName = "entity"
            }
        }
    }
    targets {
        jvm()
    }
    sourceSets {
        commonMain {
            dependencies {
                // https://github.com/Kotlin/mpp-example/tree/master/greeting
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.4.10")
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
