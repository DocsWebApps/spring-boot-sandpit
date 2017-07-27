package com.docswebapps.springbootweb.topics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/topics")
public class TopicsWebController {

	@RequestMapping(method=RequestMethod.GET)
	public String getTopic(Model model) {
		model.addAttribute("greeting", "Hello, this is the TOPIC page!!");
		return "topic";
	}
}
