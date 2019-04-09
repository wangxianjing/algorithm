package main.designPattern.structure.bridgePattern;

/**
 * Created by wong on 2019/4/8.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
