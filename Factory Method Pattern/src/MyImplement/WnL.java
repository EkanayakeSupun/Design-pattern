package MyImplement;

public class WnL extends Category{
    @Override
    protected void createPackage() {
        aPackages.add(new WorkNLearn4G());
        aPackages.add(new VideoCinferencing());
    }
    @Override
    public String toString() {
        return PackageType.WORK_AND_LEARN+"{" +
                "packages=" + aPackages +
                '}';
    }
}
