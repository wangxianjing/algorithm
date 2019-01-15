package main.java;

import main.java.InnerExample;

/**
 * Created by wong on 2018/12/31.
 */
public class InnerTest {
    public static void main(String[] args) {
        InnerExample innerExample = new InnerExample();
//        InnerExample.InnerClass innerClass = innerExample.new InnerClass();
        InnerExample.InnerClass innerClass = innerExample.getInstance();
        innerClass.addAge();
        System.out.println(innerExample.getAge());
        System.out.println(innerExample.getName());
    }
}
