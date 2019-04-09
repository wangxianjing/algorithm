package main.design.behavior.commondPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class Client {

    public static void main(String[] args) {
        Stock stock = new Stock("jdf", 3.88);
        Broker broker = new Broker();
        broker.takeOrder(new StockBuy(stock));
        broker.takeOrder(new StockSell(stock));

        broker.placeOrder();
    }
}
