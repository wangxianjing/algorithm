package main.designPattern.behavior.observerPattern;


/**
 * Created by wong on 2019/4/9.
 */
public class LongObserver extends Observer {


    private long value;

    public LongObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        value = subject.getValue();
        System.out.println("LongObserver update,value:" + value);
    }
}
