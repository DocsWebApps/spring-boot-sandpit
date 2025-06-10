package com.docswebapps.docswebapi.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docs/motd")
public class Message {
    @GetMapping("/simple")
    @ResponseStatus(HttpStatus.OK)
    public String getStringResponse() {
        return ("Hello Doc, welcome to the world of webservices!");
    }
}
