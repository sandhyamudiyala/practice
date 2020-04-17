package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

public class MyFirefox implements IWebDriver {
    private static final Logger logger = Logger.getLogger(MyFirefox.class.getName());

    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
        logger.info("Firefox Browser is about to be initiated");
        return new FirefoxDriver();
    }
}
