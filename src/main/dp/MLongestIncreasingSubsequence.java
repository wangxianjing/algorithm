package main.dp;

import main.common.ArrayUtils;

import java.util.Arrays;

/**
 * 求整数型数组里递增的最大长度
 * <p>
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * <p>
 * Created by wong on 2018/10/30.
 */
public class MLongestIncreasingSubsequence {

    /**
     * https://leetcode.com/articles/longest-increasing-subsequence/
     * 其中的方法3
     *
     * @param nums
     * @return
     */
    public static int othersGoodSolution1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        ArrayUtils.print(dp);
        System.out.println("-----------");
        return dp[nums.length - 1];
    }

    public static int otherGoodSolutions2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = 0;
        int[] dp = new int[nums.length];
        for (int value : nums) {
            int i = Arrays.binarySearch(dp, 0, len, value);
            if (i < 0) {
                System.out.println(i);
                i = -(i + 1);
            }
            dp[i] = value;
            if (i == len) {
                len++;
            }

        }
        return len;
    }

//    public static int lengthOfLIS(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        int max = 1;
//        for (int i = 0; i < nums.length; i++) {
//            int maxValue = nums[i];
//            int count = 1;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j] > maxValue) {
//                    maxValue = nums[j];
//                    count++;
//                }
//            }
//            if (max < count) {
//                max = count;
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int[] b = new int[]{10, 9, 2, 5, 3, 4};
        int[] c = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};
        System.out.println(otherGoodSolutions2(a));
        System.out.println(otherGoodSolutions2(b));
        System.out.println(otherGoodSolutions2(c));
    }
}
