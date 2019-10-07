package com.docswebapps.jpa.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
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

	protected boolean canEqual(final Object other) {
		return other instanceof Topic;
	}

}
