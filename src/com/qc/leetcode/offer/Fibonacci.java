package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/18
 * @description 斐波那契数列
 * @project LeetCode
 */

public class Fibonacci {
    public static Integer fibonacci(Integer n){
        if(n<=1) return n;
        int [] fi=new int[n+1];
        fi[1]=1;
        for(int i=2;i<=n;i++){
            fi[i]=fi[i-1]+fi[i-2];
        }
        return fi[n];
    }
    public static Integer fibonacci2(Integer n){
        if(n<=1) return n;
        int pre=1, pree=0;
        int fib=0;
        for(int i=2;i<=n;i++){
            fib=pre+pree;
            pree=pre;
            pre=fib;
        }
        return fib;
    }
}
