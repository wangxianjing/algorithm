package main.designPattern.behavior.observerPattern;

/**
 * 适用场景：当存在一对多的关系，一个对象改变，其它几个对象也跟着改变时。
 * <p>
 * Created by wong on 2019/4/9.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject(34);
        subject.addObserver(new LongObserver(subject));
        subject.addObserver(new DoubleObserver(subject));
        subject.setValue(33);
    }
}
