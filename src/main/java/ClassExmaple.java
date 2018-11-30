package main.java;

/**
 * Created by wong on 2018/11/30.
 */
public class ClassExmaple {


    public static void main(String[] args) {
        AClass a = new AClass("wong",26);
        AClass.testPassValue(a);
        System.out.println(a.age);
     }

}
