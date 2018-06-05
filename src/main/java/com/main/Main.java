package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch3.AsyncTaskService;
import com.config.TaskExecutorConfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
					= new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			asyncTaskService.exacuteAsyncTask(i);
			asyncTaskService.executeAsyncPlus(i);
		}
		context.close();
		
		System.out.println("12321074");
		
	System.out.println("java");
	}
}
