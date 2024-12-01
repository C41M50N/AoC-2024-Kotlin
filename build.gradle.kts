plugins {
    kotlin("jvm") version "2.0.21"
}

group = "cfsb.crimsoncoder"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}