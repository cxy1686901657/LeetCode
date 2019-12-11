package com.qc.leetcode.category.array;

/**
 * @author qc
 * @date 2019/12/11
 * @description 有序矩阵查找
 * @project LeetCode
 * @solving
 */

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int r = 0, c = n - 1;
        while (r < m && c >= 0) {
            if(matrix[r][c]==target) return true;
            else if( matrix[r][c] >target) c--;
            else r++;
        }
        return false;
    }
}
