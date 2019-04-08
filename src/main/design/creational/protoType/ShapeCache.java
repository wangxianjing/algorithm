package main.design.creational.protoType;

import java.util.HashMap;

/**
 * Created by wong on 2019/4/8.
 */
public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        Shape clone = (Shape) rectangle.clone();
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Circle circle = new Circle();
        circle.setId("3");
        shapeMap.put(circle.getId(), circle);
    }
}
