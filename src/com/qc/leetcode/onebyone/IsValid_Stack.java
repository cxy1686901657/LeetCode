package com.qc.leetcode.onebyone;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author qc
 * @date 2019/10/23
 * @description
 * @project LeetCode
 */

public class IsValid_Stack {

    public boolean isValid(String s) {
        Stack stack=new Stack();
        HashMap<Character,Character> hashMap=new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');
        char[] chars = s.toCharArray();
        for (char loop: chars){
            if(stack.isEmpty()){
                stack.push(loop);
            }else{
                if(hashMap.get(stack.peek())!=null&&hashMap.get(stack.peek())==loop){
                    stack.pop();
                }else{
                    stack.push(loop);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return  false;
    }
    public static void main(String[] args){
        IsValid_Stack isValid_stack = new IsValid_Stack();
        boolean valid = isValid_stack.isValid("([)]");
        System.out.println(valid);
    }
}
