package com.springcore.StereioTypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("SATYAM")
	private String name;
	
      @Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}

	

}
