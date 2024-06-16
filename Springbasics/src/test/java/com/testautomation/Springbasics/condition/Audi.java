package com.testautomation.Springbasics.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} > 100")
public class Audi implements Car{
    @Override
    public void run() {
        System.out.println("This is Audi. The Speed is 110 Km-ph");
    }
    
}
