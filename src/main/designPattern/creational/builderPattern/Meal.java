package main.designPattern.creational.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class Meal {
    List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public double getCost() {
        double price = 0.0;
        for (Item item : list) {
            price = price + item.price();
        }
        return price;
    }

    public void showItems() {
        for (Item item : list) {
            System.out.println(item.name() + ":" + item.pack().pack() + ":" + item.price());
        }
    }
}
