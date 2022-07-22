public class Shape {
    String name;

    public Shape(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
