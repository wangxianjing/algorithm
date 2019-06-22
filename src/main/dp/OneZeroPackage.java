package main.dp;

/**
 * 01背包问题
 */
public class OneZeroPackage {

    public static int resolve(int[] w, int[] v, int c) {
        int[][] res = new int[w.length][c + 1];
        for (int i = 1; i <= w.length - 1; i++) {
            for (int j = 0; j <= c; j++) {
                if (j >= w[i]) {
                    res[i][j] = Math.max(res[i - 1][j], (res[i - 1][j - w[i]] + v[i]));
                } else {
                    res[i][j] = res[i - 1][j];
                }
            }
        }
        return res[w.length - 1][c];
    }

    public static void main(String[] args) {
        int[] w = new int[]{8, 10, 6, 3, 7, 2};
        int[] v = new int[]{4, 6, 2, 2, 5, 1};
        System.out.println(resolve(w, v, 12));
    }
}
