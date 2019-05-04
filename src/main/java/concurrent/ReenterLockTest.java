package main.java.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wong on 2019/5/2.
 */
public class ReenterLockTest {
    static ReentrantLock lock = new ReentrantLock();

    public static void test1() {//ok
        lock.lock();
        lock.lock();
        System.out.println("hhhhh");
        lock.unlock();
        lock.unlock();
    }

    public static void test2() {//
        lock.lock();
        lock.lock();
        System.out.println("hhhhh");
        lock.unlock();//卡死
    }

    public static void test3() {
        lock.lock();
        System.out.println("dddd");
        lock.unlock();//IllegalMonitorStateException
        lock.unlock();
    }

    public static void main(String[] args) {
        test3();
    }
}
