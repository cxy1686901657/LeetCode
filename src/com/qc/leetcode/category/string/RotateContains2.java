package com.qc.leetcode.category.string;



/**
 * @author qc
 * @date 2019/12/8
 * @description 字符串循环移位  xiangzuo
 * @project LeetCode
 * @solving
 */

public class RotateContains2 {
    // xiangzuo
    public static void print(String s,int index){
        String from = rotate(s);
        System.out.println(from);
        String first=rotate(from.substring(0,from.length()-index));
        System.out.println(first);
        String second=rotate(from.substring(from.length()-index));
        System.out.println(first+second);
    }
    // xiangzuo
    private static String rotate(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length()/2;i++){
            char temp=chars[i];
            chars[i]=chars[s.length()-i-1];
            chars[s.length()-i-1]=temp;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        print("abcdefg", 2);
        print2("abcd123",3);
    }
    // xiangyou
    public static void print2(String s,int index){
        String left= rotate(s.substring(0, index+1));
        System.out.println(left);
        String right=rotate(s.substring(index+1,s.length()));
        System.out.println(right);
        String res=rotate(left+right);
        System.out.println(res);
    }

}
