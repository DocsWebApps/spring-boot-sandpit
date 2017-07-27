package com.docswebapps.springbootweb.topics1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Topics1ServiceImpl implements Topics1Service {
	
	@Autowired
	private Topic1Repository topic1Repository;
	
	@Override
	public String deleteTopic(String id) {
		topic1Repository.delete(id);
		return "Deleted!";
	}
	
	@Override
	public List<Topic1> getAllTopics() {
		List<Topic1> topics= new ArrayList<>();
		topic1Repository.findAll().forEach(topics::add);
		return topics;
	}
	
	@Override
	public Topic1 getTopic(String id) {
		return topic1Repository.findOne(id);
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
