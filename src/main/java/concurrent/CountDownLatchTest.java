package main.java.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wong on 2019/4/30.
 */
public class CountDownLatchTest {
    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行线程1");
                countDownLatch.countDown();
            };
        }.start();
        new Thread() {
            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行线程2");
                countDownLatch.countDown();
            };
        }.start();
        countDownLatch.await();
        System.out.println("执行线程3");
    }
}
