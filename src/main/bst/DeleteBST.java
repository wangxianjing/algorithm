package main.bst;

/**
 * 删除BST上的一个节点
 * https://blog.csdn.net/nzh1234/article/details/31076401
 * Created by wong on 18/6/9.
 */
public class DeleteBST {
    public static void delete(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        TreeNode curNode = root;
        TreeNode parentNode = null;
        while (curNode != null && curNode.getVal() != val) {//找到要删除的节点curNode及它的父节点
            if (curNode.getVal() > val) {
                parentNode = curNode;
                curNode = parentNode.getLeft();
            } else if (curNode.getVal() < val) {
                parentNode = curNode;
                curNode = parentNode.getRight();
            }
        }
        if (curNode == null) {//如果没找到，就直接返回
            return;
        }
        if (curNode.getLeft() == null && curNode.getRight() != null) {//只有右边节点
            if (curNode == root) {
                root = root.getRight();
            } else if (curNode == parentNode.getLeft()) {
                parentNode.setLeft(curNode.getRight());
            } else if (curNode == parentNode.getRight()) {
                parentNode.setRight(curNode.getRight());
            }
        } else if (curNode.getRight() == null && curNode.getLeft() != null) {//只有左边节点
            if (curNode == root) {
                root = root.getLeft();
            } else if (parentNode.getLeft() == curNode) {
                parentNode.setLeft(curNode.getLeft());
            } else if (parentNode.getRight() == curNode) {
                parentNode.setRight(curNode.getLeft());
            }
        } else if (curNode.getLeft() != null && curNode.getRight() != null) {//将目标节点的右子树的最左边节点替换目标节点的值，然后删除最左边节点
            TreeNode left = curNode.getRight();
            parentNode = curNode;
            while (left.getLeft() != null) {//找到目标节点的右边节点的最左边节点
                parentNode = left;
                left = left.getLeft();
            }
            curNode.setVal(left.getVal());//目标节点的值替换
            //删除目标节点的右边节点的最左边节点。
            if (parentNode.getLeft() == left) {
                parentNode.setLeft(left.getRight());
            } else {
                parentNode.setRight(left.getRight());
            }
        } else if (curNode.getLeft() == null && curNode.getRight() == null) {//目标节点没有左节点也没有右节点
            if (curNode == root) {
                root = null;
            } else if (parentNode.getLeft() == curNode) {
                parentNode.setLeft(null);
            } else if (parentNode.getRight() == curNode) {
                parentNode.setRight(null);
            }
        }
    }

    public static void main(String[] args) {
        delete(BaseBST.getTreeNode1(), 10);
        OrderBST.middleOrder2(BaseBST.getTreeNode1());
    }
}
