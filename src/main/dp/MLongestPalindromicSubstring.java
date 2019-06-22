package main.dp;

import java.util.Date;

/**
 * 求最长回文子序列
 * Created by wong on 2018/11/6.
 */
public class MLongestPalindromicSubstring {

    public static class Data {
        int fromIndex;
        int maxLength = 0;

        public Data(int fromIndex, int maxLength) {
            this.fromIndex = fromIndex;
            this.maxLength = maxLength;
        }
    }

    //https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution
    public static String otherGoodSolution(String s) {
        if (s.length() < 2) {
            return s;
        }
        Data data = new Data(0, 0);
        for (int i = 0; i < s.length() - 1; i++) {
            longestPalindromeSubString(s, i, i, data);
            longestPalindromeSubString(s, i, i + 1, data);
        }
        return s.substring(data.fromIndex, data.fromIndex + data.maxLength);

    }

    public static void longestPalindromeSubString(String s, int i, int j, Data data) {
        while (0 <= i && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (data.maxLength < j - i - 1) {
            data.maxLength = j - i - 1;
            data.fromIndex = i + 1;
        }
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "1";
        String s4 = "11";
        System.out.println(otherGoodSolution(s1));
        System.out.println(otherGoodSolution(s2));
        System.out.println(otherGoodSolution(s3));
        System.out.println(otherGoodSolution(s4));
    }
}
