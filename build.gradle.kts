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

application {
    mainClass.set("com.example.Example")
    mainModule.set("com.example")
}

jlink {
    options.set(listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"))
}