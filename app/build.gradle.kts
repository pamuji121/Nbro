plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "id.sch.smpn45sby.ujian"
    compileSdk = 34

    defaultConfig {
        applicationId = "id.sch.smpn45sby.ujian"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // ====== PENGATURAN ======
        buildConfigField("String", "EXAM_URL", "\"https://sas.smpnegeri45sby.sch.id/\"")
        buildConfigField("String", "EXIT_PIN", "\"45sby\"")   // PIN untuk keluar dari aplikasi (pengawas)
    }

    buildFeatures { buildConfig = true }

    buildTypes {
        release { isMinifyEnabled = false }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
