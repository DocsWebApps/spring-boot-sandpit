package com.docswebapps.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_TOPIC", allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	private Long id;
	private String name;
	private String description;
	
	Topic(){}
	
	public Topic (String name, String description) {
		this.name=name;
		this.description=description;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		StringBuilder returnString=new StringBuilder("Topic Record (");
		returnString.append("ID: "+this.getId()+", ");
		returnString.append("Name: "+this.getName()+", ");
		returnString.append("Description: "+this.getDescription()+")");
		return returnString.toString();
	}
}
