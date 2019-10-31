package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/31
 * @description
 * @project LeetCode
 */

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int len = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[len]) {
                len++;
                nums[len] = nums[j];
            }
        }
        return len+1;
    }
}
