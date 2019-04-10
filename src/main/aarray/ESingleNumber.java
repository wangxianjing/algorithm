package main.aarray;

/**
 * 给一个数组，里面只有一个数字出现了1次，找出这个数字
 * Created by wong on 2019/4/10.
 */
public class ESingleNumber {
    public static int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a = a ^ num;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 5, 3};
        System.out.println(singleNumber(a));
    }
}
