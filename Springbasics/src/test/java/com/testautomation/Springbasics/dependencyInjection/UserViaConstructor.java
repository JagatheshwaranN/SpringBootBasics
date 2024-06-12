package com.testautomation.Springbasics.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class UserViaConstructor {

    private Address address;

    private Salary salary;

    public UserViaConstructor(Address address, Salary salary){
        this.address = address;
        this.salary = salary;
    }

    public void printUserDetails() {
        System.out.println(address.getAddress());
        System.out.println(salary.getSalary());
    }
}
