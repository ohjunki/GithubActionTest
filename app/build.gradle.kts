plugins {
    id("com.android.application")
    id( "kotlin-android" )
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.souldi.souldi.githubactiontest"
        minSdk =  24
        targetSdk =  31
        versionCode =  4
        versionName =  "1.3.0"
    }

    buildTypes {
        release {
        }
    }
}

dependencies {
    implementation( "androidx.core:core-ktx:1.7.0" )
    implementation( "androidx.appcompat:appcompat:1.3.0" )
    implementation( "com.google.android.material:material:1.4.0" )
    implementation( "androidx.constraintlayout:constraintlayout:2.0.4" )
    implementation( "androidx.navigation:navigation-fragment-ktx:2.3.5" )
    implementation( "androidx.navigation:navigation-ui-ktx:2.3.5" )
    testImplementation( "junit:junit:4.13.2" )
    androidTestImplementation( "androidx.test.ext:junit:1.1.3" )
    androidTestImplementation( "androidx.test.espresso:espresso-core:3.4.0" )
}