package main.java;

/**
 * Created by wong on 2019/5/26.
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("A");
        ThreadLocal threadLocal1 = new ThreadLocal();
        threadLocal1.set(1);

        Thread thread = Thread.currentThread();
        System.out.println(threadLocal1.get());
        System.out.println(threadLocal.get());
    }
}
