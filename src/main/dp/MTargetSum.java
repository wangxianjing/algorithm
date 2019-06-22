package main.dp;

/**
 * Created by wong on 2018/11/20.
 */
public class MTargetSum {
    static int count = 0;

    public static int findTargetSumWays(int[] nums, int S) {
        solution(nums, S, 0, 0);
        return count;
    }

    public static void solution(int[] nums, int S, int i, int sum) {
        if (i == nums.length) {
            if (sum == S) {
                count++;
            }
        } else {
            solution(nums, S, i + 1, sum - nums[i]);
            solution(nums, S, i + 1, sum + nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 1, 1};
        System.out.println(findTargetSumWays(a, 3));
    }
}
