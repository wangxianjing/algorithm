package main.common;

public class ArrayUtils {
    /**
     * 1 3 5 9
     * 8 1 3 4
     * 5 0 6 1
     * 8 8 4 0
     */
    public static int[][] a = new int[4][4];

    static {
        a[0][0] = 1;
        a[0][1] = 3;
        a[0][2] = 5;
        a[0][3] = 9;
        a[1][0] = 8;
        a[1][1] = 1;
        a[1][2] = 3;
        a[1][3] = 4;
        a[2][0] = 5;
        a[2][1] = 0;
        a[2][2] = 6;
        a[2][3] = 1;
        a[3][0] = 8;
        a[3][1] = 8;
        a[3][2] = 4;
        a[3][3] = 0;
    }

    public static void print(int[] a, int len) {
        if (a != null && a.length > 0 && len <= a.length) {
            for (int i = 0; i < len; i++) {
                System.out.println(a[i]);
            }
        }
    }

    public static void print(int[] a) {
        int i = 0;
        while (i < a.length) {
            System.out.println(String.valueOf(a[i]));
            i++;
        }
    }

    public static void print(int[][] a){
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0;j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
        swap(a, 0, 5);
        print(a);
    }
}
