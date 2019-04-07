package main.design.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class FactoryMi implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ProductMi();
    }
}
