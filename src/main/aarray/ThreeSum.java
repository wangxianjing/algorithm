package main.aarray;

import java.util.HashMap;
import java.util.Map;

/**
 * https://blog.csdn.net/linmiansheng/article/details/23948475
 * Created by wong on 18/6/25.
 */
public class ThreeSum {
    public static int[] resolve(int[] a) {
        int[] res = new int[3];

        for (int i = 0; i < a.length; i++) {
            int target = 0 - a[i];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < a.length; j++) {
                int newTarget = target - a[j];
                if (map.containsKey(newTarget)) {
                    res[0] = i;
                    res[1] = j;
                    res[2] = map.get(newTarget);
                    return res;
                } else {
                    map.put(a[j], j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = -2;
        a[1] = -5;
        a[2] = 1;
        a[3] = 7;
        a[4] = 8;
        System.out.println(resolve(a)[0]);
        System.out.println(resolve(a)[1]);
        System.out.println(resolve(a)[2]);
    }
}
