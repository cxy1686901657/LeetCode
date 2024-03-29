package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/18
 * @description 跳台阶
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 变态跳台阶
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 跳上 n-1 级台阶，可以从 n-2 级跳 1 级上去，也可以从 n-3 级跳 2 级上去...，那么
 *
 * f(n-1) = f(n-2) + f(n-3) + ... + f(0)
 * 同样，跳上 n 级台阶，可以从 n-1 级跳 1 级上去，也可以从 n-2 级跳 2 级上去... ，那么
 *
 * f(n) = f(n-1) + f(n-2) + ... + f(0)
 * 综上可得
 *
 * f(n) - f(n-1) = f(n-1)
 * 即
 *
 * f(n) = 2*f(n-1)
 * 所以 f(n) 是一个等比数列
 * @project LeetCode
 */

public class JumpFloor {
    public int JumpFloor(int n) {
        if(n<=2) return n;
        int pre1=1,pre2=2;
        int res=0;
        for(int i=3;i<=n;i++){
            res=pre1+pre2;
            pre1=pre2;
            pre2=res;
        }
        return res;
    }
    public static int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(4));
    }
}
