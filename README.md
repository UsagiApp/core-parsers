> [!IMPORTANT]
> DEPRECATED: We migrated this library and [core-exts](https://github.com/UsagiApp/core-exts) to [Tsuki](https://github.com/UsagiApp/Tsuki) library!

# core-parsers

A library for plugin / extension creators. This core library containing base models, utilities, exceptions, and Tachiyomi compatibility layer.

## Usage

1. Add it to your root build.gradle at the end of repositories:

	```groovy
	allprojects {
 		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 	```

2. Add the dependency

	```groovy
 	dependencies {
 		implementation("com.github.UsagiApp:core-parsers:$version")
 	}
 	```

## Usage in code

   This library provides the core for creating sources. See our [template project](https://github.com/UsagiApp/plugins) for example implementations.

## License

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](http://www.gnu.org/licenses/gpl-3.0.en.html)

<div align="left">

You may copy, distribute and modify the software as long as you track changes/dates in source files. Any modifications
to or software including (via compiler) GPL-licensed code must also be made available under the GPL along with build &
install instructions. See [LICENSE](./LICENSE) for more details.

</div>
