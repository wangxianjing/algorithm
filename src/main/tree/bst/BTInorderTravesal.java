package main.tree.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入：中序遍历得到的二叉树数组
 * 输出：逆序
 * Created by wong on 2019/6/3.
 */
public class BTInorderTravesal {
    public class TreeNode {
        int val;
        main.tree.bst.BTInorderTravesal.TreeNode left;
        main.tree.bst.BTInorderTravesal.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        solution(root, list);
        return list;
    }

    public void solution(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                solution(root.left,list);
            }
            list.add(root.val);
            if (root.right != null) {
                solution(root.right,list);
            }
        }
    }

    public static void main(String[] args) {
    }

}


