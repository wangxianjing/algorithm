package main.java;

/**
 * Created by wong on 2019/5/20.
 */
public class ShutDownHook {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("end .....");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end !!!!");
            }
        }));
        System.out.println("start......");
        Thread.sleep(5000);


    }
}
