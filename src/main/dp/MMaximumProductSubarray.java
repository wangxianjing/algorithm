package main.dp;

/**
 * 给定一个非负数组，求连续的子序列乘积的最大值
 * <p>
 * Created by wong on 2018/11/5.
 */
public class MMaximumProductSubarray {
    //https://leetcode.com/problems/maximum-product-subarray/discuss/48230/Possibly-simplest-solution-with-O(n)-time-complexity
    public static int otherGoodSolution(int[] nums) {
        int r = nums[0];
        int max = r;
        int min = r;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);

            r = Math.max(max, r);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 3, -2, 4, -1};
        System.out.println(otherGoodSolution(a));
    }


}
