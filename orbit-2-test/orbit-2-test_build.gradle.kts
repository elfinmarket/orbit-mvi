/*
 * Copyright 2020 Babylon Partners Limited
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

plugins {
    id("java-library")
    kotlin("jvm")
}
apply<kotlinx.atomicfu.plugin.gradle.AtomicFUGradlePlugin>()

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(ProjectDependencies.kotlinCoroutines)
    implementation(kotlin("test"))

    api(project(":orbit-2-core"))

    // Testing
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation(ProjectDependencies.kotestAssertions)
    testImplementation(ProjectDependencies.kotlinCoroutinesTest)
}

// Fix lack of source code when publishing pure Kotlin projects
// See https://github.com/novoda/bintray-release/issues/262
tasks.whenTaskAdded {
    if (name == "generateSourcesJarForMavenPublication") {
        this as Jar
        from(sourceSets.main.get().allSource)
    }
}
