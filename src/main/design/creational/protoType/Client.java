package main.design.creational.protoType;

/**
 * 要点：实现clone方法。缓存原型实例。
 *
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape.getId() + ":" + shape.getType());
        Shape clone = (Shape) shape.clone();

        clone.setId("4");

        Shape shape1 = ShapeCache.getShape("2");
        System.out.println(shape1.getId() + ":" + shape1.getType());

        Shape shape2 = ShapeCache.getShape("3");
        System.out.println(shape2.getId() + ":" + shape2.getType());

        System.out.println(clone.getId() + ":" + clone.getType());
        shape.draw();
        shape1.draw();
        shape2.draw();
        clone.draw();
    }
}
