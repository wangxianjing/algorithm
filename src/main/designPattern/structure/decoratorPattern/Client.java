package main.designPattern.structure.decoratorPattern;


/**
 * 要点：动态的给对象添加额外的职责，比生成子类更灵活。
 * 适用场景：扩展一个类的功能；动态添加和删除。
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        System.out.println("--------");
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
