package main.sort;

/**
 * https://blog.csdn.net/zdp072/article/details/44227317
 * Created by wong on 18/7/1.
 */
public class HeapSort extends BaseSort {

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapAdjust(arr, 0, i);
        }
    }

    public static void heapAdjust(int[] arr, int i, int n) {
        int child;
        int father;
        for (father = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);

            if (child != n - 1 && arr[child] < arr[child + 1]) {
                child++;
            }

            if (father < arr[child]) {
                arr[i] = arr[child];
            } else {
                break;
            }
        }
        arr[i] = father;
    }

    public static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    // 构造大顶堆-----------------------------------------------------------------

    public static void buildHeap(int[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i, a.length);
        }
    }

    public static void heapify(int[] a, int i, int n) {
        int maxIndex = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        if (leftChildIndex <= n - 1 && a[maxIndex] <= a[leftChildIndex]) {
            maxIndex = leftChildIndex;
        }
        if (rightChildIndex <= n - 1 && a[maxIndex] <= a[rightChildIndex]) {
            maxIndex = rightChildIndex;
        }
        if (maxIndex != i) {
            swap(a, i, maxIndex);
            heapify(a, maxIndex, n);
        }
    }

    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, i, 0);
            heapify(a, 0, i - 1);
        }
    }

    public static void main(String[] args) {
//        heapSort(data);
//        heapSort(data2);
//        print();
//        System.out.println(data.length);
//        int[] a = new int[]{8, 10, 15, 12, 13, 18, 17, 16};
//        buildHeap(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        sort(a);
//        System.out.println("99999999999999");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        buildHeap(data);
        sort(data);
        print();

//        print();
    }
}
