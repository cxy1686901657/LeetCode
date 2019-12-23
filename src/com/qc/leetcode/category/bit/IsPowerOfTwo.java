package com.qc.leetcode.category.bit;

/**
 * 判断一个数是不是 2 的 n 次方
 *
 *
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
