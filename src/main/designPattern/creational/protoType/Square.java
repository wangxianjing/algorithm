package main.designPattern.creational.protoType;

/**
 * Created by wong on 2019/4/8.
 */
public class Square extends Shape {
    @Override
    protected void draw() {
        System.out.println("Draw a circle");
    }

    public Square() {
        type = "Square";
    }
}
