package com.springcore.StereioTypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("Indore")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city) {
		super();
		this.city = city;
	}
	
	
	
}
