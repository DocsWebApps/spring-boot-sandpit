package com.docswebapps.jdbc.service;

import java.util.List;
import com.docswebapps.jdbc.domain.Person;


public interface PersonService {
	
	public void insertData();
	public List<Person> getAll();

}
