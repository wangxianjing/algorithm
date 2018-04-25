package main.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：有一个整型数组和一个大小为w的窗口从数组左边滑到右边，记录下窗口任意时刻的最大值，
 * 复杂度O(N) 实现
 *
 * Created by wong on 18/4/25.
 */
public class CreateWindowMaxValueArray {
    private static int windowWidth = 3;
    private static int[] a = {4, 3, 5, 4, 3, 3, 6, 7};
    private static Deque<Integer> deque = new ArrayDeque<>();
    private static int i = 0;
    public static void getMaxValue() {
        int[] res = new int [a.length - windowWidth + 1];
        int index = 0;
        while (i < a.length) {
            while (!deque.isEmpty() && a[deque.peekLast()] < a[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (deque.peekFirst() == i - windowWidth) {
                deque.pollFirst();
            }
            if (i >= windowWidth - 1) {
                res[index ++] = a[deque.peekFirst()];
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
