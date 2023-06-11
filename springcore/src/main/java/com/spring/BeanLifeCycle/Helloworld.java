package com.spring.BeanLifeCycle;

import java.lang.Exception;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Helloworld implements InitializingBean, DisposableBean {
	
	
	
	public void destroy() throws Exception
	{
		
		System.out.println("I am destroy method");
	}




	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am set Properties or init method");
	}
}
