import java.util.ArrayList;

public class Memento{
    ArrayList<Shape> shapes;
    public Memento(ArrayList<Shape> shapes){
        this.shapes=shapes;
    }

    public ArrayList<Shape> getShapes(){
        return shapes;
    }

}