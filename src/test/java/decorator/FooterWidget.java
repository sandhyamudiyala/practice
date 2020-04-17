package decorator;

import java.util.logging.Logger;

public class FooterWidget extends WidgetDecorator {

    private static final Logger logger=Logger.getLogger(FooterWidget.class.getName());

    public FooterWidget(IWebpage widgetDecorator){
        super(widgetDecorator);

    }
    private int footerWidgetRank=3;

    @Override
    public int pageLayout() {
        logger.info("Footer Widget added with rank: "+footerWidgetRank);

        return widgetDecorator.pageLayout() + addWidgetRank();
    }
    private int addWidgetRank(){
        return footerWidgetRank;
    }
}

