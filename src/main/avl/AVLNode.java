package main.avl;

/**
 * Created by wong on 18/6/10.
 */
public class AVLNode {
    private int val;
    private AVLNode left;
    private AVLNode right;
    private int height;

    public AVLNode(int val, AVLNode left, AVLNode right, int height) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public AVLNode getLeft() {
        return left;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
