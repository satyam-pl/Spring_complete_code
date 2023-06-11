package com.springcore.standlone.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	
	
	private List<String> friend;
	
	

	private Map<String,String> courses;

	
	
	
	
	
	
	
	public Person(List<String> friend,  Map<String, String> courses) {
		super();
		this.friend = friend;
	
		this.courses = courses;
	}


	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	public Person(List<String> friend) {
		super();
		this.friend = friend;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [friend=");
		builder.append(friend);
	
		builder.append(", courses=");
		builder.append(courses);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
