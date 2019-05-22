package main.java.concurrent;

import java.util.concurrent.*;

/**
 * Created by wong on 2019/5/3.
 */
public class ExecutorsDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService poolService = Executors.newScheduledThreadPool(10);
        ExecutorService poolService1 = new ThreadPoolExecutor(10,20,7, TimeUnit.SECONDS,
             new LinkedBlockingQueue<Runnable>(10));

        try {
            for (int i = 0; i < 15; i++) {
                poolService.submit(()->{
                    System.out.println("pool :" + Thread.currentThread().getName());
                });

            }
        } finally {
            poolService.shutdown();
        }
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
