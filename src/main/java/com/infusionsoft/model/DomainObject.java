package com.infusionsoft.model;

import javax.annotation.Nonnull;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

public class DomainObject {

    @Nonnull
    @JsonProperty
    private String name;

    @Nonnull
    @JsonProperty
    private String location;

    @JsonProperty
    private String randomValue;

    @JsonProperty
    private DateTime renderDate;

    DomainObject(){
        this.renderDate = new DateTime();
    }

    public DomainObject(String name, String location, String randomValue){
        this.name = name;
        this.location = location;
        this.randomValue = randomValue;

        this.renderDate = new DateTime();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public DateTime getRenderDate() {
        return renderDate;
    }
}