package com.qc.leetcode.category.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author qc
 * @date 2019/12/2
 * @description 循环数组中比当前元素大的下一个元素
 * Input: [1,2,1]
 * Output: [2,-1,2]
 * @project LeetCode
 * @solving
 */

public class NextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int[] next = new int[nums.length];
        Arrays.fill(next, -1);
        Stack<Integer> pre = new Stack<>();
        for (int i = 0; i < 2 * nums.length; i++) {
            int num = nums[i % nums.length];
            while (!pre.isEmpty() && num > nums[pre.peek()]) {
                next[pre.pop()] = num;
            }
            if (i < nums.length)
                pre.push(i);
        }
        return next;
    }
}
