package main.java.thread;

import java.util.concurrent.*;

/**
 * Created by wong on 2019/6/11.
 */
public class ScheduledTreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("********");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 2, 2, TimeUnit.SECONDS);
        ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool(3);
        scheduledExecutorService2.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("##########");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 2, 2, TimeUnit.SECONDS);
    }
//    ExecutorService executorService = new ThreadPoolExecutor()
}
