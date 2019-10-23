package com.qc.leetcode.onebyone;


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
    public static void main(String[] args){
        KthSmallest kthSmallest = new KthSmallest();
        TreeNode head = new TreeNode(9);
        TreeNode f = new TreeNode(5);
        TreeNode r = new TreeNode(15);
        TreeNode ff = new TreeNode(4);
        TreeNode fr = new TreeNode(7);
        TreeNode rf = new TreeNode(14);
        TreeNode rr = new TreeNode(18);
        head.left=f;
        head.left.left=ff;
        head.left.right=fr;
        head.right=r;
        head.right.right=rr;
        head.right.left=rf;
        int i1 = kthSmallest.kthSmallest(head, 2);
        System.out.println(i1);
    }

    public  int kthSmallest(TreeNode root, int k) {
        Order(root,k);
        return val;
    }
    private int i = 0;
    private int val = 0;
    private int count=0;
    public  void Order(TreeNode treeNode,int k){
        if(treeNode==null){
            return;
        }

        this.Order(treeNode.left,k);
        System.out.println(treeNode.val);
        if(k==++i){
            val = treeNode.val;
        }
        this.Order(treeNode.right,k);
    }


    /**
     *
     *
     * efficient
     */
    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            count=k;
            Order(root);
            return i;
        }

        private int i = 0;
        private int count=0;
        public  void Order(TreeNode treeNode){
            if(treeNode==null||count==0){
                return;
            }
            this.Order(treeNode.left);
            if(--count==0){
                i=treeNode.val;
                return;
            }
            this.Order(treeNode.right);
        }

    }
}
