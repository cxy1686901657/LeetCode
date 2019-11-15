package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/11/15
 * @description
 * @project LeetCode
 */

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {2,1,3};
        shellsort2(arr);
        PrintUtil.print(arr);
    }
    public static void shellsort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for(int i=gap;i< arr.length;i++){
                for(int j=i-gap;j>=0;j -= gap){
                    if(arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }
    public static void shellsort2(int[] arr) {
        int n=arr.length;
        int temp;
        int leftIndex;
        for(int gap = n/2;gap>0;gap=gap/2){
            for(int i=gap;i<arr.length;i++){
                temp=arr[i];
                leftIndex=i-gap;
                while(leftIndex>=0&&arr[leftIndex]>temp){
                    arr[leftIndex+gap]=arr[leftIndex];
                    leftIndex=leftIndex-gap;
                }
                arr[leftIndex+gap]=temp;
            }
        }
    }
}
