plugins {
    kotlin("js") version "1.9.21"
}

group = "com.sov.zurvivalizm"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
            binaries.executable()
        }
    }
}

