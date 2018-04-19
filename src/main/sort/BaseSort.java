package main.sort;

import java.util.List;

public abstract class  BaseSort {
    public static int[] data = {3,5,11,2,4,10,8,9,7,6,20,1,18,1,19,14,13,15,12,17,16,12};
    public static void print(){
        int length = data.length;
        for (int i = 0; i<length;i ++) {
            System.out.println(data[i]);
        }
    }
}
