package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class CTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");
		// if xml store in perticular package then give it with package/.xml else in src then direct give the name
		
		Employee_info p= (Employee_info) applicationContext.getBean("emp");
		System.out.println(p.getEmp_id());
		System.out.println(p.getNames());
		System.out.println(p.getPhones());
	}

}
