package main.design.behavior.responsibilityChain;

/**
 * Created by wong on 2019/4/9.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Error log:" + message);
    }
}
