import java.util.Timer;

public class Demo {

    public static void main(String[] args) {
        long start;
        long end;

        SriLankanPresident slPresident=SriLankanPresident.getPresident();
        start=System.currentTimeMillis();
        System.out.println("1]  "+slPresident.makeGazette());
        end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        start=System.currentTimeMillis();
        System.out.println("2]  "+slPresident.makeGazette());
        end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}

