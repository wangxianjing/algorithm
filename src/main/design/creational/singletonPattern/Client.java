package main.design.creational.singletonPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class Client {

    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getInstance();
        SingletonTwo singletonTwo = SingletonTwo.getInstance();
        SingletonThree singletonThree =   SingletonThree.getInstance();
        SingletonFour singletonFour = SingletonFour.getInstance();
        SingletonFive singletonFive = SingletonFive.getInstance();

        System.out.println(singletonOne);
        System.out.println(singletonTwo);
        System.out.println(singletonThree);
        System.out.println(singletonFour);
        System.out.println(singletonFive);
    }
}
