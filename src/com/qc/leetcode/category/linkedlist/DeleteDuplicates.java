package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/25
 * @description 从有序链表中删除重复节点
 * @project LeetCode
 * @solving
 */

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr.next!=null&&curr!=null){
            if(curr.next.val==curr.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
}
