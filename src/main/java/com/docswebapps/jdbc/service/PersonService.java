package com.docswebapps.jdbc.service;

import java.util.List;
import com.docswebapps.jdbc.domain.Person;

public interface PersonService {
	void insertData();
	List<Person> getAll();
}
