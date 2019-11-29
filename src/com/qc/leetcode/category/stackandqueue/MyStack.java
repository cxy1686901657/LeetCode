package com.qc.leetcode.category.stackandqueue;

import java.util.Queue;

/**
 * @author qc
 * @date 2019/11/29
 * @description 用队列实现栈
 * @project LeetCode
 * @solving
 */

public class MyStack<T> {
    private Queue<T> queue;

    void push(T t) {
        queue.add(t);
        int cnt = queue.size();
        while (cnt-- > 1) {
            queue.add(queue.poll());
        }
    }

    T pop() {
        return queue.remove();
    }

    T top() {
        return queue.peek();
    }

    boolean empty() {
        return queue.isEmpty();
    }
}
