# Test app

A tiny Kotlin app with no external libraries (only JUnit for tests). It shows a title, a counter and a button, plus the phone Android version. It exists to prove the template works from end to end.

- Application id: com.example.templatetest
- Gradle 8.9, Android Gradle Plugin 8.7.3, Kotlin 2.0.21, JDK 17 (the template default)
- compileSdk and targetSdk 34, minSdk 24 (Android 7.0 and newer)
- 3 unit tests in app/src/test (CounterTest)
- No instrumented tests

## Expected result of a build
Compile, unit tests and debug APK all PASSED. Artifact: android-debug-apk-run<N> containing app-debug.apk.

## On the phone
Install it, open "Template Test", tap the button: the number goes up by one each tap, and the bottom line shows your Android version. Nothing is stored or sent anywhere. The app uses the default Android icon.

## Notes
- This project has never been built before the first run on GitHub. If the first build fails, send the first error from the run summary and it will be fixed.
- gradlew and the wrapper JAR come from the official Gradle 8.9.0 source repository.
