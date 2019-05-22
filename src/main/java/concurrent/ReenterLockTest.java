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


    public static void testWithoutInterruptibly() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("testWithoutInterruptibly thread1 .....");
                lock.lock();
                 try {
                    Thread.currentThread().sleep(5000);
                    System.out.println("testWithoutInterruptibly thread1 success .....");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("testWithoutInterruptibly " + Thread.currentThread().getName() + "....");
                lock.lock();
//                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + "#########");
            }
        }, "thread2");
        thread2.start();
        thread2.interrupt();
         while (true) {
            System.out.println("thread 1 is Interrupted:"+thread1.isInterrupted());
//            System.out.println("thread 1 is alive:" + thread1.isAlive());
//            System.out.println("thread 2 is Interrupted:"+thread2.isInterrupted());
//            System.out.println("thread 2 is alive:" + thread2.isAlive());
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void testLockInterruptibly() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 ~~~~~~~~");
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "exception");
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "~~~~~~~");
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + ":exception");
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "#########");
            }
        }, "thread2");
        thread2.start();
        thread2.interrupt();
    }

    public static void testTryLock() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 tryLock");
                lock.tryLock();

                try {
                    Thread.sleep(2000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "tryLock");
                boolean b = lock.tryLock();
                System.out.println(Thread.currentThread().getName() + "tryLock " + b);
            }
        }, "thread2");
        thread2.start();
    }

    public static void main(String[] args) {
        testWithoutInterruptibly();
//    testLockInterruptibly();
    }
}
