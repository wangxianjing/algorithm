package main.dp;

/**
 * 返回斐波那契数列的第N项的值
 * Created by wong on 18/6/21.
 */
public class FibonacciSequence {

    public static int fibonacci1(int n) {//递归方法，时间复杂度为n的2次方
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci1(n - 1) + fibonacci1(n - 2);
        }
    }

    public static int fibonacci2(int n) {//循环的方法，时间复杂度为n;
        if (n < 1) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int pre = 1;
            int prePre = 1;
            int res = 0;
            for (int i = 3; i <= n; i++) {
                res = pre + prePre;
                prePre = pre;
                pre = res;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci1(6));
        System.out.println(fibonacci2(6));
    }
}
