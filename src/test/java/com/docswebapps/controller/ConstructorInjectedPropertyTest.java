package com.docswebapps.controller;

import com.docswebapps.spring5guru.controller.ConstructorInjectedProperty;
import com.docswebapps.spring5guru.service.Impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave Collier on 30/07/2017.
 */
public class ConstructorInjectedPropertyTest {

    private ConstructorInjectedProperty constructorInjectedProperty;

    @Before
    public void setUp() throws Exception {
        // The best way to do DI, when you instantiate a class with dependencies inject them vai a constructor on instantiation
        this.constructorInjectedProperty= new ConstructorInjectedProperty(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedProperty.sayHello());
    }

}