package main.designPattern.structure.decoratorPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
