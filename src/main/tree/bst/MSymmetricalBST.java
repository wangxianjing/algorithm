package main.tree.bst;

/**判断二叉树是不是镜像的
 * Created by wong on 2019/5/6.
 */
public class MSymmetricalBST {

    public static boolean isSymmetrical(TreeNode treeNode) {
        return helper(treeNode, treeNode);
    }


    public static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.getVal() != right.getVal()) {
            return false;
        }

        return helper(left.getLeft(), right.getRight()) && helper(left.getRight(), right.getLeft());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(2);
        root.setLeft(left1);
        root.setRight(right1);
        System.out.println(isSymmetrical(root));
    }
}
