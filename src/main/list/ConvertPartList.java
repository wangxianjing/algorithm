package main.list;

/**
 * 反转部分链表
 * <p>
 * Created by wong on 18/5/6.
 */
public class ConvertPartList {

    public static Node convert(Node head, int from, int to) {
        if (!(1 <= from && from < to)) return head;
        int len = 0;
        Node node1 = head;
        Node fPre = null;
        Node tPos = null;

        while (node1 != null) {
            len++;
            if (len == from - 1) {
                fPre = node1;//找到要开始反转的节点的前一个节点
            }
            if (len == to + 1) {
                tPos = node1;//找到最后一个需要反转的节点的后一个节点
                break;
            }
            node1 = node1.getNext();
        }

        if (to > len) {//如果链表没有那么长，就不用反转了
            return head;
        }

        node1 = fPre == null ? head : fPre.getNext();//如果fPre位空说明是从头结点开始反转
        Node node2 = node1.getNext();//将要与之互换位置的那个节点
        node1.setNext(tPos);//把需要反转的第一个节点向需要反转的最后一个节点的下一个节点;
        Node next = null;
        while (node2 != tPos) {//不断将需要反转的节点反转
            next = node2.getNext();
            node2.setNext(node1);
            node1 = node2;
            node2 = next;
        }
        if (fPre != null) {//将需要反转的第一个节点的前一个节点指向翻转后的反转过得第一个节点
            fPre.setNext(node1);
            return head;
        } else {
            return node1;//是从第一个节点开始反转的，直接返回"头结点"
        }
    }

    public static void main(String[] args) {
        Node convert = convert(Node.init(), 1, 4);
        Node.print(convert);
    }
}
