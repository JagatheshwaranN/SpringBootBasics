package com.testautomation.Springbasics.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void initHomePage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.CSS, css = ".content-header > h1")
    private WebElement dashboardHeader;

    public void verifyDashboard() {
        dashboardHeader.isDisplayed();
    }

}
