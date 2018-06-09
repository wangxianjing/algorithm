package main.bst;

/**
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 https://leetcode-cn.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/65/basic-operations-in-a-bst/174/
 * Created by wong on 18/6/9.
 */
public class SearchBST {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.getVal() == val) {
            return root;
        } else if (root.getVal() > val) {
            return searchBST(root.getLeft(), val);
        } else {
            return searchBST(root.getRight(), val);
        }
    }

    public static void main(String[] args) {
        System.out.println(searchBST(BaseBST.getTreeNode1(),13).getVal());
    }
}
