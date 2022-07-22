package MyImplement;

public class PackageFactory {
    public static Category createPackage(PackageType packageType){
        switch (packageType){
            case INTERNET_CARDS:return new InternetCard();
            case SOCIAL_MEDIA:return new SocialMedia();
            case WORK_AND_LEARN:return new WnL();
            default:return null;
        }
    }
}
