package com.ch1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig elConfig = context.getBean(ElConfig.class);
		elConfig.outPutResource();
		context.close();
	}
}
