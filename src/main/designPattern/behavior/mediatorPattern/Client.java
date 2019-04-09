package main.designPattern.behavior.mediatorPattern;

/**
 * 适用场景：多个类耦合，行成网状结构。用一个中介对象来封装不同对象之间的交互。使得对象之间不需要显示地引用。
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        User wang = new User("wang jing");
        User liu = new User("liu");
        wang.speak("hello liu");
        liu.speak("hi wang jing");
    }
}
