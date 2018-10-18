package main.aarray;

/**
 * 找到数组（长度N+1）里的重复的数字，一定有重复的，值的范围是【1，N】，可能不止重复一次。
 * <p>
 * <p>
 * 常见的解题方式：
 * 1、用set去重；
 * 2、排序后遍历找到相邻的元素相同的值。
 * 3、再创建一个数组。
 * Created by wong on 2018/10/18.
 */
public class MFindTheDuplicateNumber {

    public static int otherGoodSolution(int[] nums) {
        return -1;
    }

    /**
     * 时间复杂度太低O（N*N）
     *
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 2, 2};
        System.out.println(findDuplicate(a));
    }
}
