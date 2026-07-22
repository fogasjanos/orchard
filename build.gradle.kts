plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    val logbackVersion = "1.5.38"
    val lombokVersion = "1.18.46"
    val slf4jVersion = "2.0.18"
    val mockitoVersion = "5.23.0"
    val jacksonVersion = "3.2.1"
    val junitVersion = "6.1.1"


    // lombok
    compileOnly("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")

    // logging
    implementation("org.slf4j:jcl-over-slf4j:${slf4jVersion}")
    implementation("ch.qos.logback:logback-classic:${logbackVersion}")

    // testing
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:${junitVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter:${junitVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${junitVersion}")

    testImplementation("org.mockito:mockito-core:${mockitoVersion}")
    testImplementation("org.mockito:mockito-junit-jupiter:${mockitoVersion}")

    testCompileOnly("org.projectlombok:lombok:${lombokVersion}")
    testAnnotationProcessor("org.projectlombok:lombok:${lombokVersion}")

    testImplementation("tools.jackson.core:jackson-databind:${jacksonVersion}")
}

tasks.test {
    useJUnitPlatform()
}
