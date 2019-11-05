package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/11/5
 * @description
 * @project LeetCode
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String result=strs[0];

        for (int i=1;i<strs.length;i++){
            int j=0;
            for (;j<result.length()&&j<strs[i].length();j++){
                if(result.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            result=result.substring(0,j);
            if(result.equals("")){
                return "";
            }
        }
        return result;
    }
}
