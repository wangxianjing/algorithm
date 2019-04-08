package main.design.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class FactoryHuawei implements AbstractFactory {

    @Override
    public Phone getPhone() {
        return new HWPhone();
    }

    @Override
    public Paid getPaid() {
        return new HWPai();
    }
}
