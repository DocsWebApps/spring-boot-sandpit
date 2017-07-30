package com.docswebapps.controller;

import com.docswebapps.spring5guru.controller.PropertyInjectedController;
import com.docswebapps.spring5guru.service.Impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave Collier on 30/07/2017.
 */
public class PropertyInjectedControllerTest {

    // Using private property injection is really BAD !!
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController=new PropertyInjectedController();
        // Manually inject GreetingServiceImpl into public property simulating Spring
        this.propertyInjectedController.greetingService= new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
