### init gradle

```powershell
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> gradle init

Select type of build to generate:
  1: Application
  2: Library
  3: Gradle plugin
  4: Basic (build structure only)
Enter selection (default: Application) [1..4] 3

Select implementation language:
  1: Java
  2: Kotlin
  3: Groovy
Enter selection (default: Java) [1..3] 1

Project name (default: tp-outils-libre-final-lab): tp-final

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 2

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


> Task :init
For more information, please refer to https://docs.gradle.org/8.7/userguide/custom_plugins.html in the Gradle documentation.

BUILD SUCCESSFUL in 38s
1 actionable task: 1 executed
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> 

```

### test the plugin

```powershell
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> gradle test

BUILD SUCCESSFUL in 11s
6 actionable tasks: 5 executed, 1 up-to-date
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> 
```

### test python

```powershell
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> python integration_test.py
> Task :plugin:compileJava
> Task :plugin:pluginDescriptors UP-TO-DATE
> Task :plugin:processResources UP-TO-DATE
> Task :plugin:classes
> Task :plugin:compileTestJava
> Task :plugin:pluginUnderTestMetadata
> Task :plugin:processTestResources NO-SOURCE
> Task :plugin:testClasses
> Task :plugin:test

BUILD SUCCESSFUL in 9s
6 actionable tasks: 4 executed, 2 up-to-date

Integration Test Passed
PS C:\Users\ELITE COMPUTER\tp-outils-libre-final-lab> 
```