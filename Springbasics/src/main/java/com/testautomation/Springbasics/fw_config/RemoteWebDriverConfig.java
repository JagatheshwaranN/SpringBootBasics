package com.testautomation.Springbasics.fw_config;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

import java.net.URL;
import java.time.Duration;

@Lazy
@Configuration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @Autowired
    private DesiredCapabilities desiredCapabilities;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefoxDriver() {
        desiredCapabilities.setPlatform(Platform.ANY);
        desiredCapabilities.setBrowserName("Firefox");
        return new RemoteWebDriver(this.url, desiredCapabilities);
    }

    @Bean
    @ConditionalOnMissingBean
    public WebDriver remoteChromeDriver() {
        desiredCapabilities.setPlatform(Platform.ANY);
        desiredCapabilities.setBrowserName("Chrome");
        return new RemoteWebDriver(this.url, desiredCapabilities);
    }

}
