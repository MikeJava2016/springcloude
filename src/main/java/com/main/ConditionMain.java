package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch3.ListService;
import com.config.ConditionConfig;

public class ConditionMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
							= new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		String cmd = listService.showListCmd();
		System.out.println(cmd);
		context.close();
	}
}
