package main.java.thread;

/**
 * Created by wong on 2019/4/3.
 */
public class ThreadSubClass extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++)
            System.out.println(getName() + " " + i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 20) {
                ThreadSubClass threadSubClass = new ThreadSubClass();
                threadSubClass.start();
                try {
                    threadSubClass.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new ThreadSubClass().start();
            }
        }
    }


}
