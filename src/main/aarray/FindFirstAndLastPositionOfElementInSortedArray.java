package main.aarray;

import main.common.ArrayUtils;

/**
 * Created by wong on 2018/9/20.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    //    public int[] searchRange(int[] nums, int target) {
//
//    }
    public static int[] searchRange(int[] A, int target) {
        int start = firstGreaterEqual(A, target);
        if (start == A.length || A[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, firstGreaterEqual(A, target + 1) - 1};
    }

    //find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    //actually this is the same as lower_bound in C++ STL.
    private static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                //should not be mid-1 when A[mid]==target.
                //could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }

    private static int lastGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A[mid] > target) {
                high = mid - 1;
            } else {
                if (high - 1 == low) {//防止死循环
                    if (high == target) {
                        return high;
                    } else if (low == target) {
                        return low;
                    } else {
                        return -1;
                    }
                }
                low = mid;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 4, 4, 5, 6, 7};
        System.out.println(lastGreaterEqual(a, 7));
//        System.out.println(firstGreaterEqual(a, 4));
//        ArrayUtils.print(searchRange(a, 4));
    }
}