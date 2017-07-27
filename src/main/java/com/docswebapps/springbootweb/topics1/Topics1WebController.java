package com.docswebapps.springbootweb.topics1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/topics1")
public class Topics1WebController {

	@RequestMapping(method=RequestMethod.GET)
	public String getTopic(Model model) {
		model.addAttribute("greeting", "Hello, this is the TOPIC1 page!!");
		return "topic";
	}
}
