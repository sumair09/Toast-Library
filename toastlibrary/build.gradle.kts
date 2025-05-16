plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.androiddev.toastlibrary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.androiddev.toastlibrary"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.activity.compose)
}

//afterEvaluate {
//    extensions.configure<PublishingExtension>("publishing") {
//        publications {
//            create<MavenPublication>("release") {
//                from(components["release"])
//                groupId = "com.androiddev.toastlibrary"
//                artifactId = "toastlibrary"
//                version = "1.0.0"
//            }
//        }
//        repositories {
//            maven {
//                name = "localRepo"
//                url = uri("${rootProject.buildDir}/repo")
//            }
//        }
//    }
//}