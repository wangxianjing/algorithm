package main.designPattern.behavior.commondPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/9.
 */
public class Broker {
    private List<Order> list = new ArrayList<>();

    public void takeOrder(Order order) {
        list.add(order);
    }

    public void placeOrder() {
        for (Order order : list) {
            order.execute();
        }
        list.clear();
    }
}
