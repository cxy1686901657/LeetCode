package com.qc.leetcode.category.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qc
 * @date 2019/12/10
 * @description 计算一组字符集合可以组成的回文字符串的最大长度
 * @project LeetCode
 * @solving Input : "abccccdd"
 * Output : 7
 * Explanation : One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        int result = 0;
        for (int c : map.values()) {
            result += c / 2 * 2;
            if (c % 2 == 1 && result % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
