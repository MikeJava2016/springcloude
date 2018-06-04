package com.ch1;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.ch1")
@PropertySource("classpath:a.properties")
public class ElConfig {
	@Value("I Love You!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("classpath:a.properties")
	private Resource testProperties;
	
	@Value("http://www.baidu.com")
	private Resource testURL;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	//@javax.annotation.Resource
	private Environment environment;
	
	public void outPutResource() {
		System.out.println(normal);
		System.out.println(osName);
		System.out.println(fromAnother);
		try {
			System.out.println(IOUtils.toString(testProperties.getInputStream()));
			System.out.println(IOUtils.toString(testURL.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.bookName"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
