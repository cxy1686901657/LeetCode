package com.qc.leetcode.offer;

import java.util.Stack;

/**
 * @author qc
 * @date 2019/11/18
 * @description
 * 两个栈实现队列
 * @project LeetCode
 */

public class TwoStackImQueue {
    public static void main(String[] args) {
        push(1);
        push(3);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
    }

    static Stack<Integer> in = new Stack<>();
    static Stack<Integer> out = new Stack<>();

    public static void push(Integer i) {
        in.push(i);
    }

    public static Integer pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            return -1;
        }
        return out.pop();
    }
}
