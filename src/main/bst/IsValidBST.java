package main.bst;

/**
 * 判断是否是合法的BST
 *
 * Created by wong on 18/6/3.
 */
public class IsValidBST {

    public static boolean isValid(TreeNode treeNode) {
        while (treeNode != null) {
            boolean currentNodeIsValid = currentNodeIsValid(treeNode);
            boolean leftChildAndRightChildBothValid = leftChildAndRightChildBothValid(treeNode);
            return currentNodeIsValid && leftChildAndRightChildBothValid;
        }
        return true;
    }

    public static boolean leftChildAndRightChildBothValid(TreeNode treeNode) {
        boolean left = true;
        if (treeNode.getLeft() != null) {
            left = isValid(treeNode.getLeft());
        }

        boolean right = true;
        if (treeNode.getRight() != null) {
            right = isValid(treeNode.getRight());
        }

        return left && right;
    }

    public static boolean currentNodeIsValid(TreeNode treeNode) {
        if (treeNode.getLeft() != null && treeNode.getLeft().getVal() > treeNode.getVal()) {
            return false;
        }

        if (treeNode.getRight() != null && treeNode.getRight().getVal() < treeNode.getVal()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid(BaseBST.getTreeNode1()));
    }
}
