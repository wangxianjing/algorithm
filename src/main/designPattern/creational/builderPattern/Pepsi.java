package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 4.0;
    }
}
