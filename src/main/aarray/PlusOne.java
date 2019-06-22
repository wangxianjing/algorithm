package main.aarray;

import main.common.ArrayUtils;

/**
 * Created by wong on 2018/9/23.
 */
public class PlusOne {

    public static int[] myResolve(int[] digits) {
        int plusFlag = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i] + plusFlag;
            if (value > 9) {
                if (i == 0) {
                    int[] newNumbers = new int[digits.length + 1];
                    newNumbers[0] = 1;
                    return newNumbers;
                }
                digits[i] = 0;
                plusFlag = 1;
            } else {
                digits[i] = value;
                return digits;
            }
        }

        return new int[]{};
    }

    public static int[] otherGoodResolution(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumbers = new int[length + 1];
        newNumbers[0] = 1;
        return newNumbers;

    }

    public static void main(String[] args) {
        int[] a = new int[]{9};
        int[] ints = myResolve(a);
        ArrayUtils.print(ints);

    }
}
