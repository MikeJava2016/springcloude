package com.ch1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		FunctionService functionService = context.getBean(FunctionService.class);
		System.out.println(functionService.sayHello("java config"));
		System.out.println(context.getBean(UseFunctionService.class).sayHello("php"));
		context.close();
	}
}
