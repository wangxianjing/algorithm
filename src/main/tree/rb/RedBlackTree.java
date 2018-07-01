//package main.tree.rb;
//
///**
// * https://tech.meituan.com/redblack-tree.html
// *
// * Created by wong on 18/7/1.
// */
//public class RedBlackTree<AnyType extends Comparable<? super AnyType>> {
//
//    public RedBlackTree() {
//
//    }
//
//    public class RedBlackNode<AnyType> {
////        RedBlackNode(AnyType theElement) {
////            this(theElement, null, null);
////        }
////
////        RedBlackNode(AnyType theElement, RedBlackNode<AnyType> lt, RedBlackNode<AnyType> rt) {
////            element = theElement;
////            left = lt;
////            right = rt;
////            color = RedBlackTree.BLACK;
////        }
//
//        public AnyType element;
//        public RedBlackNode<AnyType> left;
//        public RedBlackNode<AnyType> right;
//        public int color;
//        public RedBlackNode<AnyType> parent;
//
//    }
//
//    private RedBlackNode<AnyType> header;
//    private RedBlackNode<AnyType> nullNode;
//
//    private static final int BLACK = 1;
//    private static final int RED = 0;
//
//    private final int compare(AnyType item, RedBlackNode<AnyType> t) {
//        if (t == header) {
//            return 1;
//        } else {
//            return item.compareTo(t.element);
//        }
//    }
//
//    private RedBlackNode<AnyType> rotate(AnyType item,RedBlackNode<AnyType> parent) {
//        if (compare(item, parent) < 0) {
//            return parent.left = compare(item, parent.left) < 0 ?
//        }
//    }
//
//    private void  handleRe
//}
