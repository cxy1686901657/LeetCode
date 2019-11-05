package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/11/5
 * @description
 * @project LeetCode
 */

public class GenerateMatrixLoop {
    public static void main(String[] args) {
        int[][] ints = generateMatrix(1000);
        for (int[] s:ints){
            for(int s1:s){
                System.out.print(s1+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int l=0,r=n-1,t=0,b=n-1;
        int[][] matrix=new int[n][n];
        int num = 1, tar = n * n;
        while (num<=tar){
            for(int i = l; i <= r; i++) matrix[t][i] = num++; // left to right.
            t++;
            for(int i = t; i <= b; i++) matrix[i][r] = num++; // top to bottom.
            r--;
            for(int i = r; i >= l; i--) matrix[b][i] = num++; // right to left.
            b--;
            for(int i = b; i >= t; i--) matrix[i][l] = num++; // bottom to top.
            l++;
        }
        return matrix;
    }
}
