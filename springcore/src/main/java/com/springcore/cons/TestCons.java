package com.springcore.cons;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cons/NewFile.xml");
				
				
				Person p = (Person)context.getBean("person1");
				
				
				Certi c = p.getCerti();
				
				
				System.out.println("Id of of Person "+p.getId());
				System.out.println("Certificat name  "+c.getName());
		
		
		
	}

}
