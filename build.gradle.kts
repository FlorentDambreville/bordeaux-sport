buildscript {

    val kotlinVersion = "1.4.0"

    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.1.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
    }
}
group = "com.com.applantic.bordeauxsport"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
