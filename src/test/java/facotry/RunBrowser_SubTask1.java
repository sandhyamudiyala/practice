package com.designpattern.facotry;


import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class RunBrowser_SubTask1 {
    private static final Logger logger = Logger.getLogger(RunBrowser_SubTask1.class.getName());

    public static void main(String[] args) {


     BrowserFactory browserfactory=new BrowserFactory();
        IWebDriver mybrowser= browserfactory.getBrowser("chrome");
        WebDriver driver= mybrowser.getDriver();
        driver.close();
        logger.info("chrome browser is closed");

        IWebDriver mybrowser1=browserfactory.getBrowser("ie");
        WebDriver driver1= mybrowser1.getDriver();
        driver1.close();
        logger.info("IE browser is closed");

        IWebDriver mybrowser2=browserfactory.getBrowser("firefox");
        WebDriver driver2= mybrowser2.getDriver();
        driver2.close();
        logger.info("Firefox browser is closed");

      /*  BrowserCapabilitiesFactory browserfactory=new BrowserCapabilitiesFactory();
        IWebDriver mybrowser= browserfactory.getBrowser("chrome with capabilities");
        WebDriver driver= mybrowser.getDriver();
        driver.close();
        logger.info("chrome browser is closed");

        IWebDriver mybrowser1=browserfactory.getBrowser("internet explorer with capabilities");
        WebDriver driver1= mybrowser1.getDriver();
        driver1.close();
        logger.info("IE browser is closed");

        IWebDriver mybrowser2=browserfactory.getBrowser("firefox  with capabilities");
        WebDriver driver2= mybrowser2.getDriver();
        driver2.close();
        logger.info("Firefox browser is closed");
*/
    }
}
