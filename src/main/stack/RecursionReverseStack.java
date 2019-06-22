package main.stack;

import java.util.Stack;

/**
 * 题目：用递归实现栈的逆序
 * <p>
 * 这题连个递归有点绕，不易理解！！！！
 * 可以参考：https://www.nowcoder.com/questionTerminal/ba7d7f5d1edf4d1690d66e12e951f6ea
 * <p>
 * Created by wong on 18/4/23.
 */
public class RecursionReverseStack extends BaseStack {

    public static int getAndRemoveLastData(Stack<Integer> stack) {//这个函数要注意只是返回最底下一个元素，其余的不要动。
        Integer result = stack.pop();//第一步先pop出来总没错，不然下面的元素怎么get到呢
        if (stack.isEmpty()) {
            return result;//这里返回最底下的元素
        } else {
            int lastData = getAndRemoveLastData(stack);
            stack.push(result);//所以这里要push回去
            return lastData;
        }
    }


    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;//这个是第一次退出递归，当栈中的所有元素都被逆序取出来时，返回上一层执行；stack.push(i);
        }
        int i = getAndRemoveLastData(stack);
        reverse(stack);
        stack.push(i);//该依次进行逆序放入栈中，执行了几次递归就push几次
    }


    public static void main(String[] args) {
        reverse(stack);
        print();
    }
}