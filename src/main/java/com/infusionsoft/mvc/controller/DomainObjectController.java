package com.infusionsoft.mvc.controller;

import com.infusionsoft.model.DomainObject;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class DomainObjectController {

    @RequestMapping("/random")
    public DomainObject random(){

        final String name = "Bananarama";
        final String location = "Refrigerator";
        final String random = UUID.randomUUID().toString();

        return new DomainObject(name, location, random);

    }

    @RequestMapping(value = "/poster", method = RequestMethod.POST)
    public DomainObject poster(@Validated @RequestBody DomainObject object){

        return object;

    }

}