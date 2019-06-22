package main.dp;

/**
 * 平方数为（1，4，9，14，25。。。。。。）
 * 给一个正整数n，求n最少需要几个平方数相加得到
 * Created by wong on 2018/11/2.
 */
public class MPerfectSquares {

    /**
     * https://leetcode.com/problems/perfect-squares/discuss/71488/Summary-of-4-different-solutions-(BFS-DP-static-DP-and-mathematics)
     *
     * @param n
     * @return
     */
    public static int otherGoodSolution(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(otherGoodSolution(25));
    }
}
