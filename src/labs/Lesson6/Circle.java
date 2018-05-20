package labs.Lesson6;

public class Circle extends Shape {

    int x,y,z;

    public Circle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String draw() {
        return "circle";
    }
}
