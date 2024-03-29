package com.qc.leetcode.category.string;

/**
 * @author qc
 * @date 2019/12/10
 * @description 判断一个整数是否是回文数
 * @project LeetCode
 * @solving
 */

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x % 10 == 0) return false;
        int right = 0;
        while (x > right) {
            right = right * 10 + x % 10;
            x = x / 10;
        }
        return x == right || right / 10 == x;
    }
}
