package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.logging.Logger;

public class MyFirefoxWithCapabilities implements IWebDriver {
    private static final Logger logger = Logger.getLogger(MyFirefoxWithCapabilities.class.getName());

    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
        logger.info("Firefox Browser is about to be initiated & maximised");
        FirefoxOptions options=new FirefoxOptions();
        options.addArguments("--start-maximized");
        return new FirefoxDriver();

    }
}
