package com.testautomation.Springbasics.fw_config;

import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

//@Lazy
@Configuration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    private String url;

    @Autowired
    //private DesiredCapabilities desiredCapabilities;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefoxDriver() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANY);
        desiredCapabilities.setBrowserName("Firefox");
        FirefoxOptions options = new FirefoxOptions();
        // #14125 - Selenium 4.21.0 version bug - Unable to launch session with Grid without below parameter
        options.setEnableDownloads(true);
        options.merge(desiredCapabilities);
        try {
            return new RemoteWebDriver(URI.create(url).toURL(), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    //@ConditionalOnMissingBean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver remoteChromeDriver() throws MalformedURLException {
//        desiredCapabilities.setPlatform(Platform.ANY);
//        desiredCapabilities.setBrowserName("Chrome");
//        ChromeOptions options = new ChromeOptions();
//        // #14125 - Selenium 4.21.0 version bug - Unable to launch session with Grid without below parameter
//        options.setEnableDownloads(true);
//        options.merge(desiredCapabilities);

//        System.setProperty("otel.traces.exporter", "jaeger");
//        System.setProperty("otel.exporter.jaeger.endpoint", "http://localhost:14250");
//        System.setProperty("otel.resource.attributes", "service.name=selenium-java-client");
       // ImmutableCapabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setEnableDownloads(true);
//        chromeOptions.setCapability("browserVersion", "125.0.6422.142");
//        chromeOptions.setCapability("platformName", "Windows");
// Showing a test name instead of the session id in the Grid UI
//        chromeOptions.setCapability("se:name", "My simple test");

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setBrowserName("Chrome");
        ChromeOptions chromeOptions = new ChromeOptions();
        // Selenium 4.21.0 version bug - Unable to launch session with Grid without below parameter
        chromeOptions.setEnableDownloads(true);
        chromeOptions.merge(capabilities);

        return new RemoteWebDriver(URI.create("http://localhost:4444").toURL(), capabilities);
    }

}
