package com.springcore.cons;

public class Person {

	
	private int id;
	
	private Certi certi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Certi getCerti() {
		return certi;
	}

	public void setCerti(Certi certi) {
		this.certi = certi;
	}

	public Person(int id, Certi certi) {
		super();
		this.id = id;
		this.certi = certi;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
