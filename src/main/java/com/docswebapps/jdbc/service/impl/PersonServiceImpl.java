package com.docswebapps.jdbc.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.docswebapps.jdbc.domain.Person;
import com.docswebapps.jdbc.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	
	private static final Logger log=LoggerFactory.getLogger(PersonService.class);
	
	private final JdbcTemplate jdbcTemplate;

	public PersonServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertData() {
		log.info("> Creating Table...");
		jdbcTemplate.execute("DROP TABLE PERSON IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE PERSON(id SERIAL, firstName VARCHAR2(255), lastName VARCHAR2(255), age INT)");
		log.info("> Inserting Data ...");;
		jdbcTemplate.execute("INSERT INTO PERSON(firstName, lastName, age) VALUES ('Dave','Collier',50)");
		jdbcTemplate.execute("INSERT INTO PERSON(firstName, lastName, age) VALUES ('Sarah','Collier',47)");
		jdbcTemplate.execute("INSERT INTO PERSON(firstName, lastName, age) VALUES ('Fraz','Collier',19)");
		jdbcTemplate.execute("INSERT INTO PERSON(firstName, lastName, age) VALUES ('Jess','Collier',9)");
		log.debug("> Data Inserted...");
	}

	@Override
	public List<Person> getAll() {
		List<Person> people=new ArrayList<>();
		jdbcTemplate.query("SELECT * FROM PERSON", new Object[]{}, (rs,row) -> new Person(rs.getLong("id"), rs.getString("firstName"),rs.getString("lastName"), rs.getInt("age"))).forEach(person -> people.add(person));
		return people;
	}
}
