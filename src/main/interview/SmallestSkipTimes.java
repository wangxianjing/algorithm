package main.interview;

/**
 * 头条面试题
 */
public class SmallestSkipTimes {
    public static int resolve(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = 1000000;
        }
        b[0] = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <= a[i]; j++) {
                if (i + j < a.length) {
                    b[i + j] = Math.min(b[i + j], b[i] + 1);
                }
            }
        }
        return b[b.length - 1];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 1, 10, 1, 1, 1, 1, 2};
        System.out.println(resolve(a));
    }
}
