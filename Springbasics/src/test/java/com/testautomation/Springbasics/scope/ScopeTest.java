package com.testautomation.Springbasics.scope;

import com.testautomation.Springbasics.SpringTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class ScopeTest extends SpringTestNGTest {

//    @Autowired
//    Fresher fresher;

    @Autowired
    Experienced experienced;

    @Test
    public void scopeTest() {
        //this.fresher.setAmount(100);
        //System.out.println("Fresher Salary : "+ this.fresher.getSalary().getAmount());
        this.experienced.setAmount(200);
        System.out.println("Experienced Salary : "+ this.experienced.getSalary().getAmount());
        //System.out.println("Fresher Salary : "+ this.fresher.getSalary().getAmount());
    }
}
