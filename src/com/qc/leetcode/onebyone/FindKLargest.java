package com.qc.leetcode.onebyone;

import java.util.PriorityQueue;

/**
 * @author qc
 * @date 2019/10/23
 * @description
 * @project LeetCode
 */

public class FindKLargest {
    public static void main(String[] args){
        int [] nums={3,2,1,5,6,4};
        int kthLargest = findKthLargest(nums, 2);
        System.out.println(kthLargest);
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap =
                new PriorityQueue<>((n1, n2) -> n1 - n2);

        // keep k largest elements in the heap
        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        System.out.println(heap);
        // output
        return heap.poll();

    }
}
