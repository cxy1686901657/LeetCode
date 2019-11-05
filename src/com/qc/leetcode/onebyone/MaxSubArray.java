package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/11/5
 * @description
 * @project LeetCode
 */

public class MaxSubArray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int sum=0;
        for(int num:nums){
            if(sum>0){
                sum=sum+num;
            }else{
                sum=num;
            }
            result=Math.max(sum, result);
        }
        return result;
    }
}
