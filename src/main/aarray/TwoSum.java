package main.aarray;

import java.util.HashMap;
import java.util.Map;

/**
 * 从一个数组里找到两个数字的下标，使两个对应在数组里的值为目标值target
 * <p>
 * Created by wong on 18/6/25.
 */
public class TwoSum {

    public static int[] resolve(int[] a, int target) {
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int aim = target - a[i];
            if (map.containsKey(aim)) {
                res[0] = map.get(aim) + 1;
                res[1] = i + 1;
                break;
            } else {
                map.put(a[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 5;
        a[2] = 1;
        a[3] = 7;
        a[4] = 8;
        int[] resolve = resolve(a, 5);
        System.out.println(resolve[0]);
        System.out.println(resolve[1]);
    }
}
