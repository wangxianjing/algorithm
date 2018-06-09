package main.bst;

/**
 * 想BST中插入新的节点，若插入成功返回true，若树中已经有相同的值，则不插入，返回FALSE。
 * Created by wong on 18/6/9.
 */
public class InsertBST {

    public static boolean insert(TreeNode root, int a) {
        if (root == null) {
            root = new TreeNode();
            root.setVal(a);
            return true;
        } else {
            if (root.getVal() == a) {
                return false;
            } else if (root.getVal() > a) {
                if (root.getLeft() == null) {
                    TreeNode left = new TreeNode();
                    left.setVal(a);
                    root.setLeft(left);
                    return true;
                } else {
                    return insert(root.getLeft(), a);
                }
            } else {
                if (root.getRight() == null) {
                    TreeNode right = new TreeNode();
                    right.setVal(a);
                    root.setRight(right);
                    return true;
                } else {
                    return insert(root.getRight(), a);
                }
            }
        }
    }

    public static void main(String[] args) {
        insert(BaseBST.getTreeNode1(), 11);
        OrderBST.middleOrder2(BaseBST.getTreeNode1());
    }
}
