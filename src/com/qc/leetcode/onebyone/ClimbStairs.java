package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class ClimbStairs {
    public static void main(String[] args){
        int i = climbStairs(45);
        System.out.println(i);
    }
    public  static int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
