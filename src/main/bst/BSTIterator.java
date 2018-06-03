package main.bst;

import java.util.Stack;

/**
 * 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。

 调用 next() 将返回二叉搜索树中的下一个最小的数。

 注意: next() 和hasNext() 操作的时间复杂度是O(1)，并使用 O(h) 内存，其中 h 是树的高度。

 https://leetcode-cn.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/64/introduction-to-a-bst/172/
 *
 * https://blog.csdn.net/smile_watermelon/article/details/47280679
 *
 * Created by wong on 18/6/3.
 */
public class BSTIterator {

    private Stack<TreeNode> stackData = new Stack<>();

    public BSTIterator(TreeNode root) {
        while(root != null) {
            stackData.push(root);
            root = root.getLeft();
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stackData.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = stackData.pop(); // 获取并弹出最小元素
        int ret = tmp.getVal();
        tmp = tmp.getRight();
        // 添加元素被弹出结点的右子树上的较小元素
        while (tmp != null) {
            stackData.push(tmp);
            tmp = tmp.getLeft();
        }
        return ret; // 返回最小元素
    }

    public static void main(String[] args) {
        BSTIterator iterator = new BSTIterator(BaseBST.getTreeNode1());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

