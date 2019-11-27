package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/27
 * @description 交换链表中的相邻结点
 * 题目要求：不能修改结点的 val 值，O(1) 空间复杂度。
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @project LeetCode
 * @solving 指针
 */

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode temp=pre;
        while(temp.next!=null&&temp.next.next!=null){
            ListNode start=temp.next;
            ListNode end=temp.next.next;
            temp.next=end;
            start.next=end.next;
            end.next=start;
            temp=start;
        }
        return pre.next;
    }
}
