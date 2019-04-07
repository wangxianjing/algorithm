package main.design.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class ProductHuawei implements AbstractProduct {
    @Override
    public void doSomething() {
        System.out.println("这是华为手机，拍照好");
    }
}
