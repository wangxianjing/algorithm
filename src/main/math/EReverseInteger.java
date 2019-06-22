package main.math;

/**
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Created by wong on 2018/11/19.
 */
public class EReverseInteger {

    public static int reverse(int x) {
        String s = String.valueOf(x);
        boolean flag1 = true;
        boolean flag2 = true;
        int i = s.length() - 1;
        long result = 0l;
        while (i >= 0) {
            char c = s.charAt(i);
            if (c == '-') {
                flag1 = false;
                break;
            }
            if (flag2 && c == '0') {

            } else {
                result = Integer.valueOf(c - '0') + (long) (result * 10);
                flag2 = false;
            }
            i--;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        if (flag1) {
            return (int) result;
        } else {
            return (int) -result;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(1230));
        System.out.println(reverse(-123));
        System.out.println(reverse(1023));
        System.out.println(reverse(901000));
    }
}
