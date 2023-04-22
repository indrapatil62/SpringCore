package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("sconfig.xml");
		
		A a=(A) context.getBean("a");
		A a1=(A) context.getBean("a");
		A a2=(A) context.getBean("a");
		A a3=(A) context.getBean("a");
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
	}
}
