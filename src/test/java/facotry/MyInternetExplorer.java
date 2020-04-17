package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.logging.Logger;

public class MyInternetExplorer implements IWebDriver {
    private static final Logger logger = Logger.getLogger(MyInternetExplorer.class.getName());
    public WebDriver getDriver(){
        System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\IEDriverServer.exe");
        logger.info("Internet Explorer Browser is about to be initiated");
        return new InternetExplorerDriver();
    }
}
