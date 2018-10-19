package main.aarray;

/**
 * 找到数组中的一个峰值，峰值是指这个数比左右两边的数都要大。返回它的下标
 * Created by wong on 2018/10/19.
 */
public class MFindPeakElement {

    /**
     * https://leetcode.com/problems/find-peak-element/solution/
     *
     * @param nums
     * @return
     */
    public static int othersGoodSolution(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] > nums[i + 1]) {
                return 0;
            }
            if (i == nums.length - 1 && nums[i] > nums[i - 1]) {
                return i;
            }
            if (i > 0 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(othersGoodSolution(a));
    }
}
