package com.testautomation.Springbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experienced {

    @Autowired
    private Salary salary;

    public Salary getSalary() {
        return salary;
    }

    public void setAmount(int amount){
        this.salary.setAmount(amount);
    }
    
}
