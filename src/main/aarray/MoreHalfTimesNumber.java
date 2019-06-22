package main.aarray;

/**
 * 找出数组中出现次数超过一半的数
 * Created by wong on 2019/6/21.
 */
public class MoreHalfTimesNumber {

    public static int solution(int[] a) {
        int No = Integer.MAX_VALUE;

        if (a == null || a.length == 0) {
            return No;
        }

        if (a.length == 1) {
            return a[0];
        }
        int repeatTimes = 1;
        int target = a[0];
        for (int i = 1; i < a.length; i++) {
            if (repeatTimes == 0) {
                target = a[i];
                repeatTimes = 1;
                continue;
            }
            if (a[i] == target) {
                repeatTimes++;
            } else {
                repeatTimes--;
            }
        }

        repeatTimes = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                repeatTimes ++;
                if (repeatTimes > a.length/2){
                    return target;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 6, 7, 7, 3, 3, 3, 3, 3, 3, 4, 56, 5, 5, 3, 3, 3, 3, 33};
        System.out.println(solution(a));
    }
}
