package main.java.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wong on 2019/1/28.
 */
public class ConcurrentHashMapExample {

    public static void test() {
//        ConcurrentHashMap' '
        int n = 16;
        int sc = n - (n >>> 2);
        System.out.println(sc);
    }

    static final int resizeStamp(int n) {
        int RESIZE_STAMP_BITS = 16;
        return Integer.numberOfLeadingZeros(n) | (1 << (RESIZE_STAMP_BITS - 1));
    }


    public static void main(String[] args) {
        System.out.println(resizeStamp(64));
        System.out.println(Integer.numberOfLeadingZeros(64));
    }
}
