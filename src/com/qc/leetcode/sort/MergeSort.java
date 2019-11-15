package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,1,3 };
        mergeSort(arr,0,arr.length-1);
        PrintUtil.print(arr);
    }
    private static void mergeSort(int[] arr,int left ,int right){
       if(left<right){
           int mid=(left+right)/2;
           mergeSort(arr, left, mid);
           mergeSort(arr, mid+1, right);
           merge(arr,left,mid,right);
       }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp=new int[arr.length];
        int p1=left,p2=mid+1,k=left;
        while (p1<=mid&&p2<=right){
            if(arr[p1]<=arr[p2]){
                temp[k++]=arr[p1++];
            }else {
                temp[k++]=arr[p2++];
            }
        }
        while (p1<=mid) temp[k++]=arr[p1++];
        while (p2<=right) temp[k++]=arr[p2++];
        for(int i=left;i<=right;i++){
            arr[i]=temp[i];
        }
    }
}
