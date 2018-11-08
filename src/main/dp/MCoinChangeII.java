package main.dp;

/**
 * 求有几种拼凑方法
 * Created by wong on 2018/11/8.
 */
public class MCoinChangeII {

    /**
     * https://leetcode.com/problems/coin-change-2/discuss/141076/Logical-Thinking-with-Clear-Java-Code
     * dp[i] = dp[i - coins[0]] + dp[i - coins[1]] + ... + dp[i - coins[coins.length - 1]] if i - coins[0] >= 0
     *
     * @param coins
     * @param amount
     * @return
     */
    public static int otherGoodSolution1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int j = 0; j < coins.length; j++) {
            for (int i = 1; i <= amount; i++) {
                if (coins[j] <= i) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[amount];
    }

    /**
     * ！！！！！！！！这个方法错误，顺序不能倒
     * 例如coins[2,3],amount = 5
     *  output 2,显然错误。
     *
     */
    public static int otherGoodSolution2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 4, 5};
        System.out.println(otherGoodSolution1(a, 11));
        System.out.println(otherGoodSolution2(a, 11));
    }


}
