package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class MyChromeWithCapabilities implements IWebDriver{

    private static final Logger logger = Logger.getLogger(MyChrome.class.getName());

    public WebDriver getDriver(){

        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        logger.info("Chrome Browser with capabilities is about to be initiated");
        options.addArguments("--start-maximized");
        return new ChromeDriver();




    }

}
