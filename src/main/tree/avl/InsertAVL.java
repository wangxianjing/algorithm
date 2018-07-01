package main.tree.avl;

/**
 * Created by wong on 18/6/21.
 */
public class InsertAVL {

    public static AVLNode insert(AVLNode root, int target) {
        if (root == null) {
            return new AVLNode(target, null, null, 0);
        }
        if (root.getVal() > target) {
            root.setLeft(insert(root.getLeft(), target));
        } else if (root.getVal() < target) {
            root.setRight(insert(root.getRight(), target));
        } else {
            System.out.println("不允许插入重复的值：" + target);
        }
        return balance(root);
    }

    public static AVLNode balance(AVLNode root) {
        if (root == null) {
            return root;
        }
        if (AVLRotation.height(root.getLeft()) - AVLRotation.height(root.getRight()) > 1) {
            if (AVLRotation.height(root.getLeft().getLeft()) >= AVLRotation.height(root.getLeft().getRight())) {
                return AVLRotation.leftLeftRotation(root);
            } else {
                return AVLRotation.leftRightRotation(root);
            }
        } else if (AVLRotation.height(root.getLeft()) - AVLRotation.height(root.getRight()) < -1) {
            if (AVLRotation.height(root.getRight().getRight()) >= AVLRotation.height(root.getRight().getLeft())) {
                return AVLRotation.rightRightRotation(root);
            } else {
                return AVLRotation.rightLeftRotation(root);
            }
        }
        root.setHeight(AVLRotation.max(AVLRotation.height(root.getLeft()), AVLRotation.height(root.getRight())) + 1);
        return root;
    }

    public static void main(String[] args) {
        AVLNode root = insert(null, 10);
        root = insert(root, 6);
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 8);
        root = insert(root, 18);
        root = insert(root, 12);
        root = insert(root, 11);
        root = insert(root, 13);
        root = insert(root, 20);
        root = insert(root, 19);
        AVLRotation.middleOrderPrint(root);
    }
}
