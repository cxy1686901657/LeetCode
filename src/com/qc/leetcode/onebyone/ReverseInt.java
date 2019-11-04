package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/11/4
 * @description 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @project LeetCode
 */

public class ReverseInt {
    public static void main(String[] args) {
        int x=Integer.MAX_VALUE;
        System.out.println(x);
    }
    public int reverse(int x) {
       int ans=0;
       while (x!=0){
           int pop=x%10;
           if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&pop> Integer.MAX_VALUE%10)) return 0;
           if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&pop<Integer.MIN_VALUE%10)) return 0;
           ans=ans*10+pop;
           x=x/10;
       }
       return ans;
    }
}
