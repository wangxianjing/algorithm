package main.designPattern.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class FactoryMi implements AbstractFactory {

    @Override
    public Phone getPhone() {
        return new MiPhone();
    }

    @Override
    public Paid getPaid() {
        return new MiPaid();
    }
}
