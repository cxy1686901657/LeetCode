package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/30
 * @description
 * @project LeetCode
 */

public class IntersectionListNode {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode pa=headA,pb=headB;
        while(pa!=pb){
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
}
