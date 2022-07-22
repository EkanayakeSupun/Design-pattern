import java.util.ArrayList;
import java.util.Stack;

public class CareTaker {
    int count=0;
ArrayList<Memento> history=new ArrayList<>();

public void save(PaintPad paintPad){
    history.add(paintPad.save());
    count++;
}

public void revert(PaintPad paintPad){

    if(0<=(count-1)){
        count--;
        paintPad.revert(history.get((count)));
    }else{
        System.out.println("Cannot Undo");
    }


}


}
