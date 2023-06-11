package com.springcore.javaconfig.dependenyInjection;

import org.springframework.beans.factory.annotation.Value;

//@Component("st")
public class Student {
	
	@Value("77228")
	private int contact;
	private Samosa sm;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(Samosa sm) {
		super();
		this.sm = sm;
	}



	public Samosa getSm() {
		return sm;
	}



	public void setSm(Samosa sm) {
		System.out.println("I am student class set samosa method");
		this.sm = sm;
	}



	public int getContact() {
		return contact;
	}



	public void setContact(int contact) {
		this.contact = contact;
	}



	public void course()
	{
		
		System.out.println("I am student and my course is Java");
		System.out.println("This is using bean");
		System.out.println(" I am Dependency injection example");
		System.out.println("contact no is "+contact);
	}
	
	
	
	
	

}
