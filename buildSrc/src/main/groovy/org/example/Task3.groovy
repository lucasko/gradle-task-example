package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


class Task3 extends DefaultTask {

	String message = "Default Message"

    @TaskAction
    void test1() {
    	println "I am test1 in Task3, message is "+message 
    }

     @TaskAction
    void test2() {
    	println "I am test1 in Task3"+message
    }
}