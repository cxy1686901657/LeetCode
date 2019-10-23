package com.qc.leetcode.onebyone;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author qc
 * @date 2019/10/23
 * @description
 * @project LeetCode
 */

public class MinStack {
    // 存储整个stack中的最小值
    private int min = Integer.MAX_VALUE;
    private int[] arrs = new int[10];
    private int index = 0;
    /** initialize your data structure here. */
    public void checkGrowth() {
        if (index >= arrs.length - 1) {
            // 使用右移位运算符，每次扩容一半
            this.arrs = Arrays.copyOf(this.arrs, this.arrs.length + (this.arrs.length >> 1));
        }
    }

    public MinStack() {

    }
    public boolean isEmpty() {
        return this.index <= 0;
    }
    public void push(int x) {
        checkGrowth();
        int min=this.min;
        if ( min > x) {
            this.min = x;
        }
        arrs[index]=x;
        index++;
    }

    public void pop() {
        int top = top();
        this.index--;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.index; i++) {
            if (min > this.arrs[i]) {
                min = this.arrs[i];
            }
        }
        this.min = min;
    }

    public int top() {
        if (this.isEmpty()) {
            return 0;
        }
        // 指针前移一位
        return this.arrs[this.index - 1];
    }

    public int getMin() {
        return this.min;
    }

}
