# MVVM-Data-Binding-Demo
A simple Android application project using MVVM + Data Binding

## Getting Started

Add JitPack as library source in your project build.gradle:

>allprojects {
repositories{
        ...
        maven { url 'https://jitpack.io' }
    }
}


Then, add dependency in your app module build.gradle:

dependencies {
    compile 'com.github.baurine:multi-type-adapter:${latest-version}'
}
latest-version: see top jitpack badge.

And enable databinding in your app module build.gradle:

>android {
    ...
    dataBinding {
        enabled = true
    }
}
