package main.design.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class ProductMi implements AbstractProduct {
    @Override
    public void doSomething() {
        System.out.println("这是小米手机，性价比高");
    }
}
