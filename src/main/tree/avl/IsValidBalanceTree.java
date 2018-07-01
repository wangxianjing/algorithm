package main.tree.avl;

/**
 * 判断一棵树是不是平衡二叉树，注意不是AVL树，只是借用下。
 * Created by wong on 18/6/24.
 */
public class IsValidBalanceTree {

    public static boolean isBalance(AVLNode avlNode) {
        if (avlNode == null) {
            return true;
        }

        int cmp = AVLRotation.height(avlNode.getLeft()) - AVLRotation.height(avlNode.getRight());
        if (cmp > 1 || cmp < -1) {
            return false;
        } else {
            return isBalance(avlNode.getLeft()) && isBalance(avlNode.getRight());
        }
    }

    public static void main(String[] args) {
        AVLNode root = InsertAVL.insert(null, 10);
        root = InsertAVL.insert(root, 6);
        root = InsertAVL.insert(root, 5);
        root = InsertAVL.insert(root, 7);
        root = InsertAVL.insert(root, 8);
        root = InsertAVL.insert(root, 18);
        root = InsertAVL.insert(root, 12);
        root = InsertAVL.insert(root, 11);
        root = InsertAVL.insert(root, 13);
        root = InsertAVL.insert(root, 20);
        root = InsertAVL.insert(root, 19);

        root.getRight().getLeft().setHeight(233);
        System.out.println(isBalance(root));
    }
}
