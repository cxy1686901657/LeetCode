package com.qc.leetcode.offer;


import com.qc.leetcode.entity.ListNode;
import java.util.ArrayList;

/**
 * @author qc
 * @date 2019/11/18
 * @description
 * 反转打印链表
 *
 * @project LeetCode
 */

public class PrintListFromTailToHead {
    public static void main(String[] args) {

    }
    //递归
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode!=null){
           res.addAll(printListFromTailToHead(listNode.next));
           res.add(listNode.val);
        }
        return res;
    }
    //头插入法
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ListNode pre=null;
        while(listNode!=null){
            ListNode temp=listNode.next;
            listNode.next=pre;
            pre=listNode;
            listNode=temp;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(pre!=null){
            res.add(pre.val);
            pre=pre.next;
        }
        return res;
    }
}
