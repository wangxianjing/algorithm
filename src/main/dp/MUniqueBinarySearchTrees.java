package main.dp;

/**
 * 给一个数组，求可以组成几种BST
 * Created by wong on 2018/11/12.
 */
public class MUniqueBinarySearchTrees {

    /**
     * https://leetcode.com/articles/unique-binary-search-trees/
     * @param n
     * @return
     */
    public static int otherGoodSolution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(otherGoodSolution(3));
    }
}
