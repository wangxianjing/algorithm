package main.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一些单词A['34','ddd','hhh'...],和一个单词B 'fdfhfid',判断B能否由A组成，A中的单词可以重复使用。
 * Created by wong on 2018/11/2.
 */
public class MWordBreak {

    /**
     * https://leetcode.com/problems/word-break/discuss/43790/Java-implementation-using-DP-in-two-ways
     *
     * @param s
     * @param wordDict
     * @return
     */
    public static boolean otherGoodSolution(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                if (word.length() <= i) {
                    if (dp[i - word.length()]) {
                        if (word.equals(s.substring(i - word.length(), i))) {
                            dp[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
    }

    /**
     * Time Limit Exceeded!!!
     *
     * @param s
     * @param wordDict
     * @return
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }

        List<Boolean> result = new ArrayList<>();
        for (String element : wordDict) {
            if (s.startsWith(element)) {
                String substring = s.substring(element.length(), s.length());
                result.add(wordBreak(substring, wordDict));
            }
        }

        for (Boolean b : result) {
            if (b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        list.add("aaaaa");
        list.add("aaaaaa");
        list.add("aaaaaaa");
        list.add("aaaaaaaa");
        list.add("aaaaaaaaa");
        System.out.println(otherGoodSolution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", list));
    }
}
