package com.docswebapps.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HomePageController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayHomepage(Model model) {
		model.addAttribute("myMessage", "This really is the Homepage, honest governor !!!");
		return "homePage";
	}

}
