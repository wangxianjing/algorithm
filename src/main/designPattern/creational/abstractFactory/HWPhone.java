package main.designPattern.creational.abstractFactory;

/**
 * Created by wong on 2019/4/8.
 */
public class HWPhone implements Phone {

    @Override
    public void call() {
        System.out.println("HW call");
    }
}
