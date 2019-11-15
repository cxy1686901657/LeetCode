package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/15
 * @description
 * @project LeetCode
 */

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        boolean isSorted = false;
        for (int i = 0; i < nums.length && !isSorted; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (less(nums[j+1], nums[j])) {
                    swap(nums, j, j+1 );
                    isSorted = true;
                }
            }
        }
    }
}
