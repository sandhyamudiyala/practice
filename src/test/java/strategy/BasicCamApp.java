package strategy;

import java.util.logging.Logger;

public class BasicCamApp implements ICamera{
    private static final Logger logger=Logger.getLogger(BasicCamApp.class.getName());

    public void  takePhoto(){
        logger.info("Basic Camera has taken Photo");
    }
    public void savePhoto(){
        logger.info("Basic Camera has Saved Photo");
    }
    public  void editPhoto(){
        logger.info("Customized Edit from Basic Camera");
    }

}
