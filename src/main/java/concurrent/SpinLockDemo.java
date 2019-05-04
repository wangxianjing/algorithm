package main.java.concurrent;

import java.util.SimpleTimeZone;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by wong on 2019/5/2.
 */
public class SpinLockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " lock ,come in");
        while (!atomicReference.compareAndSet(null, thread)) {

        }
    }

    public void unMylock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "unlock");
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(()->{
            spinLockDemo.myLock();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.unMylock();
        },"t1").start();

        new Thread(()->{
            spinLockDemo.myLock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.unMylock();
        },"t2").start();

    }
}
