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
    implementation(libs.spring)
    implementation(libs.springSecurity)
    implementation(libs.springRedis)
    implementation(libs.springAop)
    implementation(libs.springTest)
    implementation(libs.springActuator)
    implementation(libs.huTool)
    implementation(libs.jjwt)
    implementation(libs.javaAnnotation)
}
tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
}
publishing {
    publications {
        create<MavenPublication>("mallSecurity") {
            from(components["java"])
        }
    }
}