package strategy;

import java.util.logging.Logger;

public class SharePhotoByText implements ISharePhoto {
    private static final Logger logger=Logger.getLogger(SharePhotoByEmail.class.getName());

    public void sharePhoto(){
        logger.info("Photo is shared via Text");
    }
}
