package com.qc.leetcode.onebyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author qc
 * @date 2019/10/21
 * @description
 *
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 *
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 *
 * @project LeetCode
 *
 * TODO
 */

public class KthSmallest {
    static List list=new ArrayList();
    public static void main(String[] args){
        KthSmallest kthSmallest = new KthSmallest();
        TreeNode head = new TreeNode(3);
        TreeNode f = new TreeNode(5);
        TreeNode r = new TreeNode(1);
        TreeNode ff = new TreeNode(6);
        TreeNode fr = new TreeNode(2);
        TreeNode frf = new TreeNode(7);
        TreeNode frr = new TreeNode(4);
        TreeNode rf = new TreeNode(0);
        TreeNode rr = new TreeNode(8);
        head.left=f;
        head.left.left=ff;
        head.left.right=fr;
        head.left.right.left=frf;
        head.left.right.right=frr;
        head.right=r;
        head.right.right=rr;
        head.right.left=rf;
        kthSmallest.preOrder(head);
        System.out.println(kthSmallest.kthSmallest(head, 2));

        int i = kthSmallest.kthSmallest1(head, 4);
        System.out.println(i);
    }

    public  int kthSmallest(TreeNode root, int k) {
        Collections.sort(list);
        System.out.println(list);
        return (int) list.get(k-1);
    }

    public  void preOrder(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        this.preOrder(treeNode.left);
        this.preOrder(treeNode.right);
        list.add(treeNode.val);
    }


    static int i=0;
    public int kthSmallest1(TreeNode root, int k) {
         return   o(root,k);
    }
    private static int o(TreeNode root,int k) {
        i++;
        if(root.left!=null){
            o(root.left, k);
        }
        if (i == k) {
            return root.val;
        }
        if(root.right!=null){
            o(root.right, k);
        }
        return 0;
    }
}
