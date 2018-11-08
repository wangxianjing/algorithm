package main.dp;

import main.common.ArrayUtils;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Created by wong on 2018/11/6.
 */
public class MCoinChange {

    /**
     * https://leetcode.com/articles/coin-change/ 方法3
     *
     * @param coins
     * @param amount
     * @return
     */
    public static int otherGoodSolution(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 4, 5};
//        System.out.println(otherGoodSolution1(a, 11));
        System.out.println(Integer.valueOf("0033"));
        System.out.println(Integer.valueOf("-003"));
        System.out.println(Integer.valueOf("+003"));
        System.out.println(Integer.valueOf(0x80000000));
        System.out.println(Integer.decode("0x7fff0fff").shortValue());
        System.out.println(new BigDecimal(3.32));
        System.out.println(new BigDecimal("3.32"));
    }
}
