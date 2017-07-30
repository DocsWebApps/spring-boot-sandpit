package com.docswebapps.spring5guru.controller;

import com.docswebapps.spring5guru.service.Impl.GreetingServiceImpl;

/**
 * Created by Dave Collier on 30/07/2017.
 * The bad way to do dependency injection, straight into a public property and straight from the implemented class not an interface
 */
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
