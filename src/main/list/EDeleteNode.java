package main.list;

/**
 * 删除节点
 * Created by wong on 2019/6/3.
 */
public class EDeleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
         node.val = node.next.val;
         node.next = node.next.next;
    }
}
