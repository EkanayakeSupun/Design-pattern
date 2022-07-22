package MyImplement;

public class App {
    public static void main(String[] args) {
    PackageFactory packageFactory=new PackageFactory();
        Category aPackage = packageFactory.createPackage(PackageType.SOCIAL_MEDIA);
        System.out.println(aPackage);

        Category aPackage1 = packageFactory.createPackage(PackageType.INTERNET_CARDS);
        System.out.println(aPackage1);

        Category aPackage2 = packageFactory.createPackage(PackageType.WORK_AND_LEARN);
        System.out.println(aPackage2);
    }
}
