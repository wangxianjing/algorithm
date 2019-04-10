package main.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 求二叉树的深度
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
 * Created by wong on 2019/4/10.
 */
public class MaxDepthBST {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return solution(root, 1);
    }

    public static int solution(TreeNode root, int max) {
        if (root.getLeft() == null && root.getRight() == null) {
            return max;
        }

        int rightMax = max;
        int leftMax = max;
        if (root.getRight() != null) {
            rightMax++;
            rightMax = solution(root.getRight(), rightMax);
        }
        if (root.getLeft() != null) {
            leftMax++;
            leftMax = solution(root.getLeft(), leftMax);
        }
        return Math.max(rightMax, leftMax);
    }

    public static void main(String[] args) {
        System.out.println(maxDepth(BaseBST.getTreeNode1()));
    }
}
