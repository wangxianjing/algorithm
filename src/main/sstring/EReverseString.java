package main.sstring;

/**
 * 字符串反转
 * Created by wong on 2018/11/21.
 */
public class EReverseString {

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1;i >=0;i --) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1="hello";
        String s2="A man, a plan, a canal: Panama";
        System.out.println(reverseString(s1));
        System.out.println(reverseString(s2));
    }
}
