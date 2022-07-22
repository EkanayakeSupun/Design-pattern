package MyImplement;

public class SocialMedia extends Category{
    @Override
    protected void createPackage() {
    aPackages.add(new FbWhatsApp());
    aPackages.add(new FunBlaster());
    aPackages.add(new Youtube());
    }
    @Override
    public String toString() {
        return PackageType.SOCIAL_MEDIA+"{" +
                "packages=" + aPackages +
                '}';
    }
}
