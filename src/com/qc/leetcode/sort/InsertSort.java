package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/31
 * @description
 * @project LeetCode
 */

public class InsertSort {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 20;
//        Integer c = 200;
//        Integer d = 200;
//        int e = 200;
//        int f = 200;
//        Integer m = 20;
//        Integer n = 20;
//        System.out.println(a == b);
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(m == n);
//        int i=0;
        int arr[] = {2,1,3};
        insertSort2(arr);
//        insertSort(arr);
        PrintUtil.print(arr);
    }

    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] < temp) {
                    break;
                } else {
                    arr[j + 1] = arr[j];
                }
            }
            arr[j + 1] = temp;
        }
    }

    public static void insertSort2(int arr[]) {
        int temp;
        int leftIndex;
        for (int i=1;i<arr.length;i++){
            temp=arr[i];
            leftIndex=i-1;
            while (leftIndex>=0&& arr[leftIndex]>temp){
                arr[leftIndex+1]=arr[leftIndex];
                leftIndex--;
            }
            arr[leftIndex+1]=temp;
        }
    }

}
