plugins {
    kotlin("jvm") version "2.1.20-RC"
}
group = "com.macro.mall"
version = "1.0-SNAPSHOT"
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(23)
}