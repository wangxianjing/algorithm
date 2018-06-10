package main.avl;

/**
 * https://www.cnblogs.com/skywang12345/p/3577479.html
 * Created by wong on 18/6/10.
 */
public class AVLRotation {

    private int max(int a,int b) {
        return a > b ? a : b;
    }

    public BaseAVL leftLeftRotation(BaseAVL root) {//LL旋转
        BaseAVL left = root.getLeft();
        root.setLeft(left.getRight());
        left.setRight(root);

        root.setHeight(max(root.getLeft().getHeight(), root.getRight().getHeight()) + 1);
        left.setHeight(max(root.getHeight(), left.getLeft().getHeight()) + 1);

        return left;
    }

    public BaseAVL rightRightRotation(BaseAVL root) {//RR旋转
        BaseAVL right = root.getRight();
        root.setRight(right.getLeft());
        right.setLeft(root);

        root.setHeight(max(root.getLeft().getHeight(), root.getRight().getHeight()) + 1);
        right.setHeight(max(root.getHeight(), right.getRight().getHeight() + 1));

        return right;
    }

    public BaseAVL leftRightRotation(BaseAVL root) {//LR旋转，先对左节点RR旋转，在对根节点LL旋转
        root.setLeft(rightRightRotation(root.getLeft()));
        return leftLeftRotation(root);
    }

    public BaseAVL rightLeftRotation(BaseAVL root) {//RL旋转，先对右节点LL旋转，再对根节点RR旋转
        root.setRight(leftLeftRotation(root.getRight()));
        return rightRightRotation(root);
    }

}
