package com.qc.leetcode.category.hash;

import java.util.HashMap;

/**
 * @author qc
 * @date 2019/12/3
 * @description 数组中两个数的和为给定值
 * @project LeetCode
 * @solving
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
