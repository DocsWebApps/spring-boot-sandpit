package com.docswebapps.spring5guru.service.Impl;

import com.docswebapps.spring5guru.service.GreetingService;

/**
 * Created by Dave Collier on 30/07/2017.
 */
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS="Hello Spring Gurus!!";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
