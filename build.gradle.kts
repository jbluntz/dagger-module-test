// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {

    val kotlinVersion by extra("1.4.10")
    val daggerVersion by extra("2.30.1")

    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}