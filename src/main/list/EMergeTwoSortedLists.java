package main.list;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 * Created by wong on 2019/4/14.
 */
public class EMergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        if (l1.val >= l2.val) {
            head = l2;
        } else {
            head = l1;
            ListNode temp = l1.next;
            l1.next = l2;
            l2 = l1;
            l1 = temp;
        }
        while (l1 != null) {
            while (l2.next != null && l2.next.val < l1.val) {
                l2 = l2.next;
            }
            if (l2.next == null) {
                l2.next = l1;
                return head;
            } else {
                ListNode temp = l1.next;
                l1.next = l2.next;
                l2.next = l1;
                l1 = temp;

            }
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(5);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(13);
        listNode3.next = listNode4;


        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(4);
        listNode21.next = listNode22;
        ListNode listNode23 = new ListNode(6);
        listNode22.next = listNode23;
        ListNode listNode24 = new ListNode(23);
        listNode23.next = listNode24;
        ListNode listNode = mergeTwoLists(listNode1, listNode21);
        print(listNode);

    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
