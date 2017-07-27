package com.docswebapps.springbootweb.topics;

public class Topic {
	
	private int id;
	private String name;
	private String descritpion;
	
	public Topic() {}
	
	public Topic(int id, String name, String descritpion) {
		super();
		this.id = id;
		this.name = name;
		this.descritpion = descritpion;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescritpion() {
		return descritpion;
	}
	
	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

}
