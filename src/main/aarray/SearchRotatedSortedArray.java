package main.aarray;

/**
 *https://leetcode.com/problems/search-in-rotated-sorted-array/discuss/14425/Concise-O(log-N)-Binary-search-solution
 * Created by wong on 2018\9\19 0019.
 */
public class SearchRotatedSortedArray {

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            }
            boolean leftSorted = isSorted(nums, left, mid);
            if (leftSorted) {
                if ( target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                }else {
                    left = mid+1;
                }
            } else {
                if (target> nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    public static  boolean isSorted(int[] a, int left, int right) {
        if (left == right || a[left] < a[right]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] a = new int[] {4,5,6,7,0,1,2};
        System.out.println(search(a, 0));
    }
}
