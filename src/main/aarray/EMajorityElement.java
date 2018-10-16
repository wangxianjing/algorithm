package main.aarray;

/**
 * 找到数组中"大多数"，出现次数大于N/2。假设一定会出现，数组不为空。
 * <p>
 * Created by wong on 2018/10/16.
 */
public class EMajorityElement {

    /**
     * https://leetcode.com/problems/majority-element/discuss/51613/O(n)-time-O(1)-space-fastest-solution
     * <p>
     * https://leetcode.com/problems/majority-element/solution/
     *
     * @param nums
     * @return
     */
    public static int otherGoodSolution(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(otherGoodSolution(a));
    }

}
