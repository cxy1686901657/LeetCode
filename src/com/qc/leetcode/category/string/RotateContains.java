package com.qc.leetcode.category.string;

/**
 * @author qc
 * @date 2019/12/8
 * @description 字符串循环移位包含
 * @project LeetCode
 * @solving
 */

public class RotateContains {
    public boolean rotateContains(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) return false;
        StringBuffer target = new StringBuffer(s1).append(s1);
        return target.toString().contains(s2);
    }
}
