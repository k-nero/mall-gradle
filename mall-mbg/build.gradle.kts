plugins{
    id("java-library")
    id("io.freefair.lombok") version "8.12.1"
    id("maven-publish")
}
group = "com.macro.mall"
version = "1.0-SNAPSHOT"
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
        vendor = JvmVendorSpec.GRAAL_VM
        implementation = JvmImplementation.VENDOR_SPECIFIC
    }

    withSourcesJar()
}
dependencies {
    implementation("com.macro.mall:mall-common:1.0-SNAPSHOT")
    implementation(libs.pageHelper)
    implementation(libs.druidSpring)
    implementation(libs.mybatisGen)
    implementation(libs.mysql)
    implementation(libs.ibatis)
    implementation(libs.springFox)
    implementation(libs.lombokMBG)
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
}

publishing {
    publications {
        create<MavenPublication>("mallMbg") {
            from(components["java"])
        }
    }
}