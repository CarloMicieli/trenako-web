plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.5.10")
    implementation("org.jetbrains.kotlin.kapt:org.jetbrains.kotlin.kapt.gradle.plugin:1.5.10")
    implementation("org.jetbrains.kotlin.plugin.allopen:org.jetbrains.kotlin.plugin.allopen.gradle.plugin:1.5.10")
    implementation("com.adarshr:gradle-test-logger-plugin:2.1.1")
    implementation("com.github.jengelman.gradle.plugins:shadow:6.1.0")
    implementation("io.micronaut.gradle:micronaut-gradle-plugin:1.5.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:5.12.5")
    implementation("com.bmuschko:gradle-docker-plugin:6.7.0")
}
