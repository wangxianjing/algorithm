package main.designPattern.behavior.strategyPattern;

/**
 * 要点：定义一系列的算法，封装起来，随时可以替换。
 * <p>
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(3, 6);
        Strategy addStrategy = new AddStrategy();
        Strategy multySrategy = new MultySrategy();

        context.setStrategy(addStrategy);
        System.out.println(context.executeOperation());

        context.setStrategy(multySrategy);
        System.out.println(context.executeOperation());
    }
}
