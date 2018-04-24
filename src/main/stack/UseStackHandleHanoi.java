package main.stack;

import java.util.Stack;

/**
 * 题目：用栈解决汉诺塔问题，将a栈上的数据移到c栈上，一次移动一个数据，且任意时刻任意一个栈下面的元素必须大于栈上面的元素
 *
 * Created by wong on 18/4/24.
 */
public class UseStackHandleHanoi {

    public static int count = 0;
    public static Stack<Integer> aStack;
    public static Stack<Integer> bStack;
    public static Stack<Integer> cStack;

    static {
        aStack = new Stack<>();
        aStack.push(5);
        aStack.push(4);
        aStack.push(3);
        aStack.push(2);
        aStack.push(1);

        bStack = new Stack<>();
        cStack = new Stack<>();
    }

    public static void hanoi1(int size, Stack<Integer> aStack, Stack<Integer> bStack, Stack<Integer> cStack) {
        if (size == 1) {
            cStack.push(aStack.pop());//这里是最后一步，从a移到c
            count++;
        } else {
            count++;//把大象放到冰箱有3步
            hanoi1(size - 1, aStack, cStack, bStack);//第一步打开冰箱，将上面的size-1个移到辅助的b栈上
            cStack.push(aStack.pop());//打开冰箱的第二步，将a栈的唯一一个放到c栈上
            hanoi1(size - 1, bStack, aStack, cStack);//打开冰箱第三步，将剩下的size-1个从b栈移到c栈上
        }
    }

    public static void hanoi2(int size, Stack<Integer> aStack, Stack<Integer> bStack, Stack<Integer> cStack) {
        if (size == 1) {
            cStack.push(aStack.pop());
            count++;
        } else {
            count++;
            int n = bStack.size();
            hanoi2(size - 1, aStack, cStack, bStack);
            cStack.push(aStack.pop());
            hanoi2(bStack.size() - n, bStack, aStack, cStack);//这一步还没理解
        }
    }

    /**
     * 两种方式的步骤都是一样的
     *
     * @param args
     */
    public static void main(String[] args) {
        hanoi1(aStack.size(), aStack, bStack, cStack);
        hanoi2(aStack.size(), aStack, bStack, cStack);
        System.out.println(cStack);
        System.out.println(count);
    }

}
