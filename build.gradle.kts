plugins {
    java
    id("org.beryx.jlink") version "2.24.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

dependencies {
    implementation(group = "org.eclipse.jetty", name = "jetty-server", version = "11.0.6")
}