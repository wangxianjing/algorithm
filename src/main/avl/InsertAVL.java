package main.avl;

/**
 * Created by wong on 18/6/21.
 */
public class InsertAVL {

    public static AVLNode insert(AVLNode root, int target) {
        if (root == null) {
            return new AVLNode(target, null, null, 0);
        }
        if (root.getVal() == target) {
            System.out.println("不允许插入重复的值：" + target);
            return root;
        }

        if (root.getVal() > target) {
            root.setLeft(insert(root.getLeft(), target));
        } else {
            root.setRight(insert(root.getRight(), target));
        }
        return balance(root);
    }

    public static AVLNode balance(AVLNode root) {
        if (AVLRotation.height(root.getLeft()) - AVLRotation.height(root.getRight()) == 2) {
            if (AVLRotation.height(root.getLeft().getLeft()) > AVLRotation.height(root.getLeft().getRight())) {
                return AVLRotation.leftLeftRotation(root);
            } else if (AVLRotation.height(root.getLeft().getLeft()) < AVLRotation.height(root.getLeft().getRight())){
                return AVLRotation.leftRightRotation(root);
            }
        } else if (AVLRotation.height(root.getLeft()) - AVLRotation.height(root.getRight()) == -2) {
            if (AVLRotation.height(root.getRight().getLeft()) < AVLRotation.height(root.getRight().getRight())) {
                return AVLRotation.rightRightRotation(root);
            } else if (AVLRotation.height(root.getRight().getLeft()) > AVLRotation.height(root.getRight().getRight())) {
                System.out.println("rightLeftRotation:" + root.getVal());
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
        AVLRotation.middleOrderPrint(root);
    }
}
