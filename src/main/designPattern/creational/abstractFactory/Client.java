package main.designPattern.creational.abstractFactory;

/**
 * Created by wong on 2019/4/3.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryHuawei();
        Paid hwPaid = factory.getPaid();
        Phone hwPhone = factory.getPhone();

        factory = new FactoryMi();
        Paid miPaid = factory.getPaid();
        Phone miPhone = factory.getPhone();

        hwPaid.watchVideo();
        miPaid.watchVideo();
        hwPhone.call();
        miPhone.call();
    }
}
