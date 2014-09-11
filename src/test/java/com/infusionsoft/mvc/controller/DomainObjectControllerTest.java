package com.infusionsoft.mvc.controller;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

@Test
public class DomainObjectControllerTest {

    private DomainObjectController domainObjectController;

    @BeforeClass
    void before(){
        domainObjectController = new DomainObjectController();
    }

    public void testRandomness(){

        assertNotNull(domainObjectController.random());

    }
}