package main.tree.bst;

/**
 * 判断是不是相同的二叉树
 * Created by wong on 2019/5/6.
 */
public class EIsTheSameTree {
    public static boolean isSame(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null) {
            return true;
        }

        if ((treeNode1 != null && treeNode2 == null) || (treeNode1 == null && treeNode2 != null) ||
                (treeNode1.getVal() != treeNode2.getVal())) {
            return false;
        } else {
            return isSame(treeNode1.getLeft(), treeNode2.getLeft()) && isSame(treeNode1.getRight(), treeNode2.getRight());
        }
    }
}
