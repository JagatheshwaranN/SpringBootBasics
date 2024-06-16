package com.testautomation.Springbasics.condition;

import com.testautomation.Springbasics.SpringTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class CarTest extends SpringTestNGTest {

    @Autowired
    private Car car;

    @Test
    public void validateCarTest() {
        this.car.run();
    }

}
