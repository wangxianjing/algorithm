package main.design.creational.protoType;

/**
 * Created by wong on 2019/4/8.
 */
public class Rectangle extends Shape{
    @Override
    protected void draw() {
        System.out.println("Draw a rectangle");
    }



    public Rectangle() {
        type = "Rectangle";
    }
}
