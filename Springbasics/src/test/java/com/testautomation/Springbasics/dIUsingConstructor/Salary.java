package com.testautomation.Springbasics.dIUsingConstructor;

import org.springframework.stereotype.Component;

@Component
public class Salary {

    private final int amount;

    public Salary(){
        this.amount = 100000;
    }

    public int getSalary() {
        return amount;
    }
}
