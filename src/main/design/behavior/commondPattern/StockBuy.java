package main.design.behavior.commondPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class StockBuy implements Order {
    private Stock stock;

    public StockBuy(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buyStock();
    }
}
