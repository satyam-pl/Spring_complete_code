package com.springcore.auto.wire.anno;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	
	
	
	private Address address;
	private String name;

	public Address getAdd() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdd(Address address) {
		System.out.println("I am setter method");
		this.address = address;
	}

	public void setName(String name) {
		System.out.println("I am setter method");
		this.name = name;
	}
	
	@Autowired
	public Employee(Address address) {
		super();
		
		
		this.address = address;
		System.out.println("I am parameterized Constructor");
	}
	public Employee() {
		super();
		System.out.println("I am default Constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		
		builder.append(", add=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
