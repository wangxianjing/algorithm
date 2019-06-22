package main.aarray;

/**
 * 求子数组的最大和
 * <p>
 * Created by wong on 2018/9/23.
 */
public class MaximumSubarray {


    /**
     * https://leetcode.com/problems/maximum-subarray/discuss/20193/DP-solution-and-some-thoughts
     *
     * @param nums
     * @return
     */
    public static int otherGoodSolution(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(dp[i], max);
        }
        return max;
    }

    /**
     * https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
     *
     * @param nums
     * @return
     */
    public static int otherGoodSolution2(int[] nums) {
        int max = nums[0];
        int maxWithNow = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxWithNow = nums[i] + (maxWithNow > 0 ? maxWithNow : 0);
            max = Math.max(maxWithNow, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(otherGoodSolution2(a));
    }

}
