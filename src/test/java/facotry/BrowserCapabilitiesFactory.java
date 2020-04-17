package com.designpattern.facotry;


class BrowserCapabilitiesFactory implements IGetFactory{

    public  IWebDriver getBrowser(String browsername){

        if (browsername.equalsIgnoreCase("chrome")){
            return  new MyChromeWithCapabilities();
        }
        else if(browsername.equalsIgnoreCase("ie")|(browsername.equalsIgnoreCase("internet explorer")))
        {
            return new MyInternetExplorerWithCapabilities();
        }
        else if (browsername.equalsIgnoreCase("firefox")){
            return  new MyFirefoxWithCapabilities();
        }
        return null;



    }
}
