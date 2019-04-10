package main.tree.bst;

/**
 * 有点费解，分治法
 * Created by wong on 2019/4/10.
 */
public class MCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.getLeft(), p, q);
        TreeNode right = lowestCommonAncestor(root.getRight(), p, q);
        return left == null ? right : right == null ? left : root;
    }

    private static TreeNode treeNode1;

    public static void main(String[] args) {
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
        treeNode1L1.setRight(treeNodeL1R1);
        TreeNode treeNodeR1L1 = new TreeNode();
        treeNodeR1L1.setVal(13);
        treeNode1R1.setLeft(treeNodeR1L1);
        TreeNode treeNodeR1R1 = new TreeNode();
        treeNodeR1R1.setVal(27);
        treeNode1R1.setRight(treeNodeR1R1);
        TreeNode a = new TreeNode();
        a.setVal(33);
        treeNodeR1R1.setRight(a);
        TreeNode treeNode = lowestCommonAncestor(treeNode1, a, treeNode1R1);
        System.out.println(treeNode.getVal());

    }
}
