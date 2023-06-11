package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;
public class TestCollection {
	
	
	
	public static void main(String args[])
	{
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/configCollection.xml");
		
		
     
		Employee e1 =(Employee)context.getBean("Employee1");
		
		System.out.println(e1);
		
		
	}

}
