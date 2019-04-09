package main.designPattern.creational.factoryPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class FactoryImpl implements Factory {
    @Override
    public Product getProduct(String name) {
        if ("A".equals(name)) {
            return new ProductA();
        } else if ("B".equals(name)) {
            return new ProductB();
        }
        return null;
    }
}
