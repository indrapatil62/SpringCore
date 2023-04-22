package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("aconfig2.xml");

		Person p1=context.getBean("per1",Person.class);
		Person p2=context.getBean("per2",Person.class);
		Person p3=context.getBean("per3",Person.class);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
