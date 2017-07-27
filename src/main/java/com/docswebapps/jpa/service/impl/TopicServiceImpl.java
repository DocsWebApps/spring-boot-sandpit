package com.docswebapps.jpa.service.impl;

import java.util.List;

import com.docswebapps.jpa.domain.Topic;
import com.docswebapps.jpa.repository.TopicRepository;
import com.docswebapps.jpa.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
    TopicRepository topicRepo;

	@Override
	public List<Topic> getAllTopics() {
		return topicRepo.findAll();
	}

	@Override
	public String addTopic(Topic topic) {
		topicRepo.save(topic);
		return"Topic Added!";
	}

	@Override
	public Topic getTopic(Long id) {
		return topicRepo.findOne(id);
	}

}
