package com.testautomation.Springbasics.dIUsingConstructor;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private final String location;

    public Address() {
        this.location = "123 Main St";
    }

    public String getAddress(){
        return location;
    }

}
