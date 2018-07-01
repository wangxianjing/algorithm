package main.tree.avl;

/**
 * https://www.cnblogs.com/skywang12345/p/3577479.html
 * Created by wong on 18/6/10.
 */
public class AVLRotation {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static AVLNode leftLeftRotation(AVLNode root) {//LL旋转
        AVLNode left = root.getLeft();
        root.setLeft(left.getRight());
        left.setRight(root);

        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
        left.setHeight(max(root.getHeight(), height(left.getLeft())) + 1);

        return left;
    }

    public static AVLNode rightRightRotation(AVLNode root) {//RR旋转
        AVLNode right = root.getRight();
        root.setRight(right.getLeft());
        right.setLeft(root);

        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
        right.setHeight(max(root.getHeight(), height(right.getRight())) + 1);

        return right;
    }

    public static AVLNode leftRightRotation(AVLNode root) {//LR旋转，先对左节点RR旋转，在对根节点LL旋转
        root.setLeft(rightRightRotation(root.getLeft()));
        return leftLeftRotation(root);
    }

    public static AVLNode rightLeftRotation(AVLNode root) {//RL旋转，先对右节点LL旋转，再对根节点RR旋转
        root.setRight(leftLeftRotation(root.getRight()));
        return rightRightRotation(root);
    }

//    public static AVLNode insert(AVLNode root, int key) {
//        System.out.println("insert:" + key);
//        if (root == null) {
//            root = new AVLNode(key, null, null, 1);
//        } else {
//            int cmp = key - root.getVal();
//            if (cmp < 0) {
//                root.setLeft(insert(root.getLeft(), key));
//                if (height(root.getLeft()) - height(root.getRight()) == 2) {
//                    if (key < root.getLeft().getVal()) {
//                        root = leftLeftRotation(root);
//                    } else {
//                        root = leftRightRotation(root);
//                    }
//                }
//            } else if (cmp > 0) {
//                root.setRight(insert(root.getRight(), key));
//                if (height(root.getRight()) - height(root.getLeft()) == 2) {
//                    if (key > height(root.getRight())) {
//                        root = rightRightRotation(root);
//                    } else {
//                        root = rightLeftRotation(root);
//                    }
//                }
//            } else {
//                System.out.println("添加失败，节点不允许相同:" + key);
//            }
//        }
//        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
//        return root;
//    }

    public static int height(AVLNode avlNode) {
        if (avlNode != null) {
            return avlNode.getHeight();
        } else {
            return -1;
        }
    }

    public static void middleOrderPrint(AVLNode root) {
        if (root != null) {
            middleOrderPrint(root.getLeft());
            System.out.println("(val:" + root.getVal() + ",height:" + root.getHeight() + ")");
            middleOrderPrint(root.getRight());
        }
    }

    public static void preOrderPrint(AVLNode root) {
        if (root != null) {
            System.out.println("(val:" + root.getVal() + ",height:" + root.getHeight() + ")");
            preOrderPrint(root.getLeft());
            preOrderPrint(root.getRight());
        }
    }

    public static void main(String[] args) {
//        AVLNode root = insert(null, 10);
//        root = insert(root, 6);
//        root = insert(root, 5);
//        root = insert(root, 7);
//        root = insert(root, 8);
//        root = insert(root, 18);
//        root = insert(root, 12);
//        root = insert(root, 11);
//        root = insert(root, 13);
//        root = insert(root, 20);
//        root = insert(root, 19);
//        middleOrderPrint(root);
    }
}
