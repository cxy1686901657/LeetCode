package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/24
 * @description
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 *
 * @project LeetCode
 */

public class ReverseList {
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = reverseList.ResreverseList(listNode2);
        System.out.println(listNode);
        System.out.println(listNode.next);
//        System.out.println(listNode.next.next);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
//        ListNode curr=head;
        while (head!= null) {
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }


        return prev;
    }
    public ListNode ResreverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }




}
