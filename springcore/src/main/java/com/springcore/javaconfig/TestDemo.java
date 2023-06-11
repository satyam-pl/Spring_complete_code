package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {

	
	
	public static void main(String args[])
			{
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		Student st1 = context.getBean("getStudent",Student.class);
		
		System.out.println(st1);
		
		st1.course();
	
			}
}
