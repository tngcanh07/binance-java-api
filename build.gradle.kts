plugins {
    id("java")
}

repositories {
    mavenCentral()
}

private object Versions {
    const val retrofit2 = "2.8.1"
    const val okHttp3 = "3.13.1"
    const val apacheCommonsLang3 = "3.6"
    const val commonsCodec = "1.10"

    const val junit = "4.12"
}

dependencies {
    implementation("org.apache.commons:commons-lang3:${Versions.apacheCommonsLang3}")
    implementation("commons-codec:commons-codec:${Versions.commonsCodec}")

    implementation("com.squareup.retrofit2:retrofit:${Versions.retrofit2}")
    implementation("com.squareup.okhttp3:okhttp:${Versions.okHttp3}")
    implementation("com.squareup.retrofit2:converter-jackson:${Versions.retrofit2}")

    // unit tests
    testImplementation("junit:junit:${Versions.junit}")
}