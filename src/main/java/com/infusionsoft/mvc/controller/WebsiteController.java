package com.infusionsoft.mvc.controller;

import  com.infusionsoft.model.DomainObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * User: wendel.schultz
 * Date: 7/29/14
 */
@Controller
public class WebsiteController {

    @RequestMapping({"/", "/index"})
    public String home(final Model model){

        final DomainObject dob = new DomainObject("My name is...", "From 8 Mile Road", UUID.randomUUID().toString());

        model.addAttribute("domainObject", dob);

        return "home";
    }

}
