package com.qc.leetcode.offer;

/**
 * @author qc
 * @date 2019/11/19
 * @description
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * @project LeetCode
 */

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int l=0,h=nums.length-1;
        while (l<h){
            int mid=(l+h-1)/2;
            if(nums[mid]<=nums[h]){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return nums[l];
    }
    /**
     * 如果数组元素允许重复，会出现一个特殊的情况：nums[l] == nums[m] == nums[h]，此时无法确定解在哪个区间，需要切换到顺序查找。
     * 例如对于数组 {1,1,1,0,1}，l、m 和 h 指向的数都为 1，此时无法知道最小数字 0 在哪个区间。
     */
    public int minNumberInRotateArray1(int[] nums) {
        if (nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[l] == nums[m] && nums[m] == nums[h])
                return minNumber(nums, l, h);
            else if (nums[m] <= nums[h])
                h = m;
            else
                l = m + 1;
        }
        return nums[l];
    }

    private int minNumber(int[] nums, int l, int h) {
        for (int i = l; i < h; i++)
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        return nums[l];
    }
}
