package main.aarray;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {
    public static int[] a = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

    /**
     * 时间复杂度是O的平方
     *
     * @param height
     * @return
     */
    public static int resolve(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int mostWater = 0;

        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int high = Math.min(height[i], height[j]);
                int length = i - j;
                int water = high * length;

                if (water > mostWater) {
                    mostWater = water;
                }
            }
        }
        return mostWater;
    }

    /**
     * 时间复杂度是o（n）
     *
     * @param height
     * @return
     */
    public static int resolve1(int[] height) {

        if (height.length < 2) {
            return 0;
        }
        int mostWater = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int water = Math.min(a[left], a[right]) * (right - left);
            mostWater = Math.max(mostWater, water);
            if (a[right] > a[left]) {
                left++;
            } else {
                right--;
            }
        }
        return mostWater;
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(resolve1(a)));
    }
}
