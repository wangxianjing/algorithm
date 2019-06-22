package main.designPattern.creational.factoryMethodPattern;

import main.designPattern.creational.simpleFactoryPattern.Product;
import main.designPattern.creational.simpleFactoryPattern.ProductA;

/**
 * Created by wong on 2019/6/20.
 */
public class FactoryA implements Factory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
