package com.testautomation.Springbasics.condition;

import com.testautomation.Springbasics.SpringTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

public class CarTest extends SpringTestNGTest {

    @Autowired
    @Qualifier("Audi")
    private Car car;

    @Test
    public void validateCarTest() {
        this.car.run();
    }

}
