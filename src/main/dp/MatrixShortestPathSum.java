package main.dp;

import main.common.ArrayUtils;

/**
 * 从一个矩阵的最左上角走到最右下角，经过的格子的数字之和的最小值。
 * <p>
 * Created by wong on 18/6/22.
 */
public class MatrixShortestPathSum {


    /**
     * 空间复杂度是Row*Col
     *
     * @param grid
     * @return
     */
    public static int min1(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }

    /**
     * 空间复杂度四min(Row,Col)
     *
     * @param a
     * @return
     */
    public static int min2(int[][] a) {
        if (a == null || a.length == 0 || a[0] == null || a[0].length == 0) {
            return 0;
        }
        int row = a.length;
        int col = a[0].length;

        if (row < col) {
            int[] dp = new int[row];
            dp[0] = a[0][0];
            for (int i = 1; i < row; i++) {
                dp[i] = dp[i - 1] + a[i][0];
            }
            for (int i = 1; i < col; i++) {
                dp[0] = dp[0] + a[0][i];
                for (int j = 1; j < row; j++) {
                    dp[j] = Math.min(dp[j - 1], dp[j]) + a[j][i];
                }
            }
            return dp[row - 1];
        } else {
            int[] dp = new int[col];
            dp[0] = a[0][0];
            for (int i = 1; i < col; i++) {
                dp[i] = dp[i - 1] + a[0][i];
            }
            for (int i = 1; i < row; i++) {
                dp[0] = dp[0] + a[i][0];
                for (int j = 1; j < col; j++) {
                    dp[j] = Math.min(dp[j - 1], dp[j]) + a[i][j];
                }
            }
            return dp[col - 1];
        }

    }

    public static void main(String[] args) {
        System.out.println(min2(ArrayUtils.a));
        System.out.println(min1(ArrayUtils.a));
    }

}
