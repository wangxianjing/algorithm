package main.list;

/**
 * https://leetcode.com/problems/sort-list/
 * <p>
 * Created by wong on 2019/4/14.
 */
public class MSortList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode l1 = null;
        ListNode l2 = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            } else {
                break;
            }
        }


        ListNode listNode1 = MInsertSortList.sortList(slow.next);
        slow.next = null;
        ListNode listNode2 = MInsertSortList.sortList(head);
        ListNode listNode = EMergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        return listNode;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(1);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(3);
        listNode3.next = listNode4;

        ListNode listNode = sortList(listNode1);
        MInsertSortList.print(listNode);
    }
}