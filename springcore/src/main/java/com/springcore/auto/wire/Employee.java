package com.springcore.auto.wire;

public class Employee {

	
	private String name;
	private String contact;
	Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Address getAdd() {
		return address;
	}
	public void setAdd(Address address) {
		this.address = address;
	}
	public Employee(String name, String contact, Address address) {
		super();
		this.name = name;
		this.contact = contact;
		this.address = address;
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
		builder.append(", contact=");
		builder.append(contact);
		builder.append(", add=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
