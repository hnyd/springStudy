package com.du.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.du.spring.entity.Performance;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-root.xml");
		
		Performance performance = (Performance) ctx.getBean("kenny");
		performance.perform();
		
		
	}
	
	
}
