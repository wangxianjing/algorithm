package main.designPattern.creational.factoryMethodPattern;

/**
 * Created by wong on 2019/6/20.
 */
public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("create ");
    }
}
