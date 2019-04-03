package main.sstring;

import java.util.HashMap;

/**
 * Created by wong on 2019/4/3.
 */
public class EValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            Integer integer = map.get(c);
            if (integer == null) {
                map.put(c, 1);
            } else {
                map.put(c, integer + 1);
            }
        }

        char[] tChars = t.toCharArray();
        for (char c : tChars) {
            Integer integer = map.get(c);
            if (integer == null || integer == 0) {
                return false;
            }
            integer = integer - 1;
            if (integer == 0) {
                map.remove(c);
            } else {
                map.put(c, integer);
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagarm", "anagram"));
    }
}
