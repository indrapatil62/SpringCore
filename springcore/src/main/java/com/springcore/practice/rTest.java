package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.Address;

public class rTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("rconfig.xml");

	
		
		Rommies rommies = (Rommies) context.getBean("rommies");
		System.out.println(rommies);

	}

}
