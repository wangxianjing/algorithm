package main.aarray;

/**
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 *
 * Created by wong on 2018/10/11.
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int profit = max - min;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                profit = max - min;
            }
            if (prices[i] < min) {
                int nowProfit = solution(prices, i);
                if (nowProfit > profit) {
                    min = prices[i];
                    profit = nowProfit;
                }
            }
        }
        return profit;
    }

    public static int solution(int[] prices, int currentValueIndex) {
        int profit = 0;
        int nowPrice = prices[currentValueIndex];
        for (int i = currentValueIndex; i < prices.length; i++) {
            profit = Math.max(prices[i] - nowPrice, profit);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 1, 5, 3, 6, 4};
        int i = maxProfit(a);
        System.out.println(i);
    }

}
