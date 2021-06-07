import org.gradle.api.tasks.testing.logging.TestExceptionFormat.*
import org.gradle.api.tasks.testing.logging.TestLogEvent.*

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.kapt")
    id("com.diffplug.spotless")
    id("com.adarshr.test-logger")
}

repositories {
    mavenCentral()
}

configurations {
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
        vendor.set(JvmVendorSpec.ADOPTOPENJDK)
        implementation.set(JvmImplementation.VENDOR_SPECIFIC)
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    test {
        useJUnitPlatform()

        testLogging {
            events(PASSED, FAILED, STANDARD_ERROR, SKIPPED)
            exceptionFormat = FULL
            showExceptions = true
            showCauses = true
            showStackTraces = true
            showStandardStreams = true
        }
        failFast = false
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint("0.41.0")
        licenseHeaderFile("${project.rootDir}/license-header")
    }
}
