/*
 * Copyright 2021 Mikołaj Leszczyński & Appmattus Limited
 * Copyright 2020 Babylon Partners Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * File modified by Mikołaj Leszczyński & Appmattus Limited
 * See: https://github.com/orbit-mvi/orbit-mvi/compare/c5b8b3f2b83b5972ba2ad98f73f75086a89653d3...main
 */

object Versions {

    const val gradleVersionsPlugin = "0.39.0"
    const val gradleAndroidPlugin = "7.0.4"
    const val gradleMavenPublishPlugin = "0.18.0"
    const val markdownLintPlugin = "0.6.0"
    const val detektPlugin = "1.19.0"
    const val safeargs = "2.3.5"
    const val atomicfu = "0.17.0"
    const val dokka = "1.6.10"

    const val kotlin = "1.6.10"
    const val coroutines = "1.6.0-native-mt"

    const val androidxLifecycles = "2.4.0"
    const val androidxEspresso = "3.4.0"
    const val androidxCompose = "1.0.5"

    const val desugar = "1.1.5"

    // Testing
    const val jacoco = "0.8.7"
    const val junit4 = "4.13.2"
    const val robolectric = "4.7.3"
}

object ProjectDependencies {
    // Kotlin
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val kotlinCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"

    // AndroidX
    const val androidxLifecycleSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.androidxLifecycles}"
    const val androidxLifecycleViewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidxLifecycles}"
    const val androidxLifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidxLifecycles}"
    const val androidxEspressoIdlingResource = "androidx.test.espresso:espresso-idling-resource:${Versions.androidxEspresso}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${Versions.androidxEspresso}"
    const val androidxComposeRuntime = "androidx.compose.runtime:runtime:${Versions.androidxCompose}"

    // Tools
    const val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.detektPlugin}"

    // Test prerequisites
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
}

object PluginDependencies {
    const val android = "com.android.tools.build:gradle:${Versions.gradleAndroidPlugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detektPlugin}"
    const val safeargs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.safeargs}"
    const val atomicfu = "org.jetbrains.kotlinx:atomicfu-gradle-plugin:${Versions.atomicfu}"
}
