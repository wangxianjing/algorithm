package main.dp;

/**
 * 求字符串的回文字串的数量
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * Created by wong on 2018/11/15.
 */
public class MPalindromicSubstrings {

    //更好的方法是：马拉车算法！

    /**
     * @param s
     * @return
     */
    public static int countSubstrings1(String s) {
        int length = s.length();
        int count = length;
        for (int i = 1; i < length; i++) {
            int left1 = i - 1;
            int right1 = i + 1;
            int left2 = i - 1;
            int right2 = i;
            boolean flag1 = true;
            boolean flag2 = true;
            while ((flag1 || flag2) && ((left1 >= 0 && right1 < length) || left2 >= 0 && right2 < length)) {

                if (flag1 && (left1 >= 0 && right1 < length) && s.charAt(left1) == s.charAt(right1)) {
                    count++;
                    left1--;
                    right1++;
                } else {
                    flag1 = false;
                }
                if (flag2 && left2 >= 0 && right2 < length && s.charAt(left2) == s.charAt(right2)) {
                    count++;
                    left2--;
                    right2++;
                } else {
                    flag2 = false;
                }

            }
        }
        return count;
    }

    /**
     * Time Limit Exceeded
     *
     * @param s
     * @return
     */
    public static int countSubstrings(String s) {
        int length = s.length();
        int count = length;
        for (int i = 1; i < length; i++) {
            int left = i - 1;
            int right = i;
            while (left >= 0 && right < length) {
                if (s.charAt(left) == s.charAt(right)) {
                    count++;
                    System.out.println(s.charAt(left));
                    System.out.println(s.charAt(right));
                    System.out.println(i);
                    System.out.println("a");
                } else {
                    break;
                }
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < length) {
                if (s.charAt(left) == s.charAt(right)) {
                    count++;
                    System.out.println("b");
                } else {
                    break;
                }
                left--;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//        System.out.println(countSubstrings1("aaa"));
//        System.out.println(countSubstrings1("abc"));
    }

}


