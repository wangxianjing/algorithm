package main.aarray;

import main.common.ArrayUtils;

/**
 * 如果一个元素为0，那么把该行该列的值都设为0
 * Created by wong on 2018/10/8.
 */
public class SetMatrixZeros {


    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int firstRowHasZero = 0;
        int firstColHasZero = 0;

        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                firstRowHasZero = 1;
            }
        }

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = 1;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        setRowElementByFirstCol(matrix, row, col);
        setColElementByFirstRow(matrix, row, col);

        setFirstColElement(matrix, row, firstColHasZero);
        setFirstRowElement(matrix, col, firstRowHasZero);
    }

    private static void setColElementByFirstRow(int[][] matrix, int row, int col) {
        for (int i = 1; i < col; i++) {
            if (matrix[0][i] == 0) {
                for (int k = 1; k < row; k++) {
                    matrix[k][i] = 0;
                }
            }
        }
    }

    private static void setRowElementByFirstCol(int[][] matrix, int row, int col) {
        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void setFirstRowElement(int[][] matrix, int col, int firstRowHasZero) {
        if (firstRowHasZero == 1) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }
    }

    private static void setFirstColElement(int[][] matrix, int row, int firstColHasZero) {
        if (firstColHasZero == 1) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        setZeroes(a);
        ArrayUtils.print(a);
    }

}
