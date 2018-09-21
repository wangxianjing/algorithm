package main.aarray;

/**
 * Created by wong on 2018/9/21.
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low = 0, high = nums.length;//如果大于最大值，那么high就必须位length
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid;//不是mid-1是为了防止出现-1
            else low = mid + 1;
        }
        return high;
    }

    /**
     * https://leetcode.com/problems/search-insert-position/discuss/15080/My-8-line-Java-solution
     *
     * @param A
     * @param target
     * @return
     */
    public static int searchInsertOthers(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
//        int[] a= new int[]{1,3,5,6};
        int[] a = new int[]{1, 3};
//        int[] a = new int[]{1, 3, 4, 5, 10};
        System.out.println(searchInsert(a, 2));
    }
}