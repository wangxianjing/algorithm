package main.dp;

import java.util.LinkedList;
import java.util.List;

/**
 * 构造处来所有可能的bst
 * Created by wong on 2018/11/19.
 */
public class MUniqueBinarySearchTreesii {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * https://leetcode.com/articles/unique-binary-search-trees-ii/
     *
     * @param n
     * @return
     */
    public static List<TreeNode> otherGoodSolution(int n) {
        if (n <= 0) {
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1, n);
    }

    public static List<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> all_trees = new LinkedList<TreeNode>();
        if (start > end) {
            all_trees.add(null);
            return all_trees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateTrees(start, i - 1);
            List<TreeNode> right = generateTrees(i + 1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = l;
                    cur.right = r;
                    all_trees.add(cur);
                }
            }

        }
        return all_trees;
    }


    public static void main(String[] args) {

    }
}
