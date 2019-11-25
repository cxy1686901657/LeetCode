package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/25
 * @description 归并两个有序的链表
 * @project LeetCode
 * @solving
 */

public class MergeTwoLists {
    //recursion
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    //iteration
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
       ListNode head=new ListNode(-1);
       ListNode pre=head;
       while(l1!=null&&l2!=null){
           if(l1.val<=l2.val){
               pre.next=l1;
               l1=l1.next;
           }else{
               pre.next=l2;
               l2=l2.next;
           }
           pre=pre.next;
       }
       pre.next=l1==null?l2:l1;
       return head.next;
    }
}
