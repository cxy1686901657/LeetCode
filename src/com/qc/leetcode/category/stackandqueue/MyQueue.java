package com.qc.leetcode.category.stackandqueue;

import java.util.Stack;

/**
 * @author qc
 * @date 2019/11/29
 * @description 用栈实现队列
 * @project LeetCode
 * @solving
 */

public class MyQueue<T> {
    Stack<T> in = new Stack<>();
    Stack<T> out = new Stack<>();

    void push(T a) {
        in.push(a);
    }

    T pop() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        if(out.isEmpty()){
            return null;
        }
        return out.pop();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
