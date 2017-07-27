package com.docswebapps.springbootweb.topics1;

import java.util.List;

public interface Topics1Service {
	
	public String deleteTopic(String id);
	
	public List<Topic1> getAllTopics();
	
	public Topic1 getTopic(String id);
	
	public String addTopic(Topic1 topic);
	
	public String updateTopic(Topic1 topic, String id);
	
}