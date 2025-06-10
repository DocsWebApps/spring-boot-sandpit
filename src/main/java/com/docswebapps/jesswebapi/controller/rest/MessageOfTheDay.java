package com.docswebapps.jesswebapi.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jess/motd")
public class MessageOfTheDay {
    @GetMapping("/simple")
    @ResponseStatus(HttpStatus.OK)
    public String getStringResponse() {
        return ("Hello Jessica, welcome to the world of webservices!");
    }
}
