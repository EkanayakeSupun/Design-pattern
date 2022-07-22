public class SriLankanPresident {
 private static volatile SriLankanPresident president;


 private SriLankanPresident(){}

    public static  SriLankanPresident getPresident(){
     if(president==null){
         synchronized (SriLankanPresident.class){
             if(president==null){
                 president=new SriLankanPresident();
             }
         }
     }
    return president;
    }

    String makeGazette(){

        return "new Gazette()  ";
    }

    @Override
    public String toString() {
        return "SL President....";
    }
}
