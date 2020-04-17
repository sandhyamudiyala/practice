package com.designpattern.facotry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;

public class MyChrome implements IWebDriver {

    private static final Logger logger = Logger.getLogger(MyChrome.class.getName());

    public WebDriver getDriver(){

        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
        logger.info("Chrome Browser is about to be initiated");
        return new ChromeDriver();




    }

}
