package main.aarray;

/**
 * 找到数组中"大多数"，出现次数大于N/2。假设一定会出现，数组不为空。
 * <p>
 * Created by wong on 2018/10/16.
 */
public class EMajorityElement {

    /**
     * 时间复杂度O（N），空间复杂度O（1）
     * <p>
     * https://leetcode.com/problems/majority-element/discuss/51613/O(n)-time-O(1)-space-fastest-solution
     * <p>
     * https://leetcode.com/problems/majority-element/solution/
     * <p>
     * 多数投票算法(Boyer-Moore Algorithm)详解:https://blog.csdn.net/kimixuchen/article/details/52787307
     * <p>
     * 备注：如果事先不知道是否存在，那就先假定存在并"找出"；再验证是否存在！
     * <p>
     * 其它普通的做法有：
     * 1、用Hash表
     * 2、排序，中间那个元素一定是要找的值
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
