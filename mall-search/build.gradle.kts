plugins{
    id("application")
    id("io.freefair.lombok") version "8.12.1"
    id("maven-publish")
}
application {
    mainClass.set("com.macro.mall.search.MallSearchApplication")
}
version = "1.0-SNAPSHOT"
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
    implementation("com.macro.mall:mall-mbg:1.0-SNAPSHOT")
    implementation("com.macro.mall:mall-common:1.0-SNAPSHOT")
    implementation(libs.spring)
    implementation(libs.springData)
    implementation(libs.logstash)
    implementation(libs.springFox)
    implementation(libs.springValidation)
    implementation(libs.pageHelper)
    implementation(libs.huTool)
    implementation(libs.springAop)
    implementation(libs.springTest)
    implementation(libs.springActuator)
    implementation(libs.ibatis)
    implementation(libs.myBatisSpring)
    implementation(libs.springElasticsearch)
    implementation(libs.druidSpring)

}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
}