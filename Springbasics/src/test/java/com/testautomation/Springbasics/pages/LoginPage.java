package com.testautomation.Springbasics.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {

    @Value("${app.url}")
    private String appURL;

    @Autowired
    private WebDriver webDriver;

    @FindBy(how = How.ID, id = "Email")
    private WebElement email;

    @FindBy(how = How.ID, id="Password")
    private WebElement password;

    @FindBy(how = How.XPATH, xpath = "//button[text()='Log in']")
    private WebElement login;


    public void doLogin(){
        webDriver.navigate().to(appURL);
    }
}
