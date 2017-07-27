package com.docswebapps.jpa.service;

import java.util.List;

import com.docswebapps.jpa.domain.Topic;

public interface TopicService {
	
	public List<Topic> getAllTopics() ;
	public String addTopic(Topic topic);
	public Topic getTopic(Long id);

}
