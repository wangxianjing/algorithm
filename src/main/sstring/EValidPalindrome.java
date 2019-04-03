package main.sstring;

/**
 * Created by wong on 2019/4/3.
 */
public class EValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return true;
        }
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (!Character.isLetterOrDigit(chars[start]) && start < end) {
                start++;
            }
            while (!Character.isLetterOrDigit(chars[end]) && end > start) {
                end--;
            }
            if (Character.toLowerCase(chars[end]) == Character.toLowerCase(chars[start])) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
