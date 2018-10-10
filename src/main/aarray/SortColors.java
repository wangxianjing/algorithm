package main.aarray;

import main.common.ArrayUtils;

/**
 * [2,0,2,1,1,0],0,1,2分别代表三种颜色，排序，要求遍历一遍，空间复杂度是参数。
 * <p>
 * Created by wong on 2018/10/9.
 */
public class SortColors {

    /**
     * https://leetcode.com/problems/sort-colors/discuss/26472/Share-my-at-most-two-pass-constant-space-10-line-solution
     *
     * @param nums
     */
    public static void otherGoodSolution(int[] nums) {
        int zero = 0;
        int second = nums.length - 1;
        for (int i = 0; i <= second; i++) {
            while (nums[i] == 2 && i < second) {
                ArrayUtils.swap(nums, i, second--);
            }
            while (nums[i] == 0 && i > zero) {
                ArrayUtils.swap(nums, i, zero++);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
        otherGoodSolution(a);
        ArrayUtils.print(a);
    }
}
