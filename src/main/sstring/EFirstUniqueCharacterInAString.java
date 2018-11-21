package main.sstring;

import java.util.LinkedList;
import java.util.List;

/**
 * 给一个字符串，返回第一个没有重复的字符的下标
 * Note: You may assume the string contain only lowercase letters.
 * Created by wong on 2018/11/21.
 */
public class EFirstUniqueCharacterInAString {

    //https://leetcode.com/problems/first-unique-character-in-a-string/discuss/86348/Java-7-lines-solution-29ms
    public static int othersGoodSolution(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] ++;
        }

        for (int i =0;i < s.length();i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static class A {
        private char c;
        private int count;

        public A(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public static int firstUniqChar(String s) {
        List<A> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.size() == 0) {
                A a = new A(c, 1);
                list.add(a);
            } else {
                boolean flag = true;
                for (int j = 0; j < list.size(); j++) {
                    A a = list.get(j);
                    if (a.c == c) {
                        a.count += 1;
                        list.set(j, a);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    A a = new A(c, 1);
                    list.add(a);
                }
            }
        }

        char c = '0';

        for (int j = 0; j < list.size(); j++) {
            A a = list.get(j);
            if (a.count == 1) {
                c = a.c;
                break;
            }
        }
        System.out.println(c);
        if (c == '0') {
            return -1;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "dddccdbba";
        System.out.println(othersGoodSolution(s1));
        System.out.println(othersGoodSolution(s2));
        System.out.println(othersGoodSolution(s3));

    }

}
