package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class MergeTwoLists {
    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(9);
        l1.next = l4;
        l4.next = l3;
        l2.next = l5;
        l5.next = l6;
        ListNode listNode = mergeTwoLists.mergeTwoLists(l1, l2);
        System.out.println(listNode + " " + listNode.next + listNode.next.next + listNode.next.next.next);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}
