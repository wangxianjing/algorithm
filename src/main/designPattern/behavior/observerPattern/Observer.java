package main.designPattern.behavior.observerPattern;

/**
 * Created by wong on 2019/4/9.
 */
public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    abstract void update();
}
