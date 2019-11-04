package com.qc.leetcode.sort;

/**
 * @author qc
 * @date 2019/10/31
 * @description
 * @project LeetCode
 */

public class InsertSort {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        Integer c = 200;
        Integer d = 200;
        int e = 200;
        int f = 200;
        Integer m = 20;
        Integer n = 20;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(m == n);
    }

    public static void insertSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>0;j--){
                if(arr[j]<temp){
                    break;
                }else{
                    arr[j+1]=arr[j];
                }
            }
            arr[j+1]=temp;
        }

    }

}
