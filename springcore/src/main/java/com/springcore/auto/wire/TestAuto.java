package com.springcore.auto.wire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
							
					
					
					Employee e1 =(Employee)context.getBean("employee1");
					
					System.out.println(e1);
							
					System.out.println(e1.getAdd().getCity());
	}

}
