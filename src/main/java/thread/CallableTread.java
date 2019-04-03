package main.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by wong on 2019/4/3.
 */
public class CallableTread implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return 100;
    }

    public static void main(String[] args) {
        CallableTread ct = new CallableTread();
        FutureTask<Integer> ft = new FutureTask<>(ct);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            new Thread(ft,"线程1").start();
            new Thread(ft,"线程2").start();
        }
    }
}
