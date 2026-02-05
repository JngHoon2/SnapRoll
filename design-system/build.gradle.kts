plugins {
    id("snaproll.android.library")
    id("snaproll.android.compose")
}

android {
    namespace = "com.ljh.snaproll.designsystem"
}

dependencies {
    implementation(project(":core"))
}
