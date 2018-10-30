package main.dynamicPrograming;

/**
 * 爬楼梯，一次可以爬1或2台阶，N阶台阶一共多少种爬法
 * Created by wong on 2018/10/29.
 */
public class EClimbingStairs {

    public static int climbStairs(int n) {
        return climb1(n);
    }

    public static int climb(int now) {
        if (now == 1 || now == 2) {
            return now;
        } else {
            return climb(now - 1) + climb(now - 2);
        }
    }

    public static int climb1(int n) {
        int first = 1;
        int second = 2;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        for (int i = 3;i <=n;i++) {
            int temp = first;
            first = second;
            second = temp+second;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
