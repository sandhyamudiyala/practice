package strategy;

public class SharingContext {
    private ISharePhoto sharingContext;

   void getTypeOfPhotoSharing(String typeOfSharing){
        sharingContext.sharePhoto();
    }
     void setSharingContext(ISharePhoto sharingContext){
        this.sharingContext=sharingContext;

    }

}
