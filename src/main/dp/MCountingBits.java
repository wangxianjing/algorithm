package main.dp;

import main.common.ArrayUtils;

/**
 * 例子：
 * Input: 5
 * Output: [0,1,1,2,1,2] 输出0-5之间的每个数的1的个数
 * Created by wong on 2018/11/12.
 */
public class HCountingBits {
    /**
     * https://leetcode.com/problems/counting-bits/discuss/79539/Three-Line-Java-Solution
     * @param num
     * @return
     */
    public static int[] otherGoodSolution(int num) {
        int[] dp = new int[num+1];
        for (int i = 1;i <=num;i++) {
            dp[i] = dp[i/2] + i%2;
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] nums = otherGoodSolution(5);
        ArrayUtils.print(nums);
    }
}
