import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("snaproll.android.library")
            }

            dependencies {
                add("implementation", project(":core"))
                add("implementation", project(":domain"))
                add("implementation", project(":design-system"))

                add("implementation", libs.findLibrary("androidx-lifecycle-runtime-ktx").get())
                add("implementation", libs.findLibrary("androidx-core-ktx").get())
            }
        }
    }
}
