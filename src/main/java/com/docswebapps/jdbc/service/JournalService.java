package com.docswebapps.jdbc.service;

import java.util.List;

import com.docswebapps.jdbc.domain.Journal;


public interface JournalService {

	public void insertData();
	public List<Journal> findAll();

}
