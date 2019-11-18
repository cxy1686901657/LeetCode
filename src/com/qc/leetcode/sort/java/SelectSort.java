package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/16
 * @description
 * @project LeetCode
 */

public class SelectSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int minIndex;
        for(int i=0;i<nums.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(less(nums[j],nums[minIndex])){
                    minIndex=j;
                }
            }
            swap(nums, i, minIndex);
        }
    }
}
