package main.aarray;

/**
 * 利润可以累加
 * <p>
 * Created by wong on 2018/10/17.
 */
public class EBestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += (prices[i] - prices[i - 1]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 1, 5, 6, 3, 6, 4};
        System.out.println(maxProfit(a));
    }

}
