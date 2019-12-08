package com.qc.leetcode.category.hash;

import java.util.Arrays;

/**
 * @author qc
 * @date 2019/12/8
 * @description 最长连续序列
 * @project LeetCode
 * @solving
 */

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    current++;
                } else {
                    longest = Math.max(longest, current);
                    current = 1;
                }
            }
        }
        return Math.max(longest, current);
    }
}
