package main.math;

import main.common.ArrayUtils;

/**
 * 求10000的阶乘
 * Created by wong on 2019/4/7.
 */
public class BigNumber {

    public static int[] count(int n) {
        int[] result = new int[300];
        int flag = 1;
        int res = 0;
        int j;
        result[0] = 1;
        for (int i = 2; i <= n; i++) {
            int carry = 0;
            for (j = 1; j <= flag; j++) {
                res = result[j - 1] * i + carry;
                result[j - 1] = res % 10;
                carry = res / 10;
            }
            while (carry > 0) {
                flag++;
                result[flag - 1] = carry % 10;
                carry = carry / 10;
            }
        }
        return result;
    }


    public static void add(int[] a, int[] b) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; b[i] != -1 || a[i] != -1; i++) {
            int x = a[i] == -1 ? 0 : a[i];
            int y = b[i] == -1 ? 0 : b[i];
            int sum = x + y;
            if (flag) {
                sum++;
            }
            int target = sum % 10;
            flag = sum >= 10 ? true : false;
            a[i] = target;
            count = i;
        }

        if (flag) {
            a[count + 1] = 1;
        }
    }

    public static void main(String[] args) {
        int[] count = count(110);
        ArrayUtils.print(count);
//        multiply(a, 9);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//        System.out.println(a[5]);
//        System.out.println(a[6]);
//        System.out.println(a[7]);
//        System.out.println(a[8]);
    }

    public static void testAdd() {
        int[] a = new int[10];
        a[0] = 9;
        a[1] = 9;
        a[2] = 9;
        a[3] = -1;
        a[4] = -1;
        int[] b = new int[10];
        b[0] = 9;
        b[1] = 9;
        b[2] = 9;
        b[3] = 9;
        b[4] = -1;
        b[5] = -1;
        add(a, b);
        ArrayUtils.print(a);
    }
}
