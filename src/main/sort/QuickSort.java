package main.sort;

public class QuickSort extends BaseSort {

    public static void sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int key = a[left];
        while (i < j) {
            while (i < j && key <= a[j]) {//这里可以有等于也可以没有，为了便于记忆这里也加个等于，为什么必须先是j--?因为否则会出现一直i++然后比基准值大的数和基准值调换(https://blog.csdn.net/w282529350/article/details/50982650)
                j--;
            }
            while (i < j && key >= a[i]) {//这里必须要有等于，否则没法继续往前移动了
                i++;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        a[left] = a[i];
        a[i] = key;
        sort(a, left, i - 1);
        sort(a, i + 1, right);
    }

    public static void main(String[] args) {
        int left = 0;
        int right = data.length - 1;
        sort(data, left, right);
        sort(data2, 0, data2.length - 1);
        print();
    }
}
