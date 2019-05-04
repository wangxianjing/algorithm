package main.java.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by wong on 2019/5/2.
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙");
        });

        for (int i = 1; i <=7 ; i++) {
            final int tempInt =i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " 收集到第 " + tempInt + " 龙珠");
                try {
                    try {
                        cyclicBarrier.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
