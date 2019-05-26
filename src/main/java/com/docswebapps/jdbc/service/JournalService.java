package com.docswebapps.jdbc.service;

import java.util.List;
import com.docswebapps.jdbc.domain.Journal;

public interface JournalService {
	void insertData();
	List<Journal> findAll();
}
