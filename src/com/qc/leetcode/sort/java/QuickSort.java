package com.qc.leetcode.sort.java;

import javax.swing.tree.FixedHeightLayoutCache;

/**
 * @author qc
 * @date 2019/11/19
 * @description
 * @project LeetCode
 */

public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {

    }

    public void quickSort(T[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && less(nums[left], nums[r])) {
                r--;
            }
            while (l < r && less(nums[l], nums[left])) {
                l++;
            }
            if (l < r) swap(nums, l, r);
        }
        swap(nums, left, l);
        quickSort(nums, left, r - 1);
        quickSort(nums, r + 1, right);
    }
}
