package main.aarray;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {
    public static int[] a = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

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

    public static void main(String[] args) {
        System.out.printf(String.valueOf(resolve(a)));
    }
}
