package main.designPattern.structure.flyWeight;

/**
 * 要点：目的是减少对象创建，减少内存。
 * 场景：系统有大量相似对象；需要缓冲池的场景
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Circle red = ShapeFactory.getCIrcle("RED");
        red.setX(3);
        red.setY(5);
        red.setRadius(7);

        Circle blue = ShapeFactory.getCIrcle("BLUE");
        blue.setX(6);
        blue.setY(4);
        blue.setRadius(8);

        red.draw();
        blue.draw();
    }
}
