package com.springcore.collection;
import java.util.*;

public class Employee {
	
	private String name;
	private List<String> phones;
	private Set <String> address;
	private Map <String,String> courses;
	
	private Properties prop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
	
	
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties prop) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.prop = prop;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", phones=");
		builder.append(phones);
		builder.append(", address=");
		builder.append(address);
		builder.append(", courses=");
		builder.append(courses);
		builder.append(", prop=");
		builder.append(prop);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
