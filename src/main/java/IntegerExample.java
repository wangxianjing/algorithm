package main.java;

/**
 * Created by wong on 2019/1/16.
 */
public class IntegerExample {

    /**
     * 0-127都是用了享元，同一片内存。
     */
    private static void testValueof() {
        Integer a1 = 127;
        Integer a2 = 127;
        System.out.println(a1 == a2);
        Integer a3 = 129;
        Integer a4 = 129;
        System.out.println(a3 == a4);
    }

    public static void main(String[] args) {


    }
}
