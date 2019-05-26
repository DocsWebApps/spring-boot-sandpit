package com.docswebapps.spring5guru.dependencyInjection;

import com.docswebapps.spring5guru.service.GreetingService;

/**
 * Created by Dave Collier on 30/07/2017.
 * The best way, private final property, injection from the interface via a constructor.
 */
public class ConstructorInjectedProperty {
    private final GreetingService greetingService;

    public ConstructorInjectedProperty(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
