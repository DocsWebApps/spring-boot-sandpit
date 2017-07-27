package com.docswebapps.jdbc.domain;

public class Person {
	
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(Long id, String firstName, String lastName, int age) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	Person(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		StringBuilder returnString=new StringBuilder("Person Entry (");
		returnString.append("ID: "+this.getId()+", ");
		returnString.append("First Name: "+this.getFirstName()+", ");
		returnString.append("Lat Name: "+this.getLastName()+", ");
		returnString.append("Age: "+this.getAge()+")");
		return returnString.toString();
	}

}
