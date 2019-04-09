package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public interface Item {
    String name();

    Packing pack();

    double price();
}
