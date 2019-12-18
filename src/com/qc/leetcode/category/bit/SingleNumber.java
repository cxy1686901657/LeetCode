package com.qc.leetcode.category.bit;

/**
 * 数组中唯一一个不重复的元素
 *136. Single Number (Easy)
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int cnt = 0;
        for (int n : nums) cnt = cnt ^ n;
        return cnt;
    }
}
