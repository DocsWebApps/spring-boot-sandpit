package com.docswebapps.spring5guru.controller.rest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/http")

// This demonstrates various rest responses using Strings or full blown ResponseEntities
public class RestResponses {

    @GetMapping("/1")
    public ResponseEntity<String> getRE() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Dave", "Is Ace!");
        // A Response Entity is the whole HTTP response, body, status, headers etc.
        // return instance; new ResponseEntity<>(beerService.getBeerDto(), HttpStatus.OK); OR
        // use static methods; below
        return ResponseEntity.ok().headers(headers).body("Hello, this is a ResponseEntity");
    }

    @GetMapping("/2")
    @ResponseStatus(HttpStatus.OK)
    public String getStringResponse() {
        return ("Hello, this is just a string with a separate HTTP status code");
    }
}
