package com.qc.leetcode.offer;

import com.qc.leetcode.entity.ListNode;

/**
 * @author qc
 * @date 2019/11/24
 * @description 删除链表中重复的结点
 * @project LeetCode
 * @solving
 */

public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null) return null;
        ListNode newHead=new ListNode(0);
        newHead.next=pHead;
        ListNode pre=newHead;
        ListNode walkNode=newHead.next;
        while(walkNode!=null){
            if(walkNode.next!=null){
                if(walkNode.next.val==walkNode.val){
                    if(pre.next==walkNode){
                        pre=walkNode;
                    }else{
                        pre.next=walkNode.next;
                    }
                }
            }else {
                if(pre.next==walkNode){
                    pre=walkNode;
                }else{
                    pre.next=null;
                }
            }
        }
        return newHead.next;
    }
}

