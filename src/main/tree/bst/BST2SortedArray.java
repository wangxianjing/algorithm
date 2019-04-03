package main.tree.bst;

import java.util.LinkedList;

/**
 * https://blog.csdn.net/anonymalias/article/details/9204825
 * Created by wong on 18/6/25.
 */
public class BST2SortedArray {
    public static int[] solution(TreeNode treeNode) {
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = -100;
        }
        transfer(treeNode, a);
        return a;
    }

    static int index = 0;

    public static void transfer(TreeNode treeNode, int[] a) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.getLeft() != null) {
            transfer(treeNode.getLeft(), a);
        }
        a[index] = treeNode.getVal();
        index++;
        if (treeNode.getRight() != null) {
            transfer(treeNode.getRight(), a);
        }
    }

    public static void main(String[] args) {
        int[] a = solution(BaseBST.getTreeNode1());

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -100) {
                System.out.println(a[i]);
            }
        }
    }
}
