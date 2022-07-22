package MyImplement;

import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    protected List<Package> aPackages =new ArrayList<>();
    public Category(){
        createPackage();
    }
    protected abstract void createPackage();


}
