package main.math;

/**
 * Created by wong on 2019/4/2.
 */
public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 0;
        int end = x;
        return solution(start, end, x);
    }

    public static int solution(int start, int end, int x) {
        int target = (start + end) / 2;
        int multiply = target * target;
        if (multiplyExact(target, target)) {
            return solution(start, target, x);
        } else if (multiply == x) {
            return target;
        } else if (multiply < x) {
            if (multiplyExact((target + 1), (target + 1)) || (target + 1) * (target + 1) > x) {

                return target;
            } else if ((target + 1) * (target + 1) > x) {
                return target + 1;
            }
            return solution(target, end, x);
        } else if (multiply > x) {
            if ((target - 1) * (target - 1) < x) {
                return target - 1;
            }
            return solution(start, target, x);
        }
        return 0;
    }

    public static boolean multiplyExact(int x, int y) {
        long r = (long) x * (long) y;
        if ((int) r != r) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(46341*46341);
//        System.out.println(mySqrt(8));
//        System.out.println(mySqrt(1));
//        System.out.println(mySqrt(0));
//        System.out.println(mySqrt(2));
//        System.out.println(mySqrt(3));
//        System.out.println(mySqrt(4));
//        System.out.println(mySqrt(5));
//        System.out.println(mySqrt(2147395599));
//        System.out.println(mySqrt(2147483647));
        System.out.println(mySqrt(2147395600));
    }

}
