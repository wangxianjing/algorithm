package main.design.structure.bridgePattern;

/**
 * Created by wong on 2019/4/8.
 */
public class Circle extends Shape {
    int x, y, r;

    public Circle(DrawAPI drawAPI, int x, int y, int r) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        this.drawAPI.draw(x, y, r);
    }
}
