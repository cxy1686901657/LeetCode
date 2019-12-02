package com.qc.leetcode.category.stackandqueue;

import java.util.Stack;

/**
 * @author qc
 * @date 2019/12/2
 * @description 数组中元素与下一个比它大的元素之间的距离
 * @project LeetCode
 * @solving
 */

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] dist = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for (int curr = 0; curr < temperatures.length; curr++) {
            while (!stack.isEmpty() && temperatures[curr] > temperatures[stack.peek()]) {
                Integer preIndex = stack.pop();
                dist[preIndex] = curr - preIndex;
            }
            stack.push(temperatures[curr]);
        }
        return dist;
    }
}
