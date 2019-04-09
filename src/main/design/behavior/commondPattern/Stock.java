package main.design.behavior.commondPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class Stock {
    private String name;
    private double prize;

    public Stock(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    public void buyStock() {
        System.out.println("buy stock name:" + name + ",price:" + prize);
    }

    public void sellStock() {
        System.out.println("sell stock name:" + name + ",price:" + prize);
    }
}
