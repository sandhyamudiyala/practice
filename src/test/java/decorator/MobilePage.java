package decorator;

import java.util.logging.Logger;

public class MobilePage implements IWebpage {

    private static final Logger logger=Logger.getLogger(MobilePage.class.getName());
    private int defaultMobilePageRank=1;
    public int pageLayout() {
        logger.info("MobilePage Layout created with default rank: "+defaultMobilePageRank);
        return defaultMobilePageRank;
    }
}
