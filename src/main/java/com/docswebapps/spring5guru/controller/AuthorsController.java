package com.docswebapps.spring5guru.controller;

import com.docswebapps.spring5guru.repository.AuthorRepository;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dave Collier on 28/07/2017.
 */
@Controller
@RequestMapping(value = "/authors")
public class AuthorsController {

    private AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllAuthors(Model model) {
        model.addAttribute("allAuthors", authorRepository.findAll());
        return "AllAuthors";
    }
}
