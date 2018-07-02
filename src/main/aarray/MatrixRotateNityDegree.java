package main.aarray;

import javafx.scene.transform.Rotate;
import main.common.ArrayUtils;

public class MatrixRotateNityDegree {

    public static void rotate(int[][] a) {

        int row = a.length;
        int col = a[0].length;

        int cr = 0;
        int cc = 0;
        int dr = row - 1;
        int dc = col - 1;

        while (cr <= dr && cc <= dc) {
            rotate(a, cr++, cc++, dr--, dc--);
        }
    }

    public static void rotate(int[][] a, int cr, int cc, int dr, int dc) {
        int temp;
        int length = dc - cc;
        for (int i = 0; i != length; i++) {
            temp = a[cr][dc - i];
            a[cr][dc - i] = a[cr + i][cc];//上
            a[cr + i][cc] = a[dr][cc + i];//左
            a[dr][cc + i] = a[dr - i][dc];//下
            a[dr - i][dc] = temp;//右
        }
    }

    public static void main(String[] args) {
        rotate(ArrayUtils.a);
//        System.out.println(ArrayUtils.a[0][1]);
//        System.out.println(ArrayUtils.a[0][0]);
        RotatePrintMatrix.print(ArrayUtils.a);
    }
}
