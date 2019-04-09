package main.designPattern.structure.facadePattern;

/**
 * 为复杂的子系统或者模块提供界面访问的模块，子系统之间耦合性小
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
