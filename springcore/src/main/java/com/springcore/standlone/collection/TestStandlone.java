package com.springcore.standlone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standlone/collection/configcollection.xml");
		
		
		Person person=(Person)context.getBean("list1");
		
		System.out.println(person);
		
		
		System.out.println("This is second bean");
		
		

		Person person2=(Person)context.getBean("list2");
		System.out.println(person2);
		
	}

}
