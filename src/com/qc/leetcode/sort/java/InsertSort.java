package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/19
 * @description
 * @project LeetCode
 */

public class InsertSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        T temp;int insertIndex;
        for(int i=1;i<nums.length;i++){
            temp=nums[i];
            insertIndex=i-1;
            while (insertIndex>=0&&less(temp,nums[insertIndex])){
                nums[insertIndex+1]=nums[insertIndex];
                insertIndex--;
            }
            nums[insertIndex+1]=temp;
        }

    }
}
