package com.qc.leetcode.category.stackandqueue;

import java.util.Stack;

/**
 * @author qc
 * @date 2019/11/29
 * @description 最小值栈
 * @project LeetCode
 * @solving
 */

public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x) {
        dataStack.add(x);
        if(minStack.isEmpty() || minStack.peek()>x){
            minStack.add(x);
        }else{
            minStack.add(minStack.peek());
        }
    }

    public void pop() {
        // 两个栈都得 pop
        if (!dataStack.isEmpty()) {
            minStack.pop();
            dataStack.pop();
        }
    }

    public int top() {
        if(!dataStack.isEmpty()){
            return dataStack.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);minStack.push(5);minStack.push(8);minStack.push(1);
        System.out.println(minStack.dataStack);
        System.out.println(minStack.minStack);
        System.out.println(minStack.getMin());
    }
}
