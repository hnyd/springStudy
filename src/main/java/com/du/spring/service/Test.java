package com.du.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.du.spring.entity.Performer;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-root.xml");
		
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
		
		
	}
	
	
}
