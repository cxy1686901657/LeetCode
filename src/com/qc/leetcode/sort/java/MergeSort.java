package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/19
 * @description
 * @project LeetCode
 */

public class MergeSort<T extends Comparable<T>> extends Sort<T>  {
    @Override
    public void sort(T[] nums) {
        mergeSort(nums,0,nums.length-1);
    }
    public void  mergeSort(T[] nums,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums,left,mid,right);
        }
    }
    protected T[] temp;
    private void merge(T[] nums, int left, int mid, int right) {
        for(int i=left;i<=right;i++){
            temp[i]=nums[i];
        }
        int p1=left;
        int p2=right;
        int k=0;
        while (p1<=mid&&p2<=right){
            if(less(temp[p2],temp[p1])){
                nums[k++]=temp[p2++];
            }else{
                nums[k++]=temp[p1++];
            }
        }
        while (p1<=mid) nums[k++]=temp[p1++];
        while (p2<=right) nums[k++]=temp[p2++];
    }
}
