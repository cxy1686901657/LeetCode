package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/19
 * @description 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * <p>
 * n = 2
 * return 1 (2 = 1 + 1)
 * <p>
 * n = 10
 * return 36 (10 = 3 + 3 + 4)
 * @project LeetCode
 */

public class IntegerBreak {
    /**
     * 贪心
     *
     * @param n
     * @return
     */
    public static int integerBreak(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int ti3 = n / 3;
        if (n - 3 * ti3 == 1) ti3--;
        int ti2 = (n - ti3 * 3) / 2;
        return (int) (Math.pow(3, ti3) * Math.pow(2, ti2));
    }

    /**
     * 动态规划
     */
    public static int integerBreak2(int n) {
        if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        int[] dp = new int[n + 1];
//        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(4));
        System.out.println(integerBreak2(4));
    }
}
