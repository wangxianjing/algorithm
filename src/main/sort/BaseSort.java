package main.sort;

import java.util.List;

/**
 * 数组为空的情况我们就不考虑了，后续代码中不做校验。
 */
public abstract class BaseSort {
    public static int[] data = {3, 5, 11, 2, 4, 10, 8, 9, 7, 6, 20, 1, 18, 1, 19, 14, 13, 15, 12, 17, 16, 12};
    public static int[] data2 = {0};

    public static void print() {
        int length = data.length;
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("****************************");
        ;
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);
        }
    }
}
