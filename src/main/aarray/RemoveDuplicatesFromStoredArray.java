package main.aarray;

public class RemoveDuplicatesFromStoredArray {
public static int [] a = new int[]{2,3,4,4,4,5,5,6,6,7,8,9,9,9,9,10};
    public static int resolve(int []a) {
        if (a == null || a.length == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < a.length; i ++){
            if (a[max] != a[i]) {
                max++;
                a[max] = a[i];
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(resolve(a)));
    }
}
