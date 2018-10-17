package main.aarray;

import main.common.ArrayUtils;

/**
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * 24是除input数组中的第一个元素外的所有元素乘积，即2*3*4=23，假定数组长度大于1。
 * <p>
 * 备注：时间复杂度O（N）
 * Created by wong on 2018/10/17.
 */
public class MProductOfArrayExceptSelf {
    /**
     * 注意：特殊情况数组里有0，要区分是1个还是多个0
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int all = 1;
        int zeroFlag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroFlag++;
            }
            if (zeroFlag == 2) {
                all = 0;
                break;
            } else if (zeroFlag == 1 && nums[i] == 0) {

            } else {
                all = all * nums[i];
            }
        }
        int[] output = new int[nums.length];
        if (zeroFlag == 2) {
            return output;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                output[i] = all;
            }
            if (zeroFlag == 1 && nums[i] != 0) {
                output[i] = 0;
            }
            if (zeroFlag == 0) {
                output[i] = all / nums[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 0};
        int[] output = productExceptSelf(a);
        ArrayUtils.print(output);
    }

}
