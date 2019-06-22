package main.sstring;

/**
 * 《程南213》
 * str1="abcdr",str2="abcth",那么最长的公共子串是"abc"
 */
public class LongestCommonSubstring {

    public static int[][] getDp(char[] c1, char[] c2) {
        int row = c1.length;
        int col = c2.length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (c1[i] == c2[0]) {
                dp[i][0] = 1;
            }
        }
        for (int j = 0; j < col; j++) {
            if (c2[j] == c1[0]) {
                dp[0][j] = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (c1[i] == c2[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp;
    }

    public static String resolve1(String str1, String str2) {
        if (str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[][] dp = getDp(chars1, chars2);
        if (dp == null) {
            return "";
        } else {
            int row = dp.length;
            int col = dp[0].length;
            int max = 0;
            int end = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        end = i;
                    }
                }
            }
            System.out.println(end);
            System.out.println(max);
            return str1.substring(end - max + 1, end + 1);
        }
    }

    /**
     * 时间复杂度和上面的一样，空间复杂度从O（N*M）下降到O(1)
     *
     * @param str1
     * @param str2
     * @return
     */
    public static String resolve2(String str1, String str2) {
        if (str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int row = chars1.length;
        int col = chars2.length;
        int max = 0;
        int end = 0;
        int lastValue = 0;
        int tempMax = 0;
        int tempEnd = 0;
        int tempJ = 0;
        int tempI = 0;

        for (int j = col - 1; j > -1; j--) {
            tempJ = j;
            for (tempI = 0; tempI < row; tempI++) {
                if (tempJ == col) {
                    break;
                } else {
                    if (chars2[tempJ] == chars1[tempI]) {
                        lastValue++;
                        if (lastValue > tempMax) {
                            tempMax = lastValue;
                            tempEnd = tempJ;
                        }
                    } else {
                        lastValue = 0;
                    }
                }
                tempJ++;
            }
        }
        if (tempMax > max) {
            max = tempMax;
            end = tempEnd;
        }

        if (row == 1) {
            return str1.substring(end - max + 1, end + 1);
        }

        tempMax = 0;
        tempEnd = 0;
        for (int i = 1; i < row; i++) {
            tempI = i;
            lastValue = 0;
            for (tempJ = 0; tempJ < col; tempJ++) {
                if (tempI == row) {
                    break;
                }
                if (chars1[tempI] == chars2[tempJ]) {
                    lastValue++;
                    if (lastValue > tempMax) {
                        tempMax = lastValue;
                        tempEnd = tempJ;
                    } else {
                        lastValue = 0;
                    }
                }
                tempI++;
            }
            tempI++;
        }
        if (tempMax > max) {
            max = tempMax;
            end = tempEnd;
        }
        return str2.substring(end - max + 1, end + 1);
    }

    public static void main(String[] args) {
        String s1 = "1ab23145cd";
        String s2 = "12345ef";
        System.out.println(resolve2(s1, s2));
    }
}
