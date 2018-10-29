package main.dynamicPrograming;

/**
 * 给定一个整数数组，不能连续取挨着的数字，求能够取到的数字的和的最大值
 * 【3，4，7，23，4】 返回27
 * <p>
 * Created by wong on 2018/10/29.
 */
public class EHouseRobber {

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int[] sums = new int[]{nums[0], nums[1]};
        rob(nums, 2, sums);
        return Math.max(sums[0], sums[1]);
    }

    public static void rob(int[] nums, int index, int[] sums) {
        if (index > nums.length - 1 || nums.length <= 2) {
            return;
        } else {
            int sumsIndex = index % 2;
            sums[sumsIndex] = Math.max(sums[sumsIndex] + nums[index], sums[1 - sumsIndex] - nums[index - 1] + nums[index]);
        }
        rob(nums, ++index, sums);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 9, 3, 1};
        int[] b = new int[]{2, 1, 1, 2};
        int[] c = new int[]{1, 3, 1, 3, 100};
        int[] d = new int[]{4, 1, 2, 7, 5, 3, 1};
        System.out.println(rob(a));
        System.out.println(rob(b));
        System.out.println(rob(c));
        System.out.println(rob(d));
    }
}
