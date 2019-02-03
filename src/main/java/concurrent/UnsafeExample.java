package main.java.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wong on 2019/1/28.
 */
public class UnsafeExample {
     private static final sun.misc.Unsafe U;

    static {
        U = sun.misc.Unsafe.getUnsafe();
        Class<?> k = UnsafeExample.class;
    }

    public static void test() {
        Class<?> k = UnsafeExample.class;

        int i = 0;
        boolean a = U.compareAndSwapInt(k, 545454l, i, 1);
        boolean b = U.compareAndSwapInt(k,545454l, i, 1);
        System.out.println(a);
        System.out.println(b);


    }

    public static void main(String[] args) {
        test();
    }
}
