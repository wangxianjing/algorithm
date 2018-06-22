package main.pchar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wong on 18/6/21.
 */
public class CString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = "abc";
        String s6 = "a";
        String s7 = new String("bc");

        System.out.println(s1 == s5);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s5 == s6 + s7);
        System.out.println(s5 == (s6 + s7).intern());

        Map<String, Integer> map = new HashMap<>();
//        System.arraycopy();
    }
}
