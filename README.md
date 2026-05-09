# core-parsers

A library for plugin / extension creators. This core library containing base models, utilities, exceptions, and Tachiyomi compatibility layer.

## Installation

Add JitPack repository to your build file:

```kotlin
// In settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency:

```kotlin
dependencies {
    implementation("com.github.KotatsuApp:core-parsers:0.0.1")
}
```

## Usage

This library provides the foundation for creating sources. See our [template](https://github.com/UsagiApp/plugins) for example implementations.

## License

GPL-3.0 License - see [LICENSE](LICENSE) for details.
