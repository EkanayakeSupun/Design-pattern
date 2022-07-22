public class Demo {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        PaintPad paintPad=new PaintPad();

        paintPad.addShape(new Shape("Line"));
        careTaker.save(paintPad);
        System.out.println(paintPad);

        paintPad.addShape(new Shape("Squire"));
        careTaker.save(paintPad);
        System.out.println(paintPad);

        paintPad.addShape(new Shape("Circle"));
//        careTaker.save(paintPad);
        System.out.println(paintPad);

        careTaker.revert(paintPad);
        System.out.println(paintPad);

        careTaker.revert(paintPad);
        System.out.println(paintPad);

        careTaker.revert(paintPad);
        System.out.println(paintPad);


    }
}
