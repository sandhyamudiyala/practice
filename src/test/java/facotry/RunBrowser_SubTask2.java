package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class RunBrowser_SubTask2 {
    private static final Logger logger = Logger.getLogger(RunBrowser_SubTask2.class.getName());

    public static void main(String[] args) {

        IGetFactory getFactory = new BrowserFactory();
        IWebDriver mybrowser = getFactory.getBrowser("chrome");
        WebDriver driver = mybrowser.getDriver();
        driver.close();
        logger.info("chrome browser is closed");


        IGetFactory getCapabilitiesFactory = new BrowserCapabilitiesFactory();
        IWebDriver mybrowser1 = getCapabilitiesFactory.getBrowser("chrome");
        WebDriver driver1 = mybrowser1.getDriver();
        driver1.close();
        logger.info("chrome browser  with capabilities is closed");
    }
}

