package main.designPattern.creational.singletonPattern;

/**
 * 线程安全的饿汉模式
 * Created by wong on 2019/4/8.
 */
public class SingletonThree extends FatherInterface{
    private static SingletonThree instance = new SingletonThree();

    private SingletonThree() {
        name = this.getClass().getName();
    }

    public static SingletonThree getInstance() {
        return instance;
    }

}
