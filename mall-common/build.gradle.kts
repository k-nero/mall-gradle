plugins{
    id("java-library")
    id("io.freefair.lombok") version "8.12.1"
    id("maven-publish")
}
version = "1.0"
group = "com.macro.mall"
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
        vendor = JvmVendorSpec.GRAAL_VM
        implementation = JvmImplementation.VENDOR_SPECIFIC
    }

    withSourcesJar()
}
dependencies {
    implementation(libs.spring)
    implementation(libs.springRedis)
    implementation(libs.springData)
    implementation(libs.logstash)
    implementation(libs.springFox)
    implementation(libs.springValidation)
    implementation(libs.pageHelper)
    implementation(libs.huTool)
    implementation(libs.springAop)
    implementation(libs.springTest)
    implementation(libs.springActuator)
    implementation(libs.javaServerlet)
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
}