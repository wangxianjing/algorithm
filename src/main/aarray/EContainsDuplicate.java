package main.aarray;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断数组中是否存在重复的元素，是返回true。
 * <p>
 * Created by wong on 2018/10/16.
 */
public class EContainsDuplicate {


    /**
     * 时间复杂度是N，空间复杂度也是N。
     * https://leetcode.com/problems/contains-duplicate/solution/
     * <p>
     * 其它常见方法：
     * 1、排序，然后遍历判断是否存在nums[i]==nums[i+1]
     *
     * @param nums
     * @return
     */
    public static boolean otherGoodSolutions(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 1};
        System.out.println(otherGoodSolutions(a));
    }
}
