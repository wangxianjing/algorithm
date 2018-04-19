package main.sort;

public class BubblingSort extends BaseSort {

    public static void main(String[] args) {
        int length = data.length;
        for (int i = 0;i < length -1;i ++) {
            for (int j = 0;j < length -1-i;j++){
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        print();
    }
}
