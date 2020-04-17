package strategy;

import java.util.logging.Logger;

public class CamPlusApp implements ICamera {
    private static final Logger logger=Logger.getLogger(CamPlusApp.class.getName());

    public void  takePhoto(){
        logger.info("Camera Plus has taken Photo");
    }
    public void savePhoto(){
        logger.info("Camera Plus has Saved Photo");
    }

    public  void editPhoto(){
        logger.info("Customized Edited from Camera Plus");
    }
}
