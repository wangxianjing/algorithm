package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 3.5;
    }
}
