package main.aarray;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环遍历二维数组并放到链表里
 * Created by wong on 2018/9/29.
 */
public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;
        int upRow = 0;
        int downRow = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        while (upRow <= downRow && leftColumn <= rightColumn) {
            if (leftColumn <= rightColumn && upRow <= downRow) {
                for (int i = leftColumn; i <= rightColumn; i++) {
                    list.add(matrix[upRow][i]);
                }
            }
            upRow++;
            if (upRow <= downRow && leftColumn <= rightColumn ) {
                for (int i = upRow; i <= downRow; i++) {
                    list.add(matrix[i][rightColumn]);
                }
            }
            rightColumn--;
            if (leftColumn <= rightColumn && upRow <= downRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    list.add(matrix[downRow][i]);
                }
            }
            downRow--;
            if (upRow <= downRow && leftColumn <= rightColumn ) {
                for (int i = downRow; i >= upRow; i--) {
                    list.add(matrix[i][leftColumn]);
                }
            }
            leftColumn++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2,3,4}, {5,6,7, 8},{9,10,11,12}};
//        int[][] a = new int[][]{{1, 2},{3,4}};
        List<Integer> list = spiralOrder(a);
        System.out.println(list.toString());
    }
}
