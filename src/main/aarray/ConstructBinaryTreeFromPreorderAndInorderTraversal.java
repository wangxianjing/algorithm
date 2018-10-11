package main.aarray;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据前序和中序遍历的数组生成生成树,注意数组中无重复数据。
 * Created by wong on 2018\10\10 0010.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
    // /discuss/34541/5ms-Java-Clean-Solution-with-Caching
    // https://articles.leetcode.com/construct-binary-tree-from-inorder-and-preorder-postorder-traversal
    public static TreeNode otherGoodSolution(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder,
                0, inorder.length - 1, inMap);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                                     int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder,
                inRoot + 1, inEnd, inMap);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = new int[]{3, 9, 20, 15, 7};
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = otherGoodSolution(preOrder, inOrder);
        print(treeNode);
    }

    public static void print(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            print(root.left);
            print(root.right);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
