plugins{
    id("java-library")
    id("io.freefair.lombok") version "8.12.1"
    id("maven-publish")
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
        vendor = JvmVendorSpec.GRAAL_VM
        implementation = JvmImplementation.VENDOR_SPECIFIC
    }

    withSourcesJar()
}
dependencies {
    implementation("com.macro.mall:mall-common:1.0")
    implementation(libs.spring)
    implementation(libs.springSecurity)
    implementation(libs.springRedis)
    implementation(libs.springAop)
    implementation(libs.springTest)
    implementation(libs.springActuator)
    implementation(libs.javaServerlet)
    implementation(libs.huTool)
    implementation(libs.jjwt)
    implementation(libs.javaAnnotation)
}