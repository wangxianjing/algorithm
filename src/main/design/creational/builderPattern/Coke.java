package main.design.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public double price() {
        return 2.4;
    }
}
