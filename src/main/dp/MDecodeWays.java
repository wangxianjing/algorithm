package main.dp;

/**
 * Input: "226"
 * Output: 3
 * Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 * Created by wong on 2018/11/6.
 */
public class MDecodeWays {

    /**
     * https://leetcode.com/problems/decode-ways/discuss/30384/A-concise-dp-solution
     *
     * @param s
     * @return
     */
    public static int otherGoodSolution(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int preCount = 1;
        int curCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                curCount = 0;
            }
            if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6') {
                curCount += preCount;
                preCount = curCount - preCount;
            } else {
                preCount = curCount;
            }
        }
        return curCount;
    }

    public static void main(String[] args) {
        System.out.println(otherGoodSolution("226"));
        System.out.println(otherGoodSolution("22"));
        System.out.println(otherGoodSolution("110"));
        System.out.println(otherGoodSolution("10"));
        System.out.println(otherGoodSolution("1003332211111"));
        System.out.println(otherGoodSolution("22430316"));
        System.out.println(otherGoodSolution("22410316"));
        System.out.println(otherGoodSolution("121"));
        System.out.println(otherGoodSolution("1212"));
        System.out.println(otherGoodSolution("12121"));
    }
}
