package com.qc.leetcode.onebyone;

import java.util.HashMap;

/**
 * @author qc
 * @date 2019/10/25
 * @description 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @project LeetCode
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer integer = map.get(i);
            integer = integer == null ? 1 : integer++;
            map.put(i, integer);
        }
        for (Integer s : map.keySet()) {
            if (map.get(s) == 1) {
                return s;
            }
        }
        return -1;
    }
    //异或

    /**
     *
     * 如果我们对 0 和二进制位做 XOR 运算，得到的仍然是这个二进制位
     *
     * 如果我们对相同的二进制位做 XOR 运算，返回的结果是 0
     *
     * XOR 满足交换律和结合律
     * a \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/single-number/solution/zhi-chu-xian-yi-ci-de-shu-zi-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int res=0;
        for(int s:nums){
            res=res^s;
        }
        return res;
    }
    public static void main(String[] args){
        //1.^(亦或运算) ，针对二进制，相同的为0，不同的为1
        System.out.println("2^3运算的结果是 :"+(2^3));//打印的结果是:   2^3运算的结果是 :1

        //2.&（与运算） 针对二进制，只要有一个为0，就为0
        System.out.println("2^3运算的结果是 :"+(2&3));//打印的结果是:   2&3运算的结果是 :2

        //3.<<(向左位移) 针对二进制，转换成二进制后向左移动3位，后面用0补齐
        System.out.println("2<<3运算的结果是 :"+(2<<3));//打印的结果是:   2<<3运算的结果是 :16

        //4.>>(向右位移) 针对二进制，转换成二进制后向右移动3位，
        System.out.println("2>>3运算的结果是 :"+(2>>3)); //打印的结果是:   2>>3运算的结果是 :0

        //5.>>>(无符号右移)  无符号右移，忽略符号位，空位都以0补齐
        System.out.println("-16>>2运算的结果是 :"+((-16)>>2)); //打印的结果是:   -16>>2运算的结果是 :-4

        System.out.println("16>>>2运算的结果是 :"+((16)>>>2));//打印的结果是:   16>>>2运算的结果是 :4

        Byte b=-1;
        System.out.println("-16>>>2运算的结果是 :"+(b>>>1));

        System.out.println(x(31));
    }
    static  int x(int n){
        int num=1;
       for(int i=0;i<n;i++){
           num=num*2;
       }
       return num;
    }
}
