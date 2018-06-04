package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch3.DemoService;
import com.config.WiselyConfig;

public class WiselyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(WiselyConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResult();
		context.close();
	}
}
