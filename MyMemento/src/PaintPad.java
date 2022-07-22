import java.util.ArrayList;

public class PaintPad {
    ArrayList<Shape> shapes=new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public ArrayList<Shape> getShapes(){
        return (ArrayList) shapes.clone();
    }

    public Memento save(){
        return new Memento(getShapes());
    }

    public void revert(Memento memento){
        shapes=memento.getShapes();
    }

    @Override
    public String toString() {
        return "PaintPad{" +
                "shapes=" + shapes +
                '}';
    }



}
