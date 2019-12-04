package com.qc.leetcode.category.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qc
 * @date 2019/12/3
 * @description 判断数组是否含有重复元素
 * @project LeetCode
 * @solving 1 . hash
 *          2 . sort and iteration
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ns=new HashSet<>();
        for(int i:nums) {
            ns.add(i);
        }
        return ns.size()<nums.length;
    }
}
