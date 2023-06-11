package com.spring.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/spring/BeanLifeCycle/Life.xml");
					
			
			
			context.close();
					
			
			}

}
