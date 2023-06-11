package com.springcore.javaconfig.dependenyInjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	public Samosa getSamosa()
	{
		
		Samosa samosa = new Samosa();
		return samosa;
	}
	@Bean
	public Student getStudent2()
	{
		Student student = new Student(getSamosa());
		
		return student;
	}
}
