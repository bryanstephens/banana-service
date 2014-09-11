package com.infusionsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.infusionsoft", "com.infusionsoft"})
@EnableAutoConfiguration
public class InfusionsoftWebServiceApplication {

    public static void main( String[] args )
    {
        SpringApplication.run(InfusionsoftWebServiceApplication.class, args);
    }

}