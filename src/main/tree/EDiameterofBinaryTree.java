package main.tree;

import main.tree.bst.BaseBST;
import main.tree.bst.TreeNode;

import java.util.Map;

/**
 * 计算二叉树直径
 * Created by wong on 2019/4/4.
 */
public class EDiameterofBinaryTree {

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dia = solution(root.getLeft()) + solution(root.getRight());
        int ldir = diameterOfBinaryTree(root.getLeft());
        int rdir = diameterOfBinaryTree(root.getRight());
        return Math.max(dia, Math.max(ldir, rdir));
    }

    public static int solution(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = solution(treeNode.getLeft());
        int right = solution(treeNode.getRight());
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        root.setVal(2);
        TreeNode left = new TreeNode();
        left.setVal(3);
        root.setLeft(left);
        TreeNode right = new TreeNode();
        right.setVal(1);
        root.setRight(right);
        System.out.println(diameterOfBinaryTree(BaseBST.getTreeNode1()));
        System.out.println(diameterOfBinaryTree(root));
    }
}
