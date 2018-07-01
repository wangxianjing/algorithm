package main.tree.rb;

/**
 * Created by wong on 18/7/1.
 */
public class RBTree<T extends Comparable<T>> {
    private final RBTreeNode<T> root;

    public RBTree(RBTreeNode<T> root) {
        this.root = root;
    }

    private T addNode(RBTreeNode<T> node) {
        node.setLeft(null);
        node.setRight(null);
        node.setParent(null);
        node.setRed(true);

        if (root.getLeft() == null) {
            root.setLeft(node);
            node.setRed(false);
        } else {
            RBTreeNode<T> x = findParentNode(node);
            int cmp = x.getValue().compareTo(node.getValue());

            if (cmp == 0) {
                return x.getValue();
            }

            setParent(node, x);

            if (cmp > 0) {
                x.setLeft(node);
            } else {
                x.setRight(node);
            }
            fixInsert(node);
        }
        return null;
    }

    public void setParent(RBTreeNode<T> node, RBTreeNode<T> parent) {
        if (node != null) {
            node.setParent(parent);
            if (parent == root) {
                node.setParent(null);
            }
        }
    }

    public RBTreeNode<T> getRoot() {
        return root.getLeft();
    }

    public RBTreeNode<T> findParentNode(RBTreeNode<T> x) {
        RBTreeNode<T> dataRoot = getRoot();
        RBTreeNode<T> child = dataRoot;
        while (child != null) {
            int cmp = child.getValue().compareTo(x.getValue());
            if (cmp == 0) {
                return child;
            }
            if (cmp > 0) {
                dataRoot = child;
                child = child.getLeft();
            } else if (cmp < 0) {
                dataRoot = child;
                child = child.getRight();
            }
        }
        return dataRoot;
    }

    private void fixInsert(RBTreeNode<T> x) {
        RBTreeNode<T> parent = x.getParent();

        while (parent != null && parent.isRed()) {
            RBTreeNode<T> uncle = getUncle(x);
            if (uncle == null) {//need to rotate
                RBTreeNode<T> grand = parent.getParent();
                if (parent == grand.getLeft()) {
                    boolean isRight = x == parent.getRight();
                    if (isRight) {
                        rotateLeft(parent);
                    }
                    rotateLeft(grand);

                    if (isRight) {
                        x.setRed(false);
                        parent = null;
                    } else {
                        parent.setRed(true);
                    }
                } else {
                    boolean isLeft = x == parent.getLeft();
                    if (isLeft) {
                        x.setRed(false);
                        parent = null;
                    } else {
                        parent.setRed(true);
                    }
                    grand.setRed(true);
                }
            } else {//uncle is red
                parent.setRed(false);
                uncle.setRed(false);
                parent.getParent().setRed(true);
                x = parent.getParent();
                parent = x.getParent();
            }
        }
    }

    private RBTreeNode<T> getUncle(RBTreeNode<T> node) {
        RBTreeNode<T> parent = node.getParent();
        RBTreeNode<T> grand = parent.getParent();
        if (grand == null) {
            return null;
        }
        if (parent == grand.getLeft()) {
            return grand.getRight();
        } else {
            return grand.getLeft();
        }
    }

    private void rotateLeft(RBTreeNode<T> node) {
        RBTreeNode<T> right = node.getRight();
        if (right == null) {
            throw new IllegalStateException("right node is null");
        }
        RBTreeNode<T> parent = node.getParent();
        node.setRight(right.getLeft());
        setParent(right.getLeft(), node);

        right.setLeft(node);
        setParent(node, right);

        if (parent == null) {
            root.setLeft(right);
            setParent(right, null);
        } else {
            if (parent.getLeft() == node) {
                parent.setLeft(right);
            } else {
                setParent(right, parent);
            }
        }
    }

    private void rotateRight(RBTreeNode<T> node) {
        RBTreeNode<T> left = node.getLeft();
        if (left == null) {
            throw new IllegalStateException("left node is null");
        }

        RBTreeNode<T> parent = node.getParent();
        node.setLeft(left.getRight());
        setParent(left.getRight(), node);

        left.setRight(node);
        setParent(node, left);

        if (parent == null) {
            root.setLeft(left);
            setParent(left, null);
        } else {
            if (parent.getLeft() == node) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
            setParent(left, parent);
        }

    }
}
