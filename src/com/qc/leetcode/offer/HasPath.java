package com.qc.leetcode.offer;

import com.qc.leetcode.sort.java.Test;

/**
 * @author qc
 * @date 2019/11/19
 * @description
 * @project LeetCode
 */

public class HasPath {
    private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};//四个方向寻找
    private int rows;
    private int cols;
    public boolean hasPath(char[] array, int rows, int cols, char[] str) {
        if(rows==0||cols==0){
            return false;
        }
        this.rows = rows;
        this.cols = cols;
        boolean[][] marked = new boolean[rows][cols];
        char[][] matrix=buildMatrix(array);
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                if(backtacking(matrix,str,marked,0,i,j))
                    return true;
        return false;
    }

    private boolean backtacking(char[][] matrix, char[] str, boolean[][] marked, int len, int r, int c) {
        if(len==str.length) return true;
        if(r<0 || r>=rows ||c<0||c>=cols
        ||matrix[r][c]!=str[len]||marked[r][c]){
            return false;
        }
        marked[r][c]=true;
        for(int[] n:next){
            if(backtacking(matrix, str, marked, len+1, r+n[0],c+n[1]))
                return true;
        }
        marked[r][c]=false;
        return false;
    }

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for(int i=0,len=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                matrix[i][j]=array[len++];
        return matrix;
    }
}
