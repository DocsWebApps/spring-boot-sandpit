package com.docswebapps.web.controller;

import java.util.List;

import com.docswebapps.jpa.domain.Topic;
import com.docswebapps.jpa.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicRestController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Topic getTopic(@PathVariable Long id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public String updateTopic(@PathVariable Topic topic) {
		return "string";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public String deleteTopic(@PathVariable Long id) {
		return "string";
	}

}
