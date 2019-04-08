package main.design.creational.singletonPattern;

/**
 * 内部类模式，懒汉模式
 * Created by wong on 2019/4/8.
 */
public class SingletonFive extends FatherInterface {

    private SingletonFive() {
        name = this.getClass().getName();
    }

    private static class SingletonFiveHolder {
        private static final SingletonFive INSTANCE = new SingletonFive();
    }

    public static final SingletonFive getInstance() {
        return SingletonFiveHolder.INSTANCE;
    }
}
