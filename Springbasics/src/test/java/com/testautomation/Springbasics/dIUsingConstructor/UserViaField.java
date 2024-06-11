package com.testautomation.Springbasics.dIUsingConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserViaField {

    @Autowired
    private Address address;

    @Autowired
    private Salary salary;

    public void printUserDetails() {
        System.out.println(address.getAddress());
        System.out.println(salary.getSalary());
    }

}
