plugins {
    id("trenako.kotlin-application-conventions")
}

dependencies {
    implementation(project(":catalog"))
    implementation(project(":collecting"))
    implementation(project(":social"))
}
