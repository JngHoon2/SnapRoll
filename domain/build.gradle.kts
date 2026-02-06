plugins {
    id("snaproll.android.library")
}

android {
    namespace = "com.ljh.snaproll.domain"
}

dependencies {
    implementation(project(":core"))
}
