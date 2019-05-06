package main.java.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/5/6.
 */
public class Cliant {
    public static void main(String[] args) {
        List<BClass> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            BClass aClass = new BClass("a", i);
            list.add(aClass);
            System.out.println(aClass);
            if (i == 9) {
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
