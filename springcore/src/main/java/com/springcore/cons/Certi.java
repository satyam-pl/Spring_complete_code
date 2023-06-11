package com.springcore.cons;

public class Certi {

	
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Certi [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
