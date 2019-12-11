package com.qc.leetcode.category.array;

/**
 * @author qc
 * @date 2019/12/11
 * @description 找出数组中最长的连续 1
 * @project LeetCode
 * @solving
 */

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int x : nums) {
            cur = x == 0 ? 0 : cur + 1;
            max = Math.max(cur, max);
        }
        return max;
    }
}
