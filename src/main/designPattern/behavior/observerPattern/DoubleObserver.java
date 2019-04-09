package main.designPattern.behavior.observerPattern;

/**
 * Created by wong on 2019/4/9.
 */
public class DoubleObserver extends Observer {
    private double value;

    public DoubleObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        value = subject.getValue();
        System.out.println("DoubleObserver update, value:" + value);
    }
}
