package main.designPattern.creational.factoryMethodPattern;

import main.designPattern.creational.simpleFactoryPattern.Product;

/**
 * 工厂方法，造成类的膨胀。
 * Created by wong on 2019/6/20.
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.getProduct();
        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.getProduct();
        productA.doSomething();
        productB.doSomething();
    }
}
