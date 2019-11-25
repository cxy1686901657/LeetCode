package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/25
 * @description 链表反转
 * @project LeetCode
 * @solving
 */

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
