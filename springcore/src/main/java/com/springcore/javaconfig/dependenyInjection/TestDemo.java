package com.springcore.javaconfig.dependenyInjection; 


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {

	
	
	public static void main(String args[])
			{
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		Student st1 = context.getBean("getStudent2",Student.class);
		
		System.out.println(st1);
		
		st1.course();
		
		
		st1.getSm().Eat();
	
			}
}
