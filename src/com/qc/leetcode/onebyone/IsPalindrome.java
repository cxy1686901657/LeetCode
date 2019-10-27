package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/27
 * @description
 * @project LeetCode
 */

public class IsPalindrome {
    public static void main(String[] args){
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean palindrome = isPalindrome.isPalindrome2(123 );

        System.out.println(palindrome);
    }
    public boolean isPalindrome(int x) {
        if(x<0|| (x % 10 == 0 && x != 0)){
            return false;
        }
        String s=Integer.toString(x);
        StringBuffer s1=new StringBuffer(s).reverse();
        if(s.equals(s1.toString())){
            return true;
        }
        return false;
    }
    public boolean isPalindrome2(int x) {
        if(x<0|| (x % 10 == 0 && x != 0)){
            return false;
        }
      int res=0;
        while(x>res){
            res=res*10+x%10;
            x=x/10;
        }

        return x==res||x==res/10;
    }
}
