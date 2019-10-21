package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/20
 * @description
 *
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * 示例:
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/product-of-array-except-self
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * @project LeetCode
 */

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0]=1;
        right[len-1]=1;
        for(int i=1;i<len;i++){
            left[i]=nums[i-1]*left[i-1];
            right[len-i-1]=nums[len-i]*right[len-i];
        }
        for(int j=0;j<len;j++){
            nums[j]=left[j]*right[j];
        }
        return nums;
    }

    /**
     * O(1) 空间复杂度
     * @param nums
     * @return
     */
    public static int[] newproductExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            output[i]=left;
            left=left*nums[i];
        }
        for(int j=len -1;j>=0;j--){
            output[j]=output[j]*right;
            right=right*nums[j];
        }
        return output;
    }

    public static void main(String[] args){
        //计算左积和右积
        int[] a1=new int[]{1,2,3,4};
        int[] ints = newproductExceptSelf(a1);
        for (int a: ints){
            System.out.println(a+" ");
        }
    }
}
