package main.designPattern.behavior.commondPattern;

/**
 * 股票买卖，封装命令，和实体
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
