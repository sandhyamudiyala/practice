package strategy;

public class RunPhoneCameraApp {
    public static void main(String[] args) {
        ICamera basicCamApp=new BasicCamApp();
        basicCamApp.takePhoto();
        basicCamApp.savePhoto();
        basicCamApp.editPhoto();

        ICamera camPlusApp=new CamPlusApp();
        camPlusApp.takePhoto();
        camPlusApp.savePhoto();
        camPlusApp.editPhoto();

        SharingContext sharingContext=new SharingContext();
        sharingContext.setSharingContext(new SharePhotoByEmail());
        sharingContext.getTypeOfPhotoSharing("Email");

        sharingContext.setSharingContext(new SharePhotoByText());
        sharingContext.getTypeOfPhotoSharing("SMS");

        sharingContext.setSharingContext(new SharePhotoBySocialMedia());
        sharingContext.getTypeOfPhotoSharing("SocialMedia");


    }
}
