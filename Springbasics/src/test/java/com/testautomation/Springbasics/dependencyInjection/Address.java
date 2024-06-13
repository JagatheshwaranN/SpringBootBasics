package com.testautomation.Springbasics.dependencyInjection;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${location}")
    private String location;



    public String getAddress(){
        return location;
    }




}
