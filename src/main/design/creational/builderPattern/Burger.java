package main.design.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public abstract class Burger implements Item {
    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
