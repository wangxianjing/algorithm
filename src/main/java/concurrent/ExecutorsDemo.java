package main.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wong on 2019/5/3.
 */
public class ExecutorsDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService poolService = Executors.newScheduledThreadPool(10);

        try {
            for (int i = 0; i < 15; i++) {
                poolService.submit(()->{
                    System.out.println("pool :" + Thread.currentThread().getName());
                });

            }
        } finally {

        }

    }
}
