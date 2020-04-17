package com.designpattern.facotry;


 class BrowserFactory implements IGetFactory{

    public IWebDriver getBrowser(String browsername){

        if( browsername.equalsIgnoreCase("chrome"))
        {

            return new MyChrome();
        }
        else if(browsername.equalsIgnoreCase("ie")|(browsername.equalsIgnoreCase("internet explorer")))
    {
            return new MyInternetExplorer();
        }
        else if (browsername.equalsIgnoreCase("firefox")){
            return  new MyFirefox();
        }

        return null;

    }
}
