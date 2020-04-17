package decorator;

import java.util.logging.Logger;

public class HeaderWidget extends WidgetDecorator {

    private static final Logger logger=Logger.getLogger(HeaderWidget.class.getName());
    public HeaderWidget(IWebpage widgetDecorator){

        super(widgetDecorator);
    }

    private int headerWidgetRank=2;


    public int pageLayout() {
        logger.info("Header Widget added with Rank: "+headerWidgetRank);

        return widgetDecorator.pageLayout() + addWidgetRank();
    }
    private int addWidgetRank(){
        return headerWidgetRank;
    }
}
