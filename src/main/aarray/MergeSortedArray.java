package main.aarray;

import main.common.ArrayUtils;

/**
 * 把一个有序的数组合并到另一个有序数组里生成最终的一个有序数组
 * Created by wong on 2018\9\24 0024.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        while (n > 0) {
            nums1[m + n - 1] = (m > 0 && nums1[m - 1] > nums2[n - 1]) ? nums1[--m] : nums2[--n];
        }
    }

    public static void mySolution(int[] nums1, int m, int[] nums2, int n) {
        int start = 0;
        for (int i = 0; i < n; i++) {
            int end = m + i;
            int newStart = mergeOneElement(nums1, start, end, nums2[i]);
            start = newStart;
        }
    }

    public static int mergeOneElement(int[] nums1, int start, int end, int target) {
        while (start <= end) {
            if (nums1[start] <= target) {
                start++;
            } else {
                while (start < end) {
                    nums1[end] = nums1[end - 1];
                    end--;
                }
                nums1[start] = target;
            }
        }
        nums1[start - 1] = target;
        return start;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        ArrayUtils.print(nums1);

    }
}
