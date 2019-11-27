package com.qc.leetcode.category.linkedlist;

import com.qc.leetcode.entity.ListNode;
/**
 * @author qc
 * @date 2019/11/27
 * @description 回文链表
 * @project LeetCode
 * @solving 分割 反转 ，判断
 */

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null) return true;
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next;
        cut(head,slow);
        return  isEquals(head,reverse(slow));
    }

    private boolean isEquals(ListNode head, ListNode reverse) {
        while (head!=null&&reverse!=null){
            if(head.val!=reverse.val) return false;
            head=head.next;
            reverse=reverse.next;
        }
        return true;
    }

    private void cut(ListNode head, ListNode slow) {
        while(head!=slow){
            head=head.next;
        }
        head.next=null;
    }
    private ListNode reverse(ListNode slow){
        ListNode pre=null;
        while (slow!=null){
            ListNode temp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp;
        }
        return pre;
    }
}
