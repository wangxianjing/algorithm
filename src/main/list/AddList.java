package main.list;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 两个链表对应位相加，生成新的链表
 *
 * 解法1：将链表放到栈中，依次取出相加放到新的栈中，再弹出栈放到链表中
 * 解法2：将两个链表逆序，依次相加生成新的链表。再将三个链表都逆序。
 *
 * 代码中用解法1
 */
public class AddList extends BaseList{

    static List<Integer> add(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list1.size()<1){
            return list2;
        }
        if (list2 == null || list2.size()< 1) {
            return list1;
        }
        Stack<Integer> stack1 = new Stack<>();
        for (int i : list1) {
            stack1.add(i);
        }
        Stack<Integer> stack2 = new Stack<>();
        for (int i : list2) {
            stack2.add(i);
        }
        Stack<Integer> resultStack = new Stack<>();
        if (stack1.size() > stack2.size()) {
            resultStack = getResultStack(stack1,stack2);
        } else {
            resultStack = getResultStack(stack2,stack1);
        }
        List<Integer> resultList = new ArrayList<>();
        while (!resultStack.isEmpty()) {
            resultList.add(resultStack.pop());
        }
        return resultList;
    }

    public static Stack<Integer> getResultStack(Stack<Integer> big,Stack<Integer> small) {
        Stack<Integer> resultStack = new Stack<>();
        boolean flag = false;
        while (!big.isEmpty()) {
            Integer value1 = big.pop();
            if (flag) {
                value1 = value1 + 1;
                flag = false;
            }
            if (!small.isEmpty()){
                value1 = value1 + small.pop();
            }
            if (value1 > 9) {
                flag = true;
                resultStack.add(value1%10);
            } else {
                resultStack.add(value1);
            }
        }
        return resultStack;
    }
    public static void main(String[] args) {
        List<Integer> list1 = add(BaseList.list, otherList);
        System.out.println(list1);
    }
}
