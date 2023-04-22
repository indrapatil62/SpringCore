package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Refconfig.xml");

		 
		Address a = (Address) applicationContext.getBean("address");
		System.out.println(a);
		
		 Employee e= (Employee) applicationContext.getBean("employee");
		  System.out.println(e);
		  
		  Person p= (Person) applicationContext.getBean("person");
		  System.out.println(p);
		  
		  Student student= applicationContext.getBean("student", Student.class);
		  System.out.println(student);

	}

}
