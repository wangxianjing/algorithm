package main.math;

/**
 * Created by wong on 2019/6/3.
 */
public class EPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        int k = 0;
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        int a = 3;
        while (a < n) {
            a = a * 3;
            k++;
        }
        System.out.println("k:" + k);
        return n == a;
    }

    public static boolean isPowerOfThree2(int n) {
        int k = 0;
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        System.out.println("k:" + k);
        return n == 1;
    }

    public static void main(String[] args) {
//        System.out.println(isPowerOfThree(45));
//        System.out.println(isPowerOfThree(3));
//        System.out.println(isPowerOfThree(9));
//        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree2(2147483647));
    }
}
