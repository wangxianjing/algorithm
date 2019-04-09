package main.designPattern.behavior.strategyPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class MultySrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
