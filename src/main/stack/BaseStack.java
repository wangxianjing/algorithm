package main.stack;

import java.util.Stack;

/**
 * Created by wong on 18/4/23.
 */
public abstract class BaseStack {

    public static Stack<Integer> stack;

    static {
        stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(6);
        stack.push(4);
        stack.push(3);
        stack.push(2);
    }

    public static void print() {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
