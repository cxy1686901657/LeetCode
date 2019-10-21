package com.qc.leetcode.onebyone;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author qc
 * @date 2019/10/21
 * @description
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:输入: [1,2,3,1]
 * 输出: true
 * @project LeetCode
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count()==nums.length;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet hashSet = new HashSet();
        for(int i:nums){
             hashSet.add(i);
        }
        return  hashSet.size()<nums.length;
    }
    public static void main(String[] args){

    }
}
