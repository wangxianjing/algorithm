package main.sstring;

import java.util.Stack;

/**
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Created by wong on 2018/11/26.
 */
public class EValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(curChar);
            } else {
                Character topChar = stack.peek();
                if (isPairChars(curChar, topChar) || isPairChars(topChar, curChar)) {
                    stack.pop();
                } else {
                    stack.push(curChar);
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPairChars(char a, char b) {
        if ((a == '{' && b == '}') || (a == '(' && b == ')') || (a == '[' && b == ']')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        System.out.println(isValid(s1));
    }
}
