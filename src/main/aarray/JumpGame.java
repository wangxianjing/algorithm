package main.aarray;

/**
 * 非负数的数组里，该索引的值代表最大能往后跳的步数，判断能否跳到最后一个元素。
 * Created by wong on 2018/9/30.
 */
public class JumpGame {

    /**
     * https://leetcode.com/problems/jump-game/discuss/20917/Linear-and-simple-solution-in-C++
     *
     * @param nums
     * @return
     */
    public static boolean otherGoodSolution(int[] nums) {
        int length = nums.length;
        int maxReach = 0;
        for (int i = 0; i < length && i <= maxReach; i++) {
            maxReach = Math.max(maxReach, nums[i] + i);
        }
        return maxReach >= length-1;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{2, 3, 1, 1, 4};
        int[] a = new int[]{3,2,1,0,4};
        System.out.println(otherGoodSolution(a));
    }
}
