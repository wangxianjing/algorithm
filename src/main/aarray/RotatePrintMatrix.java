package main.aarray;

import main.common.ArrayUtils;

/**
 * 循环打印二维数组
 * 《程南332》
 */
public class RotatePrintMatrix {

    public static void print(int[][] a) {

        int row = a.length;
        int col = a[0].length;

        int cr = 0;
        int cc = 0;
        int dr = row - 1;
        int dc = col - 1;

        while (cr <= dc && cc <= dc) {
            print(a, cr++, cc++, dr--, dc--);
        }

    }

    public static void print(int[][] a, int cr, int cc, int dr, int dc) {
        if (cc == dc) {
            for (int i = cr; i <= dr;i ++){
                System.out.println(a[i][cc]);
            }
        }else if (cr == dr) {
            for (int i = cc;i <=dc;i ++){
                System.out.println(a[cr][i]);
            }
        } else {
            int curR = cr;
            int curC = cc;

            while (curC <= dc) {
                System.out.println(a[cr][curC]);
                curC++;
            }

            curR++;
            while (curR <= dr) {
                System.out.println(a[curR][dc]);
                curR++;
            }

            curC-=2;
            while (curC >= cc) {
                try {
                    System.out.println(a[dr][curC]);
                } catch (Exception e) {
                    System.out.println("***" + curC);
                }
                curC--;
            }

            curR-=2;
            while (curR > cr){
                System.out.println(a[curR][cc]);
                curR--;
            }
        }
    }

    public static void main(String[] args) {
        print(ArrayUtils.a);
    }

}
