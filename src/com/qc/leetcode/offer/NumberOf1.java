package com.qc.leetcode.offer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Properties;
import java.util.Set;

/**
 * @author qc
 * @date 2019/11/21
 * @description 输入一个整数，输出该数二进制表示中 1 的个数。
 * @project LeetCode
 * @solving
 * n&(n-1)
 * 该位运算去除 n 的位级表示中最低的那一位。
 * n-1 相当一向下退了一位
 * 然后与n的后几位&就全为0了
 * 如果时2的n次方 最多就一个1  因为退位之后一次就全为0
 */

public class NumberOf1 {

    public static int NumberOf1(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);
        }
        return count;

    }

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<String> strings = properties.stringPropertyNames();
        for (String s:strings){
            System.out.println(properties.get(s));
        }
    }

}
