package main.avl;

/**
 * Created by wong on 18/6/10.
 */
public class BaseAVL {
    private int val;
    private BaseAVL left;
    private BaseAVL right;
    private int height;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BaseAVL getLeft() {
        return left;
    }

    public void setLeft(BaseAVL left) {
        this.left = left;
    }

    public BaseAVL getRight() {
        return right;
    }

    public void setRight(BaseAVL right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
