package main.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：有一个整型数组和一个大小为w的窗口从数组左边滑到右边，记录下窗口任意时刻的最大值，
 * 复杂度O(N) 实现
 * <p>
 * Created by wong on 18/4/25.
 */
public class CreateWindowMaxValueArray {
    private static int windowWidth = 3;
    private static int[] a = {4, 3, 5, 4, 3, 3, 6, 7};
    //    private static int[] a = {9, 8, 7, 6, 5, 4, 3, 2};
    private static Deque<Integer> deque = new ArrayDeque<>();
    private static int i = 0;

    public static void getMaxValue() {
        int[] res = new int[a.length - windowWidth + 1];
        int index = 0;
        while (i < a.length) {
            while (!deque.isEmpty() && a[deque.peekLast()] < a[i]) {//确保放进队尾时最大
                deque.pollLast();
            }
            deque.addLast(i);//添加到队尾，确保每个索引下的值都有机会称为窗口内的最大值
            if (deque.peekFirst() == i - windowWidth) {
                deque.pollFirst();//过滤掉过期的队首最大值
            }
            if (i >= windowWidth - 1) {//索引达到达到窗口长度开始有“窗口内的最大值”
                res[index++] = a[deque.peekFirst()];
            }
            i++;
        }
        for (int a : res) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        getMaxValue();
    }
}
