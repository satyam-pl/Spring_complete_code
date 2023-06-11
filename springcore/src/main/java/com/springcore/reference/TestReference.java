package com.springcore.reference;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.reference.A;
import com.springcore.reference.B;

public class TestReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/configReference.xml");
		
		
		A a = (A)context.getBean("aref");
		
		
		B b =a.getB();
		System.out.println(a.getX());
		System.out.println("I am B "+b.getY());
		
		

	}

}
