package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/11/4
 * @description  快慢指针  双向链表有环问题
 * @project LeetCode
 */

public class HasCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
