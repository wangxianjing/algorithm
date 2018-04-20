package main.sort;

public class BubblingSort extends BaseSort {

    public static void main(String[] args) {
        sort(data);
        sort(data2);
        print();
    }

    private static void sort(int[] a) {
        int length = a.length;
        for (int i = 0;i < length -1;i ++) {
            for (int j = 0;j < length -1-i;j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
