package main.java.thread;

import java.util.concurrent.*;

/**
 * Created by wong on 2019/6/11.
 */
public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<Integer> f1 = executorService.submit((new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("task1 ......");
                Thread.sleep(5000);
                System.out.println("task1 ");

                return 2;
            }
        }));
        Future<Integer> f2 = executorService.submit((new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("task2 ......");
                Thread.sleep(2000);
                System.out.println("task2 ");

                return 5;
            }
        }));

        Integer fa = f1.get();
        Integer fb = f2.get();
        System.out.println(fa+ fb);
        executorService.shutdownNow();
//        FutureTask<Integer> futureTask1 = new FutureTask<>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("task1 ......");
//                Thread.sleep(2000);
//                System.out.println("task1 ");
//
//                return 2;
//            }
//        });
//
//        FutureTask<Integer> futureTask2 = new FutureTask<>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("task2 .......");
//                Thread.sleep(3000);
//                return 1;
//            }
//        });
//        futureTask1.run();
//        System.out.println("-----------");
//        futureTask2.run();
//        Integer integer = futureTask1.get();
//        Integer integer1 = futureTask2.get();
//        System.out.println(integer+ integer1);

    }
}
