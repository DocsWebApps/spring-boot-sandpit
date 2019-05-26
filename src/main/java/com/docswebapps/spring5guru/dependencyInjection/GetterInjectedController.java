package com.docswebapps.spring5guru.dependencyInjection;

import com.docswebapps.spring5guru.service.GreetingService;

/**
 * Created by Dave Collier on 30/07/2017.
 * Not so good way, we are now using an interface and a private property with setter method though.
 */
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService=greetingService;
    }
}
