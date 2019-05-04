package main.sort;

/**
 * 时间复杂度稳定在O（n*2），效率略低
 * 选择后面最小的放在"最先头"
 */
public class SelectionSort extends BaseSort {
    public static void sort(int[] a, int startPosition) {
        if (startPosition == a.length - 1) {
            return;
        }
        int minPosition = startPosition;
        for (int i = startPosition; i < a.length - 1; i++) {
            if (a[minPosition] > a[i + 1]) {
                minPosition = i + 1;            //找到最小值的位置
            }
        }
        int temp = a[minPosition];
        a[minPosition] = a[startPosition];
        a[startPosition] = temp;               //将最小值和当前混乱的部分最小位置的值交换
        sort(a, startPosition + 1);//有序的值多了一个，继续往后将混乱的给排序
    }

    public static void main(String[] args) {
        sort(data, 0);
        sort(data2,0);
        print();

    }
}
