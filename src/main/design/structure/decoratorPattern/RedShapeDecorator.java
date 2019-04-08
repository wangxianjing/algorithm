package main.design.structure.decoratorPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("set red border");
    }
}
