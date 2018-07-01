package main.tree.bst;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 二叉树反转，https://blog.csdn.net/sunao2002002/article/details/46482559
 *
 * Created by wong on 18/6/24.
 */
public class InvertBST {

    /**
     * 递归实现
     * @param root
     */
    public static void invert1(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return;
        } else if (root.getLeft() != null && root.getRight() == null) {
            root.setRight(root.getLeft());
            invert1(root.getRight());
        } else if (root.getLeft() == null && root.getRight() != null) {
            root.setLeft(root.getRight());
            invert1(root.getLeft());
        } else {
            TreeNode left = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(left);
            invert1(root.getLeft());
            invert1(root.getRight());
        }
    }

    /**
     * 循环实现，类似层序遍历，不断往队列里塞数据然后取数据，然后反转。
     * @param root
     * @return
     */
    public static TreeNode invert2(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            TreeNode temp = cur.getRight();
            cur.setRight(cur.getLeft());
            cur.setLeft(temp);
            if (cur.getLeft() != null) {
                q.offer(cur.getLeft());
            }
            if (cur.getRight() != null) {
                q.offer(cur.getRight());
            }
        }
        return root;
    }

    public static void main(String[] args) {
        invert2(BaseBST.getTreeNode1());
        OrderBST.middleOrder2(BaseBST.getTreeNode1());
    }
}
