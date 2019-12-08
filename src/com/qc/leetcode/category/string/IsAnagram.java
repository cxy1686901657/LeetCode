package com.qc.leetcode.category.string;

/**
 * @author qc
 * @date 2019/12/8
 * @description 两个字符串包含的字符是否完全相同
 * @project LeetCode
 * @solving -. HashMap
 * -.
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int cns[] = new int[26];
        for (char s1 : s.toCharArray()) {
            cns[s1 - 'a']++;
        }
        for (char s1 : t.toCharArray()) {
            cns[s1 - 'a']--;
        }
        for (int cn : cns) {
            if (cn != 0) {
                return false;
            }
        }
        return true;
    }
}
