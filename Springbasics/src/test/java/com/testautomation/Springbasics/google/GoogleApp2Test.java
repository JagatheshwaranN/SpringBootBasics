package com.testautomation.Springbasics.google;

import com.testautomation.Springbasics.SpringTestNGTest;
import com.testautomation.Springbasics.fw_page.google.GooglePage;
import com.testautomation.Springbasics.fw_util.ScreenCapture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleApp2Test extends SpringTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenCapture screenCapture;

    @Test
    public void validateGoogleTest() {
        this.googlePage.launch();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearch().search("Selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getResultCount() > 10);
        this.screenCapture.captureScreenshot("google_app_test.png");
    }

}
