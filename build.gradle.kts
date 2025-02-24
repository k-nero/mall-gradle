plugins {
    kotlin("jvm") version "2.1.20-RC"
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(23)
}