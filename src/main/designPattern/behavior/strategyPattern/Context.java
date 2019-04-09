package main.designPattern.behavior.strategyPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class Context {
    private int num1;
    private int num2;
    private Strategy strategy;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation() {
        return strategy.doOperation(num1, num2);
    }
}
