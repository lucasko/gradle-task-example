package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class Task2 extends DefaultTask {
	
    @TaskAction
    public void test1() {
        System.out.println("I am test1 in Task2, Hello from task " + getPath() + "!");
    }
}