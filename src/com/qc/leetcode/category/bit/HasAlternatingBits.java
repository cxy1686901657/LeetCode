package com.qc.leetcode.category.bit;

/**
 * 判断一个数的位级表示是否不会出现连续的 0 和 1
 */
public class HasAlternatingBits {
    public boolean hasAbs(int n){
        int a = (n ^ (n >> 1));
        return (a & (a + 1)) == 0;
    }
}
