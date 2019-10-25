package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/26
 * @description
 * 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 方法 2：哈希表
 * 方法 3：投票选举
 * 方法 4：位运算
 * 方法 5：栈（消消乐 不同消除）
 * @project LeetCode
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int curr=nums[0];
        int count=0;
        for(int s:nums){
            if(count==0) curr=s;
            if(curr==s){
                count++;
            }else{
                count--;
            }
        }
        return curr;
    }
}
