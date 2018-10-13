package main.aarray;

import main.common.ArrayUtils;

/**
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Created by wong on 2018/10/13.
 */
public class ERotateArray {

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= nums.length;
        swap(nums, 0, nums.length - 1 - k);
        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - 1);
    }

    public static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1};
        rotate(a, 0);
        ArrayUtils.print(a);
    }

}
