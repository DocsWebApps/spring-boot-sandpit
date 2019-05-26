package com.docswebapps.springbootweb.topics;

import java.util.List;

public interface TopicsService {
	String deleteTopic(int id);
	List<Topic> getAllTopics();
	Topic getTopic(int id);
	String addTopic(Topic topic);
	String updateTopic(Topic topic, int id);
}
