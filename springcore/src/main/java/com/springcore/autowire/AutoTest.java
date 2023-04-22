package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autoconfig.xml");
		
		Payment payment =(Payment) context.getBean("payment");
		System.out.println(payment);
		
		
		
		
	}

}
