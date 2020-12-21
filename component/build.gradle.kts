plugins {
    id("kotlin")
    id("kotlin-kapt")
}

val kotlinVersion: String by rootProject.extra
val daggerVersion: String by rootProject.extra

kapt {
    javacOptions {
        option("-Adagger.validateTransitiveComponentDependencies=DISABLED")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("com.google.dagger:dagger:$daggerVersion")
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")

    implementation(project(":module-a"))
}