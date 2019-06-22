package main.aarray;

import main.common.ArrayUtils;

/**
 * https://leetcode.com/problems/next-permutation/description/
 * 见讨论
 * Created by wong on 2018\9\17 0017.
 */
public class NextPermutation {
    public static void resolve(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int length = nums.length;
        int target1 = -1;
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                target1 = i;
                break;
            }
        }
        if (target1 == -1) {//已经是最大值，全部翻转
            convert(nums, 0, length - 1);
            return;
        }
        int target2 = length - 1;
        for (int i = length - 1; i > 0; i--) {
            if (nums[i] > nums[target1]) {
                target2 = i;
                break;
            }
        }
        swap(nums, target1, target2);
        System.out.println("t1:" + target1 + "t2:" + target2);
        convert(nums, target1 + 1, length - 1);
    }

    public static void swap(int[] a, int src, int dst) {
        int temp = a[src];
        a[src] = a[dst];
        a[dst] = temp;
    }

    public static void convert(int[] a, int src, int dst) {
        if (src == dst) return;
        while (src < dst) {
            int temp = a[src];
            a[src] = a[dst];
            a[dst] = temp;
            src++;
            dst--;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 7, 4, 3, 1};
//        int[] a = new int[]{ 1,3, 2};
        resolve(a);
        ArrayUtils.print(a);
    }
}
