package main.list;

/**
 * 逆序一个链表
 * <p>
 * https://blog.csdn.net/guyuealian/article/details/51119499
 * <p>
 * Created by wong on 18/5/1.
 */
public class ReverseList {

    /**
     * 循环遍历实现
     *
     * @param head
     * @return
     */
    public static Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node pre = head;//初始化时把头结点设置为前一个节点
        Node cur = head.getNext();//把头结点的下一个节点设置为当前节点
        Node tmp;
        while (cur != null) {
            tmp = cur.getNext();//先把当前节点的下一个节点保存到临时节点
            cur.setNext(pre);//把当前节点的下一个节点设置为他的上一个节点，来逆序
            pre = cur;//前一个节点后移
            cur = tmp;//当前节点后移
        }

        head.setNext(null);//把头节点的下一个节点设置为null
        return pre;//由于当前节点为空，所以他的前一个节点就是新的头结点啦
    }

    /**
     * 递归实现
     *
     * @param head
     * @return
     */
    public static Node reverse2(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node pre = reverse2(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return pre;
    }

    public static void main(String[] args) {
        Node head = Node.init();

        Node.print(head);
        System.out.println("***************");

        Node newHead = reverse2(head);
        Node.print(newHead);

    }

}
