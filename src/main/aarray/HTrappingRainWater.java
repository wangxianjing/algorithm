package main.aarray;

/**
 * 计算数组的"高度差的和"
 * Created by wong on 2018/10/21.
 */
public class HTrappingRainWater {
    /**详细解法参考 https://leetcode.com/articles/trapping-rain-water/*/
    /**
     * 解法1，暴力破解，针对每个元素找到 它左右两边的最大值，取较小者，减去当前元素，该元素的高度差，时间复杂度是O(N*N)，空间复杂度是O(1)
     */

    /**
     * 动态规划，是方法1的改进版，时间复杂度和空间复杂度都是O(N)
     *
     * @param height
     * @return
     */
    public static int dynamicProgrammingSolution(int[] height) {
        if (height == null || height.length < 3) return 0;

        int length = height.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] = height[0];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[length - 1] = height[length - 1];
        for (int j = length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], height[j]);
        }

        int result = 0;
        for (int k = 0; k < length; k++) {
            result += Math.min(leftMax[k], rightMax[k]) - height[k];
        }
        return result;
    }

    /**
     * 两个指针的方式
     * @param height
     * @return
     */
    public static int use2Pointers(int[] height) {
        if (height == null || height.length < 3) return 0;

        int length = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = length - 1;
        int result = 0;
        while (left < right) {

            if (height[right] > height[left]) {
                if (leftMax > height[left]) {
                    result += Math.min(leftMax, height[right]) - height[left];
                } else {
                    leftMax = height[left];
                }
                ++left;
            } else {
                if (rightMax > height[right]) {
                    result += Math.min(rightMax, height[left]) - height[right];
                } else {
                    rightMax = height[right];
                }
                --right;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] b= new int[]{4,9,4,5,3,2};
        System.out.println(use2Pointers(a));
        System.out.println(use2Pointers(b));
    }
}
