package com.qc.leetcode.category.array;

/**
 * @author qc
 * @date 2019/12/11
 * @description 把数组中的 0 移到末尾
 * @project LeetCode
 * @solving
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
