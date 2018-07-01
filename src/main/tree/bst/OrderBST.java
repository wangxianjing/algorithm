package main.tree.bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * http://biaobiaoqi.github.io/blog/2013/04/27/travsal-binary-tree/
 * <p>
 * 实现前序，中序遍历，后序遍历
 * <p>
 * Created by wong on 18/6/3.
 */
public class OrderBST {

    public static void preOrder1(TreeNode treeNode) {//递归实现前序遍历
        if (treeNode != null) {
            System.out.println(treeNode.getVal());
            preOrder1(treeNode.getLeft());
            preOrder1(treeNode.getRight());
        }
    }

    public static void preOrder2(TreeNode treeNode) {//循环实现前序遍历
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(treeNode);
        while (!stack.isEmpty()) {
            TreeNode treeNode1 = stack.pop();
            System.out.println(treeNode1.getVal());
            if (treeNode1.getRight() != null) {
                stack.push(treeNode1.getRight());
            }
            if (treeNode1.getLeft() != null) {
                stack.push(treeNode1.getLeft());
            }
        }
    }

    public static void preOrder3(TreeNode treeNode) {//另一种循环实现前序遍历
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        while (treeNode != null || !treeNodes.isEmpty()) {
            while (treeNode != null) {
                System.out.println(treeNode.getVal());
                treeNodes.add(treeNode);
                treeNode = treeNode.getLeft();
            }
            treeNode = treeNodes.pop();
            treeNode = treeNode.getRight();
        }
    }

    public static void middleOrder1(TreeNode treeNode) {//递归实现中序遍历
        if (treeNode != null) {
            middleOrder1(treeNode.getLeft());
            System.out.println(treeNode.getVal());
            middleOrder1(treeNode.getRight());
        }
    }

    public static void middleOrder2(TreeNode treeNode) {//循环实现中序遍历
        if (treeNode == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                stack.add(treeNode);
                treeNode = treeNode.getLeft();
            }
            treeNode = stack.pop();
            System.out.println(treeNode.getVal());
            treeNode = treeNode.getRight();
        }
    }

    public static void postOrder1(TreeNode treeNode) {//递归实现后序遍历
        if (treeNode != null) {
            postOrder1(treeNode.getLeft());
            postOrder1(treeNode.getRight());
            System.out.println(treeNode.getVal());
        }
    }

    public static void postOrder2(TreeNode treeNode) {//循环实现后序遍历
        Stack<TreeNode> stack = new Stack<>();
        int[] flag = new int[1000];
        while (treeNode != null) {
            stack.push(treeNode);
            flag[stack.size()] = 0;
            treeNode = treeNode.getLeft();
        }

        while (!stack.isEmpty()) {
            treeNode = stack.peek();
            while (treeNode.getRight() != null && flag[stack.size()] == 0) {
                treeNode = treeNode.getRight();
                flag[stack.size()] = 1;
                while (treeNode != null) {
                    stack.push(treeNode);
                    flag[stack.size()] = 0;
                    treeNode = treeNode.getLeft();
                }
                treeNode = stack.peek();
            }
            treeNode = stack.pop();
            System.out.println(treeNode.getVal());
        }
    }

    public static void levelOrder(TreeNode treeNode) {//层序遍历
        if (treeNode == null) {
            return;
        }

        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(treeNode);
        while (treeNodes.size() != 0) {
            treeNode = treeNodes.poll();
            System.out.println(treeNode.getVal());
            if (treeNode.getLeft() != null) {
                treeNodes.add(treeNode.getLeft());
            }
            if (treeNode.getRight() != null) {
                treeNodes.add(treeNode.getRight());
            }
        }
    }

    public static void main(String[] args) {
//        preOrder(BaseBST.getTreeNode1());
//        middleOrder(BaseBST.getTreeNode1());
//        postOrder(BaseBST.getTreeNode1());
//        preOrder2(BaseBST.getTreeNode1());
//        preOrder3(BaseBST.getTreeNode1());
//        middleOrder2(BaseBST.getTreeNode1());
//        levelOrder(BaseBST.getTreeNode1());
        postOrder2(BaseBST.getTreeNode1());
    }

}
