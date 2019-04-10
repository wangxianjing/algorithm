package main.designPattern.behavior.visitorPattern;

/**
 * 目的：将稳定的数据结构和和易变的操作解耦，在被访问的类里添加一个对外的接口。
 * 关键代码：在基础数据类里面有一个方法接受访问者，将自身引用传入访问者
 * Created by wong on 2019/4/10.
 */
public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Compute();
        computer.accept(new ComputePartVisitorDisplay());
    }
}
