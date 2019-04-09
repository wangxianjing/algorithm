package main.designPattern.behavior.commondPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class StockSell implements Order {
    private Stock stock;

    public StockSell(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock();
    }
}
