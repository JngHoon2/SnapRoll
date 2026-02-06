plugins {
    id("snaproll.android.library")
}

android {
    namespace = "com.ljh.snaproll.data"
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":core"))
}
