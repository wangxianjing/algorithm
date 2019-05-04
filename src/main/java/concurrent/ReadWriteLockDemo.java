package main.java.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//缓存三大要素，读，写，清空
class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void put(String key, Object value) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " 正在写入: " + key);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + " 写入完成: " + key);
        } finally {
            lock.writeLock().unlock();
        }

    }

    public Object get(String key) {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " 正在读出: " );
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Object o = map.get(key);
            System.out.println(Thread.currentThread().getName() + " 读出完成该: " + key);
            return o;
        } finally {
            lock.readLock().lock();
            return null;
        }

    }
}

/**
 * Created by wong on 2019/5/2.
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        testNoLockCondition();

    }

    private static void testNoLockCondition() {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 6; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.put(tempInt + "", tempInt + "");
            },String.valueOf(i)).start();
        }

        for (int i = 0; i < 6; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCache.get(tempInt + "");
             },String.valueOf(i)).start();
        }
    }
}
