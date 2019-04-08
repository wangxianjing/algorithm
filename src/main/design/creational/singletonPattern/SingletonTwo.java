package main.design.creational.singletonPattern;

/**
 * 线程安全的懒汉试
 * Created by wong on 2019/4/8.
 */
public class SingletonTwo extends FatherInterface {
    private static SingletonTwo instance;

    private SingletonTwo() {
        name = this.getClass().getName();
    }

    public static synchronized SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
