package com.testautomation.Springbasics.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class UserViaConstructor {

    private Address address;

    private Salary salary;

    private Mobile mobile;

    public UserViaConstructor(Address address, Salary salary, Mobile mobile){
        this.address = address;
        this.salary = salary;
        this.mobile = mobile;
    }

    public void printUserDetails() {
        System.out.println(address.getAddress());
        System.out.println(salary.getSalary());
        System.out.println(mobile.getPhone());
    }
}
