plugins {
    kotlin("jvm")
    application
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    val flyingSaucerVersion = properties["flying-saucer.version"] as String
    val logbackVersion = properties["logback.version"] as String

    implementation("org.xhtmlrenderer:flying-saucer-core:$flyingSaucerVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("${project.group}.MainKt")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
