package decorator;

import java.util.logging.Logger;

public class DesktopPage implements IWebpage {

    private static final Logger logger=Logger.getLogger(DesktopPage.class.getName());
    private int defaultDesktopPageRank=2;

    public int pageLayout() {
        logger.info("Desktop page Layout created with default rank: "+defaultDesktopPageRank);
        return defaultDesktopPageRank;
    }
}

