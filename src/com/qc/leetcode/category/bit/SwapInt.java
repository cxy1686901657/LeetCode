package com.qc.leetcode.category.bit;


import java.util.Arrays;

/**
 * 不使用额外变量交换两个整数
 */
public class SwapInt {
    public static void swapInt(int [] nums) {
        nums[0] = nums[0] ^  nums[1];
        nums[1] = nums[0] ^  nums[1];
        nums[0] = nums[0] ^  nums[1];
    }

    public static void main(String[] args) {
        int nums[] ={1,2};
        swapInt(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
