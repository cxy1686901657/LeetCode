package com.qc.leetcode.category.bit;

/**
 * 统计两个数的二进制表示有多少位不同
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int res = 0;
        while (z != 0) {
            if ((z & 1) == 1) res++;
            z = z >> 1;
        }
        return res;
    }
}
