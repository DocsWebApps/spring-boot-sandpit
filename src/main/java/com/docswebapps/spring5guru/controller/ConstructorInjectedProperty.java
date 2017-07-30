package com.docswebapps.spring5guru.controller;

import com.docswebapps.spring5guru.service.GreetingService;

/**
 * Created by Dave Collier on 30/07/2017.
 * The best way, private property, injection from the interface via a constructor.
 */
public class ConstructorInjectedProperty {
    private GreetingService greetingService;

    public ConstructorInjectedProperty(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
