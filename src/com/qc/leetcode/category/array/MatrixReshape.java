package com.qc.leetcode.category.array;

/**
 * @author qc
 * @date 2019/12/11
 * @description 改变矩阵维度
 * @project LeetCode
 * @solving Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * <p>
 * Output:
 * [[1,2,3,4]]
 * <p>
 * Explanation:
 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * public int[][] matrixReshape(int[][] nums, int r, int c) {
 */

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = nums[index / n][index & n];
                index++;
            }
        }
        return res;
    }
}
