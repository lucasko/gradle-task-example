There are 3 different way for Task in Gradle Project.

Import external Java/Groovy file for testing Tasks.

### Overview of Project

```
├── READM.md
├── build.gradle
├── buildSrc
│   └── src
│       ├── main
│       │   └── groovy
│       │       └── org
│       │           └── example
│       │               ├── Task2.java
│       │               └── Task3.groovy
│       └── test
│           └── groovy
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   └── groovy
    │       └── Task1.groovy
    └── test
        └── groovy
```

### Tasks

I refer to 3 different file for tasks.

```
# Refer to ./src/main/groovy/Task1.groovy
task hello1 (dependsOn: 'classes', type: JavaExec) {
    main = 'Task1'
    classpath = sourceSets.main.runtimeClasspath
}

# Refer to ./buildSrc/src/main/groovy/Task2.java
import org.example.Task2
task hello2(type: Task2)


# Refer to ./buildSrc/src/main/groovy/Task3.groovy
task hello3(type: org.example.Task3) {
    message = 'I am task 3.'
}
```


### Run Tasks
```sh 
$ gradle hello1 hello2 hello3

executing gradlew instead of gradle

> Task :hello1
I am test1 in Task1

> Task :hello2
I am test1 in Task2, Hello from task :hello2!

> Task :hello3
I am test1 in Task3, message is I am task 3.
I am test1 in Task3I am task 3.

BUILD SUCCESSFUL in 4s
4 actionable tasks: 4 executed
```