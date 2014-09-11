package com.infusionsoft.config;

import com.infusionsoft.pancakes.autoconfigured.InfusionsoftApplication;
import com.infusionsoft.pancakes.autoconfigured.SimpleInfusionsoftApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 */
@Configuration
public class InfusionsoftApplicationConfiguration {

    private static final String APP_NAME = "Bananarama".replaceAll(" ", "-").replaceAll("\\.", "-").replaceAll("'", "").replaceAll("\"", "").replaceAll("\\?", "");

    @Bean
    public InfusionsoftApplication infusionsoftApplication() {
        return new SimpleInfusionsoftApplication(APP_NAME);
    }
}
