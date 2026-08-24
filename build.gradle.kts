plugins {
    id("com.android.application")
}

android {
    namespace = "com.ssahospitalequipments.mgpsbilling"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ssahospitalequipments.mgpsbilling"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "8.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.12.1")
}
