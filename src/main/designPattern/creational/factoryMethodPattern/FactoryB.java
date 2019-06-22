package main.designPattern.creational.factoryMethodPattern;

import main.designPattern.creational.simpleFactoryPattern.Product;
import main.designPattern.creational.simpleFactoryPattern.ProductB;

/**
 * Created by wong on 2019/6/20.
 */
public class FactoryB implements Factory {
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
