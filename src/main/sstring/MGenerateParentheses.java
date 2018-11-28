package main.sstring;

import java.util.ArrayList;
import java.util.List;

/**
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * <p>
 * Created by wong on 2018/11/28.
 */
public class MGenerateParentheses {

    /**
     * https://leetcode.com/articles/generate-parentheses/
     *
     * @param n
     * @return
     */
    public static List<String> otherGoodSolution(int n) {
        List<String> list = new ArrayList<>();
        build(list, "", 0, 0, n);
        return list;
    }

    /**
     * 回溯法
     *
     * @param list
     * @param cur
     * @param openCount
     * @param closedCount
     * @param max
     */
    public static void build(List<String> list, String cur, int openCount, int closedCount, int max) {
        if (cur.length() == max * 2) {
            list.add(cur);
            return;
        }
        if (openCount < max)
            build(list, cur + "(", openCount + 1, closedCount, max);

        if (closedCount < openCount)
            build(list, cur + ")", openCount, closedCount + 1, max);
    }

    public static void main(String[] args) {
        List<String> list = otherGoodSolution(3);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
