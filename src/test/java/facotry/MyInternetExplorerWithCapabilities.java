package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.logging.Logger;

public class MyInternetExplorerWithCapabilities implements IWebDriver {
    private static final Logger logger = Logger.getLogger(MyChrome.class.getName());

    public WebDriver getDriver(){

        System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\IEDriverServer.exe");
        InternetExplorerOptions option = new InternetExplorerOptions();
        String ieversion=option.getVersion();
        logger.info("Internet Explorer Browser with capabilities is about to be initiated");
        logger.info("IE version is: "+ieversion );
        return new InternetExplorerDriver();

    }
}
