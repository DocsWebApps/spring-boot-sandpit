package com.docswebapps.springbootweb.topics1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class Topics1ServiceImpl implements Topics1Service {

	private final Topic1Repository topic1Repository;

	public Topics1ServiceImpl(Topic1Repository topic1Repository) {
		this.topic1Repository = topic1Repository;
	}
	
	@Override
	public String deleteTopic(String id) {
		topic1Repository.deleteById(id);
		return "Deleted!";
	}
	
	@Override
	public List<Topic1> getAllTopics() {
		List<Topic1> topics= new ArrayList<>();
		topic1Repository.findAll().forEach(topics::add);
		return topics;
	}
	
	@Override
	public Optional<Topic1> getTopic(String id) {
		return topic1Repository.findById(id);
	}
	
	@Override
	public String addTopic(Topic1 topic) {	
		topic1Repository.save(topic);
		return "Added!";
	}
	
	@Override
	public String updateTopic(Topic1 topic, String id) {
		topic1Repository.save(topic);
		return "Updated!";
	}
}
