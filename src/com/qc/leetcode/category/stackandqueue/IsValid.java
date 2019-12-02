package com.qc.leetcode.category.stackandqueue;

import java.util.Stack;

/**
 * @author qc
 * @date 2019/12/2
 * @description 用栈实现括号匹配
 * @project LeetCode
 * @solving
 */

public class IsValid {
    public boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        char[] chars = str.toCharArray();
        for(char target:chars){
            if(stack.isEmpty()){
                stack.push(target);
            }else{
                if(target=='}'||target==')'||target==']'){
                    stack.pop();
                }else{
                    stack.push(target);
                }
            }
        }
        return stack.isEmpty();
    }
}
