package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/27
 * @description 删除链表的倒数第 n 个节点
 * @project LeetCode
 * @solving 快 慢指针 差n
 */

public class DeleteNthFromEnd {
    //快 慢指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        while(n-->0){
           fast=fast.next;
        }
        if (fast == null) return head.next;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
