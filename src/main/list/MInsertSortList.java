package main.list;

/**
 * https://leetcode.com/problems/insertion-sort-list/
 * 排序linkedlist
 * Created by wong on 2019/4/14.
 */
public class MInsertSortList {

    //插入法排序
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode next = pre.next;
        while (next != null) {
            if (next.val < head.val) {
                pre.next = next.next;
                next.next = head;
                head = next;
                next = pre;
            } else {
                ListNode temp = head;
                ListNode tempNext = head.next;
                while (temp != null && tempNext.val < pre.val) {
                    temp = temp.next;
                    tempNext = temp.next;
                }

                if (temp != next) {
                    pre.next = next.next;
                    next.next = tempNext;
                    temp.next = next;
                    next = pre.next;
                }
            }
            if (next == null) {
                return head;
            }
            pre = next;
            next = next.next;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(1);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(3);
        listNode3.next = listNode4;
//        ListNode listNode5 = new ListNode(2);
//        listNode4.next = listNode5;

//        ListNode listNode1 = new ListNode(6);
//        ListNode listNode2 = new ListNode(5);
//        listNode1.next = listNode2;
//        ListNode listNode3 = new ListNode(4);
//        listNode2.next = listNode3;
//        ListNode listNode4 = new ListNode(3);
//        listNode3.next = listNode4;
//        ListNode listNode5 = new ListNode(2);
//        listNode4.next = listNode5;
//        print(listNode1);
        listNode1 = sortList(listNode1);
        print(listNode1);
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
