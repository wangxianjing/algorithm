package main.java.thread;

/**
 * Created by wong on 2019/4/3.
 */
public class RunnableThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i <100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i =0;i < 100;i++) {
            System.out.println(Thread.currentThread().getName()+" " + i);
            if (i == 20) {
                RunnableThread rtt = new RunnableThread();
                new Thread(rtt,"线程1").start();
                new Thread(rtt,"线程2").start();
            }
        }
    }
}
