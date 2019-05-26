package com.docswebapps.springbootweb.topics;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/topics")
public class TopicsRestController {
	
	private final TopicsService topicsService;

	public TopicsRestController(TopicsService topicsService) {
		this.topicsService = topicsService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return topicsService.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addTopic(@RequestBody Topic topic) {
		return topicsService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicsService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		return topicsService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public String deleteTopic(@PathVariable int id) {
		return topicsService.deleteTopic(id);
	}
}
