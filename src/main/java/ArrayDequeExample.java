package main.java;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by wong on 2019/2/3.
 */
public class ArrayDequeExample {

    public static void test(){

        System.out.println((0 - 1) & (16 - 1));
        ArrayDeque1 arrayDeque = new ArrayDeque1();

        System.out.println(arrayDeque.tail);
        System.out.println(arrayDeque.head);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(5);
        System.out.println(arrayDeque.tail);
        System.out.println(arrayDeque.head);
        System.out.println(arrayDeque.size());
    }

    public static void main(String[] args) {
        test();
    }
}
