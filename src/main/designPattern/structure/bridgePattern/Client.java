package main.designPattern.structure.bridgePattern;

/**
 * 目的是将抽象部分和实现部分分离，具体例子中是画图的抽象和实现分离，对于两个独立变化的纬度很适合。处理继承不好处理的问题。
 * <p>
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedCircle(), 1, 2, 4);
        Circle greenCircle = new Circle(new GreenCircle(), 1, 2, 4);
        redCircle.draw();
        greenCircle.draw();
    }
}
