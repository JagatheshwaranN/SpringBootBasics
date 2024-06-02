package com.testautomation.Springbasics.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    @FindBy(how = How.CSS, css = ".content-header > h1")
    private WebElement dashboardHeader;

}
