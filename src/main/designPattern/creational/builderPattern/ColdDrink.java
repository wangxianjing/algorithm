package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
