package main.stack;

import java.util.Stack;

/**
 * 题目：用一个栈实现另一个栈的排序，只能申请一个栈，不能申请额外的数据结构
 * <p>
 * 思路：申请辅助的栈为help,stack上pop操作，弹出元素记为cur
 * 如果cur小于或等于help栈顶元素，则将cur压入help
 * 如果cur大于help栈顶元素，那么将help里数据弹出到stack里面直到cur小于等于help栈顶元素
 * 重复以上操作直到stack为空，再将help全部弹出压入stack。
 * <p>
 * 要点：要保证help中是排序的且一直是排序的！！！！
 * <p>
 * Created by wong on 18/4/23.
 */
public class OneStackSortAnotherStack extends BaseStack {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();

        while (!stack.isEmpty()) {
            Integer cur = stack.pop();
            if (help.isEmpty()) {
                help.push(cur);
            } else if (cur <= help.peek()) {
                help.push(cur);
            } else {
                while (!help.isEmpty() && cur > help.peek()) {
                    stack.push(help.pop());
                }
                help.push(cur);
            }
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        sort(stack);
        print();
    }
}
