package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/21
 * @description
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * @project LeetCode
 */

public class IsPowerOfTwo {
    public static void main(String[] args){

    }
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0&&n>0;
    }
}
