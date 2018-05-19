package Lesson6;

public class Rectangle extends Shape {

    protected int x,y,x1,y1;

    public Rectangle(String color, int x, int y, int x1, int y1) {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
