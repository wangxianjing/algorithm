package main.sstring;

public class LongestNotRepeatSubString {

    public static int resulve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int cur = 0;//到第i个字符为止最长的连续不重复子串
        int pre = -1;//到第i-1个字符串为止最长不重复子串的第一个字符的前面一个字符的位置
        int len = 0;//最大不重复子串长度
        int[] c = new int[256];//保存每个字符在字符串中最大的索引位置
        for (int i = 0; i < c.length; i++) {
            c[i] = -1;
        }
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            pre = Math.max(pre, c[chars[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            if (len == cur) {
                start = pre;
                end = i;
            }
            c[chars[i]] = i;
        }
        System.out.println(s.substring(start, len));
        return len;
    }

    public static void main(String[] args) {
        String a = "fcosjfidjdfds";
        System.out.println(resulve(a));
    }
}