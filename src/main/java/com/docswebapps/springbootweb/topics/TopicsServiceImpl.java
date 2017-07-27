package com.docswebapps.springbootweb.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsServiceImpl implements TopicsService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
		new Topic(0,"Java","Java description"),
		new Topic(1,"JavaScript","JavaScript description"),
		new Topic(2,"Ruby","Ruby description")
	));
	
	public String deleteTopic(int id) {
		for(int i=0; i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId()==id) {
				topics.remove(i);
				return "Success";
			}
		}
		return "Error";
	}
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId()==(id)).findFirst().get();
	}
	
	public String addTopic(Topic topic) {	
		if (topics.add(topic)) {
			return "Success";
		} else {
			return "Error";
		}
	}
	
	public String updateTopic(Topic topic, int id) {
		for(int i=0;i<topics.size(); i++) {
			Topic t=topics.get(i);
			if (t.getId()==id) {
				topics.set(i, topic);
				return "Success";
			}
		}
		return "Error";
	}
	
}
