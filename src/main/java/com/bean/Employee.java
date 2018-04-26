package com.bean;

public class Employee {

	
	private String name;
	private String email;
	private Address address;
	
	
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
