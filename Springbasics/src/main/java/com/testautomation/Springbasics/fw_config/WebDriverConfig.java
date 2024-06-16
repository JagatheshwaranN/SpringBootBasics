package com.testautomation.Springbasics.fw_config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    public WebDriver chromeDriver() {
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}