package com.springAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Text {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	        Employee emp=(Employee) context.getBean("empl");
	        
	        System.out.println(emp);
	        System.out.println("employee id is: "+emp.emp_id);
	        System.out.println("employee Name is: "+emp.emp_name);
	        System.out.println("employee Designation  is: "+emp.designation);
	        System.out.println("employee Salary is: "+emp.salary);
	}

}
