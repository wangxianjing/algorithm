package main.aarray;

/**
 * Created by wong on 2018/10/6.
 */
public class UniquePath {

    /**
     * 我的解决方案，但是时间复杂度超了。
     *
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    /**
     * https://leetcode.com/problems/unique-paths/discuss/22954/0ms-5-lines-DP-Solution-in-C++-with-Explanations
     *
     * @param m
     * @param n
     * @return
     */
    public static int otherGoodSolution1(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            a[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            a[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
        return a[m - 1][n - 1];
    }

    public static int otherGoodSolution2(int cols, int rows) {
        int[] cur = new int[cols];

        for (int i = 0; i < cols; i++)
            cur[i] = 1;


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++)
                cur[j] = cur[j - 1] + cur[j];
        }
        return cur[cols - 1];
    }

    public static void main(String[] args) {
//        int uniquePaths = uniquePaths(51, 9);
        int uniquePaths = otherGoodSolution2(3, 7);
        System.out.println(uniquePaths);
    }
}
