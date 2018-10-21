package main.aarray;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串和二维字符数组。判断字符串是否在数组中，可以水平和垂直搜寻，但元素不能重复
 * <p>
 * Created by wong on 2018/10/21.
 */
public class MWordSearch {

    public static boolean otherGoodSolution(char[][] board, String word) {
        for (int x = 0; x < board[0].length; x++) {
            for (int y = 0; y < board.length; y++) {
                if (exist(board, word, 0, x, y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean exist(char[][] board, String word, int index, int x, int y) {
        if (index == word.length()) {
            return true;
        }
        if (x < 0 || x == board[0].length || y < 0 || y == board.length) {
            return false;
        }
        if ((board[y][x] != word.charAt(index))) {
            return false;
        }
        board[y][x] ^= 255;
        boolean existFlag = exist(board, word, index + 1, x - 1, y) ||
                exist(board, word, index + 1, x + 1, y) ||
                exist(board, word, index + 1, x, y - 1) ||
                exist(board, word, index + 1, x, y + 1);
        board[y][x] ^= 255;
        return existFlag;
    }

    /**
     * 我的这个暴力方法超时了，且空间复杂度也不够友好！
     *
     * @param board
     * @param word
     * @return
     */
    public static boolean exist(char[][] board, String word) {
        for (int x = 0; x < board[0].length; x++) {
            for (int y = 0; y < board.length; y++) {
                boolean exist = exist(board, x, y, word, new ArrayList<Coordinate>());
                if (exist) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean exist(char[][] board, int x, int y, String word, List<Coordinate> passCoordinateList) {
        if (passCoordinateList.size() == word.length()) {
            return true;
        }
        Coordinate newCoordinate = new Coordinate(x, y);
        if (0 <= x && x < board[0].length && 0 <= y && y < board.length
                && !passCoordinateList.contains(newCoordinate)
                && word.charAt(passCoordinateList.size()) == board[y][x]) {
            passCoordinateList.add(newCoordinate);
            boolean upFlag = false;
            boolean downFlag = false;
            boolean leftFlag = false;
            boolean rightFlag = false;
            upFlag = exist(board, x, y - 1, word, copy(passCoordinateList));
            downFlag = exist(board, x, y + 1, word, copy(passCoordinateList));
            leftFlag = exist(board, x - 1, y, word, copy(passCoordinateList));
            rightFlag = exist(board, x + 1, y, word, copy(passCoordinateList));
            return upFlag || downFlag || leftFlag || rightFlag;
        }
        return false;

    }

    public static List<Coordinate> copy(List<Coordinate> src) {
        List<Coordinate> dest = new ArrayList<>();
        if (src.size() > 0) {
            for (Coordinate coordinate : src) {
                dest.add(coordinate);
            }
        }
        return dest;
    }

    public static class Coordinate {
        public int x;
        public int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            Coordinate coordinate = (Coordinate) o;
            if (this.x == coordinate.x && this.y == coordinate.y) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        char[][] b = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
//        System.out.println(exist(b, 1, 1, "AAB", new ArrayList<Coordinate>()));

        char[][] a = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

        System.out.println(otherGoodSolution(a, "ABCCED"));
        System.out.println(otherGoodSolution(a, "SEE"));
        System.out.println(otherGoodSolution(a, "ABCB"));
    }
}

