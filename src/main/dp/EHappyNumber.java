package main.dp;

import java.util.HashSet;

/**
 * 判断是不是快乐数：https://leetcode.com/problems/happy-number/
 * Created by wong on 2019/4/2.
 */
public class EHappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> loop = new HashSet<>();
        while (true) {
            if (n == 1) {
                return true;
            }
            int i = digitSquareSum(n);
            if (loop.contains(i)) {
                return false;
            }
            loop.add(i);
            n = i;
        }
    }

    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }


    /**
     * 还有一种解法，在一次循环中，A调用一次digitSquareSum，B调用2次，当A和B相遇时如果值时1，那就返回true，否则时false
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
