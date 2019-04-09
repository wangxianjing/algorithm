package main.designPattern.creational.singletonPattern;

/**
 * 线程不安全的懒汉模式
 *
 * Created by wong on 2019/4/8.
 */
public class SingletonOne extends FatherInterface{
    private static SingletonOne instance;

    private SingletonOne() {
        name = this.getClass().getName();
    }

    public static SingletonOne getInstance() {
        if (instance == null) {
            instance = new SingletonOne();
        }
        return instance;
    }
}
