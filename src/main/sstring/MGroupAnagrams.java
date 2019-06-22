package main.sstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * <p>
 * Created by wong on 2018/11/27.
 */
public class MGroupAnagrams {

    //https://leetcode.com/articles/group-anagrams/
    public static List<List<String>> otherGoodSolutions(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.keySet().contains(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> otherGoodSolutions2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        int[] count = new int[26];
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            Arrays.fill(count, 0);
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!map.keySet().contains(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] a = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> listList = otherGoodSolutions2(a);
        for (List<String> list : listList) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("-----------");
        }
    }
}
