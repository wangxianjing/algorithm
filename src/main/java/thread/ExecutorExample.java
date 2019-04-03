package main.java.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by wong on 2019/4/3.
 */
public class ExecutorExample {
    public static Executor excutors = Executors.newFixedThreadPool(5);



    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " ");
            }
        };
        excutors.execute(runnable);
        excutors.execute(runnable);
        excutors.execute(runnable);
        excutors.execute(runnable);
        excutors.execute(runnable);
        excutors.execute(runnable);
        excutors.execute(runnable);
    }
}
