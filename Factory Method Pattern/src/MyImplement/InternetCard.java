package MyImplement;

public class InternetCard extends Category{
    @Override
    protected void createPackage() {
        aPackages.add(new PackageCard99());
        aPackages.add(new PackageCard49());
    }
    @Override
    public String toString() {
        return PackageType.INTERNET_CARDS+"{" +
                "packages=" + aPackages +
                '}';
    }
}
