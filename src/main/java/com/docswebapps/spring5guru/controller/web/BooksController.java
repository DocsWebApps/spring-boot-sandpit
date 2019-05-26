package com.docswebapps.spring5guru.controller.web;

import com.docswebapps.spring5guru.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dave Collier on 28/07/2017.
 */
@Controller
@RequestMapping(value = "/web/books")
public class BooksController {

    private final BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllBooks(Model model) {
        model.addAttribute("allBooks", bookRepository.findAll());
        return "AllBooks";
    }
}
