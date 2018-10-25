package main.aarray;

/**
 * 求两个有序数组的中位数。
 * Created by wong on 2018/10/24.
 */
public class HMedianOfTwoSortedArrays {
    /**
     * https://leetcode.com/articles/median-of-two-sorted-arrays/
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int a = m;
            m = n;
            n = a;
        }

        int iMin = 0;
        int iMax = m;
        int halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMax + iMin) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > iMin && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                System.out.println("i:" + i);
                System.out.println("j:" + j);
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (minRight + maxLeft) / 2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(a, b));
    }

}
