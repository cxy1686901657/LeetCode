package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/30
 * @description
 * @project LeetCode
 */

public class SelectSort {
    public static void main(String[] args){
        int arr[] = {3, 9, -1, 10, -2};
        selectsort(arr);
        PrintUtil.print(arr);
    }
    public static void selectsort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            if (i != minIndex) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
