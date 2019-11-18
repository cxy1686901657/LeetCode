package com.qc.leetcode.entity;

/**
 * @author qc
 * @date 2019/11/18
 * @description
 * @project LeetCode
 */

public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
