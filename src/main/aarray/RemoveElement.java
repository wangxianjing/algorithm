package main.aarray;

import main.common.ArrayUtils;

/**
 * https://leetcode.com/problems/remove-element/description/
 * <p>
 * 将数组的前几位改为不是指定的值并能顺序打印
 * <p>
 * Created by wong on 2018/9/15.
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                i++;
            }
            if (i < nums.length && nums[i] != val) {
                nums[count++] = nums[i];
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int[] a = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
//        int[] a = new int[]{3};
        int len = removeElement(a, 2);
        System.out.println(String.valueOf(len));
        ArrayUtils.print(a, len);
    }
}
