package main.aarray;

import main.common.ArrayUtils;

/**
 * 求topK最大值。
 * Created by wong on 2019/6/21.
 */
public class TopK {

    public static void solution(int[] input, int K) {
        buildTopK(input, K);
        for (int i = K; i < input.length; i++) {
            compare2(input, i, K);
        }
    }

    public static void compare2(int[] input, int index, int K) {
        if (input[index] > input[0]) {
            swap(input, 0, index);
            heapify(input, 0, K);
        }
    }

    public static void print(int[] input, int K, int index) {
        if (index >= K) {
            return;
        }
        System.out.println(input[index]);
        ;
        print(input, K, index * 2 + 1);
        print(input, K, index * 2 + 2);
    }

    public static void buildTopK(int[] input, int K) {
        for (int i = K / 2; i >= 0; i--) {
            heapify(input, i, K);
        }
    }

    public static void heapify(int[] input, int index, int K) {
        int minIndex = index;
        int leftIndex = index * 2 + 1;
        int rightIndex = index * 2 + 2;
        if (leftIndex < K && input[leftIndex] < input[minIndex]) {
            minIndex = leftIndex;
        }

        if (rightIndex < K && input[rightIndex] < input[minIndex]) {
            minIndex = rightIndex;
        }

        if (minIndex != index) {
            swap(input, minIndex, index);
            heapify(input, minIndex, K);
        }
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void sort(int[] a) {
        for (int i = 4; i >= 0; i--) {
            swap(a, i, 0);
            heapify(a, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 6, 7, 8, 3, 32, 4, 5, 6, 38, 21, 12, 3,40,33};
        solution(a, 5);
//        sort(a);
        ArrayUtils.print(a);
//        System.out.println(a);
//        print(a,5,0);
    }
}
