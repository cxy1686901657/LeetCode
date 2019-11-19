package com.qc.leetcode.sort;
import static com.qc.leetcode.sort.PrintUtil.print;
/**
 * @author qc
 * @date 2019/11/16
 * @description
 * @project LeetCode
 */

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {2,1,3};
        radixSort(arr);
        print(arr);
    }

    /**
     *基数排序分为MSD(most significant digital)和LSD(least significant digital)两种排序方式。
     * 这里采用的是LSD
     * @param arr
     */
    public static void radixSort(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();
        int[][] bucket = new int[10][maxLength];
        int[] bucketElementCounts = new int[10];
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j] / n % 10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]++]=arr[j];
            }
            int index=0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        //取出元素放入到arr
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }
        }
    }
}
