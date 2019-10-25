package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/24
 * @description
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * @project LeetCode
 */

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left, right)+1;
    }
}
