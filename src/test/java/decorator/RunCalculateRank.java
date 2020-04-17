package decorator;

import java.util.logging.Logger;

public class RunCalculateRank {
    private static final Logger logger=Logger.getLogger(RunCalculateRank.class.getName());

    public static void main(String[] args) {
        IWebpage mobilePage=new HeaderWidget(new FooterWidget(new BodyWidget(new AdvertisementWidget(new MobilePage()))));
        logger.info("Mobile Page Rank with all Widgets added is: "+mobilePage.pageLayout());

        IWebpage desktopPage=new HeaderWidget(new FooterWidget(new BodyWidget(new AdvertisementWidget(new DesktopPage()))));
        logger.info("Desktop Page Rank with all Widgets added is: "+desktopPage.pageLayout());


    }

}

