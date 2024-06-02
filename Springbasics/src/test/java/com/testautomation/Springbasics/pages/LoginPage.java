package com.testautomation.Springbasics.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {

    @Value("${app.url}")
    private String appURL;

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void initLoginPage(){
        PageFactory.initElements(webDriver, this);
    }

    @Value("${user.email}")
    private String userEmail;

    @Value("${user.passcode}")
    private String userPasscode;

    @FindBy(how = How.ID, id = "Email")
    private WebElement email;

    @FindBy(how = How.ID, id="Password")
    private WebElement password;

    @FindBy(how = How.XPATH, xpath = "//button[text()='Log in']")
    private WebElement login;


    public void doLogin() {
        webDriver.navigate().to(appURL);
        email.clear();
        email.sendKeys(userEmail);
        password.clear();
        password.sendKeys(userPasscode);
        login.click();
    }

}
