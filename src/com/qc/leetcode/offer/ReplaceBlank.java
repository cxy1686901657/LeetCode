package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/15
 * @description
 * @project LeetCode
 */

public class ReplaceBlank {
    public static void main(String[] args) {
        ReplaceBlank replaceBlank = new ReplaceBlank();
        String we_are_happy = replaceBlank.replaceSpace2(new StringBuffer("We are Happy"));
        System.out.println(we_are_happy);
    }
    public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }
    public String replaceSpace2(StringBuffer str) {
        StringBuffer result=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                result.append("%20");
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
