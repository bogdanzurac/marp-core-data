plugins {
    alias(libs.plugins.marp.core)
    alias(libs.plugins.marp.koin)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.core.db"
}

dependencies {
    api(libs.realm)

    implementation(libs.marp.core)
}