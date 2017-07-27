package com.docswebapps.jdbc.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.docswebapps.jdbc.domain.Journal;
import com.docswebapps.jdbc.service.JournalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JournalServiceImpl implements JournalService{
	
	private static final Logger log=LoggerFactory.getLogger(JournalService.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertData() {
		log.info("> Table creation");
		jdbcTemplate.execute("DROP TABLE JOURNAL IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE JOURNAL(id SERIAL, title VARCHAR2(255), summary VARCHAR2(255), created TIMESTAMP)");
		log.info("> Inserting data...");
		jdbcTemplate.execute("INSERT INTO JOURNAL(title, summary, created) VALUES ('Get to know Spring Boot','Today I will learn Spring Boot','2017-04-11 13:49:00')");
		jdbcTemplate.execute("INSERT INTO JOURNAL(title, summary, created) VALUES ('Simple Spring Boot','My Spring Boot Project','2017-04-11 13:49:00')");
		jdbcTemplate.execute("INSERT INTO JOURNAL(title, summary, created) VALUES ('Spring Boot in the Cloud','Learn Spring Boot Cloud','2017-04-11 13:49:00')");
		jdbcTemplate.execute("INSERT INTO JOURNAL(title, summary, created) VALUES ('Spring Boot Reading','Read more about Spring Boot','2017-04-11 13:49:00')");
		log.info("> Done");
	}

	@Override
	public List<Journal> findAll() {
		List<Journal> entries=new ArrayList<>();
		jdbcTemplate.query("SELECT * FROM JOURNAL", new Object[]{}, (rs,row) -> new Journal(rs.getLong("id"), rs.getString("title"), rs.getString("summary"), new Date(rs.getTimestamp("created").getTime()))).forEach(entry -> entries.add(entry));;
		return entries;
	}
}
