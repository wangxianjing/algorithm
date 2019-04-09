package main.designPattern.creational.singletonPattern;

/**
 * 双重校验的懒汉模式
 * Created by wong on 2019/4/8.
 */
public class SingletonFour extends FatherInterface {

    private static volatile SingletonFour instance;

    private SingletonFour() {
        name = this.getClass().getName();
    }

    public static SingletonFour getInstance() {
        if (instance == null) {
            synchronized (SingletonFour.class) {
                if (instance == null) {
                    instance = new SingletonFour();
                }
            }
        }
        return instance;
    }
}
