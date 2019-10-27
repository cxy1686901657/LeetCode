package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {3, 9, -1, 10, -2};
        bubbleSort(arr);
        print(arr);
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int[] array){
        for (int a :array){
            System.out.printf("%d\t",a);
        }
    }
}
