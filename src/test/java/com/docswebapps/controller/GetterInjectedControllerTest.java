package com.docswebapps.controller;

import com.docswebapps.spring5guru.dependencyInjection.GetterInjectedController;
import com.docswebapps.spring5guru.service.Impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave Collier on 30/07/2017.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController=new GetterInjectedController();
        // Manual injection done via the setter method
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}
