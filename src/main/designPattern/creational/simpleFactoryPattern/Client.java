package main.designPattern.creational.simpleFactoryPattern;

/**
 *
 * 简单工厂，违背开闭原则
 *
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryImpl();
        Product a = factory.getProduct("A");
        Product b = factory.getProduct("B");
        a.doSomething();
        b.doSomething();
    }
}
