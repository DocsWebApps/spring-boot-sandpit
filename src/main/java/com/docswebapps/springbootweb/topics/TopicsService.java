package com.docswebapps.springbootweb.topics;

import java.util.List;

public interface TopicsService {
	
	public String deleteTopic(int id);
	
	public List<Topic> getAllTopics();
	
	public Topic getTopic(int id);
	
	public String addTopic(Topic topic);
	
	public String updateTopic(Topic topic, int id);
}
