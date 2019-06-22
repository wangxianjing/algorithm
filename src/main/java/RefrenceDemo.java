package main.java;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Created by wong on 2019/5/26.
 */
public class RefrenceDemo {

    public static void testWeakRefrence() {
        Object o1 = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o1);

        System.out.println(weakReference);
        System.out.println(weakReference.get());
        System.out.println(o1);
        System.out.println("************");
        o1 = null;
//        System.gc();
        System.out.println(weakReference);
        System.out.println(weakReference.get());
        System.out.println(o1);
    }

    public static void weakHashMap() {
        String key = new String("1)");
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(key, 1);
        System.out.println(weakHashMap.size());
        System.out.println(weakHashMap);
        key = null;
        System.gc();
        System.out.println("----------");
        System.out.println(weakHashMap);
        System.out.println(weakHashMap.size());

    }

    public static void main(String[] args) {
//        testWeakRefrence();
        weakHashMap();

    }
}
