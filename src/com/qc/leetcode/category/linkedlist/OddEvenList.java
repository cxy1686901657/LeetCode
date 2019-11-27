package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/27
 * @description 链表元素按奇偶聚集
 * @project LeetCode
 * @solving 将奇节点放在一个链表里，偶链表放在另一个链表里。然后把偶链表接在奇链表的尾部。
 */

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode odd=head,even=head.next,evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
