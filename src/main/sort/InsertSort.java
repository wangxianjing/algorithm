package main.sort;

public class InsertSort extends BaseSort {

    public static void sort(int[] a) {
        int targetIndex = 0;
        while (targetIndex < a.length) {
            if (targetIndex == 0) {
                targetIndex++;
                continue;
            }
            int temp = a[targetIndex];
            int tempIndex = targetIndex;
            while (tempIndex > 0 && temp < a[tempIndex - 1]) {
                a[tempIndex] = a[tempIndex - 1];
                tempIndex--;
            }
            a[tempIndex] = temp;
            targetIndex++;
        }
    }

    public static void main(String[] args) {
        sort(data);
        sort(data2);
        print();
    }
}
