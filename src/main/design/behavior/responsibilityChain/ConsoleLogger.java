package main.design.behavior.responsibilityChain;

/**
 * Created by wong on 2019/4/9.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("console log:" + message);
    }
}
