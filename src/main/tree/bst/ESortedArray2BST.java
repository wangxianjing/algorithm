package main.tree.bst;

/**
 * Created by wong on 2019/4/15.
 */
public class ESortedArray2BST {


    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.setLeft(helper(nums, low, mid - 1));
        midNode.setRight(helper(nums, mid + 1, high));
        return midNode;
    }

    public static void main(String[] args) {
        int [] a= new int[]{1,2,3,4,5,6,7,8};
        TreeNode treeNode = sortedArrayToBST(a);
        OrderBST.middleOrder1(treeNode);
    }
}
