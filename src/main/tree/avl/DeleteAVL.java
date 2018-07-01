package main.tree.avl;

/**
 * Created by wong on 18/6/21.
 */
public class DeleteAVL {

    public static AVLNode findMin(AVLNode root) {
        if (root == null) {
            return null;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    public static AVLNode delete(AVLNode root, int x) {
        if (root == null) {
            return null;
        }

        int cmp = x - root.getVal();
        if (cmp < 0) {
            root.setLeft(delete(root.getLeft(), x));
        } else if (cmp > 0) {
            root.setRight(delete(root.getRight(), x));
        } else if (root.getLeft() != null && root.getRight() != null) {
            root.setVal(findMin(root.getRight()).getVal());
            root.setRight(delete(root.getRight(), root.getVal()));
        } else {
            root = (root.getLeft() != null) ? root.getLeft() : root.getRight();
        }

        return InsertAVL.balance(root);

    }

    public static void main(String[] args) {
//        AVLNode root = InsertAVL.insert(null, 3);
//        root = InsertAVL.insert(root, 2);
//        root = InsertAVL.insert(root, 1);
//        root = InsertAVL.insert(root, 4);
//        root = InsertAVL.insert(root, 5);
//        root = InsertAVL.insert(root, 6);
//        root = InsertAVL.insert(root, 7);
//        root = InsertAVL.insert(root, 16);
//        root = InsertAVL.insert(root, 15);
//        root = InsertAVL.insert(root, 14);
//        root = InsertAVL.insert(root, 13);
//        root = InsertAVL.insert(root, 12);
//        root = InsertAVL.insert(root, 11);
//        root = InsertAVL.insert(root, 10);
//        root = InsertAVL.insert(root, 8);
//        root = InsertAVL.insert(root, 9);


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
        root = delete(root, 13);
//        AVLRotation.middleOrderPrint(root);
        AVLRotation.preOrderPrint(root);

    }
}
