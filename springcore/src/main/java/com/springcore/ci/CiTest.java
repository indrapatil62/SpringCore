package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main( String[] args )
    {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ciconfig.xml");
		// if xml store in perticular package then give it with package/.xml else in src then direct give the name
		
		Person p= (Person) applicationContext.getBean("person");
		System.out.println(p);
		
		Employee e= (Employee) applicationContext.getBean("employee");
		System.out.println(e);
    }
}
