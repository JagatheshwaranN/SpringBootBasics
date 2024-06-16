package com.testautomation.Springbasics.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DriverFactory {

    protected WebDriver driver = null;

    @Value("${browser}")
    private String browser;

    @Bean
    public WebDriver getChromeDriver() {

        if("chrome".equalsIgnoreCase(browser)){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
         return driver;
    }

}
