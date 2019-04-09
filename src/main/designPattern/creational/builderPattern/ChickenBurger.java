package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 10.2;
    }
}
