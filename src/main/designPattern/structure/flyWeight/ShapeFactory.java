package main.designPattern.structure.flyWeight;

import java.util.HashMap;

/**
 * Created by wong on 2019/4/8.
 */
public class ShapeFactory {
    private static HashMap<String, Shape> hashMap = new HashMap<>();

    public static Circle getCIrcle(String color) {
        Circle circle = (Circle) hashMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            hashMap.put(color, circle);
            System.out.println("create circle ,color:" + color);
        }
        return circle;
    }
}
