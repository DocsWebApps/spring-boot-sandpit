package com.docswebapps.jpa.service.impl;

import java.util.List;
import java.util.Optional;
import com.docswebapps.jpa.domain.Topic;
import com.docswebapps.jpa.repository.TopicRepository;
import com.docswebapps.jpa.service.TopicService;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository topicRepo;

    public TopicServiceImpl(TopicRepository topicRepo) {
    	this.topicRepo = topicRepo;
	}

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
	public Optional<Topic> getTopic(Long id) {
		return topicRepo.findById(id);
	}
}
