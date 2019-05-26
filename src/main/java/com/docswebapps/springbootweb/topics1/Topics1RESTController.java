package com.docswebapps.springbootweb.topics1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/topics1")
public class Topics1RESTController {
//	Use constructor based injection
//	@Autowired
//	Topics1Service topics1Service;

	private final Topics1Service topics1Service;

	public Topics1RESTController(Topics1Service topics1Service) {
		this.topics1Service = topics1Service;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Topic1> getAllTopics() {
		return topics1Service.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addTopic(@RequestBody Topic1 topic) {
		return topics1Service.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Optional<Topic1> getTopic(@PathVariable String id) {
		return topics1Service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public String updateTopic(@RequestBody Topic1 topic, @PathVariable String id) {
		return topics1Service.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public String deleteTopic(@PathVariable String id) {
		return topics1Service.deleteTopic(id);
	}
}
