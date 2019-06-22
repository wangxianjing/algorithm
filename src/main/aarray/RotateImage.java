package main.aarray;

import main.common.ArrayUtils;

/**
 * 二维数组旋转90度
 * Created by wong on 2018\9\27 0027.
 */
public class RotateImage {

    /**
     * https://leetcode.com/problems/rotate-image/discuss/18872/A-common-method-to-rotate-the-image
     *
     * @param matrix
     */
    public static void otherGoodSolution(int[][] matrix) {
        reverse(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix) {
        int length = matrix.length;
        int[] temp = new int[length];
        for (int j = 0; j < length / 2; j++) {
            for (int i = 0; i < length; i++) {
                temp[i] = matrix[j][i];
            }
            for (int i = 0; i < length; i++) {
                matrix[j][i] = matrix[length - 1 - j][i];
            }
            for (int i = 0; i < length; i++) {
                matrix[length - 1 - j][i] = temp[i];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        otherGoodSolution(matrix);
        ArrayUtils.print(matrix);
    }
}
