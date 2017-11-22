package com.leetcode.ex;

import java.util.PriorityQueue;

/**
 * Created by peixuan.xie on 2017/11/7.
 */
public class _378_Kth_Smallest_Element_in_a_Sorted_Matrix {

    /**
     * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

     Note that it is the kth smallest element in the sorted order, not the kth distinct element.

     Example:

     matrix = [
     [ 1,  5,  9],
     [10, 11, 13],
     [12, 13, 15]
     ],
     k = 8,

     return 13.
     Note:
     You may assume k is always valid, 1 ≤ k ≤ n2.

     PriorityQueue使用最小堆，每次取出数据都是最小的那个
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> dq = new PriorityQueue<Integer>();
        int height = matrix.length;
        int width = matrix[0].length;
        if (height <= 0 || width <= 0)
            return 0;
        int sum = height * width;
        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                dq.add(matrix[i][j]);
        while (--k > 0)
            dq.poll();
        return dq.poll();
    }
}
