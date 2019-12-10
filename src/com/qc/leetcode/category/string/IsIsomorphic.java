package com.qc.leetcode.category.string;

/**
 * @author qc
 * @date 2019/12/10
 * @description字符串同构
 * @project LeetCode
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * @solving
 * 记录一个字符上次出现的位置，如果两个字符串中的字符上次出现的位置一样，那么就属于同构。
 */

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(cs[i])!=t.indexOf(ct[i])){
                return false;
            }
        }
        return true;
    }
}
