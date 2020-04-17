package decorator;

import java.util.logging.Logger;

public class AdvertisementWidget extends WidgetDecorator {

    private static final Logger logger=Logger.getLogger(AdvertisementWidget.class.getName());

    public AdvertisementWidget(IWebpage widgetDecorator){

        super(widgetDecorator);
    }
    private int advertisementWidgetRank=8;

    public int pageLayout(){
        logger.info("Advertisement Widget added with rank: "+advertisementWidgetRank);
        return widgetDecorator.pageLayout()+ addWidgetRank();
    }
    private int addWidgetRank(){
        return advertisementWidgetRank;
    }
}
