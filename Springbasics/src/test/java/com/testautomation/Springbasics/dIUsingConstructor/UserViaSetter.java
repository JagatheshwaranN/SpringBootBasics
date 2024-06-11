package com.testautomation.Springbasics.dIUsingConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserViaSetter {

    private Address address;

    private Salary salary;


    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void printUserDetails() {
        System.out.println(address.getAddress());
        System.out.println(salary.getSalary());
    }

}
