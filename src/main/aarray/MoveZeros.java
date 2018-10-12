package main.aarray;

import main.common.ArrayUtils;

/**
 * 把数组中的0全部移动到数组末尾，要求：不能再new新数组；要尽可能少的操作次数
 * Created by wong on 2018/10/12.
 */
public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            if (i < nums.length) {
                nums[cur] = nums[i];
                cur++;
            }
        }
        while (cur < nums.length) {
            nums[cur] = 0;
            cur++;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 3, 12};
        moveZeroes(a);
        ArrayUtils.print(a);
    }

}
