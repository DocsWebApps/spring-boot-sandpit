package com.docswebapps.jpa.service;

import java.util.List;
import java.util.Optional;
import com.docswebapps.jpa.domain.Topic;

public interface TopicService {
	List<Topic> getAllTopics() ;
	String addTopic(Topic topic);
	Optional<Topic> getTopic(Long id);
}
