# Hungry Dev

A small, friendly Android app that showcases a simple UI built with AndroidX and Material components. It uses CardView-based sections (like starters and mains) to keep things clean and approachable—great as a starter or a teaching aid.

## Tech stack
- Android SDK (compile/target SDK 36, min SDK 24)
- Java (source/target compatibility: 11)
- Gradle with Kotlin DSL
- AndroidX AppCompat, Material Components, CardView, ConstraintLayout

## Requirements
- Android Studio (latest stable recommended)
- JDK 11
- Android SDK Platform 36

## Getting started
1. Clone this repository.
2. Open the project in Android Studio.
3. Let Gradle sync finish.
4. Click Run to build and install on an emulator or device (API 24+).

## Build from the command line
```bash
# macOS / Linux
./gradlew assembleDebug

# Windows
./gradlew.bat assembleDebug
```
The debug APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.

## Project structure(expanding)
```
HungeryDev/
├─ app/
│  ├─ src/main/java/com/example/hungrydev/MainActivity.java
│  ├─ src/main/res/
│  └─ build.gradle.kts
├─ build.gradle.kts
├─ settings.gradle.kts
└─ gradlew, gradlew.bat
```

## App details
- Application ID: `com.example.hungrydev`
- App name: Hungry Dev
