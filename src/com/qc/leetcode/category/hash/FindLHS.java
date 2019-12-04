package com.qc.leetcode.category.hash;


import java.util.HashMap;

/**
 * @author qc
 * @date 2019/12/4
 * @description 最长和谐序列
 * @project LeetCode
 * @solving
 */

public class FindLHS {
    /**
     * @param nums
     * @return int
     * @author qc
     * @description 枚举 暴力破解 复杂度 On2
     * @date 2019/12/4
     */
    public int findLHS_It(int[] nums) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                } else if (nums[j] + 1 == nums[i]) {
                    flag = true;
                    count++;
                }
            }
            if (flag) {
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    /**
     * @param nums
     * @return int
     * @author qc
     * @description Hash 映射  空间换时间
     * @date 2019/12/4
     */
    public int findLHS_Hash(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int longest = 0;
        for (int number : map.keySet()) {
            if (map.containsKey(number + 1)) {
                longest = Math.max(longest, map.get(number + 1) + map.get(number));
            }
        }
        return longest;
    }
}
