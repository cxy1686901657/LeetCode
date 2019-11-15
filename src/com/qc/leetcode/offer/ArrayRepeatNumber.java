package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/14
 * @description
 * 题目描述
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 * @project LeetCode
 *
 *
 * 对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。
 * 本题要求找出重复的数字，因此在调整过程中，如果第 i 位置上已经有一个值为 i 的元素，就可以知道 i 值重复。
 */

public class ArrayRepeatNumber {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length <= 0){
            return false;
        }
        for(int i=0;i<numbers.length;i++){
           while (numbers[i]!=i){
               if(numbers[i]==numbers[numbers[i]]){
                   duplication[0]=numbers[i];
                   return true;
               }
               swap(numbers,i,numbers[i]);
           }
        }
        return false;
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        String a=new String("s");
        String s = new String(a);
        System.out.println(a==s);
        System.out.println(a.hashCode());
        System.out.println(s.hashCode());
        System.out.println(a.equals(s));
        System.out.println(a.intern());
        System.out.println(s);
    }
}
