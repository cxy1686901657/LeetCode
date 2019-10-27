package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {-9, 78, 0, 23, -567, 70};
        quickSort(arr, 0, arr.length -1);
        PrintUtil.print(arr);
    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int temp;
        int l = left;
        int r = right;
        int base = arr[left];
        while(l<r){
            while(l<r&&arr[r]>=base){
                r--;
            }
            while(l<r&&arr[l]<=base){
                l++;
            }
            if (l<r) {
              temp=arr[l];
              arr[l]=arr[r];
              arr[r]=temp;
            }
        }
        arr[left]=arr[r];
        arr[l]=base;
        quickSort(arr, left, r-1);
        quickSort(arr, r+1, right);
    }
}
