package main.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * Output:
 * [
 * "cats and dog",
 * "cat sand dog"
 * ]
 *
 * <p>
 * Created by wong on 2018/11/5.
 */
public class HWordBreakII {

    //https://leetcode.com/problems/word-break-ii/discuss/44167/My-concise-JAVA-solution-based-on-memorized-DFS/43403
    public static List<String> otherGoodSolution(String s, List<String> wordDict) {
        return backtrack(s, wordDict, new HashMap<String, List<String>>());
    }

    public static List<String> backtrack(String s, List<String> wordDict, Map<String, List<String>> mem) {
        if (mem.containsKey(s)) {//已经计算过的不再重复计算
            List<String> list = mem.get(s);
            return list;
        }
        List<String> result = new ArrayList<>();
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String next = s.substring(word.length());
                if (next.length() == 0) {
                    result.add(word);
                } else {
                    for (String sub : backtrack(next, wordDict, mem)) {
                        result.add(word + " " + sub);
                    }
                }
            }
        }
        mem.put(s, result);
        return result;
    }

    public static void main(String[] args) {
        String s = "pineapplepenapple";
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        list.add("applepen");
        list.add("pine");
        list.add("pineapple");
        List<String> list1 = otherGoodSolution(s, list);
        System.out.println(list1.toString());
    }


}
