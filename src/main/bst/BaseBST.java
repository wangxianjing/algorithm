package main.bst;

/**
 * Created by wong on 18/6/3.
 */
public class BaseBST {
    private static TreeNode treeNode1;
    private static TreeNode treeNode2;

    static {
        treeNode1 = new TreeNode();
        treeNode1.setVal(10);
        TreeNode treeNode1L1 = new TreeNode();
        treeNode1L1.setVal(8);
        treeNode1.setLeft(treeNode1L1);
        TreeNode treeNode1R1 = new TreeNode();
        treeNode1R1.setVal(14);
        treeNode1.setRight(treeNode1R1);
        TreeNode treeNodeL1L1 = new TreeNode();
        treeNodeL1L1.setVal(5);
        treeNode1L1.setLeft(treeNodeL1L1);
        TreeNode treeNodeL1R1 = new TreeNode();
        treeNodeL1R1.setVal(9);
        TreeNode treeNodeR1L1 = new TreeNode();
        treeNodeL1R1.setVal(13);
        treeNode1R1.setLeft(treeNodeR1L1);
        TreeNode treeNodeR1R1 = new TreeNode();
        treeNodeR1R1.setVal(1);
        treeNode1R1.setRight(treeNodeR1R1);
    }

    public static TreeNode getTreeNode1() {
        return treeNode1;
    }

    public static void setTreeNode1(TreeNode treeNode1) {
        BaseBST.treeNode1 = treeNode1;
    }
}
