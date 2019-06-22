package main.stack;

import java.util.Stack;

/**
 * 题目： 两个栈实现一个队列
 * <p>
 * 这题是看了解题思路编写
 * <p>
 * 注意两点：
 * 1.如果popStack不为空，则不能把数据压人popStack。
 * 2，如果要往popStack中压入数据，则一次性全量从pushStack中取出并压入
 * <p>
 * Created by wong on 18/4/22.
 */
public class TwoStacksBuildQuere {

    public static class MyStack {
        public static Stack<Integer> pushStack = new Stack<>();//用来入栈时存放在这个栈里
        public static Stack<Integer> popStack = new Stack<>();//出栈时从这个栈里出

        public static void push(Integer data) {
            pushStack.push(data);
        }

        public static Integer pop() {
            if (popStack.isEmpty()) {
                if (pushStack.isEmpty()) {
                    throw new RuntimeException("no data in stack");
                } else {
                    while (!pushStack.isEmpty()) {
                        popStack.push(pushStack.pop());
                    }
                }
            }
            return popStack.pop();
        }
    }

    public static void main(String[] args) {
        MyStack.push(3);
        MyStack.push(4);
        MyStack.push(1);
        System.out.println(3 == MyStack.pop());
        System.out.println(4 == MyStack.pop());
        System.out.println(1 == MyStack.pop());
        MyStack.push(4);
        MyStack.push(8);
        System.out.println(4 == MyStack.pop());
        System.out.println(8 == MyStack.pop());

    }
}
