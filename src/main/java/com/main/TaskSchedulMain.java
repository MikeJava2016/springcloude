package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.TaskSchedulerConfig;

public class TaskSchedulMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
						= new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		
//		context.close();
	}
}
