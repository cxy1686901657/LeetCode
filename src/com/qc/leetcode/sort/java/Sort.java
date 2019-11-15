package com.qc.leetcode.sort.java;

/**
 * @author qc
 * @date 2019/11/15
 * @description
 * @project LeetCode
 */

public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);
    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
