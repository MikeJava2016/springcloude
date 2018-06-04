package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.ch3.LinuxCondition;
import com.ch3.LinuxListService;
import com.ch3.WindowsCondition;
import com.ch3.WindowsListService;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(LinuxCondition.class)
	public LinuxListService linuxListService() {
		return new LinuxListService();
	}
	
	@Bean
	@Conditional(WindowsCondition.class)
	public WindowsListService windowsListService() {
		return new WindowsListService();
	}
}
