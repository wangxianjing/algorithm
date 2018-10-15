package main.aarray;

/**
 * 一个乱序数组中，数值为0，，，N中，只缺少一个，找到那个缺少的数。要求：1、线性时间复杂度；2、有限个空间复杂度
 * <p>
 * Created by wong on 2018/10/15.
 */
public class EMissingNumber {

    public static int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = length * (length + 1) / 2;

        int count = 0;
        for (int i = 0; i < length; i++) {
            count += nums[i];
        }
        return sum - count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(a));
    }

}
