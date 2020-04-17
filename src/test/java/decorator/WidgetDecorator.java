package decorator;

import java.util.logging.Logger;

public class WidgetDecorator implements IWebpage {

    private static final Logger logger=Logger.getLogger(WidgetDecorator.class.getName());
    IWebpage widgetDecorator;

    public WidgetDecorator(IWebpage widgetDecorator){
        this.widgetDecorator=widgetDecorator;

    }

    public int pageLayout() {
        logger.info("Widget Decorator");
        return widgetDecorator.pageLayout();


    }
}
