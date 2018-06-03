package main.dp;

/**
 * 返回连续的最大子序列的和
 *
 * Created by wong on 18/6/3.
 */
public class BiggestChildSequenceSum {

    public static int getBiggestSum(int[] a) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > max) {//状态转移方程：sum[i] = max(sum(i - 1) + a[i],sum(i - 1))
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, -1 };
        System.out.println(getBiggestSum(a));
    }
}
