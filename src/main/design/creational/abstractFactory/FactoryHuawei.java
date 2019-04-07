package main.design.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class FactoryHuawei implements AbstractFactory{

    @Override
    public AbstractProduct createProduct() {
        return  new ProductHuawei();
    }
}
