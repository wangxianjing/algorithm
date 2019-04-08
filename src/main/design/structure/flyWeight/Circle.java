package main.design.structure.flyWeight;

/**
 * Created by wong on 2019/4/8.
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("draw circle x:" + x + ",y:" + y + ",r:" + radius + ",color:" + color);
    }

}
