package main.stack;

import java.util.Stack;

/**
 * 本题看着别人的结题思路敲的代码。
 * <p>
 * 普通的栈的基础上实现返回栈中最小元素的操作。要求：pop、push、getMin操作的时间复杂度都是O(1)
 * <p>
 * 解题思路：stackData记录栈的所有数据，minStack栈的顶层是当前栈中的最小值
 * <p>
 * 入栈：开始时两个栈都压入数据；如果的数据小于或者等于minStack中栈顶数据，则也压入minStack栈
 * <p>
 * 出栈：如果dataStack栈顶元素等于minStack栈顶元素则minStack也pop数据
 * <p>
 * 查最小值：从minStack中的栈顶元素就是最小值。
 * Created by wong on 18/4/22.
 */
public class GetMinStack {

    public static class Mystack {
        private static Stack<Integer> stackData = new Stack<>();
        private static Stack<Integer> minStack = new Stack<>();

        public static void push(Integer data) {
            stackData.push(data);
            if (minStack.isEmpty() || minStack.peek() >= data) {
                minStack.push(data);
            }
        }

        public static int pop() {
            if (stackData.isEmpty()) {
                throw new RuntimeException("stackData is empty");
            }
            if (minStack.peek() == stackData.peek()) {
                minStack.pop();
            }
            return stackData.pop();
        }

        public static int getMin() {
            if (minStack.isEmpty()) {
                throw new RuntimeException("minStack id empty");
            }
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        Mystack.push(3);
        Mystack.push(6);
        Mystack.push(5);
        Mystack.push(1);
        Mystack.push(3);
        Mystack.push(7);
        System.out.println(1 == Mystack.getMin());
        System.out.println(7 == Mystack.pop());
        System.out.println(1 == Mystack.getMin());

        System.out.println(3 == Mystack.pop());
        System.out.println(1 == Mystack.getMin());

        System.out.println(1 == Mystack.pop());
        System.out.println(3 == Mystack.getMin());

        System.out.println(5 == Mystack.pop());
        System.out.println(3 == Mystack.getMin());

        System.out.println(6 == Mystack.pop());
        System.out.println(3 == Mystack.getMin());

        System.out.println(3 == Mystack.pop());
        System.out.println(Mystack.minStack.isEmpty());

    }

}
