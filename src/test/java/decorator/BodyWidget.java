package decorator;

import java.util.logging.Logger;

public class BodyWidget  extends WidgetDecorator{

    private static final Logger logger=Logger.getLogger(BodyWidget.class.getName());

    public BodyWidget(IWebpage widgetDecorator){

        super(widgetDecorator);
    }
    private int bodyWidgetRank=5;

    public int pageLayout(){
        logger.info("Body Widget added with Rank: "+bodyWidgetRank);

        return widgetDecorator.pageLayout()+ addWidgetRank();
    }
    private int addWidgetRank(){
        return bodyWidgetRank;
    }
}



