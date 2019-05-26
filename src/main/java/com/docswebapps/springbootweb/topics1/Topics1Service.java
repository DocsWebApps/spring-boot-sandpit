package com.docswebapps.springbootweb.topics1;

import java.util.List;
import java.util.Optional;

public interface Topics1Service {
	String deleteTopic(String id);
	List<Topic1> getAllTopics();
	Optional<Topic1> getTopic(String id);
	String addTopic(Topic1 topic);
	String updateTopic(Topic1 topic, String id);
}
