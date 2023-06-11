package com.springcore.StereioTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStereio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/StereioTypeAnnotation/congigStereio.xml");
		
		Student student = (Student)context.getBean("student");
		
		Address a = student.getAddress();
		System.out.println(a.getCity());
		System.out.println(student);
	}

}
