package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/15
 * @description
 * @project LeetCode
 */

public class ShellSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N=nums.length;
        for (int gap=N/2;gap>0;gap/=2){
            for(int i=gap;i<nums.length;i++){
                T temp=nums[i];
                int leftIndex=i-gap;
                while (leftIndex>=0&&less(temp, nums[leftIndex])){
                    nums[leftIndex+gap]=nums[leftIndex];
                    leftIndex=leftIndex-gap;
                }
                nums[leftIndex+gap]=temp;
            }
        }
    }
}
