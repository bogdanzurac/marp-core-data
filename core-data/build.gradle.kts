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
    namespace = "dev.bogdanzurac.marp.core.data"
}

dependencies {
    api(libs.multiplatform.settings)
    implementation(libs.store)

    implementation(libs.marp.core)
}